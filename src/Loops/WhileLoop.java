package Loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to start counting down: ");
        int count = scanner.nextInt();

        // While loop
        System.out.println("Counting down:");
        while (count > 0) {
            System.out.println(count);
            count--;
        }
        System.out.println("Liftoff!");
    }
}
