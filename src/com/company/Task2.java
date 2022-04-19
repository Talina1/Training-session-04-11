package com.company;

import java.util.Scanner;

public class Task2 {
    public static void calculate() {
        System.out.println();
        System.out.println("Task 2");

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        int input;

        do {
            System.out.println("Please enter number. Enter '0' to quit: ");
            input = scanner.nextInt();
            if (min < input)
                min = input;
            if (max > input)
                max = input;

        } while (input != 0);

        double sum = min + max;
        double avg = sum / 2;

        System.out.println("The sum of lowest and largest values is: " +sum + " and average value is: " + avg);

    }
}
