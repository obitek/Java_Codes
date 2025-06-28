

import java.util.Scanner;                    // import the scanner class

public class ReverseWordWithWhile {
   public static void main(String[] args){
      Scanner obj = new Scanner(System.in);  // create scanner object
      System.out.println("This program reverses every word inputted");
      System.out.print("Enter a word (or yes/y to quit): ");
      String word = obj.nextLine();          // store original word
      
      while(!(word.equalsIgnoreCase("yes") || word.equalsIgnoreCase("y"))){
         String rev = "";
         int count = 0;
         do {
               rev += word.charAt(word.length() - (count + 1));
               count += 1;
         } while(count < word.length());

         System.out.println("The original word is: \t" + word);
         System.out.println("The reversed word is: \t" + rev);
         System.out.println();
         System.out.print("Enter a word (or yes/y to quit): ");
         word = obj.nextLine();      // store original word
      }
      obj.close();
   }
}



