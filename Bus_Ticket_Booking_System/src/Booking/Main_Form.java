package Booking;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Window.Type;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Main_Form extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Form frame = new Main_Form();
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
	public Main_Form() {
		setTitle("Home");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Asus\\Downloads\\photo_2023-06-08_09-17-04.jpg"));
		getContentPane().setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 830, 514);
		getContentPane().setLayout(null);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				new Admin_Dashboard().setVisible(true);
				
			}
		});
		btnAdmin.setBackground(SystemColor.textHighlight);
		btnAdmin.setForeground(Color.BLACK);
		btnAdmin.setFont(new Font("Arial", Font.PLAIN, 25));
		btnAdmin.setBounds(96, 349, 236, 66);
		getContentPane().add(btnAdmin);
		
		JButton btnEmployee = new JButton("Employee");
		btnEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEmployee.setBackground(new Color(220, 20, 60));
		btnEmployee.setFont(new Font("Arial", Font.PLAIN, 25));
		btnEmployee.setBounds(451, 349, 236, 66);
		getContentPane().add(btnEmployee);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\JAVA Code\\Bus_Ticket_Booking_System\\img\\Admin2.jpg"));
		lblNewLabel_1.setBounds(112, 121, 199, 192);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Bus Ticket Booking System");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_2.setBounds(205, 36, 358, 38);
		getContentPane().add(lblNewLabel_2);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\JAVA Code\\Bus_Ticket_Booking_System\\img\\Employee.jpg"));
		label.setBounds(472, 121, 199, 192);
		getContentPane().add(label);
	}
}
