import java.awt.event.*;

import javax.swing.JOptionPane;

public class Listener_search_moves implements ActionListener{
	public void actionPerformed(ActionEvent e){		
		int num_of_turns = Integer.parseInt(Lightblue2.console.JT_num.getText());
		System.out.println("consider " + num_of_turns + " turns.");
		
		long starttime = System.currentTimeMillis();
		int[] move = Lightblue2.current_situation.search_moves(num_of_turns);
		long endtime = System.currentTimeMillis();
		System.out.println("Search_done. Duration : " + (endtime - starttime));
		
		Lightblue2.current_situation.move_piece("me", move[0], move[1], move[2], move[3], move[5], move[6], move[7]);
		Lightblue2.history.add("me", move[0], move[1], move[2], move[3]);
		Lightblue2.board.reflesh_board(move[1], move[2]);
		
		String msg = new String("piece = " + move[0] + " (type = " + move[3] + ")");
		msg = msg + "\n" + "x = " + move[1];
		msg = msg + "\n" + "y = " + move[2];
		msg = msg + "\n" + "point = " + move[4];
		JOptionPane.showMessageDialog(null, msg);
		System.out.println(msg);
	}
}