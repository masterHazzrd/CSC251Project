import java.io.*;
import java.util.*;

public class Project_John_Gallagher {

    public static void main(String[] args) throws FileNotFoundException {

        //Declaring variables
        int polNumber, polHoldAge, numOfSmoker = 0;
        String polProvName, polHoldFName, polHoldLName, smkingStat;
        double polHoldHeight, polHoldWeight, polHoldBMI, policyCost = 0;

        File inputData = new File("PolicyInformation.txt");

        Scanner input = new Scanner(System.in);

        PolicyHolder polHoldInfo = new PolicyHolder();
        Policy polInfo = new Policy();
        

        System.out.println("Unable to open file or file does not exist");
        System.out.println("Input data for policy manually");            

        System.out.print("Please enter the Policy Number: ");
        polNumber = input.nextInt();
        polInfo.setPolNumber(polNumber);

        input.nextLine();

        System.out.print("Please enter the Provider Name: ");
        polProvName = input.nextLine();
        polInfo.setProvName(polProvName);

        System.out.print("Please enter the Policyholder First Name: ");
        polHoldFName = input.nextLine();
        polHoldInfo.setPolHoldFName(polHoldFName);

        System.out.print("Please enter the Policyholder Last Name: ");
        polHoldLName = input.nextLine();
        polHoldInfo.setPolHoldLName(polHoldLName);

        System.out.print("Please enter the Policyholder’s Age: ");
        polHoldAge = input.nextInt();
        polHoldInfo.setPolHoldAge(polHoldAge);
        input.nextLine();

        System.out.print("Please enter the Policyholder Smoking Status (smoker/non-smoker): ");
        smkingStat = input.nextLine();

        System.out.print("Please enter the Policyholder Height (in inches): ");
        polHoldHeight = input.nextDouble();
        polHoldInfo.setPolHoldHeight(polHoldHeight);
        
        System.out.print("Please enter the Policyholder\u2019s Weight (in pounds): ");
        polHoldWeight = input.nextDouble();
        polHoldInfo.setPolHoldWeight(polHoldWeight);

        polHoldBMI = polHoldInfo.getPolHoldBMI();

        policyCost = getCost(polHoldAge, smkingStat, polHoldBMI);

    }

    public static double getCost(int hAge, String holderSmkingStat, double hBMI) {

        double totAdditionalFee = 0, totPolCost;
        final double BASE_FEE = 600;
        final double OVER_50 = 75;
        final double SMOKER_FEE = 100;
        final double BMI_OVER_35 = ((hBMI - 35) * 20);

        if (hAge > 50) {
            totAdditionalFee = totAdditionalFee + OVER_50;
        }
        
        if (holderSmkingStat.equalsIgnoreCase("smoker")) {
            totAdditionalFee = totAdditionalFee + SMOKER_FEE;
        } 
        
        if (hBMI > 35) {
            totAdditionalFee = totAdditionalFee + BMI_OVER_35;
        }
        
        totPolCost = totAdditionalFee + BASE_FEE;        

        return totPolCost;
    }
}      