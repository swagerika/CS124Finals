import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class InfoFrame extends JFrame {
	public InfoFrame() {
		setBounds(800, 20, 300, 600);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 274, 150);
		getContentPane().add(panel);
	}
}
