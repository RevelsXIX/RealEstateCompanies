/*
 * Joshua Revels
 * 5-4-19
 * This program shows inheritance concepts and applications.
 * The ResidentialProperties program sets up final constants, declares variables
 * and sets up getters and setters to be used by other programs.
 * This program also contains overriding methods specific to the 
 * ResidentialProperties selection.
 * JDK version 1.8.0
 */

public class ResidentialProperties extends MultilistProperties {

    static final double RES_LOCAL_TAX = 00.0253;
    static final double RES_COUNTY_TAX = 00.0473;
    static final double RES_SCHOOL_TAX = 00.228763;

    protected double totalPropertyValue;
    protected double localTaxes;
    protected double countyTaxes;
    protected double schoolTaxes;
    protected double totalTaxes;

    public ResidentialProperties(String companyNumber,
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

    }

    @Override
    public String getPropertyTypeLetter() {
        propertyTypeLetter = "R";
        return propertyTypeLetter;
    }

    @Override
    public double getTotalPropertyValue() {
        totalPropertyValue = buildingValue + landValue;
        return totalPropertyValue;

    }

    @Override
    public double getLocalTax() {
        localTaxes = totalPropertyValue * RES_LOCAL_TAX;
        return localTaxes;
    }

    @Override
    public double getCountyTax() {
        countyTaxes = totalPropertyValue * RES_COUNTY_TAX;
        return countyTaxes;
    }

    @Override
    public double getSchoolTax() {
        schoolTaxes = totalPropertyValue * RES_SCHOOL_TAX;
        return schoolTaxes;
    }

    @Override
    public double getTotalTaxes() {
        totalTaxes = localTaxes + countyTaxes + schoolTaxes;
        return totalTaxes;
    }
}//End of class
