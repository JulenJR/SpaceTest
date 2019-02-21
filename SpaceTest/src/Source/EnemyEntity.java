package Source;

import java.awt.Rectangle;
import java.util.Random;

public class EnemyEntity {
	
	public String entityID = "";
	public int x;
	public int y;//over the screen high size
	public Rectangle r;
	
	public Random xOrig;
	
		public EnemyEntity(String id, int x, int y, int rX, int rY) {
			
			xOrig = new Random();
			
			this.x =xOrig.nextInt(400);//range between 0 to screen size width
			this.y = y;
			this.r = new Rectangle(rX,rY);
		}
		
		public void enemyShipMovement(int yVel) {
			this.y -= yVel;
			
		}
		
		public int getY() {
			return y;
		}

}
