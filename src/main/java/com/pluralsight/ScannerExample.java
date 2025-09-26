package com.pluralsight;


import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First Name: ");
        String firstName = scanner.nextLine();


        System.out.println("Age: ");
        int age = scanner.nextInt();

        System.out.println();
        System.out.println("Hi " + firstName);
        System.out.println("Your age is: " + age);







    }

}
