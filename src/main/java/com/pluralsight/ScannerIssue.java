package com.pluralsight;

import java.util.Scanner;

public class ScannerIssue {


//   !!!!WARNING
//   If you read a number and then after that you read a string, the string will be empty.
    // FIX: add this line of code: scanner.nextLine(); //eat the new line
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Number: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Second Number: ");
        double secondNumber = scanner.nextDouble();

        System.out.println("What operator should I use: (A) Add, (B) Subtract");
//        String newLine = scanner.nextLine();
        scanner.nextLine(); //eat the new line
        String operator = scanner.nextLine();

        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(operator);


    }
}
