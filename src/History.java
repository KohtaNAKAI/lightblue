public class History {
	public static Field[] history = new Field[250];
	public static int[][] move = new int[250][5];
	public static int index;
	public static int tmp_index;
	
	//constructor
	public History(){
		index = 0;
		tmp_index = index;
		
		Field tmp = new Field();
		tmp.set_field(Lightblue2.current_situation);
		history[index] = tmp;
		
		move[index][0] = -99;
		move[index][1] = -99;
		move[index][2] = -99;
		move[index][3] = -99;
		move[index][4] = -99;
	}
	
	//add history
	public void add(String player, int piece, int x, int y, int kind){		//need to care about promotion.
		index++;
		tmp_index = index;
		String msg = "history[" + index + "] : " + player + " [" + piece + "," + x + "," + y + "," + kind +"]\n";
		System.out.println(msg);
		Lightblue2.console.JTA_history.insert(msg, 0);
		
		Field tmp = new Field();
		tmp.set_field(Lightblue2.current_situation);
		history[index] = tmp;
		
		int me_or_oppo;
		if(player.equals("me")){
			me_or_oppo = 0;
		}else{
			me_or_oppo = 1;
		}
		move[index][0] = me_or_oppo;
		move[index][1] = piece;
		move[index][2] = x;
		move[index][3] = y;
		move[index][4] = kind;		
	}
	
	//move_back
	public void move_back(){
		tmp_index--;
		
		Field tmp = new Field();
		tmp.set_field(history[tmp_index]);
		
		String player;
		if(move[tmp_index][0] == 0){
			player = "me";
		}else if(move[tmp_index][0] == 1){
			player = "oppo";
		}else{
			player = "def";
		}
		
		int piece = move[tmp_index][1];
		int x = move[tmp_index][2];
		int y = move[tmp_index][3];
		int kind = move[tmp_index][4];
		
		System.out.println("look back history[" + tmp_index + "] : " + player + " [" + piece + "," + x + "," + y + "," + kind +"]");
		
		//set back
		index = tmp_index;
		String tmp_player;
		String tmp_msg = "";
		int i;
		for(i=tmp_index; i>0; i--){
			if(move[i][0] == 0){
				tmp_player = "me";
			}else if(move[i][0] == 1){
				tmp_player = "oppo";
			}else{
				tmp_player = "def";
			}
			
			int tmp_piece = move[i][1];
			int tmp_x = move[i][2];
			int tmp_y = move[i][3];
			int tmp_kind = move[i][4];
			tmp_msg = tmp_msg + "history[" + i + "] : " + tmp_player + " [" + tmp_piece + "," + tmp_x + "," + tmp_y + "," + tmp_kind +"]\n";
		}
		Lightblue2.console.JTA_history.setText(tmp_msg);
		
		Lightblue2.current_situation.set_field(history[tmp_index]);
		Lightblue2.board.reflesh_board(x, y);
	}
	
	//move_forward
	public void move_forward(){
	}
	
	//restart_from_shown_index
	public void restart_from_shown_index(){
	}
	
	//restart_from_latest_index
	public void restart_from_latest(){
	}
}
