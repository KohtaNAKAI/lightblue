import java.util.*;
import javax.swing.*;

public class Field {
	public int myPiece[][] = new int[16][4];
	public int oppoPiece[][] = new int[16][4];
	public boolean f_en_passant[][] = new boolean[2][16];
	public boolean f_castling[][] = new boolean[2][2];
	
	//constructor
	public Field(){
		//myPiece
		//K
		this.myPiece[0][0] = 0;
		this.myPiece[0][1] = 1;
		if(Lightblue2.White_or_Black.equals("white")){
			this.myPiece[0][2] = 5;
		}else{
			this.myPiece[0][2] = 4;
		}
		this.myPiece[0][3] = 0;		//K
		//Q
		this.myPiece[1][0] = 1;
		this.myPiece[1][1] = 1;
		if(Lightblue2.White_or_Black.equals("white")){
			this.myPiece[1][2] = 4;
		}else{
			this.myPiece[1][2] = 5;
		}
		this.myPiece[1][3] = 1;		//Q
		//B1
		this.myPiece[2][0] = 2;
		this.myPiece[2][1] = 1;
		this.myPiece[2][2] = 3;
		this.myPiece[2][3] = 2;		//B
		//B2
		this.myPiece[3][0] = 3;
		this.myPiece[3][1] = 1;
		this.myPiece[3][2] = 6;
		this.myPiece[3][3] = 2;		//B
		//H1
		this.myPiece[4][0] = 4;
		this.myPiece[4][1] = 1;
		this.myPiece[4][2] = 2;
		this.myPiece[4][3] = 3;		//H
		//H2
		this.myPiece[5][0] = 5;
		this.myPiece[5][1] = 1;
		this.myPiece[5][2] = 7;
		this.myPiece[5][3] = 3;		//H
		//R1
		this.myPiece[6][0] = 6;
		this.myPiece[6][1] = 1;
		this.myPiece[6][2] = 1;
		this.myPiece[6][3] = 4;		//R
		//R2
		this.myPiece[7][0] = 7;
		this.myPiece[7][1] = 1;
		this.myPiece[7][2] = 8;
		this.myPiece[7][3] = 4;		//R	
		//P1
		this.myPiece[8][0] = 8;
		this.myPiece[8][1] = 2;
		this.myPiece[8][2] = 1;
		this.myPiece[8][3] = 5;		//P
		//P2
		this.myPiece[9][0] = 9;
		this.myPiece[9][1] = 2;
		this.myPiece[9][2] = 2;
		this.myPiece[9][3] = 5;		//P
		//P3
		this.myPiece[10][0] = 10;
		this.myPiece[10][1] = 2;
		this.myPiece[10][2] = 3;
		this.myPiece[10][3] = 5;	//P
		//P4
		this.myPiece[11][0] = 11;
		this.myPiece[11][1] = 2;
		this.myPiece[11][2] = 4;
		this.myPiece[11][3] = 5;	//P
		//P5
		this.myPiece[12][0] = 12;
		this.myPiece[12][1] = 2;
		this.myPiece[12][2] = 5;
		this.myPiece[12][3] = 5;	//P
		//P6
		this.myPiece[13][0] = 13;
		this.myPiece[13][1] = 2;
		this.myPiece[13][2] = 6;
		this.myPiece[13][3] = 5;	//P
		//P7
		this.myPiece[14][0] = 14;
		this.myPiece[14][1] = 2;
		this.myPiece[14][2] = 7;
		this.myPiece[14][3] = 5;	//P
		//P8
		this.myPiece[15][0] = 15;
		this.myPiece[15][1] = 2;
		this.myPiece[15][2] = 8;
		this.myPiece[15][3] = 5;	//P
		
		//OppoPiece
		//K
		this.oppoPiece[0][0] = 0;
		this.oppoPiece[0][1] = 8;
		if(Lightblue2.White_or_Black.equals("white")){
			this.oppoPiece[0][2] = 5;
		}else{
			this.oppoPiece[0][2] = 4;
		}
		this.oppoPiece[0][3] = 0;	//K
		//Q
		this.oppoPiece[1][0] = 1;
		this.oppoPiece[1][1] = 8;
		if(Lightblue2.White_or_Black.equals("white")){
			this.oppoPiece[1][2] = 4;
		}else{
			this.oppoPiece[1][2] = 5;
		}
		this.oppoPiece[1][3] = 1;	//Q
		//B1
		this.oppoPiece[2][0] = 2;
		this.oppoPiece[2][1] = 8;
		this.oppoPiece[2][2] = 3;
		this.oppoPiece[2][3] = 2;	//B
		//B2
		this.oppoPiece[3][0] = 3;
		this.oppoPiece[3][1] = 8;
		this.oppoPiece[3][2] = 6;
		this.oppoPiece[3][3] = 2;	//B
		//H1
		this.oppoPiece[4][0] = 4;
		this.oppoPiece[4][1] = 8;
		this.oppoPiece[4][2] = 2;
		this.oppoPiece[4][3] = 3;	//H
		//H2
		this.oppoPiece[5][0] = 5;
		this.oppoPiece[5][1] = 8;
		this.oppoPiece[5][2] = 7;
		this.oppoPiece[5][3] = 3;	//H
		//R1
		this.oppoPiece[6][0] = 6;
		this.oppoPiece[6][1] = 8;
		this.oppoPiece[6][2] = 1;
		this.oppoPiece[6][3] = 4;	//R
		//R2
		this.oppoPiece[7][0] = 7;
		this.oppoPiece[7][1] = 8;
		this.oppoPiece[7][2] = 8;
		this.oppoPiece[7][3] = 4;	//R
		//P1
		this.oppoPiece[8][0] = 8;
		this.oppoPiece[8][1] = 7;
		this.oppoPiece[8][2] = 1;
		this.oppoPiece[8][3] = 5;	//P
		//P2
		this.oppoPiece[9][0] = 9;
		this.oppoPiece[9][1] = 7;
		this.oppoPiece[9][2] = 2;
		this.oppoPiece[9][3] = 5;	//P
		//P3
		this.oppoPiece[10][0] = 10;
		this.oppoPiece[10][1] = 7;
		this.oppoPiece[10][2] = 3;
		this.oppoPiece[10][3] = 5;	//P
		//P4
		this.oppoPiece[11][0] = 11;
		this.oppoPiece[11][1] = 7;
		this.oppoPiece[11][2] = 4;
		this.oppoPiece[11][3] = 5;	//P
		//P5
		this.oppoPiece[12][0] = 12;
		this.oppoPiece[12][1] = 7;
		this.oppoPiece[12][2] = 5;
		this.oppoPiece[12][3] = 5;	//P
		//P6
		this.oppoPiece[13][0] = 13;
		this.oppoPiece[13][1] = 7;
		this.oppoPiece[13][2] = 6;
		this.oppoPiece[13][3] = 5;	//P
		//P7
		this.oppoPiece[14][0] = 14;
		this.oppoPiece[14][1] = 7;
		this.oppoPiece[14][2] = 7;
		this.oppoPiece[14][3] = 5;	//P
		//P8
		this.oppoPiece[15][0] = 15;
		this.oppoPiece[15][1] = 7;
		this.oppoPiece[15][2] = 8;
		this.oppoPiece[15][3] = 5;	//P
	
		//f_en_passant
		int i,j;
		for(i=0; i<2; i++){
			for(j=0; j<16; j++){
				f_en_passant[i][j] = false;
			}
		}
		
		//f_castling
		for(i=0; i<2; i++){			// 0:me / 1:oppo
			for(j=0; j<2; j++){		// 0:left / 1:right
				f_castling[i][j] = true;
			}
		}
	}
	//show for debug
	public void debug_show(){
		int i;
		System.out.println("myPiece:");
		for(i=0; i<16; i++){
			System.out.println(Arrays.toString(this.myPiece[i]));
		}
		System.out.println("oppoPiece:");
		for(i=0; i<16; i++){
			System.out.println(Arrays.toString(this.oppoPiece[i]));
		}
	}
	//set field
	public void set_field(Field given_field){
		int i,j;
		//piece
		for(i=0; i<16; i++){
			for(j=0; j<4; j++){
				this.myPiece[i][j] = given_field.myPiece[i][j];
				this.oppoPiece[i][j] = given_field.oppoPiece[i][j];
			}
		}
		//f_en_passaint
		for(i=0; i<2; i++){
			for(j=0; j<16; j++){
				this.f_en_passant[i][j] = given_field.f_en_passant[i][j];
			}
		}
		
		//f_castling
		for(i=0; i<2; i++){
			for(j=0; j<2; j++){
				this.f_castling[i][j] = given_field.f_castling[i][j];
			}
		}
	}
	//move piece
	public void move_piece(String player, int piece, int x, int y, int kind, int pone_2steps, int en_passant, int pone_to_be_taken, int castling){
		int i,j;
		if(player.equals("me")){
			this.myPiece[piece][1] = x;
			this.myPiece[piece][2] = y;
			
			if(en_passant == 1){
				//en_passant
				this.oppoPiece[pone_to_be_taken][0] = -99;
				this.oppoPiece[pone_to_be_taken][1] = 0;
				this.oppoPiece[pone_to_be_taken][2] = 0;
				this.oppoPiece[pone_to_be_taken][3] = -99;
			}else if(castling == 1){
				//left castling
				this.myPiece[6][1] = x;
				this.myPiece[6][2] = y+1;
			}else if(castling == 2){
				//right castling
				this.myPiece[7][1] = x;
				this.myPiece[7][2] = y-1;
			}else{
				//normal atarihantei
				for(i=0; i<16; i++){
					if((this.oppoPiece[i][1] == x) && (this.oppoPiece[i][2] == y)){
						this.oppoPiece[i][0] = -99;
						this.oppoPiece[i][1] = 0;
						this.oppoPiece[i][2] = 0;
						this.oppoPiece[i][3] = -99;
						break;
					}
				}
			}
			
			//pone promotion
			if((kind == 5) && (x == 8)){
				this.myPiece[piece][3] = 1;		//promotion to Q
			}
			
		}else{
			this.oppoPiece[piece][1] = x;
			this.oppoPiece[piece][2] = y;
			
			if(en_passant == 1){
				//en_passant
				this.myPiece[pone_to_be_taken][0] = -99;
				this.myPiece[pone_to_be_taken][1] = 0;
				this.myPiece[pone_to_be_taken][2] = 0;
				this.myPiece[pone_to_be_taken][3] = -99;
			}else if(castling == 1){
				//left castling
				this.oppoPiece[6][1] = x;
				this.oppoPiece[6][2] = y+1;
			}else if(castling == 2){
				//right castling
				this.oppoPiece[7][1] = x;
				this.oppoPiece[7][2] = y-1;
			}else{
				//normal atarihantei
				for(i=0; i<16; i++){
					if((this.myPiece[i][1] == x) && (this.myPiece[i][2] == y)){
						this.myPiece[i][0] = -99;
						this.myPiece[i][1] = 0;
						this.myPiece[i][2] = 0;
						this.myPiece[i][3] = -99;
						break;
					}
				}
			}	
			
			//pone promotion
			if((kind == 5) && (x == 1)){
				this.oppoPiece[piece][3] = 1;	//promotion to Q
			}
		}
		
		//reflesh en_passant flag
		for(i=0; i<2; i++){
			for(j=0; j<16; j++){
				this.f_en_passant[i][j] = false;
			}
		}
		if(pone_2steps == 1){
			if(player.equals("me")){
				this.f_en_passant[0][piece] = true;
			}else{
				this.f_en_passant[1][piece] = true;
			}
		}
		
		//reflesh f_castling
		if(player.equals("me")){
			if(piece == 0){
				f_castling[0][0] = false;
				f_castling[0][1] = false;
			}else if(piece == 6){
				f_castling[0][0] = false;
			}else if(piece == 7){
				f_castling[0][1] = false;
			}
		}else{
			if(piece == 0){
				f_castling[1][0] = false;
				f_castling[1][1] = false;
			}else if(piece == 6){
				f_castling[1][0] = false;
			}else if(piece == 7){
				f_castling[1][1] = false;
			}	
		}
	}
	//get evaluation point of the situation2
	public int evaluate(){
		int i;
		int mypoint = 0;
		for(i=0; i<16; i++){
			switch(this.myPiece[i][3]){
				case 0:		//K
					mypoint = mypoint + 100;
					break;
				case 1: 	//Q
					mypoint = mypoint + 9;
					break;
				case 2: 	//B
					mypoint = mypoint + 3;
					break;
				case 3: 	//H
					mypoint = mypoint + 3;
					break;
				case 4: 	//R
					mypoint = mypoint + 5;
					break;
				case 5: 	//P
					mypoint = mypoint + 1;
					break;
				default:
					break;
			}
		}
		
		int oppopoint = 0;
		for(i=0; i<16; i++){
			switch(this.oppoPiece[i][3]){
				case 0:		//K
					oppopoint = oppopoint + 100;
					break;
				case 1: 	//Q
					oppopoint = oppopoint + 9;
					break;
				case 2: 	//B
					oppopoint = oppopoint + 3;
					break;
				case 3: 	//H
					oppopoint = oppopoint + 3;
					break;
				case 4: 	//R
					oppopoint = oppopoint + 5;
					break;
				case 5: 	//P
					oppopoint = oppopoint + 1;
					break;
				default:
					break;
			}
		}
		
		return (mypoint - oppopoint);
	}
	//get all possible moves
	public ArrayList<int[]> get_available_moves(String player){
		ArrayList<int[]> possibility = new ArrayList<int[]>();
		int i,j;
		for(i=0; i<16; i++){
			if(player.equals("me")){
				if(this.myPiece[i][0] != -99){
					ArrayList<int[]> tmp_possibility = new ArrayList<int[]>();
					tmp_possibility = get_available_moves(player,i);
					for(j=0; j<tmp_possibility.size(); j++){
						possibility.add(tmp_possibility.get(j).clone());
					}
				}
			}else{
				if(this.oppoPiece[i][0] != -99){
					ArrayList<int[]> tmp_possibility = new ArrayList<int[]>();
					tmp_possibility = get_available_moves(player,i);
					for(j=0; j<tmp_possibility.size(); j++){
						possibility.add(tmp_possibility.get(j).clone());
					}
				}
			}
		}
		return possibility;
	}
	//get possible moves for designated piece
	public ArrayList<int[]> get_available_moves(String player, int piece){
		int p1_piece[][] = new int[16][4];
		int p2_piece[][] = new int[16][4];
		int i,j;
		if(player.equals("me")){
			//my step : copy myPiece to p1_piece, oppoPiece to p2_piece
			for(i=0; i<16; i++){
				for(j=0; j<4; j++){
					p1_piece[i][j] = this.myPiece[i][j];
					p2_piece[i][j] = this.oppoPiece[i][j];
				}
			}
		}else if(player.equals("oppo")){
			//oppo step : copy oppoPiece to p1_piece, myPiece to p2_piece
			for(i=0; i<16; i++){
				for(j=0; j<4; j++){
					p1_piece[i][j] = this.oppoPiece[i][j];
					p2_piece[i][j] = this.myPiece[i][j];
				}
			}
		}
		
		//sign : to be used in pone part and evaluation default value
		int sign = -999;	
		if(player.equals("me")){
			sign = 1;
		}else if(player.equals("oppo")){
			sign = -1;
		}
		
		ArrayList<int[]> possibility = new ArrayList<int[]>();
		int x = p1_piece[piece][1];
		int y = p1_piece[piece][2];
		int kind = p1_piece[piece][3];
		int n;
		boolean f_stop = false;
		int tmp[] = new int[9];
		//tmp[0] = piece
		//tmp[1] = x (move to)
		//tmp[2] = y (move to)
		//tmp[3] = kind
		//tmp[4] = allow or not
		//tmp[5] = for pone : 2 steps forward or not
		//tmp[6] = for pone : this move is en_passant or not
		//tmp[7] = for pone : if so, number of p2 pone what p1 pone will take
		//tmp[8] = for castling : 0=none / 1=left castling / 2=right castling
		
		switch(kind){
			case 0:			//K
				//Front 1 step
				tmp[0] = piece;
				tmp[1] = x + 1;
				tmp[2] = y;
				tmp[3] = kind;
				tmp[4] = 1;	//can move
				tmp[5] = 0;
				tmp[6] = 0;
				tmp[7] = 0;
				tmp[8] = 0;
				if(x+1 > 8){
					tmp[4] = 0; //cannot move
				}else{
					for(i=0; i<16; i++){
						if((p1_piece[i][1] == x+1) && (p1_piece[i][2] == y)){
							tmp[4] = 0; //cannot move
							break;
						}
					}
				}
				if(tmp[4] == 1){
					possibility.add(tmp.clone());
				}
				
				//Front Right 1 step
				tmp[0] = piece;
				tmp[1] = x + 1;
				tmp[2] = y + 1;
				tmp[3] = kind;
				tmp[4] = 1;	//can move
				tmp[5] = 0;
				tmp[6] = 0;
				tmp[7] = 0;
				tmp[8] = 0;
				if((x + 1 > 8) || (y + 1 > 8)){
					tmp[4] = 0; //cannot move
				}else{
					for(i=0; i<16; i++){
						if((p1_piece[i][1] == x + 1) && (p1_piece[i][2] == y + 1)){
							tmp[4] = 0; //cannot move
							break;
						}
					}
				}
				if(tmp[4] == 1){
					possibility.add(tmp.clone());
				}
				
				//Right 1 step
				tmp[0] = piece;
				tmp[1] = x;
				tmp[2] = y + 1;
				tmp[3] = kind;
				tmp[4] = 1;	//can move
				tmp[5] = 0;
				tmp[6] = 0;
				tmp[7] = 0;
				tmp[8] = 0;
				if(y + 1 > 8){
					tmp[4] = 0; //cannot move
				}else{
					for(i=0; i<16; i++){
						if((p1_piece[i][1] == x) && (p1_piece[i][2] == y + 1)){
							tmp[4] = 0; //cannot move
							break;
						}
					}
				}
				if(tmp[4] == 1){
					possibility.add(tmp.clone());
				}
				
				//Back Right 1 step
				tmp[0] = piece;
				tmp[1] = x - 1;
				tmp[2] = y + 1;
				tmp[3] = kind;
				tmp[4] = 1;	//can move
				tmp[5] = 0;
				tmp[6] = 0;
				tmp[7] = 0;
				tmp[8] = 0;
				if((x - 1 < 1) || (y + 1 > 8)){
					tmp[4] = 0; //cannot move
				}else{
					for(i=0; i<16; i++){
						if((p1_piece[i][1] == x - 1) && (p1_piece[i][2] == y + 1)){
							tmp[4] = 0; //cannot move
							break;
						}
					}
				}
				if(tmp[4] == 1){
					possibility.add(tmp.clone());
				}
				
				//Back 1 step
				tmp[0] = piece;
				tmp[1] = x - 1;
				tmp[2] = y;
				tmp[3] = kind;
				tmp[4] = 1;	//can move
				tmp[5] = 0;
				tmp[6] = 0;
				tmp[7] = 0;
				tmp[8] = 0;
				if(x - 1 < 1){
					tmp[4] = 0; //cannot move
				}else{
					for(i=0; i<16; i++){
						if((p1_piece[i][1] == x - 1) && (p1_piece[i][2] == y)){
							tmp[4] = 0; //cannot move
							break;
						}
					}
				}
				if(tmp[4] == 1){
					possibility.add(tmp.clone());
				}
				
				//Back Left 1 step
				tmp[0] = piece;
				tmp[1] = x - 1;
				tmp[2] = y - 1;
				tmp[3] = kind;
				tmp[4] = 1;	//can move
				tmp[5] = 0;
				tmp[6] = 0;
				tmp[7] = 0;
				tmp[8] = 0;
				if((x - 1 < 1) || (y - 1 <  1)){
					tmp[4] = 0; //cannot move
				}else{
					for(i=0; i<16; i++){
						if((p1_piece[i][1] == x - 1) && (p1_piece[i][2] == y - 1)){
							tmp[4] = 0; //cannot move
							break;
						}
					}
				}
				if(tmp[4] == 1){
					possibility.add(tmp.clone());
				}
				
				//Left 1 step
				tmp[0] = piece;
				tmp[1] = x;
				tmp[2] = y - 1;
				tmp[3] = kind;
				tmp[4] = 1;	//can move
				tmp[5] = 0;
				tmp[6] = 0;
				tmp[7] = 0;
				tmp[8] = 0;
				if(y - 1 <  1){
					tmp[4] = 0; //cannot move
				}else{
					for(i=0; i<16; i++){
						if((p1_piece[i][1] == x) && (p1_piece[i][2] == y - 1)){
							tmp[4] = 0; //cannot move
							break;
						}
					}
				}
				if(tmp[4] == 1){
					possibility.add(tmp.clone());
				}
				
				//Front Left 1 step
				tmp[0] = piece;
				tmp[1] = x + 1;
				tmp[2] = y - 1;
				tmp[3] = kind;
				tmp[4] = 1;	//can move				
				tmp[5] = 0;
				tmp[6] = 0;
				tmp[7] = 0;
				tmp[8] = 0;
				if((x + 1 > 8) || (y - 1 < 1)){
					tmp[4] = 0; //cannot move
				}else{
					for(i=0; i<16; i++){
						if((p1_piece[i][1] == x + 1) && (p1_piece[i][2] == y - 1)){
							tmp[4] = 0; //cannot move
							break;
						}
					}
				}
				if(tmp[4] == 1){
					possibility.add(tmp.clone());
				}
				
				//Left Castling
				tmp[0] = piece;
				tmp[1] = x;
				tmp[2] = y - 2;
				tmp[3] = kind;
				tmp[4] = 0;	//cannot move
				tmp[5] = 0;
				tmp[6] = 0;
				tmp[7] = 0;
				tmp[8] = 1;
				if(Lightblue2.White_or_Black.equals("white")){	//Left Castling = QueenSide Long Castling
					if(((player.equals("me")) && (this.f_castling[0][0] == true)) || ((player.equals("oppo")) && (this.f_castling[1][0] == true))){
						boolean f_tmp = true;
						//check there's no pieces between K & R
						for(i=0; i<16; i++){
							//left 1
							if(((p1_piece[i][1] == x) && (p1_piece[i][2] == y-1)) || ((p2_piece[i][1] == x) && (p2_piece[i][2] == y-1))){
								f_tmp = false;
								break;
							}
							//left 2
							if(((p1_piece[i][1] == x) && (p1_piece[i][2] == y-2)) || ((p2_piece[i][1] == x) && (p2_piece[i][2] == y-2))){
								f_tmp = false;
								break;
							}
							//left 3
							if(((p1_piece[i][1] == x) && (p1_piece[i][2] == y-3)) || ((p2_piece[i][1] == x) && (p2_piece[i][2] == y-3))){
								f_tmp = false;
								break;
							}
						}
						//check there's no p2 pieces checking K's route
						if(f_tmp == true){
							for(i=0; i<16; i++){
								ArrayList<int[]> tmp_castling = new ArrayList<int[]>();
								if(player.equals("me")){
									if(i == 0){				//..in order to avoid infinite loop
										if(this.oppoPiece[0][1] != 8){
											tmp_castling = this.get_available_moves("oppo", i);
										}
									}else{
										tmp_castling = this.get_available_moves("oppo", i);
									}
								}else{
									if(i == 0){				//..in order to avoid infinite loop
										if(this.myPiece[0][1] != 1){
											tmp_castling = this.get_available_moves("me", i);
										}
									}else{
										tmp_castling = this.get_available_moves("me", i);
									}
								}
								for(j=0; j<tmp_castling.size(); j++){
									if((tmp_castling.get(j)[1] == x) && (tmp_castling.get(j)[2] == y)){
										f_tmp = false;
										break;
									}
									if((tmp_castling.get(j)[1] == x) && (tmp_castling.get(j)[2] == y-1)){
										f_tmp = false;
										break;
									}
									if((tmp_castling.get(j)[1] == x) && (tmp_castling.get(j)[2] == y-2)){
										f_tmp = false;
										break;
									}
								}
							}
						}
						if(f_tmp == true){
							tmp[4] = 1;		//can move
						}
					}
					if(tmp[4] == 1){
						possibility.add(tmp.clone());
					}
				}else{			//Left Castling = KingSide Short Castling
					if(((player.equals("me")) && (this.f_castling[0][0] == true)) || ((player.equals("oppo")) && (this.f_castling[1][0] == true))){
						boolean f_tmp = true;
						//check there's no pieces between K & R
						for(i=0; i<16; i++){
							//Left 1
							if(((p1_piece[i][1] == x) && (p1_piece[i][2] == y-1)) || ((p2_piece[i][1] == x) && (p2_piece[i][2] == y-1))){
								f_tmp = false;
								break;
							}
							//Leftt 2
							if(((p1_piece[i][1] == x) && (p1_piece[i][2] == y-2)) || ((p2_piece[i][1] == x) && (p2_piece[i][2] == y-2))){
								f_tmp = false;
								break;
							}
						}
						//check there's no p2 pieces checking K's route
						if(f_tmp == true){
							for(i=0; i<16; i++){
								ArrayList<int[]> tmp_castling = new ArrayList<int[]>();
								if(player.equals("me")){
									if(i == 0){				//..in order to avoid infinite loop
										if(this.oppoPiece[0][1] != 8){
											tmp_castling = this.get_available_moves("oppo", i);
										}
									}else{
										tmp_castling = this.get_available_moves("oppo", i);
									}
								}else{
									if(i == 0){				//..in order to avoid infinite loop
										if(this.myPiece[0][1] != 1){
											tmp_castling = this.get_available_moves("me", i);
										}
									}else{
										tmp_castling = this.get_available_moves("me", i);
									}
								}
								for(j=0; j<tmp_castling.size(); j++){
									if((tmp_castling.get(j)[1] == x) && (tmp_castling.get(j)[2] == y)){
										f_tmp = false;
										break;
									}
									if((tmp_castling.get(j)[1] == x) && (tmp_castling.get(j)[2] == y-1)){
										f_tmp = false;
										break;
									}
									if((tmp_castling.get(j)[1] == x) && (tmp_castling.get(j)[2] == y-2)){
										f_tmp = false;
										break;
									}
								}
							}
						}
						if(f_tmp == true){
							tmp[4] = 1;		//can move
						}
					}
					if(tmp[4] == 1){
						possibility.add(tmp.clone());
					}
				}
				
				//Right Castling
				tmp[0] = piece;
				tmp[1] = x;
				tmp[2] = y + 2;
				tmp[3] = kind;
				tmp[4] = 0;	//cannot move
				tmp[5] = 0;
				tmp[6] = 0;
				tmp[7] = 0;
				tmp[8] = 2;
				if(Lightblue2.White_or_Black.equals("white")){	//Right Castling = KingSide Short Castling
					if(((player.equals("me")) && (this.f_castling[0][1] == true)) || ((player.equals("oppo")) && (this.f_castling[1][1] == true))){
						boolean f_tmp = true;
						//check there's no pieces between K & R
						for(i=0; i<16; i++){
							//Right 1
							if(((p1_piece[i][1] == x) && (p1_piece[i][2] == y+1)) || ((p2_piece[i][1] == x) && (p2_piece[i][2] == y+1))){
								f_tmp = false;
								break;
							}
							//Right 2
							if(((p1_piece[i][1] == x) && (p1_piece[i][2] == y+2)) || ((p2_piece[i][1] == x) && (p2_piece[i][2] == y+2))){
								f_tmp = false;
								break;
							}
						}
						//check there's no p2 pieces checking K's route
						if(f_tmp == true){
							for(i=0; i<16; i++){
								ArrayList<int[]> tmp_castling = new ArrayList<int[]>();
								if(player.equals("me")){
									if(i == 0){				//..in order to avoid infinite loop
										if(this.oppoPiece[0][1] != 8){
											tmp_castling = this.get_available_moves("oppo", i);
										}
									}else{
										tmp_castling = this.get_available_moves("oppo", i);
									}
								}else{
									if(i == 0){				//..in order to avoid infinite loop
										if(this.myPiece[0][1] != 1){
											tmp_castling = this.get_available_moves("me", i);
										}
									}else{
										tmp_castling = this.get_available_moves("me", i);
									}
								}
								for(j=0; j<tmp_castling.size(); j++){
									if((tmp_castling.get(j)[1] == x) && (tmp_castling.get(j)[2] == y)){
										f_tmp = false;
										break;
									}
									if((tmp_castling.get(j)[1] == x) && (tmp_castling.get(j)[2] == y+1)){
										f_tmp = false;
										break;
									}
									if((tmp_castling.get(j)[1] == x) && (tmp_castling.get(j)[2] == y+2)){
										f_tmp = false;
										break;
									}
								}
							}
						}
						if(f_tmp == true){
							tmp[4] = 1;		//can move
						}
					}
					if(tmp[4] == 1){
						possibility.add(tmp.clone());
					}
				}else{			//Right Castling = QueenSide Long Castling
					if(((player.equals("me")) && (this.f_castling[0][1] == true)) || ((player.equals("oppo")) && (this.f_castling[1][1] == true))){
						boolean f_tmp = true;
						//check there's no pieces between K & R
						for(i=0; i<16; i++){
							//Right 1
							if(((p1_piece[i][1] == x) && (p1_piece[i][2] == y+1)) || ((p2_piece[i][1] == x) && (p2_piece[i][2] == y+1))){
								f_tmp = false;
								break;
							}
							//Right 2
							if(((p1_piece[i][1] == x) && (p1_piece[i][2] == y+2)) || ((p2_piece[i][1] == x) && (p2_piece[i][2] == y+2))){
								f_tmp = false;
								break;
							}
							//Right 3
							if(((p1_piece[i][1] == x) && (p1_piece[i][2] == y+3)) || ((p2_piece[i][1] == x) && (p2_piece[i][2] == y+3))){
								f_tmp = false;
								break;
							}
						}
						//check there's no p2 pieces checking K's route
						if(f_tmp == true){
							for(i=0; i<16; i++){
								ArrayList<int[]> tmp_castling = new ArrayList<int[]>();
								if(player.equals("me")){
									if(i == 0){				//..in order to avoid infinite loop
										if(this.oppoPiece[0][1] != 8){
											tmp_castling = this.get_available_moves("oppo", i);
										}
									}else{
										tmp_castling = this.get_available_moves("oppo", i);
									}
								}else{
									if(i == 0){				//..in order to avoid infinite loop
										if(this.myPiece[0][1] != 1){
											tmp_castling = this.get_available_moves("me", i);
										}
									}else{
										tmp_castling = this.get_available_moves("me", i);
									}
								}
								for(j=0; j<tmp_castling.size(); j++){
									if((tmp_castling.get(j)[1] == x) && (tmp_castling.get(j)[2] == y)){
										f_tmp = false;
										break;
									}
									if((tmp_castling.get(j)[1] == x) && (tmp_castling.get(j)[2] == y+1)){
										f_tmp = false;
										break;
									}
									if((tmp_castling.get(j)[1] == x) && (tmp_castling.get(j)[2] == y+2)){
										f_tmp = false;
										break;
									}
								}
							}
						}
						if(f_tmp == true){
							tmp[4] = 1;		//can move
						}
					}
					if(tmp[4] == 1){
						possibility.add(tmp.clone());
					}
				}
				
				break;
				
			case 1: //Q
				// Front n steps
				f_stop = false;
				for(n=1; n<8; n++){
					tmp[0] = piece;
					tmp[1] = x + n;
					tmp[2] = y;
					tmp[3] = kind;
					tmp[5] = 0;
					tmp[6] = 0;
					tmp[7] = 0;
					tmp[8] = 0;
					if(f_stop == false){
						tmp[4] = 1;	//can move
						if(x + n > 8) {
							tmp[4] = 0;	//cannot move
							f_stop = true;
						}else{
							for(i=0; i<16; i++){
								if((p1_piece[i][1] == x + n) && (p1_piece[i][2] == y)){
									tmp[4] = 0;	//cannot move
									f_stop = true;
								}else if((p2_piece[i][1] == x + n) && (p2_piece[i][2] == y)){
									tmp[4] = 1;	//can move
									f_stop = true;
									break;
								}
							}
						}
					}else{
						tmp[4] = 0;	//cannot move
					}
					if(tmp[4] == 1){
						possibility.add(tmp.clone());
					}
				}
				
				// Front Right n steps
				f_stop = false;
				for(n=1; n<8; n++){
					tmp[0] = piece;
					tmp[1] = x + n;
					tmp[2] = y + n;
					tmp[3] = kind;
					tmp[5] = 0;
					tmp[6] = 0;
					tmp[7] = 0;
					tmp[8] = 0;
					if(f_stop == false){
						tmp[4] = 1;	//can move
						if((x + n > 8) || (y + n > 8)) {
							tmp[4] = 0;	//cannot move
							f_stop = true;
						}else{
							for(i=0; i<16; i++){
								if((p1_piece[i][1] == x + n) && (p1_piece[i][2] == y + n)){
									tmp[4] = 0;	//cannot move
									f_stop = true;
								}else if((p2_piece[i][1] == x + n) && (p2_piece[i][2] == y + n)){
									tmp[4] = 1;	//can move
									f_stop = true;
									break;
								}
							}
						}
					}else{
						tmp[4] = 0;	//cannot move
					}
					if(tmp[4] == 1){
						possibility.add(tmp.clone());
					}
				}
				
				// Right n steps
				f_stop = false;
				for(n=1; n<8; n++){
					tmp[0] = piece;
					tmp[1] = x;
					tmp[2] = y + n;
					tmp[3] = kind;
					tmp[5] = 0;
					tmp[6] = 0;
					tmp[7] = 0;
					tmp[8] = 0;
					if(f_stop == false){
						tmp[4] = 1;	//can move
						if(y + n > 8) {
							tmp[4] = 0;	//cannot move
							f_stop = true;
						}else{
							for(i=0; i<16; i++){
								if((p1_piece[i][1] == x) && (p1_piece[i][2] == y + n)){
									tmp[4] = 0;	//cannot move
									f_stop = true;
								}else if((p2_piece[i][1] == x) && (p2_piece[i][2] == y + n)){
									tmp[4] = 1;	//can move
									f_stop = true;
									break;
								}
							}
						}
					}else{
						tmp[4] = 0;	//cannot move
					}
					if(tmp[4] == 1){
						possibility.add(tmp.clone());
					}
				}
				
				// Back Right n steps
				f_stop = false;
				for(n=1; n<8; n++){
					tmp[0] = piece;
					tmp[1] = x - n;
					tmp[2] = y + n;
					tmp[3] = kind;
					tmp[5] = 0;
					tmp[6] = 0;
					tmp[7] = 0;
					tmp[8] = 0;
					if(f_stop == false){
						tmp[4] = 1;	//can move
						if((x - n < 1) || (y + n > 8)) {
							tmp[4] = 0;	//cannot move
							f_stop = true;
						}else{
							for(i=0; i<16; i++){
								if((p1_piece[i][1] == x - n) && (p1_piece[i][2] == y + n)){
									tmp[4] = 0;	//cannot move
									f_stop = true;
								}else if((p2_piece[i][1] == x - n) && (p2_piece[i][2] == y + n)){
									tmp[4] = 1;	//can move
									f_stop = true;
									break;
								}
							}
						}
					}else{
						tmp[4] = 0;	//cannot move
					}
					if(tmp[4] == 1){
						possibility.add(tmp.clone());
					}
				}
				
				// Back n steps
				f_stop = false;
				for(n=1; n<8; n++){
					tmp[0] = piece;
					tmp[1] = x - n;
					tmp[2] = y;
					tmp[3] = kind;
					tmp[5] = 0;
					tmp[6] = 0;
					tmp[7] = 0;
					tmp[8] = 0;
					if(f_stop == false){
						tmp[4] = 1;	//can move
						if(x - n < 1) {
							tmp[4] = 0;	//cannot move
							f_stop = true;
						}else{
							for(i=0; i<16; i++){
								if((p1_piece[i][1] == x - n) && (p1_piece[i][2] == y)){
									tmp[4] = 0;	//cannot move
									f_stop = true;
								}else if((p2_piece[i][1] == x - n) && (p2_piece[i][2] == y)){
									tmp[4] = 1;	//can move
									f_stop = true;
									break;
								}
							}
						}
					}else{
						tmp[4] = 0;	//cannot move
					}
					if(tmp[4] == 1){
						possibility.add(tmp.clone());
					}
				}
				
				// Back Left n steps
				f_stop = false;
				for(n=1; n<8; n++){
					tmp[0] = piece;
					tmp[1] = x - n;
					tmp[2] = y - n;
					tmp[3] = kind;
					tmp[5] = 0;
					tmp[6] = 0;
					tmp[7] = 0;
					tmp[8] = 0;
					if(f_stop == false){
						tmp[4] = 1;	//can move
						if((x - n < 1) || (y - n < 1)) {
							tmp[4] = 0;	//cannot move
							f_stop = true;
						}else{
							for(i=0; i<16; i++){
								if((p1_piece[i][1] == x - n) && (p1_piece[i][2] == y - n)){
									tmp[4] = 0;	//cannot move
									f_stop = true;
								}else if((p2_piece[i][1] == x - n) && (p2_piece[i][2] == y - n)){
									tmp[4] = 1;	//can move
									f_stop = true;
									break;
								}
							}
						}
					}else{
						tmp[4] = 0;	//cannot move
					}
					if(tmp[4] == 1){
						possibility.add(tmp.clone());
					}
				}
				
				// Left n steps
				f_stop = false;
				for(n=1; n<8; n++){
					tmp[0] = piece;
					tmp[1] = x;
					tmp[2] = y - n;
					tmp[3] = kind;
					tmp[5] = 0;
					tmp[6] = 0;
					tmp[7] = 0;
					tmp[8] = 0;
					if(f_stop == false){
						tmp[4] = 1;	//can move
						if(y - n < 1) {
							tmp[4] = 0;	//cannot move
							f_stop = true;
						}else{
							for(i=0; i<16; i++){
								if((p1_piece[i][1] == x) && (p1_piece[i][2] == y - n)){
									tmp[4] = 0;	//cannot move
									f_stop = true;
								}else if((p2_piece[i][1] == x) && (p2_piece[i][2] == y - n)){
									tmp[4] = 1;	//can move
									f_stop = true;
									break;
								}
							}
						}
					}else{
						tmp[4] = 0;	//cannot move
					}
					if(tmp[4] == 1){
						possibility.add(tmp.clone());
					}
				}
				
				// Front Left n steps
				f_stop = false;
				for(n=1; n<8; n++){
					tmp[0] = piece;
					tmp[1] = x + n;
					tmp[2] = y - n;
					tmp[3] = kind;
					tmp[5] = 0;
					tmp[6] = 0;
					tmp[7] = 0;
					tmp[8] = 0;
					if(f_stop == false){
						tmp[4] = 1;	//can move
						if((x + n > 8) || (y - n < 1)) {
							tmp[4] = 0;	//cannot move
							f_stop = true;
						}else{
							for(i=0; i<16; i++){
								if((p1_piece[i][1] == x + n) && (p1_piece[i][2] == y - n)){
									tmp[4] = 0;	//cannot move
									f_stop = true;
								}else if((p2_piece[i][1] == x + n) && (p2_piece[i][2] == y - n)){
									tmp[4] = 1;	//can move
									f_stop = true;
									break;
								}
							}
						}
					}else{
						tmp[4] = 0;	//cannot move
					}
					if(tmp[4] == 1){
						possibility.add(tmp.clone());
					}
				}
				
				break;
				
			case 2:		//B
				// Front Right n steps
				f_stop = false;
				for(n=1; n<8; n++){
					tmp[0] = piece;
					tmp[1] = x + n;
					tmp[2] = y + n;
					tmp[3] = kind;
					tmp[5] = 0;
					tmp[6] = 0;
					tmp[7] = 0;
					tmp[8] = 0;
					if(f_stop == false){
						tmp[4] = 1;	//can move
						if((x + n > 8) || (y + n > 8)) {
							tmp[4] = 0;	//cannot move
							f_stop = true;
						}else{
							for(i=0; i<16; i++){
								if((p1_piece[i][1] == x + n) && (p1_piece[i][2] == y + n)){
									tmp[4] = 0;	//cannot move
									f_stop = true;
								}else if((p2_piece[i][1] == x + n) && (p2_piece[i][2] == y + n)){
									tmp[4] = 1;	//can move
									f_stop = true;
									break;
								}
							}
						}
					}else{
						tmp[4] = 0;	//cannot move
					}
					if(tmp[4] == 1){
						possibility.add(tmp.clone());
					}
				}
				
				// Back Right n steps
				f_stop = false;
				for(n=1; n<8; n++){
					tmp[0] = piece;
					tmp[1] = x - n;
					tmp[2] = y + n;
					tmp[3] = kind;
					tmp[5] = 0;
					tmp[6] = 0;
					tmp[7] = 0;
					tmp[8] = 0;
					if(f_stop == false){
						tmp[4] = 1;	//can move
						if((x - n < 1) || (y + n > 8)) {
							tmp[4] = 0;	//cannot move
							f_stop = true;
						}else{
							for(i=0; i<16; i++){
								if((p1_piece[i][1] == x - n) && (p1_piece[i][2] == y + n)){
									tmp[4] = 0;	//cannot move
									f_stop = true;
								}else if((p2_piece[i][1] == x - n) && (p2_piece[i][2] == y + n)){
									tmp[4] = 1;	//can move
									f_stop = true;
									break;
								}
							}
						}
					}else{
						tmp[4] = 0;	//cannot move
					}
					if(tmp[4] == 1){
						possibility.add(tmp.clone());
					}
				}
				
				// Back Left n steps
				f_stop = false;
				for(n=1; n<8; n++){
					tmp[0] = piece;
					tmp[1] = x - n;
					tmp[2] = y - n;
					tmp[3] = kind;
					tmp[5] = 0;
					tmp[6] = 0;
					tmp[7] = 0;
					tmp[8] = 0;
					if(f_stop == false){
						tmp[4] = 1;	//can move
						if((x - n < 1) || (y - n < 1)) {
							tmp[4] = 0;	//cannot move
							f_stop = true;
						}else{
							for(i=0; i<16; i++){
								if((p1_piece[i][1] == x - n) && (p1_piece[i][2] == y - n)){
									tmp[4] = 0;	//cannot move
									f_stop = true;
								}else if((p2_piece[i][1] == x - n) && (p2_piece[i][2] == y - n)){
									tmp[4] = 1;	//can move
									f_stop = true;
									break;
								}
							}
						}
					}else{
						tmp[4] = 0;	//cannot move
					}
					if(tmp[4] == 1){
						possibility.add(tmp.clone());
					}
				}
				
				// Front Left n steps
				f_stop = false;
				for(n=1; n<8; n++){
					tmp[0] = piece;
					tmp[1] = x + n;
					tmp[2] = y - n;
					tmp[3] = kind;
					tmp[5] = 0;
					tmp[6] = 0;
					tmp[7] = 0;
					tmp[8] = 0;
					if(f_stop == false){
						tmp[4] = 1;	//can move
						if((x + n > 8) || (y - n < 1)) {
							tmp[4] = 0;	//cannot move
							f_stop = true;
						}else{
							for(i=0; i<16; i++){
								if((p1_piece[i][1] == x + n) && (p1_piece[i][2] == y - n)){
									tmp[4] = 0;	//cannot move
									f_stop = true;
								}else if((p2_piece[i][1] == x + n) && (p2_piece[i][2] == y - n)){
									tmp[4] = 1;	//can move
									f_stop = true;
									break;
								}
							}
						}
					}else{
						tmp[4] = 0;	//cannot move
					}
					if(tmp[4] == 1){
						possibility.add(tmp.clone());
					}
				}
				
				break;
		
			case 3:		//H
				// Front Front Right				
				tmp[0] = piece;
				tmp[1] = x + 2;
				tmp[2] = y + 1;
				tmp[3] = kind;
				tmp[4] = 1;			//can move
				tmp[5] = 0;
				tmp[6] = 0;
				tmp[7] = 0;
				tmp[8] = 0;
				if((x + 2 > 8) || (y + 1 > 8)) {
					tmp[4] = 0;	//cannot move
				}else{
					for(i=0; i<16; i++){
						if((p1_piece[i][1] == x + 2) && (p1_piece[i][2] == y + 1)){
							tmp[4] = 0;	//cannot move
							break;
						}
					}
				}
				if(tmp[4] == 1){
					possibility.add(tmp.clone());
				}
				
				// Front Right Right				
				tmp[0] = piece;
				tmp[1] = x + 1;
				tmp[2] = y + 2;
				tmp[3] = kind;
				tmp[4] = 1;			//can move
				tmp[5] = 0;
				tmp[6] = 0;
				tmp[7] = 0;
				tmp[8] = 0;
				if((x + 1 > 8) || (y + 2 > 8)) {
					tmp[4] = 0;	//cannot move
				}else{
					for(i=0; i<16; i++){
						if((p1_piece[i][1] == x + 1) && (p1_piece[i][2] == y + 2)){
							tmp[4] = 0;	//cannot move
							break;
						}
					}
				}
				if(tmp[4] == 1){
					possibility.add(tmp.clone());
				}
				
				// Back Right Right				
				tmp[0] = piece;
				tmp[1] = x - 1;
				tmp[2] = y + 2;
				tmp[3] = kind;
				tmp[4] = 1;			//can move
				tmp[5] = 0;
				tmp[6] = 0;
				tmp[7] = 0;
				tmp[8] = 0;
				if((x - 1 < 1) || (y + 2 > 8)) {
					tmp[4] = 0;	//cannot move
				}else{
					for(i=0; i<16; i++){
						if((p1_piece[i][1] == x - 1) && (p1_piece[i][2] == y + 2)){
							tmp[4] = 0;	//cannot move
							break;
						}
					}
				}
				if(tmp[4] == 1){
					possibility.add(tmp.clone());
				}
				
				// Back Back Right				
				tmp[0] = piece;
				tmp[1] = x - 2;
				tmp[2] = y + 1;
				tmp[3] = kind;
				tmp[4] = 1;			//can move
				tmp[5] = 0;
				tmp[6] = 0;
				tmp[7] = 0;
				tmp[8] = 0;
				if((x - 2 < 1) || (y + 1 > 8)) {
					tmp[4] = 0;	//cannot move
				}else{
					for(i=0; i<16; i++){
						if((p1_piece[i][1] == x - 2) && (p1_piece[i][2] == y + 1)){
							tmp[4] = 0;	//cannot move
							break;
						}
					}
				}
				if(tmp[4] == 1){
					possibility.add(tmp.clone());
				}
				
				// Back Back Left				
				tmp[0] = piece;
				tmp[1] = x - 2;
				tmp[2] = y - 1;
				tmp[3] = kind;
				tmp[4] = 1;			//can move
				tmp[5] = 0;
				tmp[6] = 0;
				tmp[7] = 0;
				tmp[8] = 0;
				if((x - 2 < 1) || (y - 1 < 1)) {
					tmp[4] = 0;	//cannot move
				}else{
					for(i=0; i<16; i++){
						if((p1_piece[i][1] == x - 2) && (p1_piece[i][2] == y - 1)){
							tmp[4] = 0;	//cannot move
							break;
						}
					}
				}
				if(tmp[4] == 1){
					possibility.add(tmp.clone());
				}
				
				// Back Left Left				
				tmp[0] = piece;
				tmp[1] = x - 1;
				tmp[2] = y - 2;
				tmp[3] = kind;
				tmp[4] = 1;			//can move
				tmp[5] = 0;
				tmp[6] = 0;
				tmp[7] = 0;
				tmp[8] = 0;
				if((x - 1 < 1) || (y - 2 < 1)) {
					tmp[4] = 0;	//cannot move
				}else{
					for(i=0; i<16; i++){
						if((p1_piece[i][1] == x - 1) && (p1_piece[i][2] == y - 2)){
							tmp[4] = 0;	//cannot move
							break;
						}
					}
				}
				if(tmp[4] == 1){
					possibility.add(tmp.clone());
				}
				
				// Front Left Left				
				tmp[0] = piece;
				tmp[1] = x + 1;
				tmp[2] = y - 2;
				tmp[3] = kind;
				tmp[4] = 1;			//can move
				tmp[5] = 0;
				tmp[6] = 0;
				tmp[7] = 0;
				tmp[8] = 0;
				if((x + 1 > 8) || (y - 2 < 1)) {
					tmp[4] = 0;	//cannot move
				}else{
					for(i=0; i<16; i++){
						if((p1_piece[i][1] == x + 1) && (p1_piece[i][2] == y - 2)){
							tmp[4] = 0;	//cannot move
							break;
						}
					}
				}
				if(tmp[4] == 1){
					possibility.add(tmp.clone());
				}
				
				// Front Front Left				
				tmp[0] = piece;
				tmp[1] = x + 2;
				tmp[2] = y - 1;
				tmp[3] = kind;
				tmp[4] = 1;			//can move
				tmp[5] = 0;
				tmp[6] = 0;
				tmp[7] = 0;
				tmp[8] = 0;
				if((x + 2 > 8) || (y - 1 < 1)) {
					tmp[4] = 0;	//cannot move
				}else{
					for(i=0; i<16; i++){
						if((p1_piece[i][1] == x + 2) && (p1_piece[i][2] == y - 1)){
							tmp[4] = 0;	//cannot move
							break;
						}
					}
				}
				if(tmp[4] == 1){
					possibility.add(tmp.clone());
				}
				
				break;
				
			case 4: //R
				// Front n steps
				f_stop = false;
				for(n=1; n<8; n++){
					tmp[0] = piece;
					tmp[1] = x + n;
					tmp[2] = y;
					tmp[3] = kind;
					tmp[5] = 0;
					tmp[6] = 0;
					tmp[7] = 0;
					tmp[8] = 0;
					if(f_stop == false){
						tmp[4] = 1;	//can move
						if(x + n > 8) {
							tmp[4] = 0;	//cannot move
							f_stop = true;
						}else{
							for(i=0; i<16; i++){
								if((p1_piece[i][1] == x + n) && (p1_piece[i][2] == y)){
									tmp[4] = 0;	//cannot move
									f_stop = true;
								}else if((p2_piece[i][1] == x + n) && (p2_piece[i][2] == y)){
									tmp[4] = 1;	//can move
									f_stop = true;
									break;
								}
							}
						}
					}else{
						tmp[4] = 0;	//cannot move
					}
					if(tmp[4] == 1){
						possibility.add(tmp.clone());
					}
				}
				
				// Right n steps
				f_stop = false;
				for(n=1; n<8; n++){
					tmp[0] = piece;
					tmp[1] = x;
					tmp[2] = y + n;
					tmp[3] = kind;
					tmp[5] = 0;
					tmp[6] = 0;
					tmp[7] = 0;
					tmp[8] = 0;
					if(f_stop == false){
						tmp[4] = 1;	//can move
						if(y + n > 8) {
							tmp[4] = 0;	//cannot move
							f_stop = true;
						}else{
							for(i=0; i<16; i++){
								if((p1_piece[i][1] == x) && (p1_piece[i][2] == y + n)){
									tmp[4] = 0;	//cannot move
									f_stop = true;
								}else if((p2_piece[i][1] == x) && (p2_piece[i][2] == y + n)){
									tmp[4] = 1;	//can move
									f_stop = true;
									break;
								}
							}
						}
					}else{
						tmp[4] = 0;	//cannot move
					}
					if(tmp[4] == 1){
						possibility.add(tmp.clone());
					}
				}
				
				// Back n steps
				f_stop = false;
				for(n=1; n<8; n++){
					tmp[0] = piece;
					tmp[1] = x - n;
					tmp[2] = y;
					tmp[3] = kind;
					tmp[5] = 0;
					tmp[6] = 0;
					tmp[7] = 0;
					tmp[8] = 0;
					if(f_stop == false){
						tmp[4] = 1;	//can move
						if(x - n < 1) {
							tmp[4] = 0;	//cannot move
							f_stop = true;
						}else{
							for(i=0; i<16; i++){
								if((p1_piece[i][1] == x - n) && (p1_piece[i][2] == y)){
									tmp[4] = 0;	//cannot move
									f_stop = true;
								}else if((p2_piece[i][1] == x - n) && (p2_piece[i][2] == y)){
									tmp[4] = 1;	//can move
									f_stop = true;
									break;
								}
							}
						}
					}else{
						tmp[4] = 0;	//cannot move
					}
					if(tmp[4] == 1){
						possibility.add(tmp.clone());
					}
				}
				
				// Left n steps
				f_stop = false;
				for(n=1; n<8; n++){
					tmp[0] = piece;
					tmp[1] = x;
					tmp[2] = y - n;
					tmp[3] = kind;
					tmp[5] = 0;
					tmp[6] = 0;
					tmp[7] = 0;
					tmp[8] = 0;
					if(f_stop == false){
						tmp[4] = 1;	//can move
						if(y - n < 1) {
							tmp[4] = 0;	//cannot move
							f_stop = true;
						}else{
							for(i=0; i<16; i++){
								if((p1_piece[i][1] == x) && (p1_piece[i][2] == y - n)){
									tmp[4] = 0;	//cannot move
									f_stop = true;
								}else if((p2_piece[i][1] == x) && (p2_piece[i][2] == y - n)){
									tmp[4] = 1;	//can move
									f_stop = true;
									break;
								}
							}
						}
					}else{
						tmp[4] = 0;	//cannot move
					}
					if(tmp[4] == 1){
						possibility.add(tmp.clone());
					}
				}
				
				break;
			
			case 5:		//P
				// for en_passant
				boolean f_ep_tmp = false;
				
				// Front 1 step				
				tmp[0] = piece;
				tmp[1] = x + (1 * sign);
				tmp[2] = y;
				tmp[3] = kind;
				tmp[4] = 1;			//can move
				tmp[5] = 0;
				tmp[6] = 0;
				tmp[7] = 0;
				tmp[8] = 0;
				if((x + (1 * sign) > 8) || (x + (1 * sign) < 1)) {
					tmp[4] = 0;	//cannot move
				}else{
					for(i=0; i<16; i++){
						if((p1_piece[i][1] == x + (1 * sign)) && (p1_piece[i][2] == y)){
							tmp[4] = 0;	//cannot move
							break;
						}else if((p2_piece[i][1] == x + (1 * sign)) && (p2_piece[i][2] == y)){
							tmp[4] = 0;	//cannot move
							break;
						}
					}
				}
				if(tmp[4] == 1){
					possibility.add(tmp.clone());
				}
				
				// Front 2 steps				
				tmp[0] = piece;
				tmp[1] = x + (2 * sign);
				tmp[2] = y;
				tmp[3] = kind;
				tmp[4] = 1;			//can move
				tmp[5] = 1;
				tmp[6] = 0;
				tmp[7] = 0;
				tmp[8] = 0;
				if((player.equals("me")) && (x != 2)) {
					tmp[4] = 0;	//cannot move
				}else if(player.equals("oppo") && (x != 7)){
					tmp[4] = 0;	//cannot move
				}else{
					for(i=0; i<16; i++){
						if((p1_piece[i][1] == x + (1 * sign)) && (p1_piece[i][2] == y)){
							tmp[4] = 0;	//cannot move
							break;
						}else if((p2_piece[i][1] == x + (1 * sign)) && (p2_piece[i][2] == y)){
							tmp[4] = 0;	//cannot move
							break;
						}else if((p1_piece[i][1] == x + (2 * sign)) && (p1_piece[i][2] == y)){
							tmp[4] = 0;	//cannot move
							break;
						}else if((p2_piece[i][1] == x + (2 * sign)) && (p2_piece[i][2] == y)){
							tmp[4] = 0;	//cannot move
							break;
						}
					}
				}
				if(tmp[4] == 1){
					possibility.add(tmp.clone());
				}
				
				// Front Left 1 step				
				tmp[0] = piece;
				tmp[1] = x + (1 * sign);
				tmp[2] = y - (1 * sign);
				tmp[3] = kind;
				tmp[4] = 0;			//cannot move
				tmp[5] = 0;
				tmp[6] = 0;
				tmp[7] = 0;
				tmp[8] = 0;
				for(i=0; i<16; i++){
					if((p2_piece[i][1] == x + (1 * sign)) && (p2_piece[i][2] == y - (1 * sign))){
						tmp[4] = 1;	//can move
						break;
					}
				}
				
				if(tmp[4] == 0){ 		// check possibility of en_passant
					if(((player.equals("me")) && (x == 5)) || ((player.equals("oppo")) && (x == 4))){		// my side or oppo side
						//check there's no p1's piece at front left
						f_ep_tmp = true;
						for(i=0; i<16; i++){
							if((p1_piece[i][1] == x + (1 * sign)) && (p1_piece[i][2] == y - (1 * sign))){
								f_ep_tmp = false;
								break;
							}
						}
						if(f_ep_tmp == true){	//there's no piece (p1 & p2) at front left
							f_ep_tmp = false;
							for(i=0; i<16; i++){
								if((p2_piece[i][1] == x) && (p2_piece[i][2] == y - (1 * sign)) && (p2_piece[i][3] == 5)){ //there's p2 pone at left
									if(((player.equals("me")) && (this.f_en_passant[1][i] == true)) || ((player.equals("oppo")) && (this.f_en_passant[0][i] == true))){
										f_ep_tmp = true;
										break;
									}
								}
							}
						}
						if(f_ep_tmp == true){
							tmp[4] = 1;
							tmp[6] = 1;
							tmp[7] = i;
						}
					}
				}
				
				if(tmp[4] == 1){
					possibility.add(tmp.clone());
				}
				
				// Front Right 1 step				
				tmp[0] = piece;
				tmp[1] = x + (1 * sign);
				tmp[2] = y + (1 * sign);
				tmp[3] = kind;
				tmp[4] = 0;			//cannot move
				tmp[5] = 0;
				tmp[6] = 0;
				tmp[7] = 0;
				tmp[8] = 0;
				for(i=0; i<16; i++){
					if((p2_piece[i][1] == x + (1 * sign)) && (p2_piece[i][2] == y + (1 * sign))){
						tmp[4] = 1;	//can move
						break;
					}
				}
				
				if(tmp[4] == 0){ 		// check possibility of en_passant
					if(((player.equals("me")) && (x == 5)) || ((player.equals("oppo")) && (x == 4))){		// my side or oppo side
						//check there's no p1's piece at front left
						f_ep_tmp = true;
						for(i=0; i<16; i++){
							if((p1_piece[i][1] == x + (1 * sign)) && (p1_piece[i][2] == y + (1 * sign))){
								f_ep_tmp = false;
								break;
							}
						}
						if(f_ep_tmp == true){	//there's no piece (p1 & p2) at front left
							f_ep_tmp = false;
							for(i=0; i<16; i++){
								if((p2_piece[i][1] == x) && (p2_piece[i][2] == y + (1 * sign)) && (p2_piece[i][3] == 5)){ //there's p2 pone at right
									if(((player.equals("me")) && (this.f_en_passant[1][i] == true)) || ((player.equals("oppo")) && (this.f_en_passant[0][i] == true))){
										f_ep_tmp = true;
										break;
									}
								}
							}
						}
						if(f_ep_tmp == true){
							tmp[4] = 1;
							tmp[6] = 1;
							tmp[7] = i;
						}
					}
				}
				
				if(tmp[4] == 1){
					possibility.add(tmp.clone());
				}
								
				break;
		}
		return possibility;
	}
	//generate nextstep field
	public ArrayList<Field> generate_nextstep_fields(String player, ArrayList<int[]> possibility){
		ArrayList<Field> nextstep = new ArrayList<Field>();
		int i;
		for(i=0; i<possibility.size(); i++){
			if(possibility.get(i)[4] == 1){
				Field child = new Field();
				child.set_field(this);
				child.move_piece(player, possibility.get(i)[0], possibility.get(i)[1], possibility.get(i)[2], possibility.get(i)[3], possibility.get(i)[5], possibility.get(i)[6], possibility.get(i)[7], possibility.get(i)[8]);
				nextstep.add(child);
			}
		}
		return nextstep;
	}

	//consider 1 turn and get the best move
	public int[] get_best_move_1turn(boolean f_msg, boolean f_debug){
		long starttime = System.currentTimeMillis();
		if(f_debug == true){
			System.out.println("my next possible moves : ");
		}
		
		int i,j;
		ArrayList<int[]> possibility_1st = new ArrayList<int[]>();
		ArrayList<int[]> possibility_2nd = new ArrayList<int[]>();
		ArrayList<Integer> min_pt_of_2nd_move = new ArrayList<Integer>();
		
		//1st step
		//get_available_moves
		possibility_1st = this.get_available_moves("me");
		if(f_debug == true){
			for(i=0; i<possibility_1st.size(); i++){
				System.out.println(Arrays.toString(possibility_1st.get(i)));
			}
		}
		//generate_nextstep_fields
		ArrayList<Field> nextstep_1st = new ArrayList<Field>();
		nextstep_1st = this.generate_nextstep_fields("me", possibility_1st);
		
		//2nd step
		for(i=0; i<nextstep_1st.size(); i++){
			//get_available_moves
			possibility_2nd = nextstep_1st.get(i).get_available_moves("oppo");
			int min_pt = 999;
			if(f_debug == true){
				System.out.println("possible moves for 1st move : " + i);
				for(j=0; j<possibility_2nd.size(); j++){
					System.out.println(Arrays.toString(possibility_2nd.get(j)));
				}
			}
			
			//generate_neststep_fields
			ArrayList<Field> nextstep_2nd = new ArrayList<Field>();
			nextstep_2nd = nextstep_1st.get(i).generate_nextstep_fields("oppo", possibility_2nd);
			for(j=0; j<nextstep_2nd.size(); j++){
				if(min_pt > nextstep_2nd.get(j).evaluate()){
					min_pt = nextstep_2nd.get(j).evaluate();
				}
			}
			min_pt_of_2nd_move.add(min_pt);
			if(f_debug == true){
				System.out.println("min_pt = " + min_pt);
			}
		}
		
		if(f_debug == true){
			System.out.println("\n" + "min_pt_of_2nd_move : ");
			for(i=0; i<min_pt_of_2nd_move.size(); i++){
				System.out.println(i + " = " + Arrays.toString(possibility_1st.get(i)) + " : " + min_pt_of_2nd_move.get(i));
			}
		}
		
		//specify the best 1st move
		int tmp_max_point = -999;
		int tmp_max_index = -999;
		for(i=0; i<min_pt_of_2nd_move.size(); i++){
			if(tmp_max_point <= min_pt_of_2nd_move.get(i)){
				tmp_max_point = min_pt_of_2nd_move.get(i);
				tmp_max_index = i;
			}
		}
		if(f_debug == true){
			System.out.println("BEST = 1st move : " + tmp_max_index + " / 2nd move min pt = " + tmp_max_point + " (before random selection)\n");
		}
	
		//list up candidates
		ArrayList<Integer> candidates_1stmove_index = new ArrayList<Integer>();
		for(i=0; i<min_pt_of_2nd_move.size(); i++){
			if(tmp_max_point == min_pt_of_2nd_move.get(i)){
				candidates_1stmove_index.add(i);
			}
		}
		for(i=0; i<candidates_1stmove_index.size(); i++){
			if(f_debug == true){
				System.out.println("candidate / " + candidates_1stmove_index.get(i) + " = " + Arrays.toString(possibility_1st.get(candidates_1stmove_index.get(i))) + " : " + min_pt_of_2nd_move.get(candidates_1stmove_index.get(i)));
			}
			
		}
		
		//random selection
		Random rnd = new Random();
		int chosen_index = candidates_1stmove_index.get(rnd.nextInt(candidates_1stmove_index.size()));
		int chosen_piece = possibility_1st.get(chosen_index)[0];
		int chosen_x = possibility_1st.get(chosen_index)[1];
		int chosen_y = possibility_1st.get(chosen_index)[2];
		int chosen_kind = possibility_1st.get(chosen_index)[3];
		int pone_2steps = possibility_1st.get(chosen_index)[5];
		int en_passant = possibility_1st.get(chosen_index)[6];
		int pone_to_be_taken = possibility_1st.get(chosen_index)[7];

		long endtime = System.currentTimeMillis();
		if(f_debug == true){
			System.out.println("\n" + "start : " + starttime + " / end : " + endtime + " / duration : " + (endtime-starttime));
		}
			
		String msg = new String("\n" + "#candidates:" + candidates_1stmove_index.size() + "\n" + "chosenindex:" + chosen_index);
		msg = msg + "\n\n" + "piece = " + chosen_piece + " (kind = " + chosen_kind + ")";
		msg = msg + "\n" + "x = " + chosen_x;
		msg = msg + "\n" + "y = " + chosen_y;
		msg = msg + "\n" + "min_point after 2nd step = " + tmp_max_point;
		if(f_msg == true){
			JOptionPane.showMessageDialog(null, msg);
		}
		if(f_debug == true){
			System.out.println(msg);
		}
		int[] return_move = {chosen_piece, chosen_x, chosen_y, chosen_kind, tmp_max_point, pone_2steps, en_passant, pone_to_be_taken};
		return return_move;
	}
	
	//recursive search
	public int[] search_moves(int turn){
		long starttime = System.currentTimeMillis();
		System.out.println("search_moves : " + starttime);
	
		int i,j;
		ArrayList<int[]> possibility_1st = new ArrayList<int[]>();
		ArrayList<int[]> possibility_2nd = new ArrayList<int[]>();
		ArrayList<Field> nextstep_1st = new ArrayList<Field>();
		ArrayList<Field> nextstep_2nd = new ArrayList<Field>();
		ArrayList<Integer> min_pt_of_2nd_move = new ArrayList<Integer>();
		
		//1st step
		//get_available_moves
		possibility_1st = this.get_available_moves("me");
		//generate_nextstep_fields
		nextstep_1st = this.generate_nextstep_fields("me", possibility_1st);
		
		//2nd step
		for(i=0; i<nextstep_1st.size(); i++){
			//get_available_moves
			possibility_2nd = nextstep_1st.get(i).get_available_moves("oppo");
			int min_pt = 999;
			//generate_neststep_fields
			nextstep_2nd = nextstep_1st.get(i).generate_nextstep_fields("oppo", possibility_2nd);
			for(j=0; j<nextstep_2nd.size(); j++){
				//this is the last turn to consider. evaluate and return back
				if(turn == 1){
					int tmp_pt = nextstep_2nd.get(j).evaluate();
					if(min_pt > tmp_pt){
						min_pt = tmp_pt;
					}
				}
				//still next turn is there. recursively call. 
				if(turn != 1){
					int tmp[] = nextstep_2nd.get(j).search_moves(turn - 1);
					int tmp_pt = tmp[4];
					if(min_pt > tmp_pt){
						min_pt = tmp_pt;
					}
				}
				
			}
			min_pt_of_2nd_move.add(min_pt);
		}
		
		//specify the best 1st move
		int tmp_max_point = -999;
		for(i=0; i<min_pt_of_2nd_move.size(); i++){
			if(tmp_max_point <= min_pt_of_2nd_move.get(i)){
				tmp_max_point = min_pt_of_2nd_move.get(i);
			}
		}
	
		//list up candidates
		ArrayList<Integer> candidates_1stmove_index = new ArrayList<Integer>();
		for(i=0; i<min_pt_of_2nd_move.size(); i++){
			if(tmp_max_point == min_pt_of_2nd_move.get(i)){
				candidates_1stmove_index.add(i);
			}
		}
		
		//random selection
		Random rnd = new Random();
		int chosen_index = candidates_1stmove_index.get(rnd.nextInt(candidates_1stmove_index.size()));
		int chosen_piece = possibility_1st.get(chosen_index)[0];
		int chosen_x = possibility_1st.get(chosen_index)[1];
		int chosen_y = possibility_1st.get(chosen_index)[2];
		int chosen_kind = possibility_1st.get(chosen_index)[3];
		int pone_2steps = possibility_1st.get(chosen_index)[5];
		int en_passant = possibility_1st.get(chosen_index)[6];
		int pone_to_be_taken = possibility_1st.get(chosen_index)[7];
		int castling = possibility_1st.get(chosen_index)[8];
			
		int[] return_move = {chosen_piece, chosen_x, chosen_y, chosen_kind, tmp_max_point, pone_2steps, en_passant, pone_to_be_taken, castling};
		return return_move;
	}

}