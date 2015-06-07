import javax.swing.*;

public class Lightblue2 {
	public static Field current_situation;
	public static Board board;
	public static Console console;
	public static History history;
	public static String White_or_Black; 
	
	public static void main(String[] arg){
		System.out.println("======== lightblue2 =========");
	    
	    String selectvalues[] = {"white", "black"};
	    ImageIcon logo = new ImageIcon("/Users/kokko1219/Documents/lightblue/image/logo.jpg");
	    Object value = JOptionPane.showInputDialog(null, "You?", "lightblue2", JOptionPane.INFORMATION_MESSAGE, logo, selectvalues, selectvalues[0]);
	    
	    if (value == null){
	    	System.out.println("cancelled");
	    	System.exit(0);
	    }else{
	    	White_or_Black = (String)value;
	    	System.out.println("player is : " + White_or_Black);
	    }
	    
		current_situation = new Field();
		board = new Board();
		console = new Console();
		history = new History();
		board.reflesh_board(-1,-1);
	}
}