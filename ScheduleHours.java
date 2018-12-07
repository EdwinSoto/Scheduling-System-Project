package Methods;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class ScheduleHours extends ScheduleHours_abstract{
	
	JFrame frmScheduleHours;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScheduleHours window = new ScheduleHours();
					window.frmScheduleHours.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ScheduleHours() {
		initialize();
	}

	private void initialize() {
		frmScheduleHours = new JFrame();
		frmScheduleHours.setTitle("Schedule Hours");
		frmScheduleHours.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Eclipse\\Project Scheduling System\\Image\\Logo2.jpg"));
		frmScheduleHours.setFont(new Font("Cambria", Font.PLAIN, 16));
		frmScheduleHours.setBounds(100, 100, 677, 400);
		frmScheduleHours.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmScheduleHours.getContentPane().setLayout(null);
		
		JLabel lblEmployee = new JLabel("Employee:");
		lblEmployee.setFont(new Font("Cambria", Font.BOLD, 16));
		lblEmployee.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployee.setForeground(Color.WHITE);
		lblEmployee.setBackground(Color.BLACK);
		lblEmployee.setBounds(12, 13, 78, 23);
		frmScheduleHours.getContentPane().add(lblEmployee);
		
		JLabel lblNewLabel = new JLabel("Monday");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(97, 13, 68, 23);
		frmScheduleHours.getContentPane().add(lblNewLabel);
		
		JLabel lblTuesday = new JLabel("Tuesday");
		lblTuesday.setHorizontalAlignment(SwingConstants.CENTER);
		lblTuesday.setForeground(Color.WHITE);
		lblTuesday.setFont(new Font("Cambria", Font.BOLD, 16));
		lblTuesday.setBounds(177, 16, 68, 16);
		frmScheduleHours.getContentPane().add(lblTuesday);
		
		JLabel lblWednesday = new JLabel("Wednesday");
		lblWednesday.setFont(new Font("Cambria", Font.BOLD, 16));
		lblWednesday.setHorizontalAlignment(SwingConstants.CENTER);
		lblWednesday.setForeground(Color.WHITE);
		lblWednesday.setBounds(257, 13, 94, 23);
		frmScheduleHours.getContentPane().add(lblWednesday);
		
		JLabel lblThursday = new JLabel("Thursday");
		lblThursday.setForeground(Color.WHITE);
		lblThursday.setFont(new Font("Cambria", Font.BOLD, 16));
		lblThursday.setHorizontalAlignment(SwingConstants.CENTER);
		lblThursday.setBounds(363, 13, 72, 23);
		frmScheduleHours.getContentPane().add(lblThursday);
		
		JLabel lblFriday = new JLabel("Friday");
		lblFriday.setForeground(Color.WHITE);
		lblFriday.setHorizontalAlignment(SwingConstants.CENTER);
		lblFriday.setFont(new Font("Cambria", Font.BOLD, 16));
		lblFriday.setBounds(447, 16, 56, 16);
		frmScheduleHours.getContentPane().add(lblFriday);
		
		JLabel lblSaturday = new JLabel("Saturday");
		lblSaturday.setForeground(Color.WHITE);
		lblSaturday.setHorizontalAlignment(SwingConstants.CENTER);
		lblSaturday.setFont(new Font("Cambria", Font.BOLD, 16));
		lblSaturday.setBounds(515, 16, 68, 16);
		frmScheduleHours.getContentPane().add(lblSaturday);
		
		JLabel lblSunday = new JLabel("Sunday");
		lblSunday.setForeground(Color.WHITE);
		lblSunday.setFont(new Font("Cambria", Font.BOLD, 16));
		lblSunday.setHorizontalAlignment(SwingConstants.CENTER);
		lblSunday.setBounds(595, 16, 56, 16);
		frmScheduleHours.getContentPane().add(lblSunday);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.WHITE);
		btnExit.setBackground(Color.BLACK);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmScheduleHours.dispose();
			}
		});
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(Color.WHITE);
		comboBox.setBackground(Color.BLACK);
		comboBox.setFont(new Font("Cambria", Font.BOLD, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox.setBounds(112, 49, 36, 34);
		frmScheduleHours.getContentPane().add(comboBox);
		comboBox.setSelectedItem(Juan[0]);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setForeground(Color.WHITE);
		comboBox_1.setBackground(Color.BLACK);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_1.setFont(new Font("Cambria", Font.BOLD, 16));
		comboBox_1.setBounds(187, 49, 36, 34);
		frmScheduleHours.getContentPane().add(comboBox_1);
		comboBox_1.setSelectedItem(Juan[1]);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setForeground(Color.WHITE);
		comboBox_2.setBackground(Color.BLACK);
		comboBox_2.setFont(new Font("Cambria", Font.BOLD, 16));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_2.setBounds(289, 49, 36, 34);
		frmScheduleHours.getContentPane().add(comboBox_2);
		comboBox_2.setSelectedItem(Juan[2]);

		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setForeground(Color.WHITE);
		comboBox_3.setBackground(Color.BLACK);
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_3.setFont(new Font("Cambria", Font.BOLD, 16));
		comboBox_3.setBounds(378, 50, 36, 34);
		frmScheduleHours.getContentPane().add(comboBox_3);
		comboBox_3.setSelectedItem(Juan[3]);

		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setForeground(Color.WHITE);
		comboBox_4.setBackground(Color.BLACK);
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_4.setFont(new Font("Cambria", Font.BOLD, 16));
		comboBox_4.setBounds(457, 49, 36, 34);
		frmScheduleHours.getContentPane().add(comboBox_4);
		comboBox_4.setSelectedItem(Juan[4]);

		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setForeground(Color.WHITE);
		comboBox_5.setBackground(Color.BLACK);
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_5.setFont(new Font("Cambria", Font.BOLD, 16));
		comboBox_5.setBounds(536, 49, 36, 34);
		frmScheduleHours.getContentPane().add(comboBox_5);
		comboBox_5.setSelectedItem(Juan[5]);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setForeground(Color.WHITE);
		comboBox_6.setBackground(Color.BLACK);
		comboBox_6.setFont(new Font("Cambria", Font.BOLD, 16));
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_6.setBounds(600, 50, 36, 34);
		frmScheduleHours.getContentPane().add(comboBox_6);
		comboBox_6.setSelectedItem(Juan[6]);

		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setForeground(Color.WHITE);
		comboBox_7.setBackground(Color.BLACK);
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_7.setFont(new Font("Cambria", Font.BOLD, 16));
		comboBox_7.setBounds(112, 96, 36, 34);
		frmScheduleHours.getContentPane().add(comboBox_7);
		comboBox_7.setSelectedItem(Maria[0]);

		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setForeground(Color.WHITE);
		comboBox_8.setBackground(Color.BLACK);
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_8.setFont(new Font("Cambria", Font.BOLD, 16));
		comboBox_8.setBounds(187, 96, 36, 34);
		frmScheduleHours.getContentPane().add(comboBox_8);
		comboBox_8.setSelectedItem(Maria[1]);

		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setForeground(Color.WHITE);
		comboBox_9.setBackground(Color.BLACK);
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_9.setFont(new Font("Cambria", Font.BOLD, 16));
		comboBox_9.setBounds(289, 96, 36, 34);
		frmScheduleHours.getContentPane().add(comboBox_9);
		comboBox_9.setSelectedItem(Maria[2]);

		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setForeground(Color.WHITE);
		comboBox_10.setBackground(Color.BLACK);
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_10.setFont(new Font("Cambria", Font.BOLD, 16));
		comboBox_10.setBounds(378, 96, 36, 34);
		frmScheduleHours.getContentPane().add(comboBox_10);
		comboBox_10.setSelectedItem(Maria[3]);

		JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setForeground(Color.WHITE);
		comboBox_11.setBackground(Color.BLACK);
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_11.setFont(new Font("Cambria", Font.BOLD, 16));
		comboBox_11.setBounds(457, 96, 36, 34);
		frmScheduleHours.getContentPane().add(comboBox_11);
		comboBox_11.setSelectedItem(Maria[4]);

		JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setForeground(Color.WHITE);
		comboBox_12.setBackground(Color.BLACK);
		comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_12.setFont(new Font("Cambria", Font.BOLD, 16));
		comboBox_12.setBounds(536, 96, 36, 34);
		frmScheduleHours.getContentPane().add(comboBox_12);
		comboBox_12.setSelectedItem(Maria[5]);

		JComboBox comboBox_13 = new JComboBox();
		comboBox_13.setForeground(Color.WHITE);
		comboBox_13.setBackground(Color.BLACK);
		comboBox_13.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_13.setFont(new Font("Cambria", Font.BOLD, 16));
		comboBox_13.setBounds(600, 96, 36, 34);
		frmScheduleHours.getContentPane().add(comboBox_13);
		comboBox_13.setSelectedItem(Maria[6]);

		JComboBox comboBox_14 = new JComboBox();
		comboBox_14.setForeground(Color.WHITE);
		comboBox_14.setBackground(Color.BLACK);
		comboBox_14.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_14.setFont(new Font("Cambria", Font.BOLD, 16));
		comboBox_14.setBounds(112, 143, 36, 33);
		frmScheduleHours.getContentPane().add(comboBox_14);
		comboBox_14.setSelectedItem(Pedro[0]);

		JComboBox comboBox_15 = new JComboBox();
		comboBox_15.setForeground(Color.WHITE);
		comboBox_15.setBackground(Color.BLACK);
		comboBox_15.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_15.setFont(new Font("Cambria", Font.BOLD, 16));
		comboBox_15.setBounds(187, 143, 36, 34);
		frmScheduleHours.getContentPane().add(comboBox_15);
		comboBox_15.setSelectedItem(Pedro[1]);

		JComboBox comboBox_16 = new JComboBox();
		comboBox_16.setForeground(Color.WHITE);
		comboBox_16.setBackground(Color.BLACK);
		comboBox_16.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_16.setFont(new Font("Cambria", Font.BOLD, 16));
		comboBox_16.setBounds(289, 142, 36, 34);
		frmScheduleHours.getContentPane().add(comboBox_16);
		comboBox_16.setSelectedItem(Pedro[2]);

		JComboBox comboBox_17 = new JComboBox();
		comboBox_17.setForeground(Color.WHITE);
		comboBox_17.setBackground(Color.BLACK);
		comboBox_17.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_17.setFont(new Font("Cambria", Font.BOLD, 16));
		comboBox_17.setBounds(378, 142, 36, 34);
		frmScheduleHours.getContentPane().add(comboBox_17);
		comboBox_17.setSelectedItem(Pedro[3]);

		JComboBox comboBox_18 = new JComboBox();
		comboBox_18.setForeground(Color.WHITE);
		comboBox_18.setBackground(Color.BLACK);
		comboBox_18.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_18.setFont(new Font("Cambria", Font.BOLD, 16));
		comboBox_18.setBounds(457, 143, 36, 33);
		frmScheduleHours.getContentPane().add(comboBox_18);
		comboBox_18.setSelectedItem(Pedro[4]);

		JComboBox comboBox_19 = new JComboBox();
		comboBox_19.setForeground(Color.WHITE);
		comboBox_19.setBackground(Color.BLACK);
		comboBox_19.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_19.setFont(new Font("Cambria", Font.BOLD, 16));
		comboBox_19.setBounds(536, 143, 36, 33);
		frmScheduleHours.getContentPane().add(comboBox_19);
		comboBox_19.setSelectedItem(Pedro[5]);

		JComboBox comboBox_20 = new JComboBox();
		comboBox_20.setForeground(Color.WHITE);
		comboBox_20.setBackground(Color.BLACK);
		comboBox_20.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_20.setFont(new Font("Cambria", Font.BOLD, 16));
		comboBox_20.setBounds(600, 143, 36, 33);
		frmScheduleHours.getContentPane().add(comboBox_20);
		comboBox_20.setSelectedItem(Pedro[6]);

		JButton btnEnterHours = new JButton("Enter Hours");
		btnEnterHours.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Juan[0] = (String) comboBox.getSelectedItem();
				Juan[1] = (String) comboBox_1.getSelectedItem();
				Juan[2] = (String) comboBox_2.getSelectedItem();
				Juan[3] = (String) comboBox_3.getSelectedItem();
				Juan[4] = (String) comboBox_4.getSelectedItem();
				Juan[5] = (String) comboBox_5.getSelectedItem();
				Juan[6] = (String) comboBox_6.getSelectedItem();
				
				Maria[0] = (String) comboBox_7.getSelectedItem();
				Maria[1] = (String) comboBox_8.getSelectedItem();
				Maria[2] = (String) comboBox_9.getSelectedItem();
				Maria[3] = (String) comboBox_10.getSelectedItem();
				Maria[4] = (String) comboBox_11.getSelectedItem();
				Maria[5] = (String) comboBox_12.getSelectedItem();
				Maria[6] = (String) comboBox_13.getSelectedItem();

				Pedro[0] = (String) comboBox_14.getSelectedItem();
				Pedro[1] = (String) comboBox_15.getSelectedItem();
				Pedro[2] = (String) comboBox_16.getSelectedItem();
				Pedro[3] = (String) comboBox_17.getSelectedItem();
				Pedro[4] = (String) comboBox_18.getSelectedItem();
				Pedro[5] = (String) comboBox_19.getSelectedItem();
				Pedro[6] = (String) comboBox_20.getSelectedItem();

				SumJuan();
				SumMaria();
				SumPedro();
			}
		});
		btnEnterHours.setForeground(Color.WHITE);
		btnEnterHours.setBackground(Color.BLACK);
		btnEnterHours.setFont(new Font("Cambria", Font.BOLD, 16));
		btnEnterHours.setBounds(112, 189, 133, 25);
		frmScheduleHours.getContentPane().add(btnEnterHours);
		btnExit.setFont(new Font("Cambria", Font.PLAIN, 16));
		btnExit.setBounds(539, 315, 97, 25);
		frmScheduleHours.getContentPane().add(btnExit);
		
		JTextArea txtrJuan = new JTextArea();
		txtrJuan.setForeground(Color.WHITE);
		txtrJuan.setBackground(Color.BLACK);
		txtrJuan.setText("     Juan");
		txtrJuan.setFont(new Font("Cambria", Font.BOLD, 16));
		txtrJuan.setBounds(12, 49, 78, 34);
		txtrJuan.setEditable(false);
		frmScheduleHours.getContentPane().add(txtrJuan);
		
		JTextArea txtrMaria = new JTextArea();
		txtrMaria.setBackground(Color.BLACK);
		txtrMaria.setForeground(Color.WHITE);
		txtrMaria.setText("   Maria");
		txtrMaria.setFont(new Font("Cambria", Font.BOLD, 16));
		txtrMaria.setBounds(12, 96, 78, 34);
		txtrMaria.setEditable(false);
		frmScheduleHours.getContentPane().add(txtrMaria);
		
		JTextArea txtrPedro = new JTextArea();
		txtrPedro.setText("   Pedro");
		txtrPedro.setBackground(Color.BLACK);
		txtrPedro.setForeground(Color.WHITE);
		txtrPedro.setFont(new Font("Cambria", Font.BOLD, 16));
		txtrPedro.setBounds(12, 143, 78, 33);
		txtrPedro.setEditable(false);
		frmScheduleHours.getContentPane().add(txtrPedro);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\Eclipse\\Project Scheduling System\\Image\\background(2).png"));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 0, 666, 353);
		frmScheduleHours.getContentPane().add(label);
	}
	
	public int SumJuan() {
		for(int i = 0; i <= 6; i++) {
			if(Juan[i].equals("0")) {
				JuanSum = JuanSum + Integer.parseInt(Juan[i]);
			}
			else {
				JuanSum = JuanSum + Integer.parseInt(Juan[i]);
			}
		}
		if(JuanSum > 40) {
			JOptionPane.showMessageDialog(null, "You have exceeded 40 hours of work", "Alert", JOptionPane.ERROR_MESSAGE);
		}
		else if(JuanSum == 40) {
			JOptionPane.showMessageDialog(null, "You have reached maximum hours", "Alert", JOptionPane.CANCEL_OPTION);
		}
		else if(JuanSum < 40) {
			JOptionPane.showMessageDialog(null, "You need to add more hours", "Alert", JOptionPane.INFORMATION_MESSAGE);
		}
		return JuanSum;
	}
	public int SumMaria() {
		for(int i = 0; i <= 6; i++) {
			if(Maria[i].equals("0")) {
				MariaSum = MariaSum + Integer.parseInt(Maria[i]);
			}
			else {
				MariaSum = MariaSum + Integer.parseInt(Maria[i]);
			}
		}
		if(MariaSum > 40) {
			JOptionPane.showMessageDialog(null, "You have exceeded 40 hours of work", "Alert", JOptionPane.ERROR_MESSAGE);
		}
		else if(MariaSum == 40) {
			JOptionPane.showMessageDialog(null, "You have reached maximum hours", "Alert", JOptionPane.CANCEL_OPTION);
		}
		else if(MariaSum < 40) {
			JOptionPane.showMessageDialog(null, "You need to add more hours", "Alert", JOptionPane.INFORMATION_MESSAGE);
		}
		return MariaSum;
	}
	public int SumPedro() {
		for(int i = 0; i <= 6; i++) {
			if(Pedro[i].equals("0")) {
				PedroSum = PedroSum + Integer.parseInt(Pedro[i]);
			}
			else {
				PedroSum = PedroSum + Integer.parseInt(Pedro[i]);
			}
		}
		if(PedroSum > 40 ) {
			JOptionPane.showMessageDialog(null, "You have exceeded 40 hours of work", "Alert", JOptionPane.ERROR_MESSAGE);
		}
		else if(PedroSum == 40) {
			JOptionPane.showMessageDialog(null, "You have reached maximum hours", "Alert", JOptionPane.CANCEL_OPTION);
		}
		else if(PedroSum < 40) {
			JOptionPane.showMessageDialog(null, "You need to add more hours", "Alert", JOptionPane.INFORMATION_MESSAGE);
		}
		return PedroSum;
	}
}
