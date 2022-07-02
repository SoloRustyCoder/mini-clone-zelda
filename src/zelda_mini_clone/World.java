package zelda_mini_clone;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class World {
	
	public static List<Blocks> blocks = new ArrayList<Blocks>();
	
	public World() {
		for(int square = 0; square < 15; square++) {
			blocks.add(new Blocks(square * 32, 0));
			blocks.add(new Blocks(square * 32, 480 - 32));
			blocks.add(new Blocks(0, square * 32));
			blocks.add(new Blocks(480 - 32, square * 32));
			}
		}
	
	public static boolean IsFree(int x, int y) {
		for(int i = 0; i < blocks.size(); i++) {
			Blocks currentBlock = blocks.get(i);
			if(currentBlock.intersects(new Rectangle(x, y, 32, 32))) {
				return false;
			}
		}
		return true;
	}
	
	public void Render(Graphics g) {
		for (int i = 0; i < blocks.size(); i++) {
			blocks.get(i).Render(g);
		}
	}
}
