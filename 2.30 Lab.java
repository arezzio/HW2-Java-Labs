import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double x;
      double y;
      double z;
      
      x = scnr.nextDouble();
      y = scnr.nextDouble();
      z = scnr.nextDouble();
      
      double xz = x * z;
      double xyz = x * y * z;
      double absY = Math.abs(y);
      double sqrtXYZ = Math.sqrt(x * y * z);
      
      System.out.println(xz + " " + xyz + " " + absY + " " + sqrtXYZ);
      
      scnr.close();
   }
}
