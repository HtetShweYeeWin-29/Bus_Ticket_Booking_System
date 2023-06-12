package Booking;

import java.awt.BorderLayout;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.List;
import java.awt.Choice;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;





class Admin_Authority extends JFrame {
	
	private JPanel panelHome;
	private JTextField txtID;
	private JTextField txtName;
	private JTextField txtCpty;
	private JTextField txtNum;
	private JTextField txtDes;
	private JTable jTable;
	private JButton btnAdd,btnUpdate,btnDelete;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Authority frame = new Admin_Authority();
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
	public Admin_Authority() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(100, 100, 1383, 884);
	    JPanel contentPane = new JPanel();
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    contentPane.setLayout(new BorderLayout(0, 0));
	    setContentPane(contentPane);
		getContentPane().setLayout(null);
		JPanel menu_panel = new JPanel();
		menu_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
		
	    
		JPanel Bus_detail = new JPanel();
		Bus_detail.setBounds(288, 13, 899, 677);
		getContentPane().add(Bus_detail);
		Bus_detail.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Bus_id            :");
		lblNewLabel_1.setBounds(33, 45, 176, 42);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 25));
		Bus_detail.add(lblNewLabel_1);
		
		JLabel lblBusname = new JLabel("Bus_Name     :");
		lblBusname.setBounds(33, 100, 176, 42);
		lblBusname.setFont(new Font("Arial", Font.PLAIN, 25));
		Bus_detail.add(lblBusname);
		
		JLabel lblBustype = new JLabel("Bus_Type       :");
		lblBustype.setBounds(33, 155, 176, 42);
		lblBustype.setFont(new Font("Arial", Font.PLAIN, 25));
		Bus_detail.add(lblBustype);
		
		JLabel lblBuscapacity = new JLabel("Bus_Capacity :");
		lblBuscapacity.setBounds(33, 210, 209, 42);
		lblBuscapacity.setFont(new Font("Arial", Font.PLAIN, 25));
		Bus_detail.add(lblBuscapacity);
		
		JLabel lblBusnumber = new JLabel("Bus_Number  :");
		lblBusnumber.setBounds(33, 265, 176, 42);
		lblBusnumber.setFont(new Font("Arial", Font.PLAIN, 25));
		Bus_detail.add(lblBusnumber);
		
		JLabel lblDescription = new JLabel("Description     :");
		lblDescription.setBounds(33, 324, 176, 42);
		lblDescription.setFont(new Font("Arial", Font.PLAIN, 25));
		Bus_detail.add(lblDescription);
		
		txtID = new JTextField();
		txtID.setBounds(240, 54, 248, 33);
		Bus_detail.add(txtID);
		txtID.setColumns(10);
		
		txtName = new JTextField();
		txtName.setBounds(240, 109, 248, 33);
		txtName.setColumns(10);
		Bus_detail.add(txtName);
		
		txtCpty = new JTextField();
		txtCpty.setBounds(240, 210, 248, 33);
		txtCpty.setColumns(10);
		Bus_detail.add(txtCpty);
		
		txtNum = new JTextField();
		txtNum.setBounds(240, 271, 248, 33);
		txtNum.setColumns(10);
		Bus_detail.add(txtNum);
		
		txtDes = new JTextField();
		txtDes.setBounds(240, 324, 248, 98);
		txtDes.setColumns(10);
		Bus_detail.add(txtDes);
		
		JComboBox cboType = new JComboBox();
		cboType.setBounds(240, 161, 248, 33);
		cboType.setModel(new DefaultComboBoxModel(new String[] {"None","VIP", "Normal"}));
		Bus_detail.add(cboType);
		
		
		
		btnAdd = new JButton("Add");
		btnAdd.setBounds(674, 45, 148, 54);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int bID=Integer.parseInt(txtID.getText());
				String bname=txtName.getText();
				String type=cboType.getSelectedItem().toString();
				int capacity=Integer.parseInt(txtCpty.getText());
				int bnumber=Integer.parseInt(txtNum.getText());	
				String des=txtDes.getText();
				
				String data[]={String.valueOf(bID),bname,type,String.valueOf(capacity),String.valueOf(bnumber),des};
				DefaultTableModel dm=(DefaultTableModel) jTable.getModel();
				dm.addRow(data);
				
				txtID.setText(null);
				txtName.setText(null);
				cboType.setSelectedIndex(0);
				txtCpty.setText(null);				
				txtNum.setText(null);
				txtDes.setText(null);
				
				txtID.requestFocus();
	}
		});
		btnAdd.setFont(new Font("Arial", Font.PLAIN, 25));
		Bus_detail.add(btnAdd);
		
		
		btnUpdate = new JButton("Update");
		btnUpdate.setBounds(674, 119, 148, 54);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel dm=(DefaultTableModel) jTable.getModel();
				
				if(jTable.getSelectedRowCount()==1){
			          //for select
			          int bID=Integer.parseInt(txtID.getText());
			          String bname=txtName.getText();
			          String type=cboType.getSelectedItem().toString();
			          int capacity=Integer.parseInt(txtCpty.getText());
			          int bnumber=Integer.parseInt(txtNum.getText());  
			          String des=txtDes.getText();
			          
			          //Update
			          
			          dm.setValueAt(bID, jTable.getSelectedRow(), 0);
			          dm.setValueAt(bname,jTable.getSelectedRow(),1);
			          dm.setValueAt(type,jTable.getSelectedRow(),2);
			          dm.setValueAt(capacity, jTable.getSelectedRow(), 3);
			          dm.setValueAt(bnumber, jTable.getSelectedRow(), 4);
			          dm.setValueAt(des,jTable.getSelectedRow(),5);
			          
			          JOptionPane.showMessageDialog(null, "Update Successfullly done...");
	            }
	            else{
	              
	              if(jTable.getRowCount()==0){
	                JOptionPane.showMessageDialog(null, "Table is Empty");
	              }
	              else{
	                JOptionPane.showMessageDialog(null, "Please select one row for update!");
	              }
				}
	    }
		});
		btnUpdate.setFont(new Font("Arial", Font.PLAIN, 25));
		Bus_detail.add(btnUpdate);
		
		btnDelete = new JButton("Delete");
		btnDelete.setBounds(674, 186, 148, 54);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data="Bus_id :"+jTable.getValueAt(jTable.getSelectedRow(),0).toString();
				data+="\nBus_Name :"+jTable.getValueAt(jTable.getSelectedRow(),1).toString();
				data+="\nBus_Type :"+jTable.getValueAt(jTable.getSelectedRow(),2).toString();
				data+="\nBus_Capacity :"+jTable.getValueAt(jTable.getSelectedRow(),3).toString();
				data+="\nBus_Number :"+jTable.getValueAt(jTable.getSelectedRow(),4).toString();
				data+="\nDescription :"+jTable.getValueAt(jTable.getSelectedRow(),5).toString();
				
				data+="\nDo you want to really delete above data";
				int ch=JOptionPane.showConfirmDialog(null, data,"Comfirm Message",JOptionPane.WARNING_MESSAGE);
				if(ch==JOptionPane.YES_OPTION){
					DefaultTableModel dm=(DefaultTableModel) jTable.getModel();
					dm.removeRow(jTable.getSelectedRow());
				}
			
			}
		});
		btnDelete.setFont(new Font("Arial", Font.PLAIN, 25));
		Bus_detail.add(btnDelete);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(674, 253, 148, 54);
		btnLogout.setFont(new Font("Arial", Font.PLAIN, 25));
		Bus_detail.add(btnLogout);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 435, 854, 229);
		scrollPane.addMouseListener(new MouseAdapter() {
		});
		Bus_detail.add(scrollPane);
		
		jTable = new JTable();
		jTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				DefaultTableModel dm=(DefaultTableModel) jTable.getModel();
				
				String Bus_id=dm.getValueAt(jTable.getSelectedRow(), 0).toString();
		        String Bus_Name=dm.getValueAt(jTable.getSelectedRow(), 1).toString();
		        String Bus_Type=dm.getValueAt(jTable.getSelectedRow(), 2).toString();
		        String Bus_Capacity=dm.getValueAt(jTable.getSelectedRow(), 3).toString();
		        String Bus_Number=dm.getValueAt(jTable.getSelectedRow(), 4).toString();
		        String Description=dm.getValueAt(jTable.getSelectedRow(), 5).toString();
		        
		        txtID.setText(Bus_id);
		        txtName.setText(Bus_Name);
		        txtCpty.setText(Bus_Capacity);
		        txtNum.setText(Bus_Number);
		        txtDes.setText(Description);
		        cboType.setToolTipText(Bus_Type);
			}
		});
		scrollPane.setViewportView(jTable);
		jTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Bus_id", "Bus_Name", "Bus_Type", "Bus_Capacity", "Bus_Number", "Description"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, Integer.class, Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		menu_panel.setBounds(0, 0, 279, 703);
		getContentPane().add(menu_panel);
		menu_panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\JAVA Code\\Bus_Ticket_Booking_System\\img\\Admin2.jpg"));
		lblNewLabel.setBounds(27, 0, 196, 189);
		menu_panel.add(lblNewLabel);
		
		panelHome = new JPanel();
		panelHome.setBackground(Color.CYAN);
		panelHome.setBounds(0, 253, 278, 48);
		menu_panel.add(panelHome);
		panelHome.setLayout(null);
		
		JLabel Home = new JLabel("Home");
		Home.setFont(new Font("Arial", Font.PLAIN, 25));
		Home.setBounds(84, 13, 132, 22);
		panelHome.add(Home);
		
		JPanel panelAdmin = new JPanel();
		panelAdmin.setBackground(Color.CYAN);
		panelAdmin.setBounds(0, 301, 278, 48);
		menu_panel.add(panelAdmin);
		panelAdmin.setLayout(null);
		
		JLabel lblAdmin = new JLabel("Admin");
		lblAdmin.setFont(new Font("Arial", Font.PLAIN, 25));
		lblAdmin.setBounds(80, 13, 132, 22);
		panelAdmin.add(lblAdmin);
		
		JPanel panelBusdetail = new JPanel();
		panelBusdetail.setBackground(Color.CYAN);
		panelBusdetail.setBounds(0, 349, 278, 48);
		menu_panel.add(panelBusdetail);
		panelBusdetail.setLayout(null);
		
		JLabel lblBusdetail = new JLabel("Bus_detail");
		lblBusdetail.setFont(new Font("Arial", Font.PLAIN, 25));
		lblBusdetail.setBounds(83, 13, 132, 22);
		panelBusdetail.add(lblBusdetail);
		
		JPanel panelRoute = new JPanel();
		panelRoute.setBackground(Color.CYAN);
		panelRoute.setBounds(0, 395, 278, 48);
		menu_panel.add(panelRoute);
		panelRoute.setLayout(null);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Arial", Font.PLAIN, 25));
		lblRoute.setBounds(76, 13, 132, 22);
		panelRoute.add(lblRoute);
		
		JPanel panelEmployee = new JPanel();
		panelEmployee.setBackground(Color.CYAN);
		panelEmployee.setBounds(0, 443, 278, 48);
		menu_panel.add(panelEmployee);
		panelEmployee.setLayout(null);
		
		JLabel lblEmployee = new JLabel("Employee");
		lblEmployee.setFont(new Font("Arial", Font.PLAIN, 25));
		lblEmployee.setBounds(75, 13, 132, 35);
		panelEmployee.add(lblEmployee);
		
		JPanel panelLogout = new JPanel();
		panelLogout.setLayout(null);
		panelLogout.setBackground(Color.CYAN);
		panelLogout.setBounds(0, 490, 278, 48);
		menu_panel.add(panelLogout);
		
		JLabel lblLogout = new JLabel("Logout");
		lblLogout.setFont(new Font("Arial", Font.PLAIN, 25));
		lblLogout.setBounds(73, 13, 132, 35);
		panelLogout.add(lblLogout);
		
	}
}
	
	