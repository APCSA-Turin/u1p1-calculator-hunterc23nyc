package com.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      


        double tPercent = percent/100.0;
        double tTip = Math.round(cost*tPercent * 100.0) / 100.0;
        double pTip = (Math.round(tTip/people* 100.0) / 100.0);
        double pCost = (Math.round(cost/people* 100.0) / 100.0);
        double tCPerson = (Math.round((pTip+pCost)* 100.0) / 100.0);
        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + "" + cost + "\n" + 
                       "Total percentage: " + "" + percent + "%" + "\n" + 
                       "Total tip: $" + "" +  tTip + "\n" +
                       "Total Bill with tip: $" + "" + (tTip+cost) + "\n" + 
                       "Per person cost before tip: $" + "" + pCost + "\n" + 
                       "Tip per person: $" + "" + pTip + "\n" + 
                       "Total cost per person: $" + "" + tCPerson + "\n" + 
                       "-------------------------------\n";

        return result;
    }

    public static String extraCredit(int people, int percent, double cost) {
        boolean condition = true;

                        
         double tPercent = percent/100.0;
        double tTip = Math.round(cost*tPercent * 100.0) / 100.0;
        double pTip = (Math.round(tTip/people* 100.0) / 100.0);
        double pCost = (Math.round(cost/people* 100.0) / 100.0);
        double tCPerson = (Math.round((pTip+pCost)* 100.0) / 100.0);

                        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + "" + cost + "\n" + 
                       "Total percentage: " + "" + percent + "%" + "\n" + 
                       "Total tip: $" + "" +  tTip + "\n" +
                       "Total Bill with tip: $" + "" + (tTip+cost) + "\n" + 
                       "Per person cost before tip: $" + "" + pCost + "\n" + 
                       "Tip per person: $" + "" + pTip + "\n" + 
                       "Total cost per person: $" + "" + tCPerson + "\n" + 
                       "-------------------------------\n" +
                       "Items ordered:\n" ;
        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops

        String food = "1";
        List<String> items = new ArrayList<>();
         Scanner scan = new Scanner(System.in); 
        while (condition) {           
         food = scan.next();

            if (!food.equals("-1")) {
                result += food + "\n";
            } else {
                condition = false;
            }
        }
        scan.close();
        result += "-------------------------------\n";

        return result;
}



    
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people=2; 
        int percent=18;
        double cost=5.99;              
        //System.out.println(calculateTip(people,percent,cost));
        System.out.println(extraCredit(people, percent, cost));
    }
}
        
