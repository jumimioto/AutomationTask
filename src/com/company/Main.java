package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Main InstanceMain = new Main();
        Scanner in = new Scanner(System.in);
        boolean exit = false;

        do {

            System.out.println("Write the number of exercise to be performed, to quit press 0;");

            int choice = acceptOnlyInt(in);
            switch (choice) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    sumDigits();
                    break;
                case 2:
                    showIfEvenOrOdd();
                    break;
                case 3:
                    showEven();
                    break;
                case 4:
                    showAverage();
                    break;
                case 6:
                    showDateBasedOnNumber();
                    break;
                case 5:
                    calculateOddSum();
                    break;
                case 7:
                    createMatrix();
                    break;
                case 8:
                    printFactorial();
                    break;
                case 9:
                    showIfPrime();
                    break;
                default:
                    System.out.println("Invalid choice.");


            }
        } while (!exit);


    }

    /**
     * if the input is not of int type a suggestion will appear to input a int
     */

    private static int acceptOnlyInt(Scanner keyboard) {
        int num;
        while (true) {

            try {
                num = keyboard.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("You may only enter integers");
                keyboard.nextLine();
            }
        }

        return num;
    }

    /**
     * Calculate sum of digits of integer (ex. in case of 123, sum of digits = 6). Write to console different messages based on results
     * a. sum can be divided by 2 and 5 without remainder
     * b. sum can be divided by 3 or 10 without remainder
     */

    private static void sumDigits() {

        System.out.println("Write an int:");
        Scanner in = new Scanner(System.in);
        int num = acceptOnlyInt(in);
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        if (sum % 2 == 0 && sum % 5 == 0) {
            System.out.println("sum can be divided by 2 and 5 without remainder");
        }
        if (sum % 3 == 0 || sum % 10 == 0) {
            System.out.println("sum can be divided by 3 or 10 without remainder");
        }
        System.out.println("The sum of digits is: " + sum);

    }

    /**
     * Print to console whether integer is odd or even. Use ternary operator ("short if")
     */

    private static void showIfEvenOrOdd() {
        System.out.println("Write an int:");
        Scanner in = new Scanner(System.in);
        int num = acceptOnlyInt(in);
        String answer = (num % 2 == 0) ? "The int is even" : "The int is odd";
        System.out.println(answer);
    }

    /**
     * Iterate from 1 to given number and print even only numbers.
     */

    private static void showEven() {
        System.out.println("Write an int:");
        Scanner in = new Scanner(System.in);
        int num = acceptOnlyInt(in);
        for (int i = 0; i <= num; i++) {

            if (i % 2 == 0) {

                System.out.print(i + ", ");
            }
        }


    }

    /**
     * Calculate the average of three numbers.
     */

    private static void showAverage() {
        Scanner in = new Scanner(System.in);
        System.out.println("Write three numbers to get thei average:");
        float num1 = acceptOnlyInt(in);
        float num2 = acceptOnlyInt(in);
        float num3 = acceptOnlyInt(in);
        float avg = (num1 + num2 + num3) / 3;
        System.out.println("The average of those 3 numbers is: " + avg);

    }

    /**
     * Calculate sum of odd numbers from given range. Method should have
     * 2 parameters - first and last numbers from range. Use "while" cycle
     */

    private static void calculateOddSum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Write the range fromm which will be calculated the sum of odd numbers:");
        int min = acceptOnlyInt(in);
        int max = acceptOnlyInt(in);
        int sum = 0;
        int i = min;
        while (i <= max) {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("The sum of odd numbers is: " + sum);
    }

    /**
     * Print to console name of day based on given number. Use switch statement
     */

    private static void showDateBasedOnNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce number that you want to be converted in day ");
        int day = acceptOnlyInt(in);
        String dayName = "No such number of day";
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
        }
        System.out.println(dayName);
    }

    /**
     * Method that prints matrix based on given size.
     */

    private static void createMatrix() {
        Scanner in = new Scanner(System.in);
        System.out.println("Write the parameters of matrix");
        int width = acceptOnlyInt(in);
        System.out.println("X");
        int height = acceptOnlyInt(in);
        for (int w = 1; w < width; w++) {
            System.out.print("1");
            if (w == width - 1 && height > 1) {
                System.out.println("1");
                w = 0;
                height--;
            } else {
                System.out.print("1");
            }
        }
    }

    /**
     * Print to console factorial of number 10
     */

    private static void printFactorial() {
        final int NUM = 10;
        long factorial = 1;
        for (int i = 1; i <= NUM; i++) {
            factorial = factorial * i;
        }
        System.out.print("Factorial number of 10 is: " + factorial);
    }

    /**
     * Calculate if given number is a prime number
     */

    private static void showIfPrime() {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce a number: ");
        int num = acceptOnlyInt(in);
        boolean prime = false;

        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                System.out.println("Given number is prime ");
                prime = true;
            }
        }
        if (!prime) {
            System.out.println("Given number is not prime ");
        }
    }

}
