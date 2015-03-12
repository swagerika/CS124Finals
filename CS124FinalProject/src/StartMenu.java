import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JProgressBar;


public class StartMenu extends JFrame {

	private JPanel contentPane, panel, loadPanel;
	JProgressBar progressBar;

	public StartMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGameTitle = new JLabel("Game Title");
		lblGameTitle.setFont(new Font("Tahoma", Font.PLAIN, 80));
		lblGameTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblGameTitle.setBounds(398, 240, 569, 131);
		contentPane.add(lblGameTitle);
		
		panel = new JPanel();
		panel.setBounds(329, 453, 708, 94);
		contentPane.add(panel);
		panel.setLayout(null);
		
		loadPanel = new JPanel();
		loadPanel.setBounds(334, 572, 697, 46);
		//contentPane.add(loadPanel);
		loadPanel.setLayout(null);
		
		progressBar = new JProgressBar();
		progressBar.setBounds(0, 0, 697, 46);
		loadPanel.add(progressBar);
		
	
		
		
		JButton btnStartGame = new JButton("Start Game");
		btnStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.BLACK);
				contentPane.remove(panel);
				contentPane.add(loadPanel);
				progressBar.setMaximum(100);
				
				Timer timer = new Timer();
				timer.schedule(new LoadTimer(progressBar), 0, 20);
				
			}
		});
		btnStartGame.setBounds(289, 5, 127, 49);
		panel.add(btnStartGame);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setBounds(81, 5, 127, 49);
		panel.add(btnHelp);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnQuit.setBounds(497, 5, 127, 49);
		panel.add(btnQuit);
		
	}
	class LoadTimer extends TimerTask{
		JProgressBar bar;
		public LoadTimer(JProgressBar b){
			bar = b;
		}
		@Override
		public void run() {
			if(bar.getValue() >= 100){
				MainWindow mw;
				try {
					mw = new MainWindow();
					mw.setVisible(true);
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
				this.cancel();
			}
			bar.setValue(bar.getValue()+1);
			
		}
		
	}
}
