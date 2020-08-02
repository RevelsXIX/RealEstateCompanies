/*
 * Joshua Revels
 * 5-4-19
 * This is the main graphical user interface of the program.
 * JDK version 1.8.0
 */
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;

public class ProjectGUIOne extends JFrame {

    JFrame windowRealEstate;

    private final JPanel panelOne;
    private final JPanel panelTwo;

    private final JLabel messageLabelOne;
    private final JTextField textCompanyNumber;
    private final JLabel messageLabelTwo;
    private final JTextField textCompanyName;
    private final JLabel messageLabelThree;
    private final JTextField textCompanyAddress;
    private final JLabel messageLabelFour;
    private final JTextField textCompanyCity;
    private final JLabel messageLabelFive;
    private final JTextField textCompanyState;
    private final JLabel messageLabelSix;
    private final JTextField textCompanyZip;
    private final JLabel messageLabelSeven;
    private final JTextField textCompanyEmail;
    private final JLabel messageLabelEight;
    private final JTextField textCompanyPhone;
    private final JLabel messageLabelNine;
    private final JTextField textAgentNumber;
    private final JLabel messageLabelTen;
    private final JTextField textAgentName;
    private final JLabel messageLabelEleven;
    private final JTextField textAgentEmail;
    private final JLabel messageLabelTwelve;
    private final JTextField textAgentPhone;
    private final JLabel messageLabelThirteen;
    private final JTextField textPropertyNumber;
    private final JLabel messageLabelFourteen;
    private final JTextField textParcelNumber;
    private final JLabel messageLabelFifteen;
    private final JTextField textParcelID;
    private final JLabel messageLabelSixteen;
    private final JTextField textPropertyAddress;
    private final JLabel messageLabelSeventeen;
    private final JTextField textPropertyCity;
    private final JLabel messageLabelEighteen;
    private final JTextField textPropertyState;
    private final JLabel messageLabelNineteen;
    private final JTextField textPropertyZip;
    private final JLabel messageLabelTwenty;
    private final JTextField textAskingPrice;
    private final JLabel messageLabelTwentyOne;
    private final JTextField textBuildingValue;
    private final JLabel messageLabelTwentyTwo;
    private final JTextField textLandValue;

    private final JButton acceptInputButton;
    private final JButton exitButton;

    private final int WINDOW_WIDTH = 580;
    private final int WINDOW_HEIGHT = 560;

    String propertyType;

    ProjectGUIOne(String propertyType) {
        this.propertyType = propertyType;
        panelOne = new JPanel();
        panelOne.setLayout(new GridLayout(23, 1));

        messageLabelOne = new JLabel("Please enter your company number");
        textCompanyNumber = new JTextField(10);
        panelOne.add(messageLabelOne);
        panelOne.add(textCompanyNumber);

        messageLabelTwo = new JLabel("Please enter your company name");
        textCompanyName = new JTextField(10);
        panelOne.add(messageLabelTwo);
        panelOne.add(textCompanyName);

        messageLabelThree = new JLabel("Please enter your company street address");
        textCompanyAddress = new JTextField(10);
        panelOne.add(messageLabelThree);
        panelOne.add(textCompanyAddress);

        messageLabelFour = new JLabel("Please enter your company city");
        textCompanyCity = new JTextField(10);
        panelOne.add(messageLabelFour);
        panelOne.add(textCompanyCity);

        messageLabelFive = new JLabel("Please enter your company state");
        textCompanyState = new JTextField(10);
        panelOne.add(messageLabelFive);
        panelOne.add(textCompanyState);

        messageLabelSix = new JLabel("Please enter your company zip code");
        textCompanyZip = new JTextField(10);
        panelOne.add(messageLabelSix);
        panelOne.add(textCompanyZip);

        messageLabelSeven = new JLabel("Please enter your company email address");
        textCompanyEmail = new JTextField(10);
        panelOne.add(messageLabelSeven);
        panelOne.add(textCompanyEmail);

        messageLabelEight = new JLabel("Please enter your company phone number");
        textCompanyPhone = new JTextField(10);
        panelOne.add(messageLabelEight);
        panelOne.add(textCompanyPhone);

        messageLabelNine = new JLabel("Please enter your agent number");
        textAgentNumber = new JTextField(10);
        panelOne.add(messageLabelNine);
        panelOne.add(textAgentNumber);

        messageLabelTen = new JLabel("Please enter your name");
        textAgentName = new JTextField(10);
        panelOne.add(messageLabelTen);
        panelOne.add(textAgentName);

        messageLabelEleven = new JLabel("Please enter your email address");
        textAgentEmail = new JTextField(10);
        panelOne.add(messageLabelEleven);
        panelOne.add(textAgentEmail);

        messageLabelTwelve = new JLabel("Please enter your phone number");
        textAgentPhone = new JTextField(10);
        panelOne.add(messageLabelTwelve);
        panelOne.add(textAgentPhone);

        messageLabelThirteen = new JLabel("Please enter the property number");
        textPropertyNumber = new JTextField(10);
        panelOne.add(messageLabelThirteen);
        panelOne.add(textPropertyNumber);

        messageLabelFourteen = new JLabel("Please enter the property's parcel "
                + "number");
        textParcelNumber = new JTextField(10);
        panelOne.add(messageLabelFourteen);
        panelOne.add(textParcelNumber);

        messageLabelFifteen = new JLabel("Please enter the property's parcel ID");
        textParcelID = new JTextField(10);
        panelOne.add(messageLabelFifteen);
        panelOne.add(textParcelID);

        messageLabelSixteen = new JLabel("Please enter the property's address");
        textPropertyAddress = new JTextField(10);
        panelOne.add(messageLabelSixteen);
        panelOne.add(textPropertyAddress);

        messageLabelSeventeen = new JLabel("Please enter the property's city");
        textPropertyCity = new JTextField(10);
        panelOne.add(messageLabelSeventeen);
        panelOne.add(textPropertyCity);

        messageLabelEighteen = new JLabel("Please enter the property's state");
        textPropertyState = new JTextField(10);
        panelOne.add(messageLabelEighteen);
        panelOne.add(textPropertyState);

        messageLabelNineteen = new JLabel("Please enter the property's zip");
        textPropertyZip = new JTextField(10);
        panelOne.add(messageLabelNineteen);
        panelOne.add(textPropertyZip);

        messageLabelTwenty = new JLabel("Please enter the property's asking "
                + "price");
        textAskingPrice = new JTextField(10);
        panelOne.add(messageLabelTwenty);
        panelOne.add(textAskingPrice);

        messageLabelTwentyOne = new JLabel("Please enter the building value of "
                + "the property");
        textBuildingValue = new JTextField(10);
        panelOne.add(messageLabelTwentyOne);
        panelOne.add(textBuildingValue);

        messageLabelTwentyTwo = new JLabel("Please enter the land value of "
                + "the property");
        textLandValue = new JTextField(10);
        panelOne.add(messageLabelTwentyTwo);
        panelOne.add(textLandValue);

        panelTwo = new JPanel();
        panelTwo.setLayout(new GridLayout(1, 2));

        acceptInputButton = new JButton("Accept Input Data");
        acceptInputButton.addActionListener(new AcceptInputButtonListener());

        exitButton = new JButton("Exit");
        exitButton.addActionListener(new ExitButtonListener());

        panelTwo.add(acceptInputButton);
        panelTwo.add(exitButton);

        windowRealEstate = new JFrame();
        windowRealEstate.setLayout(new FlowLayout());
        windowRealEstate.setTitle("Real Estate Information");
        windowRealEstate.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        windowRealEstate.add(panelOne);
        windowRealEstate.add(panelTwo);
        windowRealEstate.setVisible(true);
        windowRealEstate.getContentPane().setBackground(Color.red);
    }

    private class AcceptInputButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String companyNumber = textCompanyNumber.getText();
            String companyName = textCompanyName.getText();
            String companyAddress = textCompanyAddress.getText();
            String companyCity = textCompanyCity.getText();
            String companyState = textCompanyState.getText();
            int companyZip = Integer.parseInt(textCompanyZip.getText());
            String companyEmail = textCompanyEmail.getText();
            String companyPhone = textCompanyPhone.getText();
            String agentNumber = textAgentNumber.getText();
            String agentName = textAgentName.getText();
            String agentEmail = textAgentEmail.getText();
            String agentPhone = textAgentPhone.getText();
            String propertyNumber = textPropertyNumber.getText();
            String parcelNumber = textParcelNumber.getText();
            String parcelID = textParcelID.getText();
            String propertyAddress = textPropertyAddress.getText();
            String propertyCity = textPropertyCity.getText();
            String propertyState = textPropertyState.getText();
            int propertyZip = Integer.parseInt(textPropertyZip.getText());
            double askingPrice = Double.parseDouble(textAskingPrice.getText());
            double buildingValue = Double.parseDouble(textBuildingValue.getText());
            double landValue = Double.parseDouble(textLandValue.getText());

            windowRealEstate.setVisible(false);

            switch (propertyType) {
                case "1":

                    CommercialProperties propertyObjectOne =
                            new CommercialProperties(companyNumber,
                            companyName,
                            companyAddress,
                            companyCity,
                            companyState,
                            companyZip,
                            companyEmail,
                            companyPhone,
                            agentNumber,
                            agentName,
                            agentEmail,
                            agentPhone,
                            propertyNumber,
                            parcelNumber,
                            parcelID,
                            propertyAddress,
                            propertyCity,
                            propertyState,
                            propertyZip,
                            askingPrice,
                            buildingValue,
                            landValue);

                    displayObjectInformation(propertyObjectOne);
                    break;

                case "2":

                    ResidentialProperties propertyObjectTwo = 
                            new ResidentialProperties(companyNumber,
                            companyName,
                            companyAddress,
                            companyCity,
                            companyState,
                            companyZip,
                            companyEmail,
                            companyPhone,
                            agentNumber,
                            agentName,
                            agentEmail,
                            agentPhone,
                            propertyNumber,
                            parcelNumber,
                            parcelID,
                            propertyAddress,
                            propertyCity,
                            propertyState,
                            propertyZip,
                            askingPrice,
                            buildingValue,
                            landValue);

                    displayObjectInformation(propertyObjectTwo);

                    break;

                default:
                    System.out.println("error");

            } // End of the switch statement

        } // End of the method

    }// End of the class

    private class ExitButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            windowRealEstate.setVisible(false);
        }
    }

// Display the information to the user
    public void displayObjectInformation(MultilistProperties propertyObject) {
        // Format the output 
        DecimalFormat formatOutput = new DecimalFormat("#####.00");

        JFrame displayInfoWindow = new JFrame();

        displayInfoWindow.setLayout(new FlowLayout());
        displayInfoWindow.setTitle("Your Real Estate Information");
        displayInfoWindow.setSize(500, 440);
        displayInfoWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panelThree = new JPanel();
        panelThree.setLayout(new GridLayout(18, 2));

        JLabel messageLabelOne = new JLabel("Company Number is ");
        panelThree.add(messageLabelOne);
        JTextField outputCompanyNumber = 
                new JTextField(propertyObject.getCompanyNumber());
        panelThree.add(outputCompanyNumber);

        JLabel messageLabelTwo = new JLabel("Company Name is ");
        panelThree.add(messageLabelTwo);
        JTextField outputCompanyName = 
                new JTextField(propertyObject.getCompanyName());
        panelThree.add(outputCompanyName);

        JLabel messageLabelThree = new JLabel("Your Agent Number is ");
        panelThree.add(messageLabelThree);
        JTextField outputAgentNumber = 
                new JTextField(propertyObject.getAgentNumber());
        panelThree.add(outputAgentNumber);

        JLabel messageLabelFour = new JLabel("Your Agent Name is ");
        panelThree.add(messageLabelFour);
        JTextField outputAgentName = 
                new JTextField(propertyObject.getAgentName());
        panelThree.add(outputAgentName);

        JLabel messageLabelFive = new JLabel("Your Agent Phone Number is ");
        panelThree.add(messageLabelFive);
        JTextField outputAgentPhone = 
                new JTextField(propertyObject.getAgentPhone());
        panelThree.add(outputAgentPhone);

        JLabel messageLabelSix = new JLabel("Your Property Number is ");
        panelThree.add(messageLabelSix);
        JTextField outputPropertyNumber = 
                new JTextField(propertyObject.getPropertyNumber());
        panelThree.add(outputPropertyNumber);

        JLabel messageLabelSeven = new JLabel("Your Property's Parcel Number is ");
        panelThree.add(messageLabelSeven);
        JTextField outputParcelNumber = 
                new JTextField(propertyObject.getParcelNumber());
        panelThree.add(outputParcelNumber);

        JLabel messageLabelEight = new JLabel("Your Property's Parcel ID is ");
        panelThree.add(messageLabelEight);
        JTextField outputParcelID = 
                new JTextField(propertyObject.getParcelID());
        panelThree.add(outputParcelID);

        JLabel messageLabelNine = new JLabel("Your Property Address is ");
        panelThree.add(messageLabelNine);
        JTextField outputPropertyAddress = 
                new JTextField(propertyObject.getPropertyAddress());
        panelThree.add(outputPropertyAddress);

        JLabel messageLabelTen = new JLabel("The Asking Price for This Property is ");
        panelThree.add(messageLabelTen);
        JTextField outputAskingPrice = 
                new JTextField(String.valueOf((formatOutput.format(propertyObject.getAskingPrice()))));
        panelThree.add(outputAskingPrice);

        JLabel messageLabelEleven = new JLabel("The Building Value of this property is ");
        panelThree.add(messageLabelEleven);
        JTextField outputBuildingValue = 
                new JTextField(String.valueOf((formatOutput.format(propertyObject.getBuildingValue()))));
        panelThree.add(outputBuildingValue);

        JLabel messageLabelTwelve = new JLabel("The Land Value of this property is ");
        panelThree.add(messageLabelTwelve);
        JTextField outputLandValue = 
                new JTextField(String.valueOf((formatOutput.format(propertyObject.getLandValue()))));
        panelThree.add(outputLandValue);

        JLabel messageLabelThirteen = new JLabel("The Total Property Value is ");
        panelThree.add(messageLabelThirteen);
        JTextField outputTotalPropertyValue = 
                new JTextField(String.valueOf((formatOutput.format(propertyObject.getTotalPropertyValue()))));
        panelThree.add(outputTotalPropertyValue);

        JLabel messageLabelFourteen = new JLabel("The Local Taxes for this property are ");
        panelThree.add(messageLabelFourteen);
        JTextField outputLocalTaxes = 
                new JTextField(String.valueOf((formatOutput.format(propertyObject.getLocalTax()))));
        panelThree.add(outputLocalTaxes);

        JLabel messageLabelFifteen = new JLabel("The County Taxes for this property are ");
        panelThree.add(messageLabelFifteen);
        JTextField outputCountyTaxes = 
                new JTextField(String.valueOf((formatOutput.format(propertyObject.getCountyTax()))));
        panelThree.add(outputCountyTaxes);

        JLabel messageLabelSixteen = new JLabel("The School Taxes for this property are ");
        panelThree.add(messageLabelSixteen);
        JTextField outputSchoolTaxes = 
                new JTextField(String.valueOf((formatOutput.format(propertyObject.getSchoolTax()))));
        panelThree.add(outputSchoolTaxes);

        JLabel messageLabelSeventeen = new JLabel("The Total Taxes for this property are ");
        panelThree.add(messageLabelSeventeen);
        JTextField outputTotalTaxes = 
                new JTextField(String.valueOf((formatOutput.format(propertyObject.getTotalTaxes()))));
        panelThree.add(outputTotalTaxes);

        JLabel messageLabelEighteen = new JLabel("The Property Type for this property is ");
        panelThree.add(messageLabelEighteen);
        JTextField outputPropertyTypeLetter = 
                new JTextField(propertyObject.getPropertyTypeLetter());
        panelThree.add(outputPropertyTypeLetter);

        displayInfoWindow.add(panelThree);
        displayInfoWindow.getContentPane().setBackground(Color.red);
        displayInfoWindow.setVisible(true);

    }

    public static void main(String[] args, String propertyType) {
        ProjectGUIOne projectGUI = new ProjectGUIOne(propertyType);
    }
} // End of the class

