/*
 * Joshua Revels
 * 5-4-19
 * This abstract program shows inheritance concepts and applications.
 * The MultilistProperties program declares variables and sets up getters
 * and setters as well as abstract methods to be used by other programs.
 * JDK version 1.8.0
 */

public abstract class MultilistProperties extends RealEstateAgents {

    private String propertyNumber;
    private String parcelNumber;
    private String parcelID;
    protected String propertyTypeLetter;
    private String propertyAddress;
    private String propertyCity;
    private String propertyState;
    private int propertyZip;
    private double askingPrice;
    protected double buildingValue;
    protected double landValue;

    public MultilistProperties(String companyNumber,
            String companyName,
            String companyAddress,
            String companyCity,
            String companyState,
            int companyZip,
            String companyEmail,
            String companyPhone,
            String agentNumber,
            String agentName,
            String agentEmail,
            String agentPhone,
            String propertyNumber,
            String parcelNumber,
            String parcelID,
            String propertyAddress,
            String propertyCity,
            String propertyState,
            int propertyZip,
            double askingPrice,
            double buildingValue,
            double landValue) {

        super(companyNumber,
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
                agentPhone);

        this.propertyNumber = propertyNumber;
        this.parcelNumber = parcelNumber;
        this.parcelID = parcelID;
        this.propertyAddress = propertyAddress;
        this.propertyCity = propertyCity;
        this.propertyState = propertyState;
        this.propertyZip = propertyZip;
        this.askingPrice = askingPrice;
        this.buildingValue = buildingValue;
        this.landValue = landValue;
    }

    public void setPropertyNumber(String propertyNumber) {
        this.propertyNumber = propertyNumber;
    }

    public String getPropertyNumber() {
        return propertyNumber;
    }

    public void setParcelNumber(String parcelNumber) {
        this.parcelNumber = parcelNumber;
    }

    public String getParcelNumber() {
        return parcelNumber;
    }

    public void setParcelID(String parcelID) {
        this.parcelID = parcelID;
    }

    public String getParcelID() {
        return parcelID;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyCity(String propertyCity) {
        this.propertyCity = propertyCity;
    }

    public String getPropertyCity() {
        return propertyCity;
    }

    public void setPropertyState(String propertyState) {
        this.propertyState = propertyState;
    }

    public String getPropertyState() {
        return propertyState;
    }

    public void setPropertyZip(int propertyZip) {
        this.propertyZip = propertyZip;
    }

    public int getPropertyZip() {
        return propertyZip;
    }

    public void setAskingPrice(double askingPrice) {
        this.askingPrice = askingPrice;
    }

    public double getAskingPrice() {
        return askingPrice;
    }

    public void setBuildingValue(double buildingValue) {
        this.buildingValue = buildingValue;
    }

    public double getBuildingValue() {
        return buildingValue;
    }

    public void setLandValue(double landValue) {
        this.landValue = landValue;
    }

    public double getLandValue() {
        return landValue;
    }

    public abstract String getPropertyTypeLetter();

    public abstract double getTotalPropertyValue();

    public abstract double getLocalTax();

    public abstract double getCountyTax();

    public abstract double getSchoolTax();

    public abstract double getTotalTaxes();

}//End of class
