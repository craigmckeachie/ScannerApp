package com.pluralsight;


import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First Name: ");
        String firstName = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Hi " + firstName);


    }

}
