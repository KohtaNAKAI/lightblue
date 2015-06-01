import java.awt.event.*;
import java.util.*;

import javax.swing.JOptionPane;

public class Listener_available_moves4 implements ActionListener{
	public void actionPerformed(ActionEvent e){		

		System.out.println("\n" + "consider 4 steps");
		long starttime = System.currentTimeMillis();
		
		int i,j;
		ArrayList<int[]> possibility_1st = new ArrayList<int[]>();
		ArrayList<int[]> possibility_2nd = new ArrayList<int[]>();
		ArrayList<Field> nextstep_1st = new ArrayList<Field>();
		ArrayList<Field> nextstep_2nd = new ArrayList<Field>();
		ArrayList<int[]> comp_list = new ArrayList<int[]>();
		
		//1st step
		//get_available_moves
		possibility_1st = Lightblue2.current_situation.get_available_moves("me");
		//generate_nextstep_fields
		nextstep_1st = Lightblue2.current_situation.generate_nextstep_fields("me", possibility_1st);
		
		//2nd step
		for(i=0; i<nextstep_1st.size(); i++){
			//get_available_moves
			possibility_2nd = nextstep_1st.get(i).get_available_moves("oppo");
			//generate_neststep_fields
			nextstep_2nd = nextstep_1st.get(i).generate_nextstep_fields("oppo", possibility_2nd);
			for(j=0; j<nextstep_2nd.size(); j++){
				//for each situation, consider more 2 steps further and get best move and evaluation point 
				int[] bestmove = nextstep_2nd.get(j).get_best_move_1turn(false, false);
				int p_1st = possibility_1st.get(i)[0];
				int x_1st = possibility_1st.get(i)[1];
				int y_1st = possibility_1st.get(i)[2];
				int p_2nd = possibility_2nd.get(j)[0];
				int x_2nd = possibility_2nd.get(j)[1];
				int y_2nd = possibility_2nd.get(j)[2];
				int p_3rd = bestmove[0];
				int x_3rd = bestmove[1];
				int y_3rd = bestmove[2];
				int pt = bestmove[3];
				int[] tmp = {i, p_1st, x_1st, y_1st, j, p_2nd, x_2nd, y_2nd, p_3rd, x_3rd, y_3rd, pt};
				comp_list.add(tmp);
			}
		}
		
		for(i=0; i<comp_list.size(); i++){
			String msg = new String();
			msg = msg + "1st[" + comp_list.get(i)[0] + "] : [" + comp_list.get(i)[1] + " , " + comp_list.get(i)[2] + " , " + comp_list.get(i)[3] + "] \t--> ";
			msg = msg + "2nd[" + comp_list.get(i)[4] + "] : [" + comp_list.get(i)[5] + " , " + comp_list.get(i)[6] + " , " + comp_list.get(i)[7] + "] \t--> ";
			msg = msg + "3rd best = [" + comp_list.get(i)[8] + " , " + comp_list.get(i)[9] + " , " + comp_list.get(i)[10] + "] \t/ point = " + comp_list.get(i)[11];
			System.out.println(msg);
		}
		
		//summarize min pt for each 1st move
		ArrayList<int[]> min_for_1st_move = new ArrayList<int[]>();
		int min = 999;
		int move = 0;
		for(i=0; i<comp_list.size(); i++){
			if(comp_list.get(i)[0] == move){
				if(comp_list.get(i)[11] < min){
					min = comp_list.get(i)[11];
				}
			}else{
				int[] tmp = {move, min};
				min_for_1st_move.add(tmp);
				move = comp_list.get(i)[0];
				min = 999;
				if(comp_list.get(i)[11] < min){
					min = comp_list.get(i)[11];
				}
			}
		}
		int[] tmp = {move, min};
		min_for_1st_move.add(tmp);
		System.out.println("\n" + "min_for_1st_move : ");
		for(i=0; i<min_for_1st_move.size(); i++){
			System.out.println(Arrays.toString(min_for_1st_move.get(i)));
		}
		
		//choose the best move
		int max = -999;
		for(i=0; i<min_for_1st_move.size(); i++){
			if(max < min_for_1st_move.get(i)[1]){
				max = min_for_1st_move.get(i)[1];
			}
		}
		ArrayList<int[]> candidates = new ArrayList<int[]>();
		for(i=0; i<min_for_1st_move.size(); i++){
			if(max == min_for_1st_move.get(i)[1]){
				candidates.add(min_for_1st_move.get(i));
				System.out.println("candidate : " + Arrays.toString(min_for_1st_move.get(i)));  
			}
		}
		//random selection
		Random rnd = new Random();
		int[] chosen_candidate = candidates.get(rnd.nextInt(candidates.size()));
		int chosen_index = chosen_candidate[0];
		int point = chosen_candidate[1];
		int chosen_piece = possibility_1st.get(chosen_index)[0];
		int chosen_x = possibility_1st.get(chosen_index)[1];
		int chosen_y = possibility_1st.get(chosen_index)[2];
		
		long endtime = System.currentTimeMillis();
		System.out.println("\n" + "start : " + starttime + " / end : " + endtime + " / duration : " + (endtime-starttime));
	
		String msg = new String("\n" + "#candidates:" + candidates.size() + "\n" + "chosenindex:" + chosen_index);
		msg = msg + "\n\n" + "piece = " + Integer.toString(chosen_piece);
		msg = msg + "\n" + "x = " + Integer.toString(chosen_x);
		msg = msg + "\n" + "y = " + Integer.toString(chosen_y);
		msg = msg + "\n" + "worst case point = " + point;
		JOptionPane.showMessageDialog(null, msg);
		System.out.println(msg);
		
		Lightblue2.current_situation.move_piece("me", chosen_piece, chosen_x, chosen_y);
		Lightblue2.board.reflesh_board(chosen_x, chosen_y);
	}
}