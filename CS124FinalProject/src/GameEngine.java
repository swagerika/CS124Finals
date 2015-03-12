import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.util.ArrayList;
 
public class GameEngine extends Canvas{
	protected final int characterSize = 20;
	protected double rad;
	protected double mouseX, mouseY;
	protected ArrayList<Zombie> zombieList = new ArrayList<Zombie>();
	
	public GameEngine() throws FileNotFoundException{
		setBackground(Color.BLACK);
		rad = 0;
		mouseX = 1;
		mouseY = 1;
		
		ZombieFactory factory = new ZombieFactory();
		zombieList.add(factory.createZombie());
		
		Thread repainter = new Thread(new Repainter(this));
		repainter.start();
		
	}
	
	@Override
	public void paint(Graphics g){
		Graphics gra;
		BufferedImage offscreen = null;
		offscreen = (BufferedImage) createImage(getWidth(), getHeight());
		gra = offscreen.getGraphics();
	
		gra.setColor(Color.WHITE);
		gra.fillArc(getWidth()/2, getHeight()/2, characterSize, characterSize, 0, 360);
		
		rad = Math.atan2(mouseY,mouseX);
		gra.drawLine(getWidth()/2+characterSize/2, getHeight()/2+characterSize/2, (int)(Math.cos(rad) * 50 + (getWidth()/2 + characterSize/2)), (int)(Math.sin(rad) * 50 + (getHeight()/2 + characterSize/2)));
		
		for(int i = 0; i < zombieList.size(); i++){
			zombieList.get(i).draw(gra);
		}
		
		/*System.out.println("X:"+mouseX);
		System.out.println("Y:"+mouseY);
		System.out.println("RAD:"+rad);*/
		
		
		g.drawImage(offscreen, 0, 0, null);
		
		
	}
	
}
