import java.awt.Graphics;


public abstract class Zombie implements Runnable{
	private ZombieFlyWeight source;
	private int size;
	protected int targetX, targetY, xpos, ypos;
	protected State state;
	
	public Zombie(){
		state = new DefaultState(this);
	}

	public void setSource(ZombieFlyWeight s){
		source = s;
		size = source.getSize();
		targetX = source.getTargetX();
		targetY = source.getTargetY();
		
	}
	public int getSize(){
		return size;  
	}
	
	public abstract void draw(Graphics g);
}
