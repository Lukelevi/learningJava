package samplepackage;
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter your age: ");
        age = scanner.nextInt();

        if (age >= 18) {
            System.out.print("\nYou are an adult");

        }else if (age < 0) {
            System.out.print("\nYou are not born yet");

        }else if (age == 0) {
            System.out.print("You are still a baby");
          }
        else {
            System.out.print("\nYou are still a minor");
        }
        
        scanner.close();
    }
}
