/*
 * Joshua Revels
 * 5-4-19
 * This program shows inheritance concepts and applications.
 * The RealEstateCompanies program declares variables and sets up getters
 * and setters to be used by other programs.
 * JDK version 1.8.0
 */

public class RealEstateCompanies {

    private String companyNumber;
    private String companyName;
    private String companyAddress;
    private String companyCity;
    private String companyState;
    private int companyZip;
    private String companyEmail;
    private String companyPhone;

    public RealEstateCompanies(String companyNumber, String companyName,
            String companyAddress, String companyCity, String companyState,
            int companyZip, String companyEmail, String companyPhone) {
        this.companyNumber = companyNumber;
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyCity = companyCity;
        this.companyState = companyState;
        this.companyZip = companyZip;
        this.companyEmail = companyEmail;
        this.companyPhone = companyPhone;

    }//End of Constructor

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyCity(String companyCity) {
        this.companyCity = companyCity;
    }

    public String getCompanyCity() {
        return companyCity;
    }

    public void setCompanyState(String companyState) {
        this.companyState = companyState;
    }

    public String getCompanyState() {
        return companyState;
    }

    public void setCompanyZip(int companyZip) {
        this.companyZip = companyZip;
    }

    public int getCompanyZip() {
        return companyZip;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

}//End of class
