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
		int kind = -999;
		if(piece.equals("K")){
			token = 0;
			kind = 0;
		}else if(piece.equals("Q")){
			token = 1;
			kind = 1;
		}else if(piece.equals("B1")){
			token = 2;
			kind = 2;
		}else if(piece.equals("B2")){
			token = 3;
			kind = 2;
		}else if(piece.equals("H1")){
			token = 4;
			kind = 3;
		}else if(piece.equals("H2")){
			token = 5;
			kind = 3;
		}else if(piece.equals("R1")){
			token = 6;
			kind = 4;
		}else if(piece.equals("R2")){
			token = 7;
			kind = 4;
		}else if(piece.equals("P1")){
			token = 8;
			kind = 5;
		}else if(piece.equals("P2")){
			token = 9;
			kind = 5;
		}else if(piece.equals("P3")){
			token = 10;
			kind = 5;
		}else if(piece.equals("P4")){
			token = 11;
			kind = 5;
		}else if(piece.equals("P5")){
			token = 12;
			kind = 5;
		}else if(piece.equals("P6")){
			token = 13;
			kind = 5;
		}else if(piece.equals("P7")){
			token = 14;
			kind = 5;
		}else if(piece.equals("P8")){
			token = 15;
			kind = 5;
		}else if(piece.equals("Q(P1)")){	//promotion
			token = 8;
			kind = 1;
		}else if(piece.equals("Q(P2)")){	//promotion
			token = 9;
			kind = 1;
		}else if(piece.equals("Q(P3)")){	//promotion
			token = 10;
			kind = 1;
		}else if(piece.equals("Q(P4)")){	//promotion
			token = 11;
			kind = 1;
		}else if(piece.equals("Q(P5)")){	//promotion
			token = 12;
			kind = 1;
		}else if(piece.equals("Q(P6)")){	//promotion
			token = 13;
			kind = 1;
		}else if(piece.equals("Q(P7)")){	//promotion
			token = 14;
			kind = 1;
		}else if(piece.equals("Q(P8)")){	//promotion
			token = 15;
			kind = 1;
		}else{
			System.out.println("error : inproper piece input.");
		}
		
		Lightblue2.current_situation.move_piece(player, token, x, y, kind);
		Lightblue2.board.reflesh_board(x, y);
	}
}



