package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;

public class addNewCarPanel extends JPanel {
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
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;

	/**
	 * Create the panel.
	 */
	public addNewCarPanel() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Insert new car's information");
		lblNewLabel.setBounds(187, 5, 269, 21);
		lblNewLabel.setFont(new Font("Helvetica", Font.BOLD, 20));
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Brand");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(99, 28, 109, 16);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Color");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(99, 118, 109, 16);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Year");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(99, 163, 109, 16);
		add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Model");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(99, 73, 109, 16);
		add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Engine No.");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBounds(99, 208, 109, 16);
		add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Seats number");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setBounds(99, 253, 109, 16);
		add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("License plates");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setBounds(99, 298, 109, 16);
		add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Owner Name");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setBounds(99, 350, 109, 16);
		add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_4 = new JLabel("Owner Telephone numbers");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setBounds(401, 28, 189, 16);
		add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Owner Email addresses");
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2.setBounds(401, 74, 189, 16);
		add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Owner Driver license");
		lblNewLabel_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_3.setBounds(391, 120, 199, 16);
		add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Owner Social Security number");
		lblNewLabel_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2.setBounds(401, 166, 189, 16);
		add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Owner address");
		lblNewLabel_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_1.setBounds(401, 212, 189, 16);
		add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Service records");
		lblNewLabel_1_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_1.setBounds(401, 258, 189, 16);
		add(lblNewLabel_1_2_2_1);
		
		textField = new JTextField();
		textField.setBounds(54, 38, 199, 26);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(54, 84, 199, 26);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(54, 130, 199, 26);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(54, 176, 199, 26);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(54, 222, 199, 26);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(54, 268, 199, 26);
		add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(54, 314, 199, 26);
		add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(54, 360, 199, 26);
		add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(391, 222, 199, 26);
		add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(391, 268, 199, 26);
		add(textField_9);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(391, 360, 199, 26);
		add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(391, 176, 199, 26);
		add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(391, 130, 199, 26);
		add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(391, 84, 199, 26);
		add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(391, 38, 199, 26);
		add(textField_15);
		
		JLabel lblNewLabel_2 = new JLabel("Photo");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(391, 350, 189, 16);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Warranty Year");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(401, 304, 189, 16);
		add(lblNewLabel_3);
		
		textField_16 = new JTextField();
		textField_16.setBounds(391, 314, 199, 26);
		add(textField_16);
		textField_16.setColumns(10);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setFont(new Font("Kefa", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setBounds(265, 360, 117, 48);
		add(btnNewButton);

	}
}
