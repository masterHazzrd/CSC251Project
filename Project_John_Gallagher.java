import java.util.Scanner;

public class Project_John_Gallagher {

    public static void main(String[] args) {

        //Declaring variables
        int polNumber, polHoldAge;
        String polProvName, polHoldFName, polHoldLName, smkingStat;
        boolean holderSmkingStat = false;
        double polHoldHeight, polHoldWeight, polHoldBMI, policyCost;

        Scanner input = new Scanner(System.in);

        Policy pInfo = new Policy();

        System.out.print("Please enter the Policy Number: ");
        polNumber = input.nextInt();
        pInfo.setPolNumber(polNumber);

        input.nextLine();

        System.out.print("Please enter the Provider Name: ");
        polProvName = input.nextLine();
        pInfo.setProvName(polProvName);

        System.out.print("Please enter the Policyholder First Name: ");
        polHoldFName = input.nextLine();
        pInfo.setPolHoldFName(polHoldFName);

        System.out.print("Please enter the Policyholder Last Name: ");
        polHoldLName = input.nextLine();
        pInfo.setPolHoldLName(polHoldLName);

        System.out.print("Please enter the Policyholder’s Age: ");
        polHoldAge = input.nextInt();
        pInfo.setPolHoldAge(polHoldAge);
        input.nextLine();

        System.out.print("Please enter the Policyholder Smoking Status (smoker/non-smoker): ");
        smkingStat = input.nextLine();

        if (smkingStat.equals("smoker"))
            holderSmkingStat = true;

        pInfo.setPolHoldSmkStat(holderSmkingStat);

        System.out.print("Please enter the Policyholder Height (in inches): ");
        polHoldHeight = input.nextDouble();
        pInfo.setPolHoldHeight(polHoldHeight);
        
        System.out.print("Please enter the Policyholder\u2019s Weight (in pounds): ");
        polHoldWeight = input.nextDouble();
        pInfo.setPolHoldWeight(polHoldWeight);

        polHoldBMI = pInfo.getPolHoldBMI();

        policyCost = getCost(polHoldAge, holderSmkingStat, polHoldBMI);

        System.out.print("\n\n______________________________");
        System.out.print("\n\n\tPolicy Information");
        System.out.print("\n______________________________");
        System.out.print("\n\nPolicy Number: " + pInfo.getPolNumber());
        System.out.print("\nProvider Name: " + pInfo.getProvName());
        System.out.print("\nPolicyholders First Name:  " + pInfo.getPolHoldFName());
        System.out.print("\nPolicyholders Last Name: " + pInfo.getPolHoldLName());
        System.out.print("\nPolicyholders Age: " + pInfo.getPolHoldAge());
        System.out.print("\nPolicyholders Smoking Status: " + smkingStat);
        System.out.print("\nPolicyholders Height: " + pInfo.getPolHoldHeight());
        System.out.print("\nPolicyholders Weight: " + pInfo.getPolHoldWeight());
        System.out.printf("\nPolicyholder’s BMI: %.2f", pInfo.getPolHoldBMI());
        System.out.printf("\n\nPolicy Price: %.2f", policyCost);
        System.out.print("\n\n");      

    }

    public static double getCost(int hAge, boolean holderSmkingStat, double hBMI) {

        double totAdditionalFee = 0, totPolCost;
        final double BASE_FEE = 600;
        final double OVER_50 = 75;
        final double SMOKER_FEE = 100;
        final double BMI_OVER_35 = ((hBMI - 35) * 20);

        if (hAge > 50) {
            totAdditionalFee = totAdditionalFee + OVER_50;
        }
        
        if (holderSmkingStat != false) {
            totAdditionalFee = totAdditionalFee + SMOKER_FEE;
        } 
        
        if (hBMI > 35) {
            totAdditionalFee = totAdditionalFee + BMI_OVER_35;
        }
        
        totPolCost = totAdditionalFee + BASE_FEE;        

        return totPolCost;
    }

}