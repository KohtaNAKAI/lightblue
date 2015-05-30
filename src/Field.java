import java.util.*;

public class Field {
	public int myPiece[][] = new int[16][3];
	public int oppoPiece[][] = new int[16][3];
	
	//constructor
	public Field(){
		//myPiece
		//K
		this.myPiece[0][0] = 0;
		this.myPiece[0][1] = 1;
		this.myPiece[0][2] = 4;
		//Q
		this.myPiece[1][0] = 1;
		this.myPiece[1][1] = 1;
		this.myPiece[1][2] = 5;
		//B1
		this.myPiece[2][0] = 2;
		this.myPiece[2][1] = 1;
		this.myPiece[2][2] = 3;
		//B2
		this.myPiece[3][0] = 3;
		this.myPiece[3][1] = 1;
		this.myPiece[3][2] = 6;
		//H1
		this.myPiece[4][0] = 4;
		this.myPiece[4][1] = 1;
		this.myPiece[4][2] = 2;
		//H2
		this.myPiece[5][0] = 5;
		this.myPiece[5][1] = 1;
		this.myPiece[5][2] = 7;
		//R1
		this.myPiece[6][0] = 6;
		this.myPiece[6][1] = 1;
		this.myPiece[6][2] = 1;
		//R2
		this.myPiece[7][0] = 7;
		this.myPiece[7][1] = 1;
		this.myPiece[7][2] = 8;
		//P1
		this.myPiece[8][0] = 8;
		this.myPiece[8][1] = 2;
		this.myPiece[8][2] = 1;
		//P2
		this.myPiece[9][0] = 9;
		this.myPiece[9][1] = 2;
		this.myPiece[9][2] = 2;
		//P3
		this.myPiece[10][0] = 10;
		this.myPiece[10][1] = 2;
		this.myPiece[10][2] = 3;
		//P4
		this.myPiece[11][0] = 11;
		this.myPiece[11][1] = 2;
		this.myPiece[11][2] = 4;
		//P5
		this.myPiece[12][0] = 12;
		this.myPiece[12][1] = 2;
		this.myPiece[12][2] = 5;
		//P6
		this.myPiece[13][0] = 13;
		this.myPiece[13][1] = 2;
		this.myPiece[13][2] = 6;
		//P7
		this.myPiece[14][0] = 14;
		this.myPiece[14][1] = 2;
		this.myPiece[14][2] = 7;
		//P8
		this.myPiece[15][0] = 15;
		this.myPiece[15][1] = 2;
		this.myPiece[15][2] = 8;
		
		//OppoPiece
		//K
		this.oppoPiece[0][0] = 0;
		this.oppoPiece[0][1] = 8;
		this.oppoPiece[0][2] = 4;
		//Q
		this.oppoPiece[1][0] = 1;
		this.oppoPiece[1][1] = 8;
		this.oppoPiece[1][2] = 5;
		//B1
		this.oppoPiece[2][0] = 2;
		this.oppoPiece[2][1] = 8;
		this.oppoPiece[2][2] = 3;
		//B2
		this.oppoPiece[3][0] = 3;
		this.oppoPiece[3][1] = 8;
		this.oppoPiece[3][2] = 6;
		//H1
		this.oppoPiece[4][0] = 4;
		this.oppoPiece[4][1] = 8;
		this.oppoPiece[4][2] = 2;
		//H2
		this.oppoPiece[5][0] = 5;
		this.oppoPiece[5][1] = 8;
		this.oppoPiece[5][2] = 7;
		//R1
		this.oppoPiece[6][0] = 6;
		this.oppoPiece[6][1] = 8;
		this.oppoPiece[6][2] = 1;
		//R2
		this.oppoPiece[7][0] = 7;
		this.oppoPiece[7][1] = 8;
		this.oppoPiece[7][2] = 8;
		//P1
		this.oppoPiece[8][0] = 8;
		this.oppoPiece[8][1] = 7;
		this.oppoPiece[8][2] = 1;
		//P2
		this.oppoPiece[9][0] = 9;
		this.oppoPiece[9][1] = 7;
		this.oppoPiece[9][2] = 2;
		//P3
		this.oppoPiece[10][0] = 10;
		this.oppoPiece[10][1] = 7;
		this.oppoPiece[10][2] = 3;
		//P4
		this.oppoPiece[11][0] = 11;
		this.oppoPiece[11][1] = 7;
		this.oppoPiece[11][2] = 4;
		//P5
		this.oppoPiece[12][0] = 12;
		this.oppoPiece[12][1] = 7;
		this.oppoPiece[12][2] = 5;
		//P6
		this.oppoPiece[13][0] = 13;
		this.oppoPiece[13][1] = 7;
		this.oppoPiece[13][2] = 6;
		//P7
		this.oppoPiece[14][0] = 14;
		this.oppoPiece[14][1] = 7;
		this.oppoPiece[14][2] = 7;
		//P8
		this.oppoPiece[15][0] = 15;
		this.oppoPiece[15][1] = 7;
		this.oppoPiece[15][2] = 8;
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
		for(i=0; i<16; i++){
			for(j=0; j<3; j++){
				this.myPiece[i][j] = given_field.myPiece[i][j];
				this.oppoPiece[i][j] = given_field.oppoPiece[i][j];
			}
		}
	}
	//move piece
	public void move_piece(String player, int piece, int x, int y){
		int i;
		if(player.equals("me")){
			this.myPiece[piece][1] = x;
			this.myPiece[piece][2] = y;
			
			//atarihantei
			for(i=0; i<16; i++){
				if((this.oppoPiece[i][1] == x) && (this.oppoPiece[i][2] == y)){
					this.oppoPiece[i][0] = -99;
					this.oppoPiece[i][1] = 0;
					this.oppoPiece[i][2] = 0;
					break;
				}
			}
		}else{
			this.oppoPiece[piece][1] = x;
			this.oppoPiece[piece][2] = y;
			
			//atarihantei
			for(i=0; i<16; i++){
				if((this.myPiece[i][1] == x) && (this.myPiece[i][2] == y)){
					this.myPiece[i][0] = -99;
					this.myPiece[i][1] = 0;
					this.myPiece[i][2] = 0;
					break;
				}
			}
		}
	}
	//get evaluation point of the situation
	public int evaluate(){
		int i;
		int mypoint = 0;
		for(i=0; i<16; i++){
			switch(this.myPiece[i][0]){
				case 0:		//K
					mypoint = mypoint + 100;
					break;
				case 1: 	//Q
					mypoint = mypoint + 9;
					break;
				case 2: 	//B1
				case 3: 	//B2
					mypoint = mypoint + 3;
					break;
				case 4: 	//H1
				case 5: 	//H2
					mypoint = mypoint + 3;
					break;
				case 6: 	//R1
				case 7: 	//R2
					mypoint = mypoint + 5;
					break;
				case 8: 	//P1
				case 9: 	//P2
				case 10: 	//P3
				case 11: 	//P4
				case 12: 	//P5
				case 13: 	//P6
				case 14: 	//P7
				case 15: 	//P8
					mypoint = mypoint + 1;
					break;
				default:
					break;
			}
		}
		//System.out.println("mypoint = " + Integer.toString(mypoint));
		
		int oppopoint = 0;
		for(i=0; i<16; i++){
			switch(this.oppoPiece[i][0]){
				case 0:		//K
					oppopoint = oppopoint + 100;
					break;
				case 1: 	//Q
					oppopoint = oppopoint + 9;
					break;
				case 2: 	//B1
				case 3: 	//B2
					oppopoint = oppopoint + 3;
					break;
				case 4: 	//H1
				case 5: 	//H2
					oppopoint = oppopoint + 3;
					break;
				case 6: 	//R1
				case 7: 	//R2
					oppopoint = oppopoint + 5;
					break;
				case 8: 	//P1
				case 9: 	//P2
				case 10: 	//P3
				case 11: 	//P4
				case 12: 	//P5
				case 13: 	//P6
				case 14: 	//P7
				case 15: 	//P8
					oppopoint = oppopoint + 1;
					break;
				default:
					break;
			}
		}
		//System.out.println("oppopoint = " + Integer.toString(oppopoint));
		
		return mypoint - oppopoint;
	}
	//get all possible moves
	public ArrayList<int[]> get_available_moves(String player){
		ArrayList<int[]> possibility = new ArrayList<int[]>();
		int i,j;
		for(i=0; i<16; i++){
			if(this.myPiece[i][0] != -99){
				ArrayList<int[]> tmp_possibility = new ArrayList<int[]>();
				tmp_possibility = get_available_moves(player,i);
				for(j=0; j<tmp_possibility.size(); j++){
					possibility.add(tmp_possibility.get(j).clone());
				}
			}
		}
		return possibility;
	}
	//get possible moves for designated piece
	public ArrayList<int[]> get_available_moves(String player, int piece){
		int p1_piece[][] = new int[16][3];
		int p2_piece[][] = new int[16][3];
		int i,j;
		if(player.equals("me")){
			//my step : copy myPiece to p1_piece, oppoPiece to p2_piece
			for(i=0; i<16; i++){
				for(j=0; j<3; j++){
					p1_piece[i][j] = this.myPiece[i][j];
					p2_piece[i][j] = this.oppoPiece[i][j];
				}
			}
		}else if(player.equals("oppo")){
			//oppo step : copy oppoPiece to p1_piece, myPiece to p2_piece
			for(i=0; i<16; i++){
				for(j=0; j<3; j++){
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
		int n;
		boolean f_stop = false;
		int tmp[] = new int[5];
		switch(piece){
			case 0:			//K
				//Front 1 step
				tmp[0] = piece;
				tmp[1] = x + 1;
				tmp[2] = y;
				tmp[3] = -999 * sign;
				tmp[4] = 1;	//can move
				if(x+1>8){
					tmp[4] = 0; //cannot move
				}else{
					for(i=0; i<16;i++){
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
				tmp[3] = -999 * sign;
				tmp[4] = 1;	//can move
				if((x + 1 > 8) || (y + 1 > 8)){
					tmp[4] = 0; //cannot move
				}else{
					for(i=0; i<16;i++){
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
				tmp[3] = -999 * sign;
				tmp[4] = 1;	//can move
				if(y + 1 > 8){
					tmp[4] = 0; //cannot move
				}else{
					for(i=0; i<16;i++){
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
				tmp[3] = -999 * sign;
				tmp[4] = 1;	//can move
				if((x - 1 < 1) || (y + 1 > 8)){
					tmp[4] = 0; //cannot move
				}else{
					for(i=0; i<16;i++){
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
				tmp[3] = -999 * sign;
				tmp[4] = 1;	//can move
				if(x - 1 < 1){
					tmp[4] = 0; //cannot move
				}else{
					for(i=0; i<16;i++){
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
				tmp[3] = -999 * sign;
				tmp[4] = 1;	//can move
				if((x - 1 < 1) || (y - 1 <  1)){
					tmp[4] = 0; //cannot move
				}else{
					for(i=0; i<16;i++){
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
				tmp[3] = -999 * sign;
				tmp[4] = 1;	//can move
				if(y - 1 <  1){
					tmp[4] = 0; //cannot move
				}else{
					for(i=0; i<16;i++){
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
				tmp[3] = -999 * sign;
				tmp[4] = 1;	//can move
				if((x + 1 > 8) || (y - 1 < 1)){
					tmp[4] = 0; //cannot move
				}else{
					for(i=0; i<16;i++){
						if((p1_piece[i][1] == x + 1) && (p1_piece[i][2] == y - 1)){
							tmp[4] = 0; //cannot move
							break;
						}
					}
				}
				if(tmp[4] == 1){
					possibility.add(tmp.clone());
				}
				
				break;
				
			case 1: //Q
				// Front n steps
				f_stop = false;
				for(n=1; n<8; n++){
					tmp[0] = piece;
					tmp[1] = x + n;
					tmp[2] = y;
					tmp[3] = -999 * sign;
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
					tmp[3] = -999 * sign;
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
					tmp[3] = -999 * sign;
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
					tmp[3] = -999 * sign;
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
					tmp[3] = -999 * sign;
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
					tmp[3] = -999 * sign;
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
					tmp[3] = -999 * sign;
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
					tmp[3] = -999 * sign;
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
				
			case 2:		//B1
			case 3: 	//B2
				// Front Right n steps
				f_stop = false;
				for(n=1; n<8; n++){
					tmp[0] = piece;
					tmp[1] = x + n;
					tmp[2] = y + n;
					tmp[3] = -999 * sign;
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
					tmp[3] = -999 * sign;
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
					tmp[3] = -999 * sign;
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
					tmp[3] = -999 * sign;
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
		
			case 4:		//H1
			case 5:		//H2
				// Front Front Right				
				tmp[0] = piece;
				tmp[1] = x + 2;
				tmp[2] = y + 1;
				tmp[3] = -999 * sign;
				tmp[4] = 1;			//can move
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
				tmp[3] = -999 * sign;
				tmp[4] = 1;			//can move
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
				tmp[3] = -999 * sign;
				tmp[4] = 1;			//can move
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
				tmp[3] = -999 * sign;
				tmp[4] = 1;			//can move
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
				tmp[3] = -999 * sign;
				tmp[4] = 1;			//can move
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
				tmp[3] = -999 * sign;
				tmp[4] = 1;			//can move
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
				tmp[3] = -999 * sign;
				tmp[4] = 1;			//can move
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
				tmp[3] = -999 * sign;
				tmp[4] = 1;			//can move
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
				
			case 6: //R1
			case 7: //R2
				// Front n steps
				f_stop = false;
				for(n=1; n<8; n++){
					tmp[0] = piece;
					tmp[1] = x + n;
					tmp[2] = y;
					tmp[3] = -999 * sign;
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
					tmp[3] = -999 * sign;
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
					tmp[3] = -999 * sign;
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
					tmp[3] = -999 * sign;
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
			
			case 8:		//P1
			case 9:		//P2
			case 10:	//P3
			case 11:	//P4
			case 12:	//P5
			case 13:	//P6
			case 14:	//P7
			case 15:	//P8
				// Front 1 step				
				tmp[0] = piece;
				tmp[1] = x + (1 * sign);
				tmp[2] = y;
				tmp[3] = -999 * sign;
				tmp[4] = 1;			//can move
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
				tmp[3] = -999 * sign;
				tmp[4] = 1;			//can move
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
				tmp[3] = -999 * sign;
				tmp[4] = 0;			//cannot move
				for(i=0; i<16; i++){
					if((p2_piece[i][1] == x + (1 * sign)) && (p2_piece[i][2] == y - (1 * sign))){
						tmp[4] = 1;	//can move
						break;
					}
				}
				if(tmp[4] == 1){
					possibility.add(tmp.clone());
				}
				
				// Front Right 1 step				
				tmp[0] = piece;
				tmp[1] = x + (1 * sign);
				tmp[2] = y + (1 * sign);
				tmp[3] = -999 * sign;
				tmp[4] = 0;			//cannot move
				for(i=0; i<16; i++){
					if((p2_piece[i][1] == x + (1 * sign)) && (p2_piece[i][2] == y + (1 * sign))){
						tmp[4] = 1;	//can move
						break;
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
				child.move_piece(player, possibility.get(i)[0], possibility.get(i)[1], possibility.get(i)[2]);
				nextstep.add(child);
			}
		}
		return nextstep;
	}
}