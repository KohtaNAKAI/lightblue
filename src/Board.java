import java.awt.*;
import javax.swing.*;

public class Board{
	public static JFrame Board = new JFrame("Chess Board");
	public static JTextField SQ[][] = new JTextField[9][10];
	public int g_highlight_x = -1;
	public int g_highlight_y = -1;
	
	//constructor
	public Board(){
		Container cont = Board.getContentPane();
		GridLayout grid = new GridLayout(9,9,0,0);
		cont.setLayout(grid);
		
		int i,j;
		for(i=9; i>0; i--){
			if(i == 9){
				//for coordinate display
				SQ[0][0] = new JTextField();
				SQ[0][0].setText("x\\y");
				SQ[0][0].setHorizontalAlignment(JTextField.CENTER);
				cont.add(SQ[0][0]);
				//for coordinate display
				for(j=1;j<9; j++){
					SQ[0][j] = new JTextField();
					SQ[0][j].setText(Integer.toString(j));
					SQ[0][j].setHorizontalAlignment(JTextField.CENTER);
					cont.add(SQ[0][j]);
				}
			}else{
				for(j=0; j<9; j++){
					if(j == 0){
						//for coordinate display
						SQ[i][j] = new JTextField();
						SQ[i][j].setText(Integer.toString(i));
						SQ[i][j].setHorizontalAlignment(JTextField.CENTER);
						cont.add(SQ[i][j]);
					}else{
						//Main Board
						SQ[i][j] = new JTextField();
						SQ[i][j].setOpaque(true);
						SQ[i][j].setHorizontalAlignment(JTextField.CENTER);
						String name;
						name = i + "," + j;
						SQ[i][j].setName(name);
						SQ[i][j].addMouseListener(new Listener_display_available_moves());
						cont.add(SQ[i][j]);
					}
				}
			}
		}
		Board.setBounds(0,0,500,500);
		Board.setVisible(true);
		Board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//reflesh_board
	public void reflesh_board(int highlight_x, int highlight_y){
		clear_board();
		int i;
		
		//myPiece
		for(i=0; i<16; i++){
			String piece = new String("");
			int x,y;
			
			switch(Lightblue2.current_situation.myPiece[i][0]){
				case 0:
					piece = "K";
					break;
				case 1:
					piece = "Q";
					break;
				case 2:
					piece = "B1";
					break;
				case 3:
					piece = "B2";
					break;
				case 4:
					piece = "H1";
					break;
				case 5:
					piece = "H2";
					break;
				case 6:
					piece = "R1";
					break;
				case 7:
					piece = "R2";
					break;
				case 8:
					piece = "P1";
					if(Lightblue2.current_situation.myPiece[i][3] == 1){ //promotion
						piece = "Q(P1)";
					}
					break;
				case 9:
					piece = "P2";
					if(Lightblue2.current_situation.myPiece[i][3] == 1){ //promotion
						piece = "Q(P2)";
					}
					break;
				case 10:
					piece = "P3";
					if(Lightblue2.current_situation.myPiece[i][3] == 1){ //promotion
						piece = "Q(P3)";
					}
					break;
				case 11:
					piece = "P4";
					if(Lightblue2.current_situation.myPiece[i][3] == 1){ //promotion
						piece = "Q(P4)";
					}
					break;
				case 12:
					piece = "P5";
					if(Lightblue2.current_situation.myPiece[i][3] == 1){ //promotion
						piece = "Q(P5)";
					}
					break;
				case 13:
					piece = "P6";
					if(Lightblue2.current_situation.myPiece[i][3] == 1){ //promotion
						piece = "Q(P6)";
					}
					break;
				case 14:
					piece = "P7";
					if(Lightblue2.current_situation.myPiece[i][3] == 1){ //promotion
						piece = "Q(P7)";
					}
					break;
				case 15:
					piece = "P8";
					if(Lightblue2.current_situation.myPiece[i][3] == 1){ //promotion
						piece = "Q(P8)";
					}
					break;
				default:
					break;
			}
			x = Lightblue2.current_situation.myPiece[i][1];
			y = Lightblue2.current_situation.myPiece[i][2];
			SQ[x][y].setText(piece);
			SQ[x][y].setForeground(Color.BLUE);
		}
		
		//oppoPiece
		for(i=0;i<16;i++){
			String piece = new String("");
			int x,y;
			
			switch(Lightblue2.current_situation.oppoPiece[i][0]){
				case 0:
					piece = "K";
					break;
				case 1:
					piece = "Q";
					break;
				case 2:
					piece = "B1";
					break;
				case 3:
					piece = "B2";
					break;
				case 4:
					piece = "H1";
					break;
				case 5:
					piece = "H2";
					break;
				case 6:
					piece = "R1";
					break;
				case 7:
					piece = "R2";
					break;
				case 8:
					piece = "P1";
					if(Lightblue2.current_situation.oppoPiece[i][3] == 1){ //promotion
						piece = "Q(P1)";
					}
					break;
				case 9:
					piece = "P2";
					if(Lightblue2.current_situation.oppoPiece[i][3] == 1){ //promotion
						piece = "Q(P2)";
					}
					break;
				case 10:
					piece = "P3";
					if(Lightblue2.current_situation.oppoPiece[i][3] == 1){ //promotion
						piece = "Q(P3)";
					}
					break;
				case 11:
					piece = "P4";
					if(Lightblue2.current_situation.oppoPiece[i][3] == 1){ //promotion
						piece = "Q(P4)";
					}
					break;
				case 12:
					piece = "P5";
					if(Lightblue2.current_situation.oppoPiece[i][3] == 1){ //promotion
						piece = "Q(P5)";
					}
					break;
				case 13:
					piece = "P6";
					if(Lightblue2.current_situation.oppoPiece[i][3] == 1){ //promotion
						piece = "Q(P6)";
					}
					break;
				case 14:
					piece = "P7";
					if(Lightblue2.current_situation.oppoPiece[i][3] == 1){ //promotion
						piece = "Q(P7)";
					}
					break;
				case 15:
					piece = "P8";
					if(Lightblue2.current_situation.oppoPiece[i][3] == 1){ //promotion
						piece = "Q(P8)";
					}
					break;
				default:
					break;
			}
			x = Lightblue2.current_situation.oppoPiece[i][1];
			y = Lightblue2.current_situation.oppoPiece[i][2];
			SQ[x][y].setText(piece);
			SQ[x][y].setForeground(Color.RED);
		}
		
		//highlight
		if(highlight_x > 0){
			g_highlight_x = highlight_x;
			g_highlight_y = highlight_y;
			highlight();
		}
	}
	//clear and color board
	public void clear_board(){
		int i,j;
		for(i=8; i>0; i--){
			for(j=1; j<9; j++){
				SQ[i][j].setText("");
				if((i+j)%2 == 0){
					SQ[i][j].setBackground(Color.LIGHT_GRAY);
				}else{
					SQ[i][j].setBackground(Color.WHITE);
				}
			}
		}
	}

	//highlight
	public void highlight(){
		SQ[g_highlight_x][g_highlight_y].setBackground(Color.YELLOW);
	}
	//change color
	public void change_color(int x, int y, Color color){
		SQ[x][y].setBackground(color);
	}
	//return back color
	public void return_color(int x, int y){
		if((x+y)%2 == 0){
			SQ[x][y].setBackground(Color.LIGHT_GRAY);
		}else{
			SQ[x][y].setBackground(Color.WHITE);
		}
		//highlight
		if(g_highlight_x != -1){
			highlight();
		}
		
	}
}
