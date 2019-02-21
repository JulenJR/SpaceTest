package Source;

import java.util.ArrayList;

public class CollisionManager {

	GameController gc;
	ArrayList<EnemyEntity> eList;
	ArrayList<Collision> collisionList;
	Player p;
	
		public CollisionManager() {
			eList = new ArrayList<EnemyEntity>();
			collisionList = new ArrayList<Collision>();
		}
		
		public void collisionDetector() {
			int x= 0;
			for (EnemyEntity ee : eList) {
				x++;
				
				if(ee.r.intersects(eList.get(x).r))
					collisionList.add(new Collision(ee,eList.get(x), null));
					
				
				if(ee.r.intersects(p.r1))
					collisionList.add(new Collision(ee, null, p));
				
			//This method keeps implementing removal orders to entities
				//...
				//..
				//.
			}
		}
		
		public ArrayList<Collision> getCollisions (){
			return collisionList;
		}
		
}