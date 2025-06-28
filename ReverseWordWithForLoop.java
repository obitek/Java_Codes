
import java.util.Scanner;                    // import the scanner class

public class ReverseWordWithForLoop {
   public static void main(String[] args){
      Scanner obj = new Scanner(System.in);  // create scanner object
      System.out.println("This program reverses every word inputted");
      System.out.print("Enter a word (or yes/y to quit): ");
      String OriginalWord = obj.nextLine();          // store original word
      
      while(!(OriginalWord.equalsIgnoreCase("yes") || OriginalWord.equalsIgnoreCase("y"))){
         String rev = "";
         for(int i = OriginalWord.length() - 1; i > -1; i--){
            rev += OriginalWord.charAt(i);
         }
         System.out.println("The original word is: \t" + OriginalWord);
         System.out.println("The reversed word is: \t" + rev);
         System.out.println();
         System.out.print("Enter a word (or yes/y to quit): ");
         OriginalWord = obj.nextLine();      // store original word
      }
      obj.close();
   }
}



