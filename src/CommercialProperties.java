/*
 * Joshua Revels
 * 5-4-19
 * This program shows inheritance concepts and applications.
 * The CommercialProperties program sets up final constants, declares variables
 * and sets up getters and setters to be used by other programs.
 * This program also contains overriding methods specific to the 
 * CommercialProperties selection.
 * JDK version 1.8.0
 */

public class CommercialProperties extends MultilistProperties {

    static final double COM_LOCAL_TAX = 0.0435;
    static final double COM_COUNTY_TAX = 0.07251;
    static final double COM_SCHOOL_TAX = 0.2790;

    protected double totalPropertyValue;
    protected double localTaxes;
    protected double countyTaxes;
    protected double schoolTaxes;
    protected double totalTaxes;

    public CommercialProperties(String companyNumber,
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
        propertyTypeLetter = "C";
        return propertyTypeLetter;
    }

    @Override
    public double getTotalPropertyValue() {
        totalPropertyValue = buildingValue + landValue;
        return totalPropertyValue;

    }

    @Override
    public double getLocalTax() {
        localTaxes = totalPropertyValue * COM_LOCAL_TAX;
        return localTaxes;
    }

    @Override
    public double getCountyTax() {
        countyTaxes = totalPropertyValue * COM_COUNTY_TAX;
        return countyTaxes;
    }

    @Override
    public double getSchoolTax() {
        schoolTaxes = totalPropertyValue * COM_SCHOOL_TAX;
        return schoolTaxes;
    }

    @Override
    public double getTotalTaxes() {
        totalTaxes = localTaxes + countyTaxes + schoolTaxes;
        return totalTaxes;
    }
}//End of class
