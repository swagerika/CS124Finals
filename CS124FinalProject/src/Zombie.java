import java.awt.Graphics;


public abstract class Zombie implements Runnable{
	private ZombieFlyWeight source;
	private int size;
	protected int targetX, targetY;
	private State state;
	//private int turnProb;

	public void setSource(ZombieFlyWeight s){
		source = s;
		size = source.getSize();
		state = null;
		targetX = source.getTargetX();
		targetY = source.getTargetY();
		
	}
	public int getSize(){
		return size;  
	}
	
	public abstract void draw(Graphics g);
}
