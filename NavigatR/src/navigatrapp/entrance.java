package navigatrapp;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class entrance {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					entrance window = new entrance();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public entrance() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 1369);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/1.jpg"));
		label.setIcon(img);
		label.setBounds(0, -40, 866, 1313);
		frame.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("UP");
		frame.dispose();
		firstimage one = new firstimage();
		one.setVisible(true);
		btnNewButton.setBounds(347, 1104, 61, 43);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RIGHT");
		frame.dispose();
		fortysixthimage foursix = new fortysixthimage();
		foursix.setVisible(true);
		btnNewButton_1.setBounds(383, 1143, 117, 43);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("MAP");
		frame.dispose();
	    mapscreen mscr = new mapscreen();
		mscr.setVisible(true);
		btnNewButton_2.setBounds(531, 1104, 181, 43);
		frame.getContentPane().add(btnNewButton_2);
	}
}
