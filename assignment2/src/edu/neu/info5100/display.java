package edu.neu.info5100;

import javax.swing.*;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class display {
    //    private Date lastTimeUpdated;
    private static final List<car> carDatabase = new ArrayList<car>();
    private final static String[] carDataLabels = new String[]{
            "Name: ", "Brand: ", "Model: ", "Manufactured Year: ", "Seat: ", "Serial Number: ", "Location: ",
            "Uber used: ", "Available: ", "Expired maintenance: ",
    };
    private static JPanel navigationPanel, inputPanel, displayPanel;
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static JLabel dateLabelData = new JLabel(dateFormat.format(new Date()));
    private final static int width = 1150;
    private final static int height = 470;

    public static void main(String[] args) throws ParseException {
        createMainFrame();
    }

    private static void createMainFrame() throws ParseException {
        JFrame mainFrame = new JFrame("Uber management");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createMainPanel(mainFrame);

        mainFrame.setSize(width, height);
        mainFrame.setVisible(true);
    }

    private static void createMainPanel(final JFrame frame) throws ParseException {
        // Create two panels for navigation buttons and main profiles
        navigationPanel = createNavigationPanel();
        inputPanel = createInputPanel();
        displayPanel = createDisplayPanel(null);

        JSplitPane leftSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, navigationPanel, inputPanel);
        JSplitPane rightSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftSplitPane, displayPanel);
        rightSplitPane.setDividerLocation(661);

        frame.getContentPane().add(rightSplitPane, BorderLayout.CENTER);
//        frame.setSize(1500,700);
        frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().setBackground(Color.PINK);

    }

    private static String[] getAllCarNames() {
        String[] data = carDatabase.stream().map(car -> car.getUniqueName()).toArray(String[]::new);
        return data;
    }

    private static String[] getAllCarModel() {
        String[] data = carDatabase.stream().map(car -> car.getModel()).distinct().toArray(String[]::new);
        return data;
    }

    private static String[] getAllCarBrand() {
        String[] data = carDatabase.stream().distinct().map(car -> car.getBrand()).distinct().toArray(String[]::new);
        return data;
    }

    private static String[] getAllCarSeat() {
        String[] data = carDatabase.stream().distinct().map(car -> String.valueOf(car.getSeat())).distinct().toArray(String[]::new);
        return data;
    }

    private static String[] getAllCarYears() {
        String[] data = carDatabase.stream().distinct().map(car -> String.valueOf(car.getManufacturedYear())).distinct().toArray(String[]::new);
        return data;
    }

    private static String[] getAllCarLocation() {
        String[] data = carDatabase.stream().map(car -> car.getLocation()).distinct().toArray(String[]::new);
        return data;
    }

    private static String[] getAllCarSerialNumber() {
        String[] data = carDatabase.stream().map(car -> String.valueOf(car.getSerialNumber())).toArray(String[]::new);
        return data;
    }

    private static String[] getAllCarAvailability() {
        String[] data = carDatabase.stream().map(car -> String.valueOf(car.isAvailable())).toArray(String[]::new);
        return data;
    }

    private static String[] getAllCarExpiration() {
        String[] data = carDatabase.stream().map(car -> String.valueOf(car.isExpired())).toArray(String[]::new);
        return data;
    }

    private static String[] getAllCarUberUsed() {
        String[] data = carDatabase.stream().map(car -> String.valueOf(car.isUsedByUber())).toArray(String[]::new);
        return data;
    }

    private static JPanel createNavigationPanel() {
        JPanel panel = new JPanel(new GridBagLayout());
        JButton createBtn = new JButton("Create");
        JButton searchBtn = new JButton("Search");
        //JButton importBtn = new JButton("Import");
        JButton modifyBtn = new JButton("Update");
        JLabel importLabel = new JLabel("");
        JLabel dateLabel = new JLabel("Catalog recently update at: ");
        JComboBox jComboBox = new JComboBox(getAllCarNames());

        jComboBox.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                jComboBox.removeAllItems();
                jComboBox.setModel(new DefaultComboBoxModel(getAllCarNames()));
            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });

//        importBtn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent event) {
//                JFileChooser fileChooser = new JFileChooser();
//
//                int fileOpenFlag = fileChooser.showOpenDialog(null);
//                if (fileOpenFlag == JFileChooser.APPROVE_OPTION) {
//                    File file = fileChooser.getSelectedFile();
//
//                    try (BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath()))) {
//                        String line;
//                        br.readLine(); // skip the first line
//                        while ((line = br.readLine()) != null) {
//                            String[] data = line.trim().split("\\s*,\\s*");
//                            importCarData(data);
//                        }
//                        importLabel.setText("Imported");
//
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//
//                } else {
//                    importLabel.setText("No file imported");
//                }
//                dateLabelData.setText(dateFormat.format(new Date()));
//            }
//        });

        createBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputPanel.removeAll();
                inputPanel.repaint();
                try {
                    inputPanel.add(createInputPanel());
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }
                inputPanel.revalidate();
                dateLabelData.setText(dateFormat.format(new Date()));
            }
        });

        searchBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputPanel.removeAll();
                inputPanel.repaint();
                inputPanel.add(createSearchPanel());
                inputPanel.revalidate();
            }
        });

        modifyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputPanel.removeAll();
                inputPanel.repaint();
                try {
                    inputPanel.add(createModifyPanel(jComboBox.getSelectedItem().toString()));
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }
                inputPanel.revalidate();
            }
        });

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.REMAINDER;
        constraints.ipady = 10;

        constraints.gridy = 0;
        constraints.gridx = 0;
        panel.add(dateLabel, constraints);

        constraints.gridy = 1;
        panel.add(dateLabelData, constraints);

        constraints.gridy = 2;
        panel.add(createBtn, constraints);

        constraints.gridy = 3;
        panel.add(searchBtn, constraints);

//        constraints.gridy = 4;
//        panel.add(importBtn, constraints);

        constraints.gridy = 5;
        panel.add(modifyBtn, constraints);

        constraints.gridy = 6;
        panel.add(jComboBox, constraints);

        return panel;
    }

    private static void modifyCarData(String[] data) {
        for (int i = 0; i < carDatabase.size(); i++) {
            if (carDatabase.get(i).getUniqueName().equals(data[0])) {
                carDatabase.get(i).setBrand(data[1]);
                carDatabase.get(i).setModel(data[2]);
                carDatabase.get(i).setManufacturedYear(Integer.parseInt(data[3]));
                carDatabase.get(i).setSeat(Integer.parseInt(data[4]));
                carDatabase.get(i).setSerialNumber(Integer.parseInt(data[5]));
                carDatabase.get(i).setLocation(data[6]);
                carDatabase.get(i).setUsedByUber(Boolean.parseBoolean(data[7]));
                carDatabase.get(i).setAvailable(Boolean.parseBoolean(data[8]));
                carDatabase.get(i).setExpired(Boolean.parseBoolean(data[9]));

                return;
            }
        }
    }

    private static void importCarData(String[] data) {
        car carData = new car(data[0]);
        carData.setBrand(data[1]);
        carData.setModel(data[2]);
        carData.setManufacturedYear(Integer.parseInt(data[3]));
        carData.setSeat(Integer.parseInt(data[4]));
        carData.setSerialNumber(Integer.parseInt(data[5]));
        carData.setLocation(data[6]);

        if (data[7].equalsIgnoreCase("yes") || data[7].equalsIgnoreCase("true")) {
            carData.setUsedByUber(true);
        } else {
            carData.setUsedByUber(false);
        }

        if (data[8].equalsIgnoreCase("yes") || data[8].equalsIgnoreCase("true")) {
            carData.setAvailable(true);
        } else {
            carData.setAvailable(false);
        }

        if (data[9].equalsIgnoreCase("yes") || data[9].equalsIgnoreCase("true")) {
            carData.setExpired(true);
        } else {
            carData.setExpired(false);
        }


        System.out.println("Car imported: " + data[0]);

        carDatabase.add(carData);
    }

    private static String[] exportCarData(car carData) {
        String[] carDataString = new String[]{
                carData.getUniqueName(),
                carData.getBrand(),
                carData.getModel(),
                String.valueOf(carData.getManufacturedYear()),
                String.valueOf(carData.getSeat()),
                String.valueOf(carData.getSerialNumber()),
                String.valueOf(carData.getLocation()),
                String.valueOf(carData.isUsedByUber()),
                String.valueOf(carData.isAvailable()),
                String.valueOf(carData.isExpired()),
        };

        return carDataString;
    }

    private static JPanel createModifyPanel(String carName) throws ParseException {
        JPanel panel = new JPanel(new GridBagLayout());
        JButton jButton = new JButton("Apply");
        List<JFormattedTextField> inputField = new ArrayList<JFormattedTextField>();
        List<JLabel> inputFieldLabel = new ArrayList<JLabel>();
        List<JCheckBox> inputCheckBox = new ArrayList<JCheckBox>();

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.REMAINDER;
        constraints.ipady = 10;

        car car = carDatabase.stream().filter(c -> c.getUniqueName().equals(carName)).findFirst().orElse(null);
        for (int i = 0; i < carDataLabels.length; i++) {
            JLabel jLabel = new JLabel(carDataLabels[i]);
            JFormattedTextField jFormattedTextField = new JFormattedTextField();
            JCheckBox jCheckBox = new JCheckBox();

            switch (i) {
                case 0: //Name
                    jFormattedTextField.setFormatterFactory(new DefaultFormatterFactory(customFormatter("AAAAAAAAAAAAAAAAAAAA")));
                    jFormattedTextField.setText(car.getUniqueName());
                    break;
                case 1: //Brand
                    jFormattedTextField.setFormatterFactory(new DefaultFormatterFactory(customFormatter("AAAAAAAAAAAAAAAAAAAA")));
                    jFormattedTextField.setText(car.getBrand());
                    break;
                case 2: //Model
                    jFormattedTextField.setFormatterFactory(new DefaultFormatterFactory(customFormatter("AAAAAAAAAAAAAAAAAAAA")));
                    jFormattedTextField.setText(car.getModel());
                    break;
                case 3: //Year
                    jFormattedTextField.setFormatterFactory(new DefaultFormatterFactory(customFormatter("####")));
                    jFormattedTextField.setText(String.valueOf(car.getManufacturedYear()));
                    break;
                case 4: //Seat
                    jFormattedTextField.setFormatterFactory(new DefaultFormatterFactory(customFormatter("##")));
                    jFormattedTextField.setText(String.valueOf(car.getSeat()));
                    break;
                case 5: //SN
                    jFormattedTextField.setFormatterFactory(new DefaultFormatterFactory(customFormatter("######")));
                    jFormattedTextField.setText(String.valueOf(car.getSerialNumber()));
                    break;
                case 6: //Location
                    jFormattedTextField.setFormatterFactory(new DefaultFormatterFactory(customFormatter("????????????????????")));
                    jFormattedTextField.setText(String.valueOf(car.getLocation()));
                    break;
                case 7: //Uber
                    if (String.valueOf(car.isUsedByUber()).equalsIgnoreCase("true")) {
                        ;
                        jCheckBox.setText("Yes");
                        jCheckBox.setSelected(true);
                    } else {
                        jCheckBox.setText("No");
                        jCheckBox.setSelected(false);
                    }
                    break;
                case 8: //Availability
                    if (String.valueOf(car.isAvailable()).equalsIgnoreCase("true")) {
                        ;
                        jCheckBox.setText("Yes");
                        jCheckBox.setSelected(true);
                    } else {
                        jCheckBox.setText("No");
                        jCheckBox.setSelected(false);
                    }
                    break;
                case 9: //Expired
                    if (String.valueOf(car.isExpired()).equalsIgnoreCase("true")) {
                        ;
                        jCheckBox.setText("Yes");
                        jCheckBox.setSelected(true);
                    } else {
                        jCheckBox.setText("No");
                        jCheckBox.setSelected(false);
                    }
                    break;
            }

            jFormattedTextField.setFocusLostBehavior(JFormattedTextField.PERSIST);
            jFormattedTextField.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    jFormattedTextField.setBackground(Color.WHITE);
                    jFormattedTextField.setText(jFormattedTextField.getText().trim());
                }
            });

            jCheckBox.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    if (e.getStateChange() == 1) {
                        jCheckBox.setText("Yes");
                    } else {
                        jCheckBox.setText("No");
                    }
                }
            });

            jLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);

            inputFieldLabel.add(jLabel);

            constraints.gridy = i;
            constraints.gridx = 0;

            panel.add(jLabel, constraints);
            constraints.gridx = 1;

            if (i <= 6) {
                panel.add(jFormattedTextField, constraints);
                jLabel.setLabelFor(jFormattedTextField);
                jFormattedTextField.setPreferredSize(new Dimension(80, 15));
                inputField.add(jFormattedTextField);
            } else {
                panel.add(jCheckBox, constraints);
                jLabel.setLabelFor(jCheckBox);
                inputCheckBox.add(jCheckBox);
            }
        }

        constraints.gridy = carDataLabels.length;
        constraints.gridx = 2;
        panel.add(jButton, constraints);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] data = new String[inputFieldLabel.size()];
                Boolean check = true;

                for (int i = 0; i < inputFieldLabel.size(); i++) {
                    switch (i) {
                        case 7: // Uber used
                        case 8: // Availability
                        case 9: // Expired
                            String result = inputCheckBox.get(i - 7).getText().trim();
                            if (result.equalsIgnoreCase("yes")) {
                                data[i] = "true";
                            } else if (result.equalsIgnoreCase("no")) {
                                data[i] = "false";
                            } else {
                                inputField.get(i).setBackground(Color.RED);
                                check = false;
                            }
                            break;
                        default:
                            String input = inputField.get(i).getText().trim();
                            if (input.length() == 0) {
                                inputField.get(i).setBackground(Color.RED);
                                check = false;
                                continue;
                            }
                            data[i] = input;
                    }
                }

                if (check) {
                    modifyCarData(data);
                    inputPanel.removeAll();
                    inputPanel.repaint();
                    inputPanel.add(createSearchPanel());
                    inputPanel.revalidate();
                    dateLabelData.setText(dateFormat.format(new Date()));
                } else {
                    return;
                }
            }
        });

        return panel;
    }

    // Create panels with input fields for the user in the right panel
    private static JPanel createInputPanel() throws ParseException {
        JPanel panel = new JPanel(new GridBagLayout());
        JButton jButton = new JButton("Create");
        List<JFormattedTextField> inputField = new ArrayList<JFormattedTextField>();
        List<JLabel> inputFieldLabel = new ArrayList<JLabel>();
        List<JCheckBox> inputCheckBox = new ArrayList<JCheckBox>();

        // Set some constrains for the input field to make it easier to read
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.REMAINDER;
        constraints.ipady = 10;

        for (int i = 0; i < carDataLabels.length; i++) {
            JLabel jLabel = new JLabel(carDataLabels[i]);
            JFormattedTextField jFormattedTextField = new JFormattedTextField();
            JCheckBox jCheckBox = new JCheckBox();

            switch (i) {
                case 0: //Model
                case 1: //Brand
                case 2: //Name
                    jFormattedTextField.setFormatterFactory(new DefaultFormatterFactory(customFormatter("AAAAAAAAAAAAAAAAAAAA")));
                    break;
                case 3: //Year
                    jFormattedTextField.setFormatterFactory(new DefaultFormatterFactory(customFormatter("####")));
                    break;
                case 4: //Seat
                    jFormattedTextField.setFormatterFactory(new DefaultFormatterFactory(customFormatter("##")));
                    break;
                case 5: //SN
                    jFormattedTextField.setFormatterFactory(new DefaultFormatterFactory(customFormatter("######")));
                    break;
                case 6: //Location
                    jFormattedTextField.setFormatterFactory(new DefaultFormatterFactory(customFormatter("????????????????????")));
                    break;
                case 7: //Uber
                case 8: //Availability
                    jCheckBox.setText("Yes");
                    jCheckBox.setSelected(true);
                    break;
                case 9: //Expired
                    jCheckBox.setText("No");
                    jCheckBox.setSelected(false);
                    break;

            }

            jFormattedTextField.setFocusLostBehavior(JFormattedTextField.PERSIST);
            jFormattedTextField.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    jFormattedTextField.setBackground(Color.WHITE);
                    jFormattedTextField.setText(jFormattedTextField.getText().trim());
                }
            });

            jCheckBox.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    if (e.getStateChange() == 1) {
                        jCheckBox.setText("Yes");
                    } else {
                        jCheckBox.setText("No");
                    }
                }
            });

            jLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);

            inputFieldLabel.add(jLabel);

            constraints.gridy = i;
            constraints.gridx = 0;

            panel.add(jLabel, constraints);
            constraints.gridx = 1;

            if (i <= 6) {
                panel.add(jFormattedTextField, constraints);
                jLabel.setLabelFor(jFormattedTextField);
                jFormattedTextField.setPreferredSize(new Dimension(250, 30));
                inputField.add(jFormattedTextField);

            } else {
                panel.add(jCheckBox, constraints);
                jLabel.setLabelFor(jCheckBox);
                inputCheckBox.add(jCheckBox);
            }
        }

        constraints.gridy = carDataLabels.length;
        constraints.gridx = 2;
        panel.add(jButton, constraints);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] data = new String[inputFieldLabel.size()];
                Boolean check = true;

                for (int i = 0; i < inputFieldLabel.size(); i++) {

                    switch (i) {
                        case 7: // Uber used
                        case 8: // Availability
                        case 9: // Expired
                            String result = inputCheckBox.get(i - 7).getText().trim();
                            if (result.equalsIgnoreCase("yes")) {
                                data[i] = "true";
                            } else if (result.equalsIgnoreCase("no")) {
                                data[i] = "false";
                            } else {
                                inputField.get(i).setBackground(Color.RED);
                                check = false;
                            }
                            break;
                        default:
                            String input = inputField.get(i).getText().trim();
                            if (input.length() == 0) {
                                inputField.get(i).setBackground(Color.RED);
                                JOptionPane.showMessageDialog(null, "Wrong Input! Please check it again.",
                                        "Oops", JOptionPane.ERROR_MESSAGE);
                                check = false;
                                continue;
                            }
                            data[i] = input;
                    }
                }

                if (check) {
                    importCarData(data);
                    dateLabelData.setText(dateFormat.format(new Date()));
                } else {
                    return;
                }
            }
        });

        return panel;
    }

    protected static MaskFormatter customFormatter(String s) {
        MaskFormatter formatter = null;
        try {
            formatter = new MaskFormatter(s);
            formatter.setPlaceholder("");
        } catch (java.text.ParseException e) {
            System.err.println("Formatter not correct: " + e.getMessage());
            System.exit(-1);
        }
        return formatter;
    }

    private static JPanel createDisplayPanel(car[] cars) {
        JPanel panel = new JPanel(new GridBagLayout());

        if (cars == null) {

            JLabel jLabel = new JLabel("<html><body>Dear Uber users, welcome to the Uber service sandbox!<br/><br/><br/>" +
                    "1. Please press \"Create\" botton to add a new Uber car into the table.<br/><br/>" +
                    "2. Use the \"Search\" botton to filter or find cars in the list.<br/><br/>" +
                    "3. If you want to update some attributes, press \"Update\".<br/><br/><br/>" +
                    "Contact us if you have any technical issue!</p></body></html>");
            panel.add(jLabel);
            return panel;
        }

        JLabel carNumberLabel = new JLabel("Found Cars: ");
        JLabel carNumberLabelData = new JLabel(String.valueOf(cars.length));
        JLabel carTotalNumberLabel = new JLabel("Total Cars: ");
        JLabel carTotalNumberLabelData = new JLabel(String.valueOf(carDatabase.size()));

        // Set some constrains for the input field to make it easier to read
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.REMAINDER;
        constraints.ipady = 10;
        constraints.ipadx = 10;
        final int pageLimit = 8;

        for (int i = 0; i < carDataLabels.length; i++) {
            JLabel jLabel = new JLabel(carDataLabels[i]);
            jLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);

            constraints.gridx = 0;
            constraints.gridy = i;
            panel.add(jLabel, constraints);
        }

        for (int i = 0; i < cars.length; i++) {
            String[] carDataString = exportCarData(cars[i]);
            constraints.gridx = i % pageLimit + 1;

            for (int j = 0; j < carDataString.length; j++) {
                JLabel jLabelData = new JLabel(carDataString[j]);

                constraints.gridy = j + (i / pageLimit) * carDataString.length;
                panel.add(jLabelData, constraints);
            }
        }

        constraints.gridy = carDataLabels.length + 1 + carDataLabels.length * (cars.length / pageLimit);
        constraints.gridx = 0;
        panel.add(carNumberLabel, constraints);

        constraints.gridx = 1;
        panel.add(carNumberLabelData, constraints);

        constraints.gridy = carDataLabels.length + 2 + carDataLabels.length * (cars.length / pageLimit);
        constraints.gridx = 0;
        panel.add(carTotalNumberLabel, constraints);

        constraints.gridx = 1;
        panel.add(carTotalNumberLabelData, constraints);

        return panel;
    }

    private static JPanel createSearchPanel() {
        JPanel panel = new JPanel(new GridBagLayout());
        JButton jButton = new JButton("Search");
        List<JComboBox> jComboBoxList = new ArrayList<JComboBox>(carDataLabels.length);

        // Set some constrains for the input field to make it easier to read
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.REMAINDER;
        constraints.ipady = 10;

        for (int i = 0; i < carDataLabels.length; i++) {
            JLabel jLabel = new JLabel(carDataLabels[i]);
            JComboBox jComboBox = new JComboBox();
            JComboBox maxSeat = new JComboBox();
            JComboBox minSeat = new JComboBox();

            switch (i) {
                case 0: //Name
                    jComboBox.setModel(new DefaultComboBoxModel(addHyphen(getAllCarNames())));
                    break;
                case 1: //Brand
                    jComboBox.setModel(new DefaultComboBoxModel(addHyphen(getAllCarBrand())));
                    break;
                case 2: //Model
                    jComboBox.setModel(new DefaultComboBoxModel(addHyphen(getAllCarModel())));
                    break;
                case 3: //Year
                    jComboBox.setModel(new DefaultComboBoxModel(addHyphen(getAllCarYears())));
                    break;
                case 4: //Seat
                    minSeat.setModel(new DefaultComboBoxModel(addHyphen(getAllCarSeat())));
                    maxSeat.setModel(new DefaultComboBoxModel(addHyphen(getAllCarSeat())));
                    break;
                case 5: //SN
                    jComboBox.setModel(new DefaultComboBoxModel(addHyphen(getAllCarSerialNumber())));
                    break;
                case 6: //Location
                    jComboBox.setModel(new DefaultComboBoxModel(addHyphen(getAllCarLocation())));
                    break;
                case 7: //Uber
                case 8: //Availability
                case 9: //Expired
                    jComboBox.setModel(new DefaultComboBoxModel(new String[]{"--", "Yes", "No"}));
                    break;

            }

            jLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);

            if (i == 4) {
                jComboBoxList.add(minSeat);
                jComboBoxList.add(maxSeat);
                jLabel.setLabelFor(minSeat);
                JLabel maxSeatLabel = new JLabel("max: ");
                JLabel minSeatLabel = new JLabel("min: ");

                maxSeatLabel.setLabelFor(maxSeat);
                minSeatLabel.setLabelFor(minSeat);

                constraints.gridy = i;
                constraints.gridx = 0;
                panel.add(jLabel, constraints);

                constraints.gridx = 1;
                constraints.gridwidth = 1;
                panel.add(minSeatLabel, constraints);

                constraints.gridx = 2;
                panel.add(minSeat, constraints);

                constraints.gridx = 3;
                panel.add(maxSeatLabel, constraints);

                constraints.gridx = 4;
                panel.add(maxSeat, constraints);
            } else {
                jComboBoxList.add(jComboBox);
                jLabel.setLabelFor(jComboBox);

                constraints.gridy = i;
                constraints.gridx = 0;
                panel.add(jLabel, constraints);
                constraints.gridx = 1;
                panel.add(jComboBox, constraints);
            }
        }

        constraints.gridy = carDataLabels.length;
        constraints.gridx = 2;
        panel.add(jButton, constraints);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] searchCarAttributes = new String[jComboBoxList.size()];
                for (int i = 0; i < jComboBoxList.size(); i++) {
                    switch (i) {
                        case 8:
                        case 9:
                        case 10:
                            if (String.valueOf(jComboBoxList.get(i).getSelectedItem()).equalsIgnoreCase("yes")) {
                                searchCarAttributes[i] = "true";
                            } else if (String.valueOf(jComboBoxList.get(i).getSelectedItem()).equalsIgnoreCase("no")) {
                                searchCarAttributes[i] = "false";
                            } else {
                                searchCarAttributes[i] = "--";
                            }
                            break;
                        default:
                            searchCarAttributes[i] = String.valueOf(jComboBoxList.get(i).getSelectedItem());
                    }
                }

                car[] result = searchCar(searchCarAttributes);

                displayPanel.removeAll();
                displayPanel.repaint();
                displayPanel.add(createDisplayPanel(result));
                displayPanel.revalidate();
            }
        });

        return panel;
    }

    private static String[] addHyphen(String[] carData) {
        String[] comboList = new String[carData.length + 1];
        comboList[0] = "--";
        System.arraycopy(carData, 0, comboList, 1, carData.length);
        return comboList;
    }

    private static car[] searchCar(String[] searchCarAttributes) {
        List<car> filteredCarDatabase = new ArrayList<car>(carDatabase);
        car[] carResult = new car[]{};
        for (int i = 0; i < searchCarAttributes.length; i++) {
            if (searchCarAttributes[i].equals("--")) {
                continue;
            }

            switch (i) {
                case 0: //name
                    car carName = carDatabase.stream().filter(car -> car.getUniqueName().equals(searchCarAttributes[0])).findFirst().orElse(null);
                    return new car[]{carName};
                case 1: //Brand
                    carResult = filteredCarDatabase.stream().filter(car -> car.getBrand().equals(searchCarAttributes[1])).toArray(car[]::new);
                    break;
                case 2: //Model
                    carResult = filteredCarDatabase.stream().filter(car -> car.getModel().equals(searchCarAttributes[2])).toArray(car[]::new);
                    break;
                case 3: //Year
                    carResult = filteredCarDatabase.stream().filter(car -> car.getManufacturedYear() == Integer.parseInt(searchCarAttributes[3])).toArray(car[]::new);
                    break;
                case 4: //minSeat
                    carResult = filteredCarDatabase.stream().filter(car -> car.getSeat() >= Integer.parseInt(searchCarAttributes[4])).toArray(car[]::new);
                    break;
                case 5: //maxSeat
                    carResult = filteredCarDatabase.stream().filter(car -> car.getSeat() <= Integer.parseInt(searchCarAttributes[5])).toArray(car[]::new);
                    break;
                case 6: //SN
                    carResult = filteredCarDatabase.stream().filter(car -> car.getSerialNumber() == Integer.parseInt(searchCarAttributes[6])).toArray(car[]::new);
                    break;
                case 7: //Location
                    carResult = filteredCarDatabase.stream().filter(car -> car.getLocation().equalsIgnoreCase(searchCarAttributes[7])).toArray(car[]::new);
                    break;
                case 8: //Uber
                    carResult = filteredCarDatabase.stream().filter(car -> car.isUsedByUber() == Boolean.parseBoolean(searchCarAttributes[8])).toArray(car[]::new);
                    break;
                case 9: //Availability
                    carResult = filteredCarDatabase.stream().filter(car -> car.isAvailable() == Boolean.parseBoolean(searchCarAttributes[9])).toArray(car[]::new);
                    break;
                case 10: //Expired
                    carResult = filteredCarDatabase.stream().filter(car -> car.isExpired() == Boolean.parseBoolean(searchCarAttributes[10])).toArray(car[]::new);
                    break;
            }

            if (carResult.length == 1) {
                return carResult;
            }

            if (carResult.length == 0) {
                return null;
            }

            filteredCarDatabase.clear();
            filteredCarDatabase = new ArrayList<car>(Arrays.asList(carResult));
        }
        return carResult;
    }

}
