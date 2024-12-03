package Loops;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        // Do-while loop
        do {
            System.out.print("Enter a positive number (enter -1 to quit): ");
            number = scanner.nextInt();

            if (number != -1) {
                System.out.println("You entered: " + number);
            }
        } while (number != -1);

        System.out.println("Goodbye!");
    }
}
