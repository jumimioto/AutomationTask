package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main InstanceMain = new Main();
        Scanner in = new Scanner(System.in);
        boolean exit = false;

        do {

            System.out.println("Write the number of exercise to be performed, to quit press 0;");

            int choice = InstanceMain.Exception(in);
            switch (choice) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    InstanceMain.Ex1();
                    break;
                case 2:
                    InstanceMain.Ex2();
                    break;
                case 3:
                    InstanceMain.Ex3();
                    break;
                case 4:
                    InstanceMain.Ex4();
                    break;
                case 6:
                    InstanceMain.Ex6();
                    break;
                case 5:
                    InstanceMain.Ex5();
                    break;
                case 7:
                    InstanceMain.Ex7();
                    break;
                case 8:
                    InstanceMain.Ex8();
                    break;
                case 9:
                    InstanceMain.Ex9();
                    break;
                default:
                    System.out.println("Invalid choice.");


            }
        } while (!exit);


    }

    //Calculate sum of digits of integer (ex. in case of 123, sum of digits = 6). Write to console different messages based on results
//
//            a. sum can be divided by 2 and 5 without remainder
//
//            b. sum can be divided by 3 or 10 without remainder
    private int Exception(Scanner keyboard) {
        int num ;
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

    private void Ex1() {

        System.out.println("Write an int:");
        Scanner in = new Scanner(System.in);
        int num = Exception(in);
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

    // Print to console whether integer is odd or even. Use ternary operator ("short if")
    private void Ex2() {
        System.out.println("Write an int:");
        Scanner in = new Scanner(System.in);
        int num = Exception(in);
        String answer = (num % 2 == 0) ? "The int is even" : "The int is odd";
        System.out.println(answer);
    }

    // Iterate from 1 to given number and print even only numbers.
    private void Ex3() {
        System.out.println("Write an int:");
        Scanner in = new Scanner(System.in);
        int num = Exception(in);
        for (int i = 0; i <= num; i++) {

            if (i % 2 == 0) {

                System.out.print(i + ", ");
            }
        }


    }

    //    Calculate the average of three numbers.
    private void Ex4() {
        Scanner in = new Scanner(System.in);
        System.out.println("Write three numbers to get thei average:");
        float num1 = Exception(in);
        float num2 = Exception(in);
        float num3 = Exception(in);
        float avg = (num1 + num2 + num3) / 3;
        System.out.println("The average of those 3 numbers is: " + avg);

    }

    //    Calculate sum of odd numbers from given range. Method should have
//    2 parameters - first and last numbers from range. Use "while" cycle
    private void Ex5() {
        Scanner in = new Scanner(System.in);
        System.out.println("Write the range fromm which will be calculated the sum of odd numbers:");
        int min = Exception(in);
        int max = Exception(in);
        int sum = 0;
        for (int i = min; i <= max; i++) {
            if (i % 2 != 0) {
                sum += i;
            }

        }
        System.out.println("The sum of odd numbers is: " + sum);
    }

    //    Print to console name of day based on given number. Use switch statement
    private void Ex6() {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce number that you want to be converted in day ");
        int day = Exception(in);
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

    //    Method that prints matrix based on given size.
    private void Ex7() {
        Scanner in = new Scanner(System.in);
        System.out.println("Write the parameters of matrix");
        int width = Exception(in);
        System.out.println("X");
        int height = Exception(in);
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

    //     Print to console factorial of number 10
    private void Ex8() {
        int num = 10;
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.print("Factorial number of 10 is: " + factorial);
    }

    //    Calculate if given number is a prime number
    private void Ex9() {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce a number: ");
        int num = Exception(in);
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
