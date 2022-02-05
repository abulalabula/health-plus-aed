package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import edu.neu.info5100.Driver;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.SystemColor;

public class addNewCarPanel extends JPanel {
	private JTextField textBrand;
	private JTextField textModel;
	private JTextField textColor;
	private JTextField textYear;
	private JTextField textEngineNumber;
	private JTextField textSeatsNumber;
	private JTextField textLicensePlates;
	private JTextField textOwnerName;
	private JTextField textOwnerAddress;
	private JTextField textServiceRecords;
	private JTextField textOwnerSocialSecurityNumber;
	private JTextField textOwnerDriverLicense;
	private JTextField textOwnerEmailAddresses;
	private JTextField textOwnerTelephoneNumbers;
	private JTextField textWarrantyYear;
	
	Driver driver;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public addNewCarPanel(Driver driver) {
		
		this.driver = driver;
		
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Insert new car's information");
		lblNewLabel.setBounds(167, 34, 269, 21);
		lblNewLabel.setFont(new Font("Helvetica", Font.BOLD, 20));
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Brand");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(97, 80, 109, 16);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Color");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(97, 170, 109, 16);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Year");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(97, 215, 109, 16);
		add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Model");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(97, 125, 109, 16);
		add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Engine No.");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBounds(97, 260, 109, 16);
		add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Seats number");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setBounds(97, 305, 109, 16);
		add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("License plates");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setBounds(97, 350, 109, 16);
		add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Owner Name");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setBounds(97, 402, 109, 16);
		add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_4 = new JLabel("Owner Telephone numbers");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setBounds(350, 80, 189, 16);
		add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Owner Email addresses");
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2.setBounds(350, 126, 189, 16);
		add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Owner Driver license");
		lblNewLabel_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_3.setBounds(340, 172, 199, 16);
		add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Owner Social Security number");
		lblNewLabel_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2.setBounds(350, 218, 189, 16);
		add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Owner address");
		lblNewLabel_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_1.setBounds(350, 264, 189, 16);
		add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Service records");
		lblNewLabel_1_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_1.setBounds(350, 310, 189, 16);
		add(lblNewLabel_1_2_2_1);
		
		JLabel lblNewLabel_4 = new JLabel("Photo preview");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(551, 327, 279, 166);
		add(lblNewLabel_4);
		
		textBrand = new JTextField();
		textBrand.setBounds(52, 90, 199, 26);
		add(textBrand);
		textBrand.setColumns(10);
		
		textModel = new JTextField();
		textModel.setColumns(10);
		textModel.setBounds(52, 136, 199, 26);
		add(textModel);
		
		textColor = new JTextField();
		textColor.setColumns(10);
		textColor.setBounds(52, 182, 199, 26);
		add(textColor);
		
		textYear = new JTextField();
		textYear.setToolTipText("4-digit number > 1885 and < 2022");
		textYear.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c = e.getKeyChar();
				if(Character.isDigit(c)|| Character.isWhitespace(c)|| Character.isISOControl(c)) {
					textYear.setEditable(true);
				} else {
					textYear.setEditable(false);
				}
			}
		});
		textYear.setColumns(10);
		textYear.setBounds(52, 228, 199, 26);
		add(textYear);
		
		textEngineNumber = new JTextField();
		textEngineNumber.setColumns(10);
		textEngineNumber.setBounds(52, 274, 199, 26);
		add(textEngineNumber);
		
		textSeatsNumber = new JTextField();
		textSeatsNumber.setToolTipText("Number < 100");
		textSeatsNumber.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c = e.getKeyChar();
				if(Character.isDigit(c)|| Character.isWhitespace(c)|| Character.isISOControl(c)) {
					textSeatsNumber.setEditable(true);
				} else {
					textSeatsNumber.setEditable(false);
				}
			}
		});
		textSeatsNumber.setColumns(10);
		textSeatsNumber.setBounds(52, 320, 199, 26);
		add(textSeatsNumber);
		
		textLicensePlates = new JTextField();
		textLicensePlates.setColumns(10);
		textLicensePlates.setBounds(52, 366, 199, 26);
		add(textLicensePlates);
		
		textOwnerName = new JTextField();
		textOwnerName.setColumns(10);
		textOwnerName.setBounds(52, 412, 199, 26);
		add(textOwnerName);
		
		textOwnerAddress = new JTextField();
		textOwnerAddress.setColumns(10);
		textOwnerAddress.setBounds(340, 274, 199, 26);
		add(textOwnerAddress);
		
		textServiceRecords = new JTextField();
		textServiceRecords.setColumns(10);
		textServiceRecords.setBounds(340, 320, 199, 26);
		add(textServiceRecords);
		
		textOwnerSocialSecurityNumber = new JTextField();
		textOwnerSocialSecurityNumber.setToolTipText("9-digit number");
		textOwnerSocialSecurityNumber.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c = e.getKeyChar();
				if(Character.isDigit(c)|| Character.isWhitespace(c)|| Character.isISOControl(c)) {
					textOwnerSocialSecurityNumber.setEditable(true);
				} else {
					textOwnerSocialSecurityNumber.setEditable(false);
				}
			}
		});
		textOwnerSocialSecurityNumber.setColumns(10);
		textOwnerSocialSecurityNumber.setBounds(340, 228, 199, 26);
		add(textOwnerSocialSecurityNumber);
		
		textOwnerDriverLicense = new JTextField();
		textOwnerDriverLicense.setColumns(10);
		textOwnerDriverLicense.setBounds(340, 182, 199, 26);
		add(textOwnerDriverLicense);
		
		textOwnerEmailAddresses = new JTextField();
		textOwnerEmailAddresses.setToolTipText("Must contains a \"@\"");
		textOwnerEmailAddresses.setColumns(10);
		textOwnerEmailAddresses.setBounds(340, 136, 199, 26);
		add(textOwnerEmailAddresses);
		
		textOwnerTelephoneNumbers = new JTextField();
		textOwnerTelephoneNumbers.setToolTipText("10-digit number");
		textOwnerTelephoneNumbers.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c = e.getKeyChar();
				if(Character.isDigit(c)|| Character.isWhitespace(c)|| Character.isISOControl(c)) {
					textOwnerTelephoneNumbers.setEditable(true);
				} else {
					textOwnerTelephoneNumbers.setEditable(false);
				}
			}
		});
		textOwnerTelephoneNumbers.setColumns(10);
		textOwnerTelephoneNumbers.setBounds(340, 90, 199, 26);
		add(textOwnerTelephoneNumbers);
		
		JLabel lblNewLabel_2 = new JLabel("Photo");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(362, 417, 85, 16);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Warranty Year");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(350, 356, 189, 16);
		add(lblNewLabel_3);
		
		textWarrantyYear = new JTextField();
		textWarrantyYear.setToolTipText("4-digit number > 1885");
		textWarrantyYear.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c = e.getKeyChar();
				if(Character.isDigit(c)|| Character.isWhitespace(c)|| Character.isISOControl(c)) {
					textWarrantyYear.setEditable(true);
				} else {
					textWarrantyYear.setEditable(false);
				}
			}
		});
		textWarrantyYear.setBounds(340, 366, 199, 26);
		add(textWarrantyYear);
		textWarrantyYear.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(551, 38, 293, 262);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		DefaultTableModel model = new DefaultTableModel();
		Object[] column = {"Brand", "Model", "Service records"};
		model.setColumnIdentifiers(column);
		table.setModel(model);
		
		Object[] row = new Object[4];
		
		JButton btnSaveResult = new JButton("Save");
		btnSaveResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(Integer.parseInt(textYear.getText()) > 2022 || Integer.parseInt(textYear.getText()) < 1885) {
					JOptionPane.showMessageDialog(null, "Wrong Format: Year",
				               "Oops", JOptionPane.ERROR_MESSAGE); 
				} else if (Integer.parseInt(textSeatsNumber.getText()) > 100 ||Integer.parseInt(textSeatsNumber.getText()) < 1) {
					JOptionPane.showMessageDialog(null, "Wrong Format: SeatsNumber",
				               "Oops", JOptionPane.ERROR_MESSAGE);
				} else if (textOwnerTelephoneNumbers.getText().length() != 10) {
					JOptionPane.showMessageDialog(null, "Wrong Format: Owner Telephone Number",
				               "Oops", JOptionPane.ERROR_MESSAGE);
				} else if (textOwnerSocialSecurityNumber.getText().length() != 9)  {
					JOptionPane.showMessageDialog(null, "Wrong Format: Owner Social Security Number",
				               "Oops", JOptionPane.ERROR_MESSAGE);
				} else if (!textOwnerEmailAddresses.getText().contains("@"))  {
					JOptionPane.showMessageDialog(null, "Wrong Format: Owner Email Addresses",
				               "Oops", JOptionPane.ERROR_MESSAGE);
				} else if (Integer.parseInt(textWarrantyYear.getText()) < 1885) {
					JOptionPane.showMessageDialog(null, "Wrong Format: Warranty Year",
				               "Oops", JOptionPane.ERROR_MESSAGE); 
				}
				
				
				
				else {
					row[0] = textBrand.getText();
		            row[1] = textModel.getText();
		            row[2] = textServiceRecords.getText();
		            model.addRow(row);
					JOptionPane.showMessageDialog(null, textBrand.getText() + " " + textModel.getText() + " is saved successfully!",
				               "Congratulations!!!", JOptionPane.INFORMATION_MESSAGE);
					
				}
				
				
				
				driver.setBrand(textBrand.getText());
				driver.setModel(textModel.getText());
				driver.setColor(textColor.getText());
				driver.setYear(Integer.parseInt(textYear.getText()));
				driver.setEngineNumber(textEngineNumber.getText());
				driver.setSeatsNumber(Integer.parseInt(textSeatsNumber.getText()));
				driver.setLicensePlates(textLicensePlates.getText());
				driver.setOwnerName(textOwnerName.getText());
				driver.setOwnerTelephoneNumbers(textOwnerTelephoneNumbers.getText());
				driver.setOwnerEmailAddresses(textOwnerEmailAddresses.getText());
				driver.setOwnerDriverLicense(textOwnerDriverLicense.getText());
				driver.setOwnerSocialSecurityNumber(textOwnerSocialSecurityNumber.getText());
				driver.setOwnerAddress(textOwnerAddress.getText());
				driver.setServiceRecords(textServiceRecords.getText());
				driver.setWarrantyYear(Integer.parseInt(textWarrantyYear.getText()));
				
				
			}
		});
		btnSaveResult.setFont(new Font("Kefa", Font.BOLD | Font.ITALIC, 20));
		btnSaveResult.setForeground(Color.BLUE);
		btnSaveResult.setBackground(Color.GRAY);
		btnSaveResult.setBounds(250, 450, 117, 48);
		add(btnSaveResult);
		

		

		
		final JFileChooser fc = new JFileChooser();
		
		JButton btnAddButton = new JButton("Add");
		btnAddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (e.getSource() == btnAddButton) {
					JFileChooser fc = new JFileChooser();
					fc.setCurrentDirectory(new File(System.getProperty("user.home")));
					FileNameExtensionFilter filter = new FileNameExtensionFilter("All Pic", "png", "jpg", "jpeg", "gif");
					fc.addChoosableFileFilter(filter);
					
					//fc.showOpenDialog(null);
			        int returnVal = fc.showSaveDialog(null);
			        
			        if (returnVal == JFileChooser.APPROVE_OPTION) {
			            File file = fc.getSelectedFile();
			            String path = file.getAbsolutePath();
			            
		
			            
			            ImageIcon MyImage = new ImageIcon(path);
			    		Image img = MyImage.getImage();
			    		Image newImg = img.getScaledInstance(lblNewLabel_4.getWidth(), lblNewLabel_4.getHeight(), Image.SCALE_SMOOTH);
			    		ImageIcon image = new ImageIcon(newImg);
			    		lblNewLabel_4.setIcon(image);
			            
//			            Image im = Toolkit.getDefaultToolkit().createImage(path);
//			            im = im.getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_SMOOTH);
//			            ImageIcon ii = new ImageIcon(im);
//			            im.setIcon(ii);
			            
			            //File file = fc.getSelectedFile();
			        } else if (returnVal == JFileChooser.CANCEL_OPTION){
			        	System.out.println("No File Select");
			        }
				}
				
				
				
				
//				if (e.getSource() == openButton) {
//			        int returnVal = fc.showOpenDialog(FileChooserDemo.this);
//
//			        if (returnVal == JFileChooser.APPROVE_OPTION) {
//			            File file = fc.getSelectedFile();
//			            //This is where a real application would open the file.
//			            log.append("Opening: " + file.getName() + "." + newline);
//			        } else {
//			            log.append("Open command cancelled by user." + newline);
//			        }
//			   }
				
				}
			
				
				
			
			
			}
		);
		btnAddButton.setBounds(444, 413, 58, 26);
		add(btnAddButton);
		
		table.addMouseListener(new MouseAdapter() {
			//@Override
			public void mouseClicked(MouseEvent e) {
				int i = table.getSelectedRow();
				textBrand.setText(model.getValueAt(i, 0).toString());
				textModel.setText(model.getValueAt(i, 1).toString());
				textServiceRecords.setText(model.getValueAt(i, 2).toString());
				lblNewLabel_4.setText(model.getValueAt(i, 3).toString());
			}
			
		});
		

	}
}
