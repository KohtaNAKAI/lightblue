import java.awt.*;
import javax.swing.*;

public class Console{
	public JFrame Console = new JFrame("Console");
	public JRadioButton JR_1 = new JRadioButton("oppo",true);
	public JRadioButton JR_2 = new JRadioButton("me");
	public JTextField JT_token = new JTextField();
	public JTextField JT_x = new JTextField();
	public JTextField JT_y = new JTextField();
	public JTextField JT_num = new JTextField();
	public JTextArea JTA_history = new JTextArea();
	public JScrollPane Scroll = new JScrollPane(JTA_history);
	
	//constructor
	public Console(){
		Container cont = Console.getContentPane();
		cont.setLayout(null);
		
		JButton JB_1step = new JButton("Move Selection : 1 step");
		cont.add(JB_1step);
		JB_1step.setBounds(10,10,200,50);
		JB_1step.addActionListener(new Listener_available_moves());
		
		JButton JB_2step = new JButton("Move Selection : 2 steps");
		cont.add(JB_2step);
		JB_2step.setBounds(10,70,200,50);
		JB_2step.addActionListener(new Listener_available_moves2());
		
		JButton JB_4step = new JButton("Move Selection : 4 steps");
		cont.add(JB_4step);
		JB_4step.setBounds(10,130,200,50);
		JB_4step.addActionListener(new Listener_available_moves4());
		
		JLabel JL_player = new JLabel("player");
		cont.add(JL_player);
		JL_player.setBounds(250,10,50,30);
		cont.add(JR_1);
		JR_1.setBounds(300,10,70,30);
		cont.add(JR_2);
		JR_2.setBounds(360,10,70,30);
		ButtonGroup b_group = new ButtonGroup();
		b_group.add(JR_1);
		b_group.add(JR_2);
		
		JLabel JL_piece = new JLabel("piece");
		cont.add(JL_piece);
		JL_piece.setBounds(250,40,50,30);
		cont.add(JT_token);
		JT_token.setBounds(300,40,100,30);
		
		JLabel JL_x = new JLabel("x");
		cont.add(JL_x);
		JL_x.setBounds(250,70,50,30);
		cont.add(JT_x);
		JT_x.setBounds(300,70,100,30);
		
		JLabel JL_y = new JLabel("y");
		cont.add(JL_y);
		JL_y.setBounds(250,100,50,30);
		cont.add(JT_y);
		JT_y.setBounds(300,100,100,30);
		
		JButton JB_move = new JButton("Move");
		cont.add(JB_move);
		JB_move.setBounds(300,130,100,50);
		JB_move.addActionListener(new Listener_move_from_GUI());
		
		JButton JB_Nturn = new JButton("N turns");
		cont.add(JB_Nturn);
		JB_Nturn.setBounds(10,200,100,50);
		JB_Nturn.addActionListener(new Listener_search_moves());
		cont.add(JT_num);
		JT_num.setBounds(110,200,100,50);
		
		//History
		Scroll.setBounds(10, 300, 300, 240);
		cont.add(Scroll);
	    
		JButton JB_move_back = new JButton("back");
		cont.add(JB_move_back);
		JB_move_back.setBounds(320,300,100,50);
		JB_move_back.addActionListener(new Listener_moveback());
		
		Console.setBounds(500, 0 , 450, 500);
		Console.setVisible(true);
		Console.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}