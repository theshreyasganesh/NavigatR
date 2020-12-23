package navigatrapp;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class settings {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					settings window = new settings();
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
	public settings() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 846, 1434);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/Options_screen.jpg"));
		label.setIcon(img);
		label.setBounds(0, 0, 812, 1338);
		frame.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("FAQ's");
		frame.dispose();
		FAQs faq = new FAQs();
		faq.setVisible(true);
		btnNewButton.setBounds(92, 300, 181, 43);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("About Us");
		frame.dispose();
		AboutUs abtus = new AboutUs();
		abtus.setVisible(true);
		btnNewButton_1.setBounds(129, 481, 181, 43);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Get In Touch");
		frame.dispose();
		GetInTouch gits = new GetInTouch();
		gits.setVisible(true);
		btnNewButton_2.setBounds(92, 674, 277, 43);
		frame.getContentPane().add(btnNewButton_2);
	}
}
