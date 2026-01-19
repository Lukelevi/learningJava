package samplepackage;

import java.util.Scanner;

public class AcceptInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nEnter your name: ");

        //Take in a String data type
        String name = scanner.nextLine();

        //Take in integer data type
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        //Take in double data type
        System.out.print("What is score: ");
        double bps = scanner.nextDouble();

        //Take in a boolean datatype
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("\nHello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your score is: " + bps);
        
        if (isStudent) {
            System.out.println("You are enrolled as a student");
        }
        else {
            System.out.println("You are NOT enrolled as a student");
        }

        scanner.close(); 

        //Common Errors
        // System.out.print("\nEnter your age: ");
        // int age = scanner.nextInt();
        // scanner.nextLine();

        // System.out.print("Enter your favourite color: ");
        // String color = scanner.nextLine();
          
        // System.out.println("You are " + age + " years old");
        // System.out.println("Your favourite color is " + color);

        // scanner.close();
    }
}
