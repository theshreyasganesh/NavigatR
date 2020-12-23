package navigatrapp;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;

public class logoscreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					logoscreen window = new logoscreen();
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
	public logoscreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 750, 1334);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/NavigatR.jpg"));
		label.setIcon(img);
		label.setBounds(0, 0, 716, 1238);
		frame.getContentPane().add(label);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(686, 255, 2, 2);
		frame.getContentPane().add(scrollPane);
		
		JButton btnNewButton = new JButton("Go to homescreen");
		frame.dispose();
		homescreen hscr = new homescreen();
		hscr.setVisible(true);
		btnNewButton.setBounds(176, 29, 361, 43);
		frame.getContentPane().add(btnNewButton);
		
		
		
	}
}
