package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Rebecca Pina Partidas
 */

//Libraries
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int max = 0;

        // Compares 3 numbers and determines the largest number
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        // Exits program if numbers equal each other
        if (num1 == num2)
        {
            System.exit(0);
        }
        else if (num1 == num3)
        {
            System.exit(0);
        }
        else if (num2 == num3)
        {
            System.exit(0);
        }

        // Finds largest number
        if (num1 > num2 && num1 > num3)
        {
            max = num1;
        }

        if (num2 > num1 && num2 > num3)
        {
            max = num2;
        }

        if (num3 > num1 && num3 > num2)
        {
            max = num3;
        }

        System.out.printf("The largest number is %d.", max);
    }
}
