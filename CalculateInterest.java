
// create a java code for calculating simple interest, I =  PRT/100

import java.util.Scanner;                    // import the scanner class

public class CalculateInterest {
   public static void main(String[] args){
      Scanner p1 = new Scanner(System.in);   // create scanner object
      System.out.println("The program calculates the ineterest and amount and displays result.");
      System.out.print("Enter the Principal: ");
      double P = p1.nextDouble();            // store the principle P
      System.out.print("Enter the Rate: ");
      double R = p1.nextDouble();            // store the rate R
      System.out.print("Enter the Time: ");
      double T = p1.nextDouble();            // store the time per annum T
      double I = P * R * T / 100;            // calculate the interest I
      double A  = I + P;                     // calculate the amount A
      System.out.printf("The interest is: %.2f \nThe amount is: %2f \n", I, A); // display results
   }
}



