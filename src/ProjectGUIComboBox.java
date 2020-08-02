/*
 * Joshua Revels
 * 5-4-19
 * This program is a Simple Graphical User Interface (ComboBox)
 * that works with inheritance concepts and applications. 
 * JDK version 1.8.0
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProjectGUIComboBox extends JFrame {

    JFrame mainWindow;

    private final JLabel messageTitle;

    private final JPanel panelOne;
    private final JPanel panelTwo;

    private final int WINDOW_WIDTH = 500;
    private final int WINDOW_HEIGHT = 900;

    private final JComboBox propertyChoices;

    public String propertyType;

    public ProjectGUIComboBox() {
        mainWindow = new JFrame();

        mainWindow.setTitle("Property Types");

        mainWindow.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainWindow.setLayout(new FlowLayout());

        messageTitle = new JLabel("Choose A Property Type From The List");
        panelOne = new JPanel();
        panelOne.add(messageTitle);

        panelTwo = new JPanel();
        panelTwo.setLayout(new FlowLayout());
        String[] comboChoices = {"Commercial Property",
            "Residential Property"};
        propertyChoices = new JComboBox();
        JComboBox propertyChoices = new JComboBox(comboChoices);
        propertyChoices.setSelectedIndex(0);
        propertyChoices.addActionListener(new ComboBoxListener());
        panelTwo.add(propertyChoices);

        mainWindow.add(panelOne);
        mainWindow.add(panelTwo);

        mainWindow.pack();
        mainWindow.getContentPane().setBackground(Color.red);
        mainWindow.setVisible(true);
    }

    private class ComboBoxListener implements ActionListener {

        public void actionPerformed(ActionEvent eventInfo) {
            JComboBox propertyChoices = (JComboBox) eventInfo.getSource();

            String selectedItem = (String) propertyChoices.getSelectedItem();

            switch (selectedItem) {
                case "Commercial Property":
                    propertyType = "1";
                    break;
                case "Residential Property":
                    propertyType = "2";
                    break;
            }

            // 
            ProjectGUIOne projectGUIOne;
            projectGUIOne = new ProjectGUIOne(propertyType);
        }
    }

    public static void main(String[] args) {
        ProjectGUIComboBox realEstateObject;
        realEstateObject = new ProjectGUIComboBox();
    }//end of main method

}//end of class
