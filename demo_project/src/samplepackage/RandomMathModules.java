package samplepackage;

import java.util.Random;
import java.util.Scanner;

public class RandomMathModules {
    public static void main(String[] args) {
        Random rdm = new Random();

        try (Scanner scanner = new Scanner(System.in)) {
            boolean coin;

            System.out.print('\n');
            coin = rdm.nextBoolean();

            if (coin) {
                System.out.print("Heads");
            }
            else {
                System.out.print("Tails");
            }
                
            //Math module
            System.out.print("\n");
            System.out.print(Math.PI);

            double result;

            System.out.print("\n");
            result = Math.pow(2, 4);
            result = Math.sqrt(9);
            //Same as in Python  except that this time you dont import Math class

            System.out.print(result);

            // Calculate the Hypotenuse -> sqrt(a^2 + b^2)
            double adjacent;
            double opposite;
            double hypotenuse = 0;

            System.out.print("\n");
            System.out.print("Enter an adjacent size: ");
            adjacent = scanner.nextDouble();

            System.out.print("Enter an opposite size: ");
            opposite = scanner.nextDouble();

            hypotenuse = Math.sqrt(Math.pow(adjacent, 2) + Math.pow(opposite, 2));
   
            System.out.print("\nThe hypotenuse is: " + hypotenuse + "cm");

            /* Given a radius of a circle, calculate the Circumference, Area, and Volume
            circumference = 2 * pi * radius 
            area = pi * radius^2
            volume = (4.0 / 3.0) * pi * radius^3 */

            double radius;
            double circumference;
            double area;
            double volume;
            //String measure = "cm";

            System.out.print("\nEnter a radius: ");
            radius = scanner.nextDouble();

            circumference = 2 * Math.PI * radius;
            
            area = Math.PI * Math.pow(radius, 2);

            volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

            System.out.print("\n");
            System.out.println("Using the radius provided, I managed to calculate: ");
            System.out.printf("The circumference is: %.1fcm\n", circumference); // 
            System.out.printf("The area is: %.3fcm^2\n", area);
            System.out.printf("The volume is: %.1fcm^3\n", volume);
        }

    }
}
