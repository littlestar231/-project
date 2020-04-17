package Boundary;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class StaffShowBill extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffShowBill frame = new StaffShowBill();
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
	public StaffShowBill() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.activeCaption);
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Change Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(42, 80, 124, 23);
		contentPane.add(btnNewButton);
		
		JButton btnSendBill = new JButton("Send Bill");
		btnSendBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSendBill.setBounds(42, 113, 124, 23);
		contentPane.add(btnSendBill);
		
		JButton btnYearlyReport = new JButton("Yearly Report");
		btnYearlyReport.setBounds(42, 145, 124, 23);
		contentPane.add(btnYearlyReport);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(198, 10, 228, 243);
		contentPane.add(textArea);
		
		JButton btnNewButton_2_1 = new JButton("Back");
		btnNewButton_2_1.setBounds(10, 230, 59, 23);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("Exit");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2_1_1.setBounds(79, 230, 59, 23);
		contentPane.add(btnNewButton_2_1_1);
	}
}
