package com.company;

import java.util.Scanner;

public class Task1 {
    public static void calculate() {
        System.out.println();
        System.out.println("Task 1");
        System.out.println("Please input number. Input 0 to calculate sum");
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num == 0)
                break;

            sum += num;

        }

        System.out.println("The sum of numbers: " + sum);
    }

}




