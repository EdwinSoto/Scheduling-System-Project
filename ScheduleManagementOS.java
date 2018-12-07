package Methods;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextPane;

public class ScheduleManagementOS {
	
	public JFrame frmScheduleManagement;
	
	public ScheduleManagementOS() {
		initialize();
	}

	private void initialize() {
		frmScheduleManagement = new JFrame();
		frmScheduleManagement.setTitle("Schedule Management");
		frmScheduleManagement.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Eclipse\\Project Scheduling System\\Image\\Logo2.jpg"));
		frmScheduleManagement.setBounds(100, 100, 680, 400);
		frmScheduleManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmScheduleManagement.getContentPane().setLayout(null);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.WHITE);
		btnExit.setBackground(Color.BLACK);
		btnExit.setFont(new Font("Cambria", Font.PLAIN, 16));
		btnExit.setBounds(553, 315, 97, 25);
		frmScheduleManagement.getContentPane().add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
				
		JButton btnSignOut = new JButton("Sign Out");
		btnSignOut.setForeground(Color.WHITE);
		btnSignOut.setBackground(Color.BLACK);
		btnSignOut.setFont(new Font("Cambria", Font.PLAIN, 16));
		btnSignOut.setBounds(553, 13, 97, 25);
		frmScheduleManagement.getContentPane().add(btnSignOut);
		btnSignOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LogIn log = new LogIn();
				log.frmScheduleManager.setVisible(true);
				frmScheduleManagement.dispose();
			}
		});
		
		JButton btnScheduleManager = new JButton("Schedule Hours");
		btnScheduleManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ScheduleHours open = new ScheduleHours();
				open.frmScheduleHours.setVisible(true);
			}
		});
		btnScheduleManager.setForeground(Color.WHITE);
		btnScheduleManager.setBackground(Color.BLACK);
		btnScheduleManager.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 16));
		btnScheduleManager.setBounds(132, 82, 150, 61);
		frmScheduleManagement.getContentPane().add(btnScheduleManager);
		
		JButton btnTimeDisplay = new JButton("Time Display");
		btnTimeDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TimeDisplay open = new TimeDisplay();
				open.frmTimeDisplay.setVisible(true);
			}
		});
		btnTimeDisplay.setBackground(Color.BLACK);
		btnTimeDisplay.setForeground(Color.WHITE);
		btnTimeDisplay.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 16));
		btnTimeDisplay.setBounds(376, 82, 150, 61);
		frmScheduleManagement.getContentPane().add(btnTimeDisplay);
		
		JButton btnTracker = new JButton("Tracker");
		btnTracker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tracker open = new Tracker();
				open.frmTracker.setVisible(true);
			}
		});
		btnTracker.setForeground(Color.WHITE);
		btnTracker.setBackground(Color.BLACK);
		btnTracker.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 16));
		btnTracker.setBounds(375, 215, 151, 61);
		frmScheduleManagement.getContentPane().add(btnTracker);
		
		JButton btnPayChart = new JButton("Pay Chart");
		btnPayChart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PayChart open = new PayChart();
				open.frmPayChart.setVisible(true);
			}
		});
		btnPayChart.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 16));
		btnPayChart.setForeground(Color.WHITE);
		btnPayChart.setBackground(Color.BLACK);
		btnPayChart.setBounds(132, 215, 150, 61);
		frmScheduleManagement.getContentPane().add(btnPayChart);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Cambria", Font.PLAIN, 16));
		label.setIcon(new ImageIcon("D:\\Eclipse\\Project Scheduling System\\Image\\background(2).png"));
		label.setBounds(0, 0, 662, 353);
		frmScheduleManagement.getContentPane().add(label);
	}
}
