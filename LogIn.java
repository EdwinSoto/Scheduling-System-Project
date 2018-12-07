package Methods;

/* Rights reserved to Edwin Soto Velázquez*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.util.*;

public class LogIn {

	String username = " ";
	private String password = " ";
	public JFrame frmScheduleManager;
	private JPasswordField passwordField;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn window = new LogIn();
					window.frmScheduleManager.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Scanner in = new Scanner (System.in);
	private JTextField textField;

	public LogIn() {
		initialize();
	}

	private void initialize() {
		frmScheduleManager = new JFrame();
		frmScheduleManager.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmScheduleManager.getContentPane().setFont(new Font("Cambria", Font.PLAIN, 16));
		frmScheduleManager.setBackground(Color.WHITE);
		frmScheduleManager.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 16));
		frmScheduleManager.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Eclipse\\Project Scheduling System\\Image\\Logo2.jpg"));
		frmScheduleManager.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmScheduleManager.getContentPane().setForeground(Color.LIGHT_GRAY);
		frmScheduleManager.setForeground(Color.BLACK);
		frmScheduleManager.setTitle("Schedule Manager");
		frmScheduleManager.setBounds(100, 100, 680, 400);
		frmScheduleManager.getContentPane().setLayout(null);
		
		Button button = new Button("Enter");
		button.setFont(new Font("Cambria", Font.PLAIN, 16));
		button.setBackground(Color.BLACK);
		button.setBounds(246, 218, 130, 24);
		frmScheduleManager.getContentPane().add(button);
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				username = textField.getText();
				textField.setText(username);
				
				password = passwordField.getText();
				passwordField.setText(password);
				
				if(username.contains("Joshua") && password.contains("1114") || username.contains("Edwin") && password.contains("0520")) {
					textField.setText(null);
					passwordField.setText(null);
					JOptionPane.showMessageDialog(null, "Welcome to Schedule Management OS", "Schedule Management", JOptionPane.DEFAULT_OPTION);
					ScheduleManagementOS open = new ScheduleManagementOS ();
					open.frmScheduleManagement.setVisible(true);
					frmScheduleManager.dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid Login", "Login error" ,JOptionPane.ERROR_MESSAGE);
					textField.setText(null);
					passwordField.setText(null);
				}
			}
		});
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Cambria", Font.BOLD, 16));
		lblPassword.setBounds(246, 125, 115, 24);
		frmScheduleManager.getContentPane().add(lblPassword);
		
		Button button_2 = new Button("Exit");
		button_2.setFont(new Font("Cambria", Font.PLAIN, 16));
		button_2.setBackground(Color.BLACK);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		button_2.setBounds(559, 319, 95, 24);
		frmScheduleManager.getContentPane().add(button_2);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBackground(Color.WHITE);
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setFont(new Font("Cambria", Font.BOLD, 16));
		lblUsername.setBounds(246, 33, 115, 24);
		frmScheduleManager.getContentPane().add(lblUsername);
		
		JLabel label = new JLabel("");
		label.setForeground(Color.WHITE);
		label.setIcon(new ImageIcon("D:\\Eclipse\\Project Scheduling System\\Image\\background(2).png"));
		label.setBounds(0, 0, 664, 353);
		frmScheduleManager.getContentPane().add(label);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setFont(new Font("Cambria", Font.ITALIC, 16));
		passwordField.setBackground(Color.WHITE);
		passwordField.setForeground(Color.LIGHT_GRAY);
		passwordField.setBounds(246, 169, 130, 22);
		frmScheduleManager.getContentPane().add(passwordField);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Cambria", Font.ITALIC, 16));
		textField.setBounds(246, 88, 130, 22);
		frmScheduleManager.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
