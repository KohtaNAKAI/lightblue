import java.awt.event.*;

public class Listener_available_moves2 implements ActionListener{
	public void actionPerformed(ActionEvent e){		

		int[] move = Lightblue2.current_situation.get_best_move_1turn(true, true);
		Lightblue2.current_situation.move_piece("me", move[0], move[1], move[2], move[3]);
		Lightblue2.board.reflesh_board(move[1], move[2]);
	}
}
