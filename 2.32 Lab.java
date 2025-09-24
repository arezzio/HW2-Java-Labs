import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int nickels = scnr.nextInt();
      int dimes = scnr.nextInt();
      int quarters = scnr.nextInt();
      
      double total = (nickels * 0.05) + (dimes * 0.10) + (quarters * 0.25);
      
      System.out.printf("Amount: $%.2f\n", total);
   }
}
