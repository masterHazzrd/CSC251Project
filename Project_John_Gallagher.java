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

        Policy pInfo = new Policy();

        if (inputData.exists() == false) {

            System.out.println("Unable to open file or file does not exist");
            System.out.println("Input data for policy manually");            

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

            System.out.print("Please enter the Policyholder Height (in inches): ");
            polHoldHeight = input.nextDouble();
            pInfo.setPolHoldHeight(polHoldHeight);
            
            System.out.print("Please enter the Policyholder\u2019s Weight (in pounds): ");
            polHoldWeight = input.nextDouble();
            pInfo.setPolHoldWeight(polHoldWeight);

            polHoldBMI = pInfo.getPolHoldBMI();

            policyCost = getCost(polHoldAge, smkingStat, polHoldBMI);

        } else {

            input = new Scanner(inputData);

            ArrayList<Policy> polList = new ArrayList<Policy>();

            while (input.hasNext()) {
                int pNumber = input.nextInt();
                String insurProvName = input.nextLine();
                String fName = input.nextLine();
                String lName = input.nextLine();
                int age = input.nextInt();
                String smokingStat = input.nextLine();
                double polHolderHeight = input.nextInt();
                double polHolderWeight = input.nextInt();

                if (input.hasNext())
                    input.nextLine();
                if (input.hasNext())
                    input.nextLine();

                polList.add(new Policy(pNumber, insurProvName, fName, lName, age, smokingStat, polHolderHeight, polHolderWeight));
            }

            for (Policy policy : polList) {
                System.out.print("\n\n______________________________");
                System.out.print("\n\n\tPolicy Information");
                System.out.print("\n______________________________");
                System.out.print("\n\nPolicy Number: " + policy.getPolNumber());
                System.out.print("\nProvider Name: " + policy.getProvName());
                System.out.print("\nPolicyholders First Name:  " + policy.getPolHoldFName());
                System.out.print("\nPolicyholders Last Name: " + policy.getPolHoldLName());
                System.out.print("\nPolicyholders Age: " + policy.getPolHoldAge());
                System.out.print("\nPolicyholders Smoking Status: " + policy.getPolHoldSmkStat());
                System.out.print("\nPolicyholders Height: " + policy.getPolHoldHeight());
                System.out.print("\nPolicyholders Weight: " + policy.getPolHoldWeight());
                System.out.printf("\nPolicyholder’s BMI: %.2f", policy.getPolHoldBMI());
                System.out.printf("\n\nPolicy Price: %.2f", policyCost);
                System.out.print("\n\n");

                if (policy.getPolHoldSmkStat().equalsIgnoreCase("smoker"))
                    numOfSmoker++;
            }

            System.out.println("The number of policies with a smoker is: " + numOfSmoker);
            System.out.println("The number of policies with a non-smoker is: " + (polList.size() - numOfSmoker));

        }

        //Fix after getting program to read file
        

        System.out.print("\n\n______________________________");
        System.out.print("\n\n\tPolicy Information");
        System.out.print("\n______________________________");
        System.out.print("\n\nPolicy Number: " + pInfo.getPolNumber());
        System.out.print("\nProvider Name: " + pInfo.getProvName());
        System.out.print("\nPolicyholders First Name:  " + pInfo.getPolHoldFName());
        System.out.print("\nPolicyholders Last Name: " + pInfo.getPolHoldLName());
        System.out.print("\nPolicyholders Age: " + pInfo.getPolHoldAge());
        System.out.print("\nPolicyholders Smoking Status: " + pInfo.getPolHoldSmkStat());
        System.out.print("\nPolicyholders Height: " + pInfo.getPolHoldHeight());
        System.out.print("\nPolicyholders Weight: " + pInfo.getPolHoldWeight());
        System.out.printf("\nPolicyholder’s BMI: %.2f", pInfo.getPolHoldBMI());
        System.out.printf("\n\nPolicy Price: %.2f", policyCost);
        System.out.print("\n\n");      

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