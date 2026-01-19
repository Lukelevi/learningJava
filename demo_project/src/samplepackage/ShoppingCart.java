package samplepackage;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        String item;
        double price;
        double total = 0;
        int quantity;
        char currency = 'R';

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nWhat item would you like to buy?: ");
        item = scanner.nextLine();
    
        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();
        System.out.println();

        System.out.print("You have bought " + quantity + " " + item + "/s");
        total += price * quantity;
        System.out.print("\nYour total is " + currency + total);

        scanner.close();
    }
}
