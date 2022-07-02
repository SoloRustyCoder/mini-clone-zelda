package zelda_mini_clone;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

@SuppressWarnings("serial")
public class Player extends Rectangle {
	
	public boolean right, up, left, down;
	public int speed = 4;
	
	public Player(int x, int y) {
		super(x, y, 32, 32);
	}
	
	public void Tick() {
		if(right == true && World.IsFree(x + speed, y)) {
			x += speed;
		} else if(left == true && World.IsFree(x - speed, y)) {
			x -= speed;
		};
		if(up == true && World.IsFree(x, y - speed)) {
			y -= speed;
		} else if(down == true && World.IsFree(x, y + speed)) {
			y += speed;
		};
		
	}
	
	public void Render(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x, y, width, height);
	}
}