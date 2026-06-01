/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simplecalculator;
import java.util.Scanner;

/**
 *
 * @author Rutvi PANCHAL
 */
public class SimpleCalculator {

 public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== Simple Calculator ===");

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.println("\nChoose Operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        System.out.print("Enter choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result = " + (num1 + num2));
                break;

            case 2:
                System.out.println("Result = " + (num1 - num2));
                break;

            case 3:
                System.out.println("Result = " + (num1 * num2));
                break;

            case 4:
                if (num2 != 0) {
                    System.out.println("Result = " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;

            default:
                System.out.println("Invalid choice.");
        }

        input.close();
    }
}
