import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Listener_display_available_moves implements MouseListener{
	public static boolean selected = false;
	public static String selected_player = "xxx";
	public static int selected_piece[] = {-99, -99, -99, -99};
	public static ArrayList<int[]> possibility = new ArrayList<int[]>();
	
	public void mouseClicked(MouseEvent e){	
		int i,j;
		if(selected == false){								//Normal Operation
			Component c = (Component)e.getSource();
			String name = c.getName();
			int x = Integer.valueOf(name.substring(0,1));
			int y = Integer.valueOf(name.substring(2,3));
			
			for(i=0; i<16; i++){
				if((Lightblue2.current_situation.myPiece[i][1] == x) && (Lightblue2.current_situation.myPiece[i][2] == y)){
					possibility = Lightblue2.current_situation.get_available_moves("me", Lightblue2.current_situation.myPiece[i][0]);
					for(j=0; j<possibility.size(); j++){
						int move_x = possibility.get(j)[1];
						int move_y = possibility.get(j)[2];
						Lightblue2.board.change_color(move_x, move_y, Color.PINK);
					}
					selected = true;
					selected_player = "me";
					selected_piece[0] = Lightblue2.current_situation.myPiece[i][0];
					selected_piece[1] = Lightblue2.current_situation.myPiece[i][1];
					selected_piece[2] = Lightblue2.current_situation.myPiece[i][2];
					selected_piece[3] = Lightblue2.current_situation.myPiece[i][3];
					break;
				}else if((Lightblue2.current_situation.oppoPiece[i][1] == x) && (Lightblue2.current_situation.oppoPiece[i][2] == y)){
					possibility = Lightblue2.current_situation.get_available_moves("oppo", Lightblue2.current_situation.oppoPiece[i][0]);
					for(j=0; j<possibility.size(); j++){
						int move_x = possibility.get(j)[1];
						int move_y = possibility.get(j)[2];
						Lightblue2.board.change_color(move_x, move_y, Color.PINK);
					}
					selected = true;
					selected_player = "oppo";
					selected_piece[0] = Lightblue2.current_situation.oppoPiece[i][0];
					selected_piece[1] = Lightblue2.current_situation.oppoPiece[i][1];
					selected_piece[2] = Lightblue2.current_situation.oppoPiece[i][2];
					selected_piece[3] = Lightblue2.current_situation.oppoPiece[i][3];
					break;
				}
			}
		
		}else{												//drugging
			Component c = (Component)e.getSource();
			String name = c.getName();
			int move_to_x = Integer.valueOf(name.substring(0,1));
			int move_to_y = Integer.valueOf(name.substring(2,3));
			
			int piece 				= selected_piece[0];
			int move_fr_x 			= selected_piece[1];
			int move_fr_y 			= selected_piece[2];
			int kind 				= selected_piece[3];
			
			int pone_2steps 		= 0;
			int en_passant 			= 0;
			int pone_to_be_taken 	= 0;
			int castling 			= 0;
			
			if((move_fr_x == move_to_x) && (move_fr_y == move_to_y)){
				//drug within same component
				Lightblue2.board.reflesh_board(Lightblue2.board.g_highlight_x, Lightblue2.board.g_highlight_y);
			}else{
				//drug from other component to this component
				for(i=0; i<possibility.size(); i++){
					if((possibility.get(i)[0] == piece) && (possibility.get(i)[1] == move_to_x) && (possibility.get(i)[2] == move_to_y) && (possibility.get(i)[3] == kind)){
						pone_2steps 		= possibility.get(i)[5];
						en_passant  		= possibility.get(i)[6];
						pone_to_be_taken 	= possibility.get(i)[7];
						castling			= possibility.get(i)[8];
						break;
					}
				}
				
				Lightblue2.current_situation.move_piece(selected_player, piece, move_to_x, move_to_y, kind, pone_2steps ,en_passant ,pone_to_be_taken, castling);
				Lightblue2.history.add(selected_player, piece, move_to_x, move_to_y, kind);
				Lightblue2.board.reflesh_board(move_to_x, move_to_y);
			}
			
			selected = false;
			selected_player = "xxx";
			selected_piece[0] = -99;
			selected_piece[1] = -99;
			selected_piece[2] = -99;
			selected_piece[3] = -99;
			
			possibility = new ArrayList<int[]>();
		}
	}
	
	public void mouseEntered(MouseEvent e){
		if(selected == true){
			//drugging
		}else{
			//normal operation
			Component c = (Component)e.getSource();
			String name = c.getName();
			int x = Integer.valueOf(name.substring(0,1));
			int y = Integer.valueOf(name.substring(2,3));
			Lightblue2.board.change_color(x, y, Color.PINK);
		}
	}

	public void mouseExited(MouseEvent e){
		if(selected == true){
			//drugging
		}else{
			//normal operation
			Component c = (Component)e.getSource();
			String name = c.getName();
			int x = Integer.valueOf(name.substring(0,1));
			int y = Integer.valueOf(name.substring(2,3));
			Lightblue2.board.return_color(x, y);
		}
	}

	public void mousePressed(MouseEvent e){
	}

	public void mouseReleased(MouseEvent e){
	}
}
