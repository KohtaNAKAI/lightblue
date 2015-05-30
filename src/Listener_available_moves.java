import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Listener_available_moves implements ActionListener{
	public void actionPerformed(ActionEvent e){		
		System.out.println("my next possible moves : ");
		
		int i;
		ArrayList<int[]> possibility = new ArrayList<int[]>();
		
		//get_available_moves
		possibility = Lightblue2.current_situation.get_available_moves("me");
		for(i=0; i<possibility.size(); i++){
			System.out.println(Arrays.toString(possibility.get(i)));
		}
		
		//generate_nextstep_fields
		ArrayList<Field> nextstep = new ArrayList<Field>();
		nextstep = Lightblue2.current_situation.generate_nextstep_fields("me", possibility);
		
		//choose
		int max_point = -999;
		for(i=0; i<nextstep.size(); i++){
			if(max_point <= nextstep.get(i).evaluate()){
				max_point = nextstep.get(i).evaluate();
			}
		}
		ArrayList<Field> candidates_field = new ArrayList<Field>();
		ArrayList<int[]> candidates_move = new ArrayList<int[]>();
		for(i=0; i<nextstep.size(); i++){
			if(max_point == nextstep.get(i).evaluate()){
				candidates_field.add(nextstep.get(i));
				candidates_move.add(possibility.get(i));
			}
		}
		
		Random rnd = new Random();
		int chosen_index = rnd.nextInt(candidates_field.size());
		int chosen_piece = candidates_move.get(chosen_index)[0];
		int chosen_x = candidates_move.get(chosen_index)[1];
		int chosen_y = candidates_move.get(chosen_index)[2];
		Lightblue2.current_situation.set_field(candidates_field.get(chosen_index));
		
		String msg = new String("\n" + "#candidates:" + Integer.toString(candidates_field.size()) + "\n" + "chosenindex:" + Integer.toString(chosen_index) + "\n");
		msg = msg + "piece : " + chosen_piece + "\n";
		msg = msg + "x : " + chosen_x + "\n";
		msg = msg + "y : " + chosen_y + "\n";
		JOptionPane.showMessageDialog(null, msg);
		System.out.println(msg);
		
		//reflesh_board
		Lightblue2.board.reflesh_board(chosen_x, chosen_y);
	}
}
