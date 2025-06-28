
// Assignment: GravityCalculator
// Compute the position of a falling object:
// x(t) = ut + 0.5at2 + xi

import java.util.Scanner;

public class GravityCalculator{
   public static double gravCal(double a, double t, double u, double x0){
      //double v = u + a * t;
      double xi = x0 + u * t + 0.5 * a * Math.pow(t, 2);  
      return xi;
   }
   
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the value of a: ");
      double a = scan.nextDouble();
      System.out.print("Enter the value of t: ");
      double t = scan.nextDouble();
      System.out.print("Enter the value of u: ");
      double u = scan.nextDouble();
      System.out.print("Enter the value of xi: ");
      double x0 = scan.nextDouble();
      
      if(t < 0 || u < 0 || x0 < 0){
         System.out.println("Distance/velocity cannot be negative!");
      } else {
         double x = gravCal(a, t, u, x0 = 0.0);
         System.out.printf("The result is: %.2f", x);
      }
   }
}

