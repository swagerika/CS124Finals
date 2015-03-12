import java.awt.Color;
import java.awt.Graphics;

public class NormalZombie extends Zombie{
	int size, xpos, ypos;
	public NormalZombie() {
		size = super.getSize();
		xpos = (int) (Math.random() * 400);
		ypos = (int) (Math.random() * 400);
	}
  
	
	
	@Override
	public void draw(Graphics g){
		g.setColor(Color.RED);
		g.fillArc(xpos - size/2, ypos - size/2, size, size, 0, 360);
	}
	
	public void setSource(ZombieFlyWeight s){
		super.setSource(s);
		size = super.getSize();
	}
	
}
