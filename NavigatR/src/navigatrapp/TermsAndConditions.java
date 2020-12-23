package navigatrapp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import java.awt.Font;

public class TermsAndConditions extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TermsAndConditions frame = new TermsAndConditions();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TermsAndConditions() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTextArea txtrTermsAndConditions = new JTextArea(10,10); //size of textarea
		txtrTermsAndConditions.setFont(new Font("Monospaced", Font.BOLD, 15));
		txtrTermsAndConditions.setText("TERMS AND CONDITIONS:\r\n\r\nPlease read these terms and conditions of use carefully before accessing, using or obtaining any information or services. By accessing, the NavigatR\u2122 application, or any other feature or platform you agree to be bound by these terms and conditions (\u201CTerms\u201D) and our Privacy Policy. If you do not accept all of these Terms, then you may not use our application. In these Terms, \u201Cwe\u201D, \u201Cus\u201D, \u201Cour\u201D, or \u201CNavigatR\u2122\u201D refers to NavigatR\u2122 application, and \u201Cyou\u201D or \u201Cyour\u201D refers to you as the user of our Application.\r\n\r\nTHESE TERMS INCLUDE AN ARBITRATION CLAUSE AND A WAIVER OF YOUR RIGHT TO PARTICIPATE IN A CLASS ACTION OR REPRESENTATIVE LAWSUIT.\r\n\r\nGENERAL RULES:\r\n   The set of general rules include:\r\nYou must be a student/staff/visitor of DSI.\r\nIf you are a visitor you must have a permission document.\r\n\r\n\r\n\r\nAGREEMENT LOCATION:\r\n            DAYANANDA SAGAR INSTITUTIONS\r\nAddress: Shavige Malleshwara Hills, 91st Main Road, 1st Stage,               Kumaraswamy Layout, Bengaluru, Karnataka State\r\nPincode: 560078\r\nContact: 080-42161750\r\n\r\nLIMITATIONS OF LIABILITIES OR DISCLAIMERS:\r\n\r\nThis is a virtual walkover of the DSI Campus intending to help the new visitors or parents to explore the vast campus without any difficulty.\r\nThis isn\u2019t the complete view of the campus, it is subject to minor changes due to obvious reasons.\r\n\r\nINTELLECTUAL PROPERTY RIGHTS:\r\n\r\nThis application contains images of buildings that belongs to Dayananda Sagar Institutions and the misuse of the images available in this application are strictly prohibited. These images are not supposed to be used in any other possible manner, as it is against the privacy policy of the application.\r\n\r\nNOTIFICATION OF CHANGES:\r\n\r\nWe may modify these Terms, for any reason at any time, by posting a new version on our application; these changes do not affect rights and obligations that arose prior to such changes. Your continued use of our application following the posting of modified Terms in effect at the time of your use. Please review these terms periodically for changes. If you object to any provision of these terms or any subsequent modifications to these terms or become dissatisfied with our application in any way, your only recourse is to immediately terminate use of our Application.\r\n\r\nCONTACT INFORMATION:\r\n\r\nE-mail ID: yukta-cs197@dsce.edu.in\r\nPhone number:  9845960394 / 9148681497 / 6366159449\r\n\r\n\r\n\r\n");
		txtrTermsAndConditions.setBackground(new Color(154, 205, 50));
		contentPane.add(txtrTermsAndConditions, BorderLayout.CENTER);
		//Add ScrollPane to JFrame
		
		JScrollPane sp = new JScrollPane(txtrTermsAndConditions, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		contentPane.add(sp);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("I agree to the Terms&Conditions set by NavigatR");
		contentPane.add(chckbxNewCheckBox, BorderLayout.SOUTH);
		
		
		
	}

}
