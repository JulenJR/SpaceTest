package Source;

import java.awt.Rectangle;

public class Player {
	
	public float x;
	public float y;
	public Rectangle r1;
	
	
		public Player(float x, float y) {
			
			this.x = x;
			this.y = y;
			r1 = new Rectangle(64,64); //the size of this rectangle equals to sprite size, like (sprite.getSizeX, sprite.getSizeY)
		}
		
		public void render(/*Graphics2D g2d*/) {
			/*set the player sprite in the board
			 * 
			 *g2d.drawImage(sprite, x, y, null);  
			 *
			 */
		}
		
		public void moveUP(float velY) {
			this.y += velY;
		}
		
		public void moveDOWN(float velY) {
			this.y -= velY;
		}
		
		public void moveLEFT(float velX) {
			this.y += velX;
		}
		
		public void moveRIGHT(float velX) {
			this.y += velX;
		}
		
		public float getX() {
			return x;
		}
		
		public float getY() {
			return y;
		}
		
}
