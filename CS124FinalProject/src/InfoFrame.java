import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class InfoFrame extends JFrame {
	public InfoFrame() {
		setBounds(800, 20, 300, 600);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 274, 150);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblStage = new JLabel("Stage:");
		lblStage.setBounds(10, 11, 61, 14);
		panel.add(lblStage);
		
		JLabel lblStagenum = new JLabel("1");
		lblStagenum.setBounds(118, 11, 77, 14);
		panel.add(lblStagenum);
		
		JLabel lblHealth = new JLabel("Health");
		lblHealth.setBounds(10, 36, 46, 14);
		panel.add(lblHealth);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(118, 36, 146, 14);
		panel.add(progressBar);
		
		JLabel lblZombiesLeft = new JLabel("Zombies Left:");
		lblZombiesLeft.setBounds(10, 61, 84, 14);
		panel.add(lblZombiesLeft);
		
		JLabel lblZombiecount = new JLabel("<number>");
		lblZombiecount.setBounds(118, 61, 77, 14);
		panel.add(lblZombiecount);
	}
}
