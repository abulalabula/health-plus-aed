package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class detailsOfCarPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;

	/**
	 * Create the panel.
	 */
	public detailsOfCarPanel() {
		setLayout(null);
		
		JLabel lblCarsInformation = new JLabel("Car's information");
		lblCarsInformation.setHorizontalAlignment(SwingConstants.CENTER);
		lblCarsInformation.setFont(new Font("Helvetica", Font.BOLD, 20));
		lblCarsInformation.setBounds(186, 6, 269, 21);
		add(lblCarsInformation);
		
		JLabel lblNewLabel_1 = new JLabel("Brand");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(98, 29, 109, 16);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Color");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(98, 119, 109, 16);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Year");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(98, 164, 109, 16);
		add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Model");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(98, 74, 109, 16);
		add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Engine No.");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBounds(98, 209, 109, 16);
		add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Seats number");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setBounds(98, 254, 109, 16);
		add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("License plates");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setBounds(98, 299, 109, 16);
		add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Owner Name");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setBounds(98, 351, 109, 16);
		add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_4 = new JLabel("Owner Telephone numbers");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setBounds(400, 29, 189, 16);
		add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Owner Email addresses");
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2.setBounds(400, 75, 189, 16);
		add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Owner Driver license");
		lblNewLabel_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_3.setBounds(390, 121, 199, 16);
		add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Owner Social Security number");
		lblNewLabel_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2.setBounds(400, 167, 189, 16);
		add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Owner address");
		lblNewLabel_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_1.setBounds(400, 213, 189, 16);
		add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Service records");
		lblNewLabel_1_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_1.setBounds(400, 259, 189, 16);
		add(lblNewLabel_1_2_2_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(53, 39, 199, 26);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(53, 85, 199, 26);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(53, 131, 199, 26);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(53, 177, 199, 26);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(53, 223, 199, 26);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(53, 269, 199, 26);
		add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(53, 315, 199, 26);
		add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(53, 361, 199, 26);
		add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(390, 223, 199, 26);
		add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(390, 269, 199, 26);
		add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(390, 361, 199, 26);
		add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(390, 177, 199, 26);
		add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(390, 131, 199, 26);
		add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(390, 85, 199, 26);
		add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(390, 39, 199, 26);
		add(textField_14);
		
		JLabel lblNewLabel_2 = new JLabel("Photo");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(390, 351, 189, 16);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Warranty Year");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(400, 305, 189, 16);
		add(lblNewLabel_3);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(390, 315, 199, 26);
		add(textField_15);

	}

}
