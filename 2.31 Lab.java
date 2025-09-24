import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int num1 = scnr.nextInt();
      int num2 = scnr.nextInt();
      int num3 = scnr.nextInt();
      int num4 = scnr.nextInt();
      
      int productInt = num1 * num2 * num3 * num4;
      int averageInt = (num1 + num2 + num3 + num4) / 4;
      System.out.println(productInt + " " + averageInt);
      
      double dnum1 = (double) num1;
      double dnum2 = (double) num2;
      double dnum3 = (double) num3;
      double dnum4 = (double) num4;
      
      double productDouble = dnum1 * dnum2 * dnum3 * dnum4;
      double averageDouble = (dnum1 + dnum2 + dnum3 + dnum4) / 4.0;
      
      System.out.printf("%.3f %.3f%n", productDouble, averageDouble);
   }
}
