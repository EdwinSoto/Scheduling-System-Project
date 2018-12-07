package Methods;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

public class Tracker implements Tracker_interface{

	JFrame frmTracker;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	public static String sum;
	public static String sum1;
	public static String sum2;

	public Tracker() {
		initialize();
	}

	private void initialize() {
		frmTracker = new JFrame();
		frmTracker.setTitle("Tracker");
		frmTracker.setFont(new Font("Cambria", Font.PLAIN, 16));
		frmTracker.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Eclipse\\Project Scheduling System\\Image\\Logo2.jpg"));
		frmTracker.setBounds(100, 100, 680, 400);
		frmTracker.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmTracker.getContentPane().setLayout(null);

		JButton btnEnter = new JButton("Enter");
		btnEnter.setFont(new Font("Cambria", Font.PLAIN, 16));
		btnEnter.setForeground(Color.WHITE);
		btnEnter.setBackground(Color.BLACK);
		btnEnter.setBounds(56, 134, 97, 25);
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum = textField.getText();
				if(Integer.parseInt(sum) > 40) {
					JOptionPane.showMessageDialog(null, "Error", "Alert", JOptionPane.ERROR_MESSAGE);
				}
				else if(Integer.parseInt(sum)==0){
					JOptionPane.showMessageDialog(null, "Add hours", "Alert", JOptionPane.ERROR_MESSAGE);
				}
				textField.setText(sum);
			}
		});
		frmTracker.getContentPane().add(btnEnter);
		
		JButton btnEnter2 = new JButton("Enter");
		btnEnter2.setFont(new Font("Cambria", Font.PLAIN, 16));
		btnEnter2.setForeground(Color.WHITE);
		btnEnter2.setBackground(Color.BLACK);
		btnEnter2.setBounds(290, 134, 97, 25);
		btnEnter2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum1 = textField_1.getText();
				if(Integer.parseInt(sum1) > 40) {
					JOptionPane.showMessageDialog(null, "Error", "Alert", JOptionPane.ERROR_MESSAGE);
				}
				else if(Integer.parseInt(sum1)==0){
					JOptionPane.showMessageDialog(null, "Add hours", "Alert", JOptionPane.ERROR_MESSAGE);
				}
				textField_1.setText(sum1);
			}
		});
		frmTracker.getContentPane().add(btnEnter2);
		
		JButton btnEnter3 = new JButton("Enter");
		btnEnter3.setFont(new Font("Cambria", Font.PLAIN, 16));
		btnEnter3.setForeground(Color.WHITE);
		btnEnter3.setBackground(Color.BLACK);
		btnEnter3.setBounds(509, 134, 97, 25);
		btnEnter3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum2 = textField_2.getText();
				if(Integer.parseInt(sum2) > 40) {
					JOptionPane.showMessageDialog(null, "Error", "Alert", JOptionPane.ERROR_MESSAGE);
				}
				else if(Integer.parseInt(sum2)==0){
					JOptionPane.showMessageDialog(null, "Add hours", "Alert", JOptionPane.ERROR_MESSAGE);
				}
				textField_2.setText(sum2);
			}
		});
		frmTracker.getContentPane().add(btnEnter3);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTracker.dispose();
			}
		});
		btnExit.setForeground(Color.WHITE);
		btnExit.setBackground(Color.BLACK);
		btnExit.setFont(new Font("Cambria", Font.PLAIN, 16));
		btnExit.setBounds(553, 315, 97, 25);
		frmTracker.getContentPane().add(btnExit);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.WHITE);
		textField.setBackground(Color.BLACK);
		textField.setFont(new Font("Cambria", Font.ITALIC, 16));
		textField.setBounds(31, 99, 147, 22);
		frmTracker.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("Cambria", Font.ITALIC, 16));
		textField_1.setColumns(10);
		textField_1.setBackground(Color.BLACK);
		textField_1.setBounds(263, 99, 147, 22);
		frmTracker.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setForeground(Color.WHITE);
		textField_2.setFont(new Font("Cambria", Font.ITALIC, 16));
		textField_2.setColumns(10);
		textField_2.setBackground(Color.BLACK);
		textField_2.setBounds(484, 99, 147, 22);
		frmTracker.getContentPane().add(textField_2);
		
		JLabel lblJuan = new JLabel("Juan");
		lblJuan.setForeground(Color.WHITE);
		lblJuan.setHorizontalAlignment(SwingConstants.CENTER);
		lblJuan.setFont(new Font("Cambria", Font.BOLD, 18));
		lblJuan.setBackground(Color.BLACK);
		lblJuan.setBounds(62, 42, 74, 44);
		frmTracker.getContentPane().add(lblJuan);
		
		JLabel lblMaria = new JLabel("Maria");
		lblMaria.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaria.setForeground(Color.WHITE);
		lblMaria.setFont(new Font("Cambria", Font.BOLD, 18));
		lblMaria.setBackground(Color.BLACK);
		lblMaria.setBounds(294, 47, 77, 39);
		frmTracker.getContentPane().add(lblMaria);
		
		JLabel lblPedro = new JLabel("Pedro");
		lblPedro.setHorizontalAlignment(SwingConstants.CENTER);
		lblPedro.setForeground(Color.WHITE);
		lblPedro.setFont(new Font("Cambria", Font.BOLD, 18));
		lblPedro.setBackground(Color.BLACK);
		lblPedro.setBounds(518, 47, 70, 39);
		frmTracker.getContentPane().add(lblPedro);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\Eclipse\\Project Scheduling System\\Image\\background(2).png"));
		label.setBounds(0, 0, 662, 353);
		frmTracker.getContentPane().add(label);
	}
	public int SumJuan() {
		sum = textField.getText();
		return Integer.parseInt(sum);
	}
	public int SumMaria() {
		sum1 = textField_1.getText();
		return Integer.parseInt(sum1);
	}
	public int SumPedro() {
		sum2 = textField_2.getText();
		return Integer.parseInt(sum2);
	}
}
