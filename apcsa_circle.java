

import java.util.Scanner;
import java.lang.Math;

public class apcsa_circle {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

      System.out.print("Diameter: ");
      double diameter = in.nextDouble();
      in.close();

      double diameterDivided = (diameter / 2); //calculates the user's inputted diameter divided by 2
      double area = Math.PI * Math.pow(diameterDivided, 2); //calculates the area of a circle

      /*
        Formula divided into two seperate parts so it's easier for my brain to comprehend. 
      */

      System.out.printf("The area of a circle with a diameter of " + String.format("%.1f", diameter) + " is " + String.format("%.1f", area) + ".\n");



  }
}
