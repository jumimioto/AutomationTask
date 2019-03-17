package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        Scanner in = new Scanner(System.in);
        boolean exit = false;
        do {

            System.out.println("Write the number of exercise to be performed, to quit press 0;");
            int choice = in.nextInt();
            switch (choice) {
                case 0: exit =true;
                    break;
                case 1:
                    m.ex1();
                    break;
                case 2:
                    m.ex2();
                    break;
                case 3:
                    m.ex3();
                    break;
                case 4:
                    m.ex4();
                    break;
                case 6:
                    m.ex6();
                    break;
                case 5:
                    m.ex5();
                    break;
                case 7:
                    m.ex7();
                    break;
                case 8:
                    m.ex8();
                    break;
                case 9:
                    m.ex9();
                    break;
                default:
                    System.out.println("Invalid choice.");


            }
        }while (!exit );


    }
//Calculate sum of digits of integer (ex. in case of 123, sum of digits = 6). Write to console different messages based on results
//
//            a. sum can be divided by 2 and 5 without remainder
//
//            b. sum can be divided by 3 or 10 without remainder
    private void ex1() {

        System.out.println("Write an int:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
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
    private void ex2() {
        System.out.println("Write an int:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String Asnwer = (num % 2 == 0) ? "The int is even" : "The int is odd";
        System.out.println(Asnwer);
    }
// Iterate from 1 to given number and print even only numbers.
    private void ex3() {
        System.out.println("Write an int:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 0; i <= num; i++) {

            if (i % 2 == 0) {

                System.out.print(i + ", ");
            }
        }


    }
//    Calculate the average of three numbers.
    private void ex4()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Write three numbers to get thei average:");
        float num1 = in.nextFloat();
        float num2 = in.nextFloat();
        float num3 = in.nextFloat();
        float avg = (num1 + num2 + num3)/3;
        System.out.println("The average of those 3 numbers is: "+avg);

    }
//    Calculate sum of odd numbers from given range. Method should have
//    2 parameters - first and last numbers from range. Use "while" cycle
    private void ex5()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Write the range fromm which will be calculated the sum of odd numbers:");
        int min = in.nextInt();
        int max = in.nextInt();
        int sum = 0;
        for(int i = min;i<=max;i++)
        {
            if(i %2!=0)
            {
                sum+=i;
            }

        }
        System.out.println("The sum of odd numbers is: "+sum);
    }
//    Print to console name of day based on given number. Use switch statement
    private void ex6()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce number that you want to be converted in day ");
        int Day = in.nextInt();
        switch (Day){
            case 1:System.out.print("Monday");
                break;
            case 2:System.out.print("Tuesday");
                break;
            case 3:System.out.print("Wednesday");
                break;
            case 4:System.out.print("Thursday");
                break;
            case 5:System.out.print("Friday");
                break;
            case 6:System.out.print("Saturday");
                break;
            case 7:System.out.print("Sunday");
                break;
        }
    }
//    Method that prints matrix based on given size.
    private void ex7()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Write the parameters of matrix");
        int Width = in.nextInt();
        System.out.println("X");
        int  Height  = in.nextInt();
        for(int W =1;W<Width; W++)
        {
            System.out.print("1");
           if(W == Width-1 && Height>1 )
           {
               System.out.println("1");
               W = 0;
               Height--;
           }
           else {System.out.print("1");}
        }
    }
//     Print to console factorial of number 10
    private void ex8 ()
    {
        int num =10;
        long factorial = 1;
        for (int i =1;i <= num;i++)
        {
            factorial = factorial * i;
        }
        System.out.print("Factorial number of 10 is: "+factorial);
    }
//    Calculate if given number is a prime number
    private void ex9 ()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce a number: ");
        int num = in.nextInt();
        boolean prime = false;

        for(int i =2;i<num; i++)
        {
            if(num%i==0) {
                System.out.println("Given number is prime ");
                prime =true;
            }
        }
        if (!prime)
        {System.out.print("Given number is not prime ");}
    }

}
