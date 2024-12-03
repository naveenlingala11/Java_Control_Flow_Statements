package Loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // For loop
        System.out.println("The first " + n + " numbers are:");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
