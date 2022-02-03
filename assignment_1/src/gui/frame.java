package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class frame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame frame = new frame();
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
	public frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 150, 900, 600);
		getContentPane().setLayout(null);
		
		JSplitPane splitPane_2 = new JSplitPane();
		splitPane_2.setBounds(0, 96, 900, 476);
		getContentPane().add(splitPane_2);
		splitPane_2.setDividerLocation(200);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(0, 0, 900, 99);
		getContentPane().add(splitPane);
		splitPane.setDividerLocation(450);
		
		JButton btnNewButton = new JButton("Add a new car");
		splitPane.setLeftComponent(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Details of this car");
		splitPane.setRightComponent(btnNewButton_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
	}
}
