/*
 * Joshua Revels
 * 5-4-19
 * This program shows inheritance concepts and applications.
 * The RealEstateAgents program declares variables and sets up getters
 * and setters to be used by other programs.
 * JDK version 1.8.0
 */

public class RealEstateAgents extends RealEstateCompanies {

    private String agentNumber;
    private String agentName;
    private String agentEmail;
    private String agentPhone;

    public RealEstateAgents(String companyNumber,
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
            String agentPhone) {

        super(companyNumber,
                companyName,
                companyAddress,
                companyCity,
                companyState,
                companyZip,
                companyEmail,
                companyPhone);

        this.agentNumber = agentNumber;
        this.agentName = agentName;
        this.agentEmail = agentEmail;
        this.agentPhone = agentPhone;

    }

    public void setAgentNumber(String agentNumber) {
        this.agentNumber = agentNumber;
    }

    public String getAgentNumber() {
        return agentNumber;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentEmail(String agentEmail) {
        this.agentEmail = agentEmail;
    }

    public String getAgentEmail() {
        return agentEmail;
    }

    public void setAgentPhone(String agentPhone) {
        this.agentPhone = agentPhone;
    }

    public String getAgentPhone() {
        return agentPhone;
    }
}//End of class
