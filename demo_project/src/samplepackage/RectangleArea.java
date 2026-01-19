package samplepackage;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in); 

        //Accepting user input
        System.out.print("\nYour width: ");
        width = scanner.nextDouble();

        System.out.print("Your height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("Your area: " + area + "cm^2");

        scanner.close();
    }
}
