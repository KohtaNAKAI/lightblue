import java.awt.event.*;
import java.util.*;

import javax.swing.JOptionPane;

public class Listener_available_moves2 implements ActionListener{
	public void actionPerformed(ActionEvent e){		
		System.out.println("my next possible moves : ");
		long starttime = System.currentTimeMillis();
		
		int i,j;
		ArrayList<int[]> possibility_1st = new ArrayList<int[]>();
		ArrayList<int[]> possibility_2nd = new ArrayList<int[]>();
		ArrayList<Integer> min_pt_of_2nd_move = new ArrayList<Integer>();
		
		//1st step
		//get_available_moves
		possibility_1st = Lightblue2.current_situation.get_available_moves("me");
		for(i=0; i<possibility_1st.size(); i++){
			System.out.println(Arrays.toString(possibility_1st.get(i)));
		}
		//generate_nextstep_fields
		ArrayList<Field> nextstep_1st = new ArrayList<Field>();
		nextstep_1st = Lightblue2.current_situation.generate_nextstep_fields("me", possibility_1st);
		
		//2nd step
		for(i=0; i<nextstep_1st.size(); i++){
			//get_available_moves
			System.out.println("possible moves for 1st move : " + i);
			possibility_2nd = nextstep_1st.get(i).get_available_moves("oppo");
			int min_pt = 999;
			for(j=0; j<possibility_2nd.size(); j++){
				System.out.println(Arrays.toString(possibility_2nd.get(j)));
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
			System.out.println("min_pt = " + min_pt);
		}
		
		System.out.println("\n" + "min_pt_of_2nd_move : ");
		for(i=0; i<min_pt_of_2nd_move.size(); i++){
			System.out.println(i + " = " + Arrays.toString(possibility_1st.get(i)) + " : " + min_pt_of_2nd_move.get(i));
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
		System.out.println("BEST = 1st move : " + Integer.toString(tmp_max_index) + " / 2nd move min pt = " + Integer.toString(tmp_max_point) + " (before random selection)\n");
	
		//list up candidates
		ArrayList<Integer> candidates_1stmove_index = new ArrayList<Integer>();
		for(i=0; i<min_pt_of_2nd_move.size(); i++){
			if(tmp_max_point == min_pt_of_2nd_move.get(i)){
				candidates_1stmove_index.add(i);
			}
		}
		for(i=0; i<candidates_1stmove_index.size(); i++){
			System.out.println("candidate / " + candidates_1stmove_index.get(i) + " = " + Arrays.toString(possibility_1st.get(candidates_1stmove_index.get(i))) + " : " + min_pt_of_2nd_move.get(candidates_1stmove_index.get(i)));
		}
		
		//random selection
		Random rnd = new Random();
		int chosen_index = candidates_1stmove_index.get(rnd.nextInt(candidates_1stmove_index.size()));
		int chosen_piece = possibility_1st.get(chosen_index)[0];
		int chosen_x = possibility_1st.get(chosen_index)[1];
		int chosen_y = possibility_1st.get(chosen_index)[2];
		Lightblue2.current_situation.set_field(nextstep_1st.get(chosen_index));

		long endtime = System.currentTimeMillis();
		System.out.println("\n" + "start : " + starttime + " / end : " + endtime + " / duration : " + (endtime-starttime));
		
		String msg = new String("\n" + "#candidates:" + Integer.toString(candidates_1stmove_index.size()) + "\n" + "chosenindex:" + Integer.toString(chosen_index));
		msg = msg + "\n\n" + "piece = " + Integer.toString(chosen_piece);
		msg = msg + "\n" + "x = " + Integer.toString(chosen_x);
		msg = msg + "\n" + "y = " + Integer.toString(chosen_y);
		msg = msg + "\n" + "min_point after 2nd step = " + Integer.toString(tmp_max_point);
		JOptionPane.showMessageDialog(null, msg);
		System.out.println(msg);
		
		//reflesh_board
		Lightblue2.board.reflesh_board(chosen_x, chosen_y);
	}
}
