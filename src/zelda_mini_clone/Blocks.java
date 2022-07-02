package zelda_mini_clone;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

@SuppressWarnings("serial")
public class Blocks extends Rectangle{
	public Blocks(int x, int y) {
		super(x, y, 32, 32);
	}
	
	public void Render(Graphics g) {
		g.setColor(Color.magenta);
		g.fillRect(x, y, width, height);
	}
}
