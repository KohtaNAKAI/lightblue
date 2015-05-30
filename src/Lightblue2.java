public class Lightblue2 {
	public static Field current_situation = new Field();
	public static Board board = new Board();
	public static Console console = new Console();
	
	public static void main(String arg[]){
		System.out.println("======== lightblue2 =========");
		board.reflesh_board(-1,-1);
		System.out.println("created chess_board object.");
		System.out.println("created console object.");
	}
}