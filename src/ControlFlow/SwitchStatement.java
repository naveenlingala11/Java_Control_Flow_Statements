package ControlFlow;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 5: ");
        int num = scanner.nextInt();

        // Switch statement
        switch (num) {
            case 1:
                System.out.println("You selected One.");
                break;
            case 2:
                System.out.println("You selected Two.");
                break;
            case 3:
                System.out.println("You selected Three.");
                break;
            case 4:
                System.out.println("You selected Four.");
                break;
            case 5:
                System.out.println("You selected Five.");
                break;
            default:
                System.out.println("Invalid selection.");
        }
    }
}
