package Source;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class GameController implements KeyListener {

	Player player;
	ArrayList<EnemyEntity> enemyShipList;
	CollisionManager cm;
	
		public GameController() {
			enemyShipList = new ArrayList<EnemyEntity>();
			cm = new CollisionManager();
			
			player = new Player(200.0f, 50.0f);
			
			enemyShipList.add(new EnemyEntity("ship", 133, 420, 12, 12));				//-----
			enemyShipList.add(new EnemyEntity("misile", 250, 420, 10, 14));				//method for entity creation with his own loop*
			enemyShipList.add(new EnemyEntity("bHole", 300, 200, 16, 16));				//-----
			
		}

	@Override
	public void keyPressed(KeyEvent arg0) {
		switch(arg0.getKeyCode()) {
			
		case KeyEvent.VK_A:
			player.moveLEFT(0.5f);
		case KeyEvent.VK_S:
			player.moveDOWN(0.5f);
		case KeyEvent.VK_D:
			player.moveDOWN(0.5f);
		case KeyEvent.VK_W:
			player.moveUP(0.5f);
		
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		
		switch(arg0.getKeyCode()) {
		
		case KeyEvent.VK_A:
			player.moveLEFT(0);
			break;
		case KeyEvent.VK_S:
			player.moveDOWN(0);
			break;
		case KeyEvent.VK_D:
			player.moveDOWN(0);
			break;
		case KeyEvent.VK_W:
			player.moveUP(0);
			break;
		
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		
	}
	
	public void enemyEntityMovement() {
		//...
	}
	
	public ArrayList<EnemyEntity> geteList(){
		return this.enemyShipList;	
	}
}
