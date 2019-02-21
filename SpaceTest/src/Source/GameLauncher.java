package Source;
import javax.swing.JFrame;

public class GameLauncher extends JFrame {
	
	private static final long serialVersionUID = 1L;
	GameController gc;

		public GameLauncher(){
			
			JFrame frm = new JFrame();
		    frm.setSize(400, 400);
		    frm.setLocationRelativeTo(null);
		    frm.setResizable(false);
		    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frm.setVisible(true);
			
			this.gc = new GameController();
			
			
			
		}
	
		
		
		
		public static void main(String[] args) {
			new GameLauncher();
	
		}

}
