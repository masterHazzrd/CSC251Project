import java.util.*;
import java.io.*;

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

    public void setPolNumber(int pNum) {
        this.policyNum = pNum;
    }

    public int getPolNumber() {
        return policyNum;
    }

    public void setProvName(String provName) {
        this.policyProviderName = provName;
    }

    public String getProvName() {
        return policyProviderName;
    }

    public void setPolHoldFName(String pHFName) {
        this.policyHoldersFName = pHFName;
    }

    public String getPolHoldFName() {
        return policyHoldersFName;
    }

    public void setPolHoldLName(String pHLName) {
        this.policyHolderLName = pHLName;
    }

    public String getPolHoldLName() {
        return policyHolderLName;
    }

    public void setPolHoldAge(int pHAge) {
        this.policyHoldersAge = pHAge;
    }

    public int getPolHoldAge() {
        return policyHoldersAge;
    }

    public void setPolHoldSmkStat(boolean pHSmkSt) {
        this.policyHoldersSmokingStatus = pHSmkSt;
    }

    public boolean getPolHoldSmkStat() {
        return policyHoldersSmokingStatus;
    }

    public void setPolHoldHeight(double pHHeight) {
        this.policyHoldersHeight = pHHeight;
    }

    public double getPolHoldHeight() {
        return policyHoldersHeight;
    }

    public void setPolHoldWeight(double pHWeight) {
        this.policyHoldersWeight = pHWeight;
    }

    public double getPolHoldWeight() {
        return policyHoldersWeight;
    }

    public double getPolHoldBMI() {
        return ((policyHoldersWeight * 703) / Math.pow(policyHoldersHeight, 2));
    }
    
}
