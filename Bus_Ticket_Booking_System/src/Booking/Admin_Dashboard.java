package Booking;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Admin_Dashboard extends JFrame {

	private JPanel contentPane;
	private JTextField txtAcc;
	private JPasswordField pwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Dashboard frame = new Admin_Dashboard();
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
	public Admin_Dashboard() {
		setTitle("Admin");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Asus\\Downloads\\Telegram Desktop\\photo_2023-06-08_10-01-33.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 830, 514);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPassword = new JLabel(" Password  :");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBackground(Color.WHITE);
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 22));
		lblPassword.setBounds(91, 226, 143, 65);
		contentPane.add(lblPassword);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				new Admin_Authority().setVisible(true);
			}
		});
		btnSubmit.setBackground(new Color(0, 250, 154));
		btnSubmit.setFont(new Font("Arial", Font.PLAIN, 20));
		btnSubmit.setBounds(108, 362, 132, 48);
		contentPane.add(btnSubmit);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAcc.setText("");
				pwd.setText("");
				txtAcc.requestFocus();
			}
		});
		btnClear.setBackground(new Color(220, 20, 60));
		btnClear.setFont(new Font("Arial", Font.PLAIN, 20));
		btnClear.setBounds(304, 362, 132, 48);
		contentPane.add(btnClear);
		
		JButton btnAdmin = new JButton("Employee");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdmin.setBackground(new Color(0, 191, 255));
		btnAdmin.setFont(new Font("Arial", Font.PLAIN, 20));
		btnAdmin.setBounds(499, 362, 132, 48);
		contentPane.add(btnAdmin);
		
		txtAcc = new JTextField();
		txtAcc.setBackground(Color.WHITE);
		txtAcc.setFont(new Font("Arial", Font.PLAIN, 20));
		txtAcc.setBounds(297, 142, 263, 37);
		contentPane.add(txtAcc);
		txtAcc.setColumns(10);
		
		pwd = new JPasswordField();
		pwd.setBounds(297, 243, 263, 37);
		contentPane.add(pwd);
		
		JLabel lblAccount = new JLabel("Account  :");
		lblAccount.setForeground(Color.WHITE);
		lblAccount.setFont(new Font("Arial", Font.PLAIN, 22));
		lblAccount.setBackground(Color.WHITE);
		lblAccount.setBounds(108, 142, 143, 65);
		contentPane.add(lblAccount);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\JAVA Code\\Bus_Ticket_Booking_System\\img\\Bus_bg.jpg"));
		label.setBounds(0, 0, 812, 467);
		contentPane.add(label);
	}
}
