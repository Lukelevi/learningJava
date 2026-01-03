import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;

public class Main {
     public static void main(String[] args) {
        //Data Types: Primitive -> int, boolean, double, float, long, char
        /*int age = 24;
        boolean isStudent = true;
        double bps = 3.45;
        float pi = 3.143F;
        long netWorth = 300000000L;

        System.out.print("I am " + age + " years old\n");
        System.out.print("Is student: " + isStudent + "\n");
        System.out.println("This is my score: " + bps);
        System.out.println(netWorth);
        System.out.println(pi);

        //Reference Types --> String, char, objects
        String name = "Sihle";
        char grade = 'A';

        System.out.println(name);
        System.out.println(grade); */

        //Accepting user input

        Scanner scanner = new Scanner(System.in);

        /* 
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

        scanner.close(); */

        //Common Errors
        // System.out.print("\nEnter your age: ");
        // int age = scanner.nextInt();
        // scanner.nextLine();

        // System.out.print("Enter your favourite color: ");
        // String color = scanner.nextLine();
          
        // System.out.println("You are " + age + " years old");
        // System.out.println("Your favourite color is " + color);

        // scanner.close();

        //Calculate the area of a rectangle
    //     double width = 0;
    //     double height = 0;
    //     double area = 0;

    //    // Scanner scanner = new Scanner(System.in); Already defined above 

    //     //Accepting user input
    //     System.out.print("\nYour width: ");
    //     width = scanner.nextDouble();

    //     System.out.print("Your height: ");
    //     height = scanner.nextDouble();

    //     area = width * height;

    //     System.out.println("Your area: " + area + "cm^2");

    //     scanner.close();

    //     //Build a Mad Lib Game
    //     String adjective1;
    //     String noun1;
    //     String adjective2;
    //     String verb1;
    //     String adjective3;

    //     System.out.print("\nEnter an adjective (description): ");
    //     adjective1 = scanner.nextLine();

    //     System.out.print("Enter a noun (animal or person): ");
    //     noun1 = scanner.nextLine();

    //     System.out.print("Enter an adjective (description): ");
    //     adjective2 = scanner.nextLine();

    //     System.out.print("Enter a verb ending with -ing (action): ");
    //     verb1 = scanner.nextLine();

    //     System.out.print("Enter an adjective (description): ");
    //     adjective3 = scanner.nextLine();
    //     System.out.println();

    //     System.out.print("\nToday I went to " + adjective1 + " zoo.");
    //     System.out.println("In an exihib, I saw a " + noun1 + ".");
    //     System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
    //     System.out.println("I was " + adjective3 + ".");

    //     scanner.close();

        //Shopping cart  

        // String item;
        // double price;
        // double total = 0;
        // int quantity;
        // char currency = 'R';

        // System.out.print("\nWhat item would you like to buy?: ");
        // item = scanner.nextLine();
    
        // System.out.print("What is the price for each?: ");
        // price = scanner.nextDouble();

        // System.out.print("How many would you like?: ");
        // quantity = scanner.nextInt();
        // System.out.println();

        // System.out.print("You have bought " + quantity + " " + item + "/s");
        // total += price * quantity;
        // System.out.print("\nYour total is " + currency + total);

        // scanner.close();

        //If statements
        // int age;

        // System.out.print("\nEnter your age: ");
        // age = scanner.nextInt();

        // if (age >= 18) {
        //     System.out.print("\nYou are an adult");

        // }else if (age < 0) {
        //     System.out.print("\nYou are not born yet");

        // }else if (age == 0) {
        //     System.out.print("You are still a baby");
        //   }
        // else {
        //     System.out.print("\nYou are still a minor");
        // }

        // scanner.close();

        /* We can generate a handful of Random data types using the Random class
           by first creatng a random object (same as scanner). 
        */
    //    Random rdm = new Random();

    //    boolean coin;

    //    System.out.print('\n');
    //    coin = rdm.nextBoolean();

    //    if (coin) {
    //     System.out.print("Heads");
    //    }
    //    else {
    //     System.out.print("Tails");
    //    }
        
        //Math module
        // System.out.print("\n");
        // System.out.print(Math.PI);

        // double result;

        // System.out.print("\n");
        // result = Math.pow(2, 4);
        // result = Math.sqrt(9);
        // //Same as in Python  except that this time you dont import Math class

        // System.out.print(result);

        //Calculate the Hypotenuse -> sqrt(a^2 + b^2)
        // double adjacent;
        // double opposite;
        // double hypotenuse = 0;

        // System.out.print("\n");
        // System.out.print("Enter an adjacent size: ");
        // adjacent = scanner.nextDouble();

        // System.out.print("Enter an opposite size: ");
        // opposite = scanner.nextDouble();

        // hypotenuse = Math.sqrt(Math.pow(adjacent, 2) + Math.pow(opposite, 2));
    
        // System.out.print("\nThe hypotenuse is: " + hypotenuse + "cm");

        //Given a radius of a circle, calculate the Circumference, Area, and Volume
        // circumference = 2 * pi * radius 
        // area = pi * radius^2
        // volume = (4.0 / 3.0) * pi * radius^3

        // double radius;
        // double circumference;
        // double area;
        // double volume;
        // //String measure = "cm";

        // System.out.print("\nEnter a radius: ");
        // radius = scanner.nextDouble();

        // circumference = 2 * Math.PI * radius;
        
        // area = Math.PI * Math.pow(radius, 2);

        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        // System.out.print("\n");
        // System.out.println("Using the radius provided, I managed to calculate: ");
        // System.out.printf("The circumference is: %.1fcm\n", circumference);
        // System.out.printf("The area is: %.3fcm^2\n", area);
        // System.out.printf("The volume is: %.1fcm^3\n", volume);

        //Dictionaries in Java. Also known as HashMaps
        // HashMap<String, Integer> employeeId = new HashMap<>();
        
        // //Inserting values inside my Dictionary
        // employeeId.put("David", 86534);
        // employeeId.put("Mike", 87332);    
        // employeeId.put("Samuel", 89665);

        // int result = employeeId.get("Mike");

        // System.out.print("\n");
        // System.out.print(result);

        // Cash register
        

      }
}
 