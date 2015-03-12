import java.awt.Graphics;


public abstract class Zombie {
	private ZombieFlyWeight source;
	private int size;

	public void setSource(ZombieFlyWeight s){
		source = s;
		size = source.getSize();
	}
	public int getSize(){
		return size;
	}
	
	public abstract void draw(Graphics g);
}