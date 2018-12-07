package Methods;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class TimeDisplay extends ScheduleHours {

	JFrame frmTimeDisplay;

	public TimeDisplay() {
		initialize();
	}

	private void initialize() {
		frmTimeDisplay = new JFrame();
		frmTimeDisplay.setFont(new Font("Cambria", Font.PLAIN, 16));
		frmTimeDisplay.setTitle("Time Display");
		frmTimeDisplay.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Eclipse\\Project Scheduling System\\Image\\Logo2.jpg"));
		frmTimeDisplay.setBounds(100, 100, 680, 400);
		frmTimeDisplay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTimeDisplay.getContentPane().setLayout(null);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTimeDisplay.dispose();
			}
		});
		btnExit.setForeground(Color.WHITE);
		btnExit.setBackground(Color.BLACK);
		btnExit.setFont(new Font("Cambria", Font.PLAIN, 16));
		btnExit.setBounds(553, 315, 97, 25);
		frmTimeDisplay.getContentPane().add(btnExit);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Cambria", Font.PLAIN, 16));
		textPane.setForeground(Color.WHITE);
		textPane.setBackground(Color.BLACK);
		textPane.setBounds(12, 13, 638, 289);
		frmTimeDisplay.getContentPane().add(textPane);
		textPane.setText("Horarios de Juan:" + "\n" + "\n" + "   Monday        Tuesday        Wednesday        Thursday        Friday        Saturday        Sunday" + "\n"
						+"          " + Juan[0] + "                   " + Juan[1] + "                       " + Juan[2] + "                        " + Juan[3] 
								+ "                    " + Juan[4] + "                   " + Juan[5] + "                    " + Juan[6] + "\n" + "\n"
								+ "Horarios de Maria:" + "\n" + "\n" + "   Monday        Tuesday        Wednesday        Thursday        Friday        Saturday        Sunday" + "\n"
								+"          " + Maria[0] + "                   " + Maria[1] + "                       " + Maria[2] + "                        " + Maria[3] 
										+ "                    " + Maria[4] + "                   " + Maria[5] + "                    " + Maria[6] + "\n" + "\n"
								+ "Horarios de Pedro:" + "\n" + "\n" + "   Monday        Tuesday        Wednesday        Thursday        Friday        Saturday        Sunday" + "\n"
								+"          " + Pedro[0] + "                   " + Pedro[1] + "                       " + Pedro[2] + "                        " + Pedro[3] 
										+ "                    " + Pedro[4] + "                   " + Pedro[5] + "                    " + Pedro[6] + "\n");
		textPane.setEditable(false);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\Eclipse\\Project Scheduling System\\Image\\background(2).png"));
		label.setBounds(0, 0, 662, 353);
		frmTimeDisplay.getContentPane().add(label);
	}
}
