import java.awt.Color;
import java.awt.Graphics;

public class NormalZombie extends Zombie{
	private int size, xpos, ypos;
	public NormalZombie() {	
		xpos = (int) (Math.random() * 400);
		ypos = (int) (Math.random() * 400);
		
		Thread runner = new Thread(this);
		runner.start();
	}
  
	@Override
	public void draw(Graphics g){
		g.setColor(Color.RED);
		g.fillArc(xpos - size/2, ypos - size/2, size, size, 0, 360);
	}
	
	public void setSource(ZombieFlyWeight s){
		super.setSource(s);
		size = super.getSize();
		targetX = super.targetX;
		targetY = super.targetY;
	}

	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(targetX < xpos){
				xpos--;
			}
			if(targetX > xpos){
				xpos++;
			}
			if(targetY < ypos){
				ypos--;
			}
			if(targetY > ypos){
				ypos++;
			}
		}
	}
	
}
