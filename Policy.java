public class Policy {

    //instance variables
    private int policyNum;
    private String policyProviderName;
    

    //default constructor
    public Policy() {
        this.policyNum = 0;
        this.policyProviderName = "";       
    }

    //parameterized constructor
    public Policy(int polNum, String provName) {
        this.policyNum = polNum;
        this.policyProviderName = provName;
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
    
    public String toString() {
        return String.format("Policy Number: %s\n" + "Policy Provider: %s\n", this.getPolNumber(), this.getProvName());
    }

}
