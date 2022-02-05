package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.neu.info5100.Driver;

import javax.swing.JSplitPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTable;

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
		
	
	
	Driver driver; 

	
	/**
	 * Create the frame.
	 */
	public frame() {
		
		driver = new Driver();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 150, 900, 600);
		getContentPane().setLayout(null);
		
		JSplitPane splitPane_2 = new JSplitPane();
		splitPane_2.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_2.setBounds(10, 28, 900, 550);
		getContentPane().add(splitPane_2);
		
		JPanel panel = new JPanel();
		//splitPane_2.setLeftComponent(panel);
		splitPane_2.setDividerLocation(0);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(0, 0, 900, 33);
		getContentPane().add(splitPane);
		splitPane.setDividerLocation(450);
		
		JButton btnAddNewCar = new JButton("Add a new car");
		btnAddNewCar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNewCarPanel addNewCarPanel = new addNewCarPanel(driver); 
				
				splitPane_2.setRightComponent(addNewCarPanel);
				
			}
		});
		splitPane.setLeftComponent(btnAddNewCar);
		
		
		
		JButton btnDetailOfCarPanel = new JButton("Details of this car");
		btnDetailOfCarPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				detailsOfCarPanel detailsOfCarPanel = new detailsOfCarPanel(driver);
				
				splitPane_2.setRightComponent(detailsOfCarPanel);
			}
		});
		splitPane.setRightComponent(btnDetailOfCarPanel);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
	}
}
