import java.awt.event.*;

class Listener_move_from_GUI implements ActionListener{
	public void actionPerformed(ActionEvent e){	
		String player = new String();
		if(Lightblue2.console.JR_1.isSelected() == true){
			player = "oppo";
		}
		if(Lightblue2.console.JR_2.isSelected() == true){
			player = "me";
		}
		String piece = new String(Lightblue2.console.JT_token.getText());
		int x = Integer.parseInt(Lightblue2.console.JT_x.getText());
		int y = Integer.parseInt(Lightblue2.console.JT_y.getText());
		System.out.println("Move_from_GUI : player=" + player + " / piece=" + piece + " / x=" + Integer.toString(x) + " / y=" + Integer.toHexString(y));
		
		//switch cannot use string...
		int token = -999;
		if(piece.equals("K")){
			token = 0;
		}else if(piece.equals("Q")){
			token = 1;
		}else if(piece.equals("B1")){
			token = 2;
		}else if(piece.equals("B2")){
			token = 3;
		}else if(piece.equals("H1")){
			token = 4;
		}else if(piece.equals("H2")){
			token = 5;
		}else if(piece.equals("R1")){
			token = 6;
		}else if(piece.equals("R2")){
			token = 7;
		}else if(piece.equals("P1")){
			token = 8;
		}else if(piece.equals("P2")){
			token = 9;
		}else if(piece.equals("P3")){
			token = 10;
		}else if(piece.equals("P4")){
			token = 11;
		}else if(piece.equals("P5")){
			token = 12;
		}else if(piece.equals("P6")){
			token = 13;
		}else if(piece.equals("P7")){
			token = 14;
		}else if(piece.equals("P8")){
			token = 15;
		}else{
			System.out.println("error : inproper piece input.");
		}
		
		Lightblue2.current_situation.move_piece(player, token, x, y);
		Lightblue2.board.reflesh_board(x, y);
	}
}



