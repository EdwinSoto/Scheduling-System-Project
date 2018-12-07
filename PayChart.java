package Methods;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

public class PayChart extends PayChart_Data {

	Tracker a = new Tracker();
	ScheduleHours b = new ScheduleHours();
	
	JFrame frmPayChart;
	
	static double pay = 0;
	static double pay1 = 0;
	static double pay2 = 0;

	public PayChart() {
		initialize();
	}

	private void initialize() {
		frmPayChart = new JFrame();
		frmPayChart.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Eclipse\\Project Scheduling System\\Image\\Logo2.jpg"));
		frmPayChart.setTitle("Pay Chart");
		frmPayChart.setFont(new Font("Cambria", Font.PLAIN, 16));
		frmPayChart.setBounds(100, 100, 680, 400);
		frmPayChart.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmPayChart.getContentPane().setLayout(null);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmPayChart.dispose();
			}
		});
		btnExit.setForeground(Color.WHITE);
		btnExit.setBackground(Color.BLACK);
		btnExit.setFont(new Font("Cambria", Font.BOLD, 16));
		btnExit.setBounds(553, 315, 97, 25);
		frmPayChart.getContentPane().add(btnExit);
		
		JTextPane textPane = new JTextPane();
		textPane.setForeground(Color.WHITE);
		textPane.setBackground(Color.BLACK);
		textPane.setFont(new Font("Cambria", Font.PLAIN, 16));
		textPane.setBounds(12, 13, 516, 327);
		textPane.setEditable(false);
		frmPayChart.getContentPane().add(textPane);
		
		JButton btnSubTotal = new JButton("Sub Total");
		btnSubTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pay = Balance(Double.parseDouble(a.sum));
				pay1 = Balance(Double.parseDouble(a.sum1));
				pay2 = Balance(Double.parseDouble(a.sum2));
				textPane.setText("========================================================="
						+"		               		Bahn's Buffet" + "\n" 
						+ "------------------------------------------------------------------------------------------------------" + "\n"
						+ "          Employee:                           Total Hours:                   SubTotal:" + "\n" 
						+ "            Juan                                           " + b.JuanSum +"                                  " + Double.toString(pay)  + "\n" 
						+ "            Maria                                         " + b.MariaSum +"                                  " + Double.toString(pay1) +"\n"
						+ "            Pedro                                        " + b.PedroSum +"                                   " + Double.toString(pay2) + "\n"
						+ "------------------------------------------------------------------------------------------------------");
			}
		});
		btnSubTotal.setFont(new Font("Cambria", Font.PLAIN, 16));
		btnSubTotal.setForeground(Color.WHITE);
		btnSubTotal.setBackground(Color.BLACK);
		btnSubTotal.setBounds(540, 40, 110, 70);
		frmPayChart.getContentPane().add(btnSubTotal);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.setForeground(Color.WHITE);
		btnTotal.setBackground(Color.BLACK);
		btnTotal.setFont(new Font("Cambria", Font.PLAIN, 16));
		btnTotal.setBounds(540, 195, 110, 70);
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double total = Balance(pay,0.0115);
				double total1 = Balance(pay1,0.0115);
				double total2= Balance(pay2,0.0115);
				
				textPane.setText("========================================================="
						+"		               		Bahn's Buffet" + "\n" 
						+ "------------------------------------------------------------------------------------------------------" + "\n"
						+ "          Employee:                           Total Hours:                     Total:" + "\n" 
						+ "            Juan                                           " + b.JuanSum +"                                  " + Double.toString(total)  + "\n" 
						+ "            Maria                                         " + b.MariaSum +"                                  " + Double.toString(total1) +"\n"
						+ "            Pedro                                        " + b.PedroSum +"                                   " + Double.toString(total2) + "\n"
						+ "------------------------------------------------------------------------------------------------------");
			}
		});
		frmPayChart.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setText("");
			}
		});
		btnReset.setFont(new Font("Cambria", Font.PLAIN, 16));
		btnReset.setForeground(Color.WHITE);
		btnReset.setBackground(Color.BLACK);
		btnReset.setBounds(540, 123, 110, 59);
		frmPayChart.getContentPane().add(btnReset);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("D:\\Eclipse\\Project Scheduling System\\Image\\background(2).png"));
		label.setBounds(0, 0, 662, 353);
		frmPayChart.getContentPane().add(label);
	}
}
