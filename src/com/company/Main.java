package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write a program that will take an array of numbers and sum all the values
        // except the largest and smallest numbers.
        // e.g [10, 9, 2, 4]

        // Assignment Solution
        // Initialize scanner
//        Scanner scanner = new Scanner(System.in);
//
//        // Collect the size of the array from the user
//        System.out.print("How many numbers do you want to enter?: ");
////        int numberOfValues = scanner.nextInt();
//
//        // Use the value entered by the user to create the array
//        // of that size
//        int[] arrayOfNumbers = new int[scanner.nextInt()];
//
//        // Collect input from the user
//        for (int i = 0; i < arrayOfNumbers.length; i++) {
//            System.out.print("Enter the next number: ");
//            arrayOfNumbers[i] = scanner.nextInt();
//        }
//
//        // initialize the maximum
//        int max = 0;
//
//        // Find the maximum
//        for (int i = 0; i < arrayOfNumbers.length; i++) {
//            // if we encouter a value greater than the current
//            // value of the array then we exchange that
//            // and make that our new maximum
//            if (max < arrayOfNumbers[i]) {
//                max = arrayOfNumbers[i];
//            }
//        }
//        // [23, 46, 12, 89]
//        // initialize the minimum
//        int min = arrayOfNumbers[0];
//        // Find the minimum
//        for (int i = 0; i < arrayOfNumbers.length; i++) {
//            // if we encouter a value less than the current
//            // value of the array then we exchange that
//            // and make that our new minimum
//            if (min > arrayOfNumbers[i]) {
//                min = arrayOfNumbers[i];
//            }
//        }

//        System.out.println(max);
//        System.out.println(min);

        // initialize the sum variable
//        int sum = 0; // + 12 + 12 = 24

        // loop through the values and use an if statement to
        // add all the values except the min and max values
//        for (int i = 0; i < arrayOfNumbers.length; i++) {
            // if the value of the array at this point is
            // equal to the maximum or minimum value, it won't added
            // to the sum.

            // ||(OR) executes or returns true if at least one of the conditions
            // is true
            // &&(AND) executes or returns true if and only if both of the conditions are
            // true
//            if (arrayOfNumbers[i] != max && arrayOfNumbers[i] != min) {
//                sum += arrayOfNumbers[i];
//            }
//        }
//
//
//        System.out.println("The sum of the values excluding the max and min is: " + sum);

        // Date and Time
        // Methods & // Varargs
        // Classes and Objects & // Static methods and classes

        // Date - java.util.Date - returns everything date and time included
//        Date date = new Date();
//        System.out.println(date);
        // java.time
        LocalTime currentLocal = LocalTime.now();
        System.out.println(currentLocal);
        LocalDate currentDate = LocalDate.now(); // YYYY-mm-dd
        System.out.println(currentDate);

        Scanner scanner = new Scanner(System.in);

        System.out.print("What time did he get back?: ");
        LocalDate.of(2000, Month.APRIL, 1);

        System.out.println("He got back at " + LocalTime.parse(scanner.nextLine()));


    }
}
