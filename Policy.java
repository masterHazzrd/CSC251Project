public class Policy {

    //instance variables
    private int policyNum, policyHoldersAge;
    private String policyProviderName, policyHoldersFName, policyHolderLName;
    private boolean policyHoldersSmokingStatus;
    private double policyHoldersHeight, policyHoldersWeight;

    //default constructor
    public Policy() {
        this.policyNum = 0;
        this.policyProviderName = "";
        this.policyHoldersFName = "";
        this.policyHolderLName = "";
        this.policyHoldersAge = 0;
        this.policyHoldersSmokingStatus = false;
        this.policyHoldersHeight = 0.0;
        this.policyHoldersWeight = 0.0;
    }

    //parameterized constructor
    public Policy(int polNum, String provName, String polHoldersFName, String polHoldersLName, int polHoldersAge, boolean polSmkStat, double polHoldersHeight, double polHoldersWeight) {
        this.policyNum = polNum;
        this.policyProviderName = provName;
        this.policyHoldersFName = polHoldersFName;
        this.policyHolderLName = polHoldersLName;
        this.policyHoldersAge = polHoldersAge;
        this.policyHoldersSmokingStatus = polSmkStat;
        this.policyHoldersHeight = polHoldersHeight;
        this.policyHoldersWeight = polHoldersWeight;
    }

    //Implementing mutator and accessor method for the policy class

    /**
     * The setPolNumber method sets the policy number.
     * @param pNum Sets the policy number.
     */
    public void setPolNumber(int pNum) {
        this.policyNum = pNum;
    }

    /**
     * The getPolNumber will return the policy number.
     * @return Returns the policy number.
     */
    public int getPolNumber() {
        return policyNum;
    }

    /**
     * The setProvName method sets the providers name.
     * @param provName Sets the provider name.
     */
    public void setProvName(String provName) {
        this.policyProviderName = provName;
    }

    /**
     * The getProvName will return the providers name.
     * @return Returns the providers name.
     */
    public String getProvName() {
        return policyProviderName;
    }

    /**
     * The setPolHoldFName method set the policy holders first name.
     * @param pHFName Sets the policy holders first name.
     */
    public void setPolHoldFName(String pHFName) {
        this.policyHoldersFName = pHFName;
    }

    /**
     * The getPolHoldFName returns the policy holders first name.
     * @return Returns policy holders first name.
     */
    public String getPolHoldFName() {
        return policyHoldersFName;
    }

    /**
     * The pHLName method sets the policy holders last name
     * @param pHLName Sets policy holders last name.
     */
    public void setPolHoldLName(String pHLName) {
        this.policyHolderLName = pHLName;
    }

    /**
     * The getPolHoldLName returns the policy holders last name.
     * @return Returns policy holders last name.
     */
    public String getPolHoldLName() {
        return policyHolderLName;
    }

    /**
     * The setPolHoldAge sets the policy holders age.
     * @param pHAge Sets ploicy holders age.
     */
    public void setPolHoldAge(int pHAge) {
        this.policyHoldersAge = pHAge;
    }

    /**
     * The getPolHoldAge returns policy holders age
     * @return Returns policy holders age.
     */
    public int getPolHoldAge() {
        return policyHoldersAge;
    }

    /**
     * The pHSmkSt sets the policy holders smoking status.
     * @param pHSmkSt Sets policy holders smoking status.
     */
    public void setPolHoldSmkStat(boolean pHSmkSt) {
        this.policyHoldersSmokingStatus = pHSmkSt;
    }

    /**
     * The getPolHoldSmkStat returns policy holders smoking status.
     * @return Returns policy holders smoking status.
     */
    public boolean getPolHoldSmkStat() {
        return policyHoldersSmokingStatus;
    }

    /**
     * The setPolHoldHeight sets policy holders height.
     * @param pHHeight Sets policy holders height.
     */
    public void setPolHoldHeight(double pHHeight) {
        this.policyHoldersHeight = pHHeight;
    }

    /**
     * The getPolHoldHeight returns policy holders height.
     * @return Returns policy holders height.
     */
    public double getPolHoldHeight() {
        return policyHoldersHeight;
    }

    /**
     * The setPolHoldWeight sets the policy holders weight.
     * @param pHWeight Sets policy holders weight.
     */
    public void setPolHoldWeight(double pHWeight) {
        this.policyHoldersWeight = pHWeight;
    }

    /**
     * The getPolHoldWeight returns policy holders weight.
     * @return Returns policy holders weight.
     */
    public double getPolHoldWeight() {
        return policyHoldersWeight;
    }

    /**
     * The getPolHoldBMI returns policy holders BMI.
     * @return Returns policy holders BMI.
     */ 
    public double getPolHoldBMI() {
        return ((policyHoldersWeight * 703) / Math.pow(policyHoldersHeight, 2));
    }    
}
