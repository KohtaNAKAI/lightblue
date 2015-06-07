import java.awt.*;
import javax.swing.*;

public class Console{
	public JFrame Console = new JFrame("Console");
	public JTextField JT_num = new JTextField();
	public JTextArea JTA_history = new JTextArea();
	public JScrollPane Scroll = new JScrollPane(JTA_history);
	
	//constructor
	public Console(){
		Container cont = Console.getContentPane();
		cont.setLayout(null);
		
		//logo
		ImageIcon logo = new ImageIcon("/Users/kokko1219/Documents/lightblue/image/logo.jpg");
		JLabel JL_logo = new JLabel(logo);
		cont.add(JL_logo);
		JL_logo.setBounds(220,15,200,220);
		
		//1step
		JButton JB_1step = new JButton("Move Selection : 1 step");
		cont.add(JB_1step);
		JB_1step.setBounds(10,10,200,50);
		JB_1step.addActionListener(new Listener_available_moves());
		
		//2steps
		JButton JB_2step = new JButton("Move Selection : 2 steps");
		cont.add(JB_2step);
		JB_2step.setBounds(10,70,200,50);
		JB_2step.addActionListener(new Listener_available_moves2());
		
		//4steps
		JButton JB_4step = new JButton("Move Selection : 4 steps");
		cont.add(JB_4step);
		JB_4step.setBounds(10,130,200,50);
		JB_4step.addActionListener(new Listener_available_moves4());
		
		//N turn search
		JButton JB_Nturn = new JButton("N turns");
		cont.add(JB_Nturn);
		JB_Nturn.setBounds(10,190,100,50);
		JB_Nturn.addActionListener(new Listener_search_moves());
		cont.add(JT_num);
		JT_num.setBounds(110,190,100,50);
		
		//History
		Scroll.setBounds(10, 250, 300, 210);
		cont.add(Scroll);
	    
		JButton JB_move_back = new JButton("back");
		cont.add(JB_move_back);
		JB_move_back.setBounds(320,250,100,50);
		JB_move_back.addActionListener(new Listener_moveback());
		
		Console.setBounds(500, 0 , 435, 500);
		Console.setVisible(true);
		Console.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}