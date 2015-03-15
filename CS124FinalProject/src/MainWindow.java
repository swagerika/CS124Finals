import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.corba.se.impl.oa.poa.ActiveObjectMap.Key;


public class MainWindow extends JFrame implements KeyListener, MouseMotionListener{

	private JPanel contentPane;
	private GameEngine canvas;

	/**
	 * Create the frame.
	 * @throws FileNotFoundException 
	 */
	public MainWindow() throws FileNotFoundException {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null); 
		
		canvas = new GameEngine();
		canvas.setBounds(0,0,getWidth(),getHeight()-30);
		contentPane.add(canvas);
		
		InfoFrame infoFrame = new InfoFrame();
		infoFrame.setVisible(true);

		canvas.addKeyListener(this);
		canvas.addMouseMotionListener(this);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			canvas.rad += Math.PI/12;
		}
		else if(e.getKeyCode() == KeyEvent.VK_LEFT){
			canvas.rad -= Math.PI/12;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_SPACE){
			//canvas
		}
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent me) {
		canvas.mouseX =  me.getPoint().getX() - canvas.getWidth()/2 + canvas.characterSize/2;
		canvas.mouseY =  me.getPoint().getY() - canvas.getHeight()/2 + canvas.characterSize/2;
		
	}
	
	
}
