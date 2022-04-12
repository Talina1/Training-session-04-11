package com.company;

import java.util.Scanner;

public class Task4 {
    static void PrimeCheck() {
        System.out.println();
        System.out.println("Task 4");
        System.out.println("Please enter a number to check weather it's prime or not.");
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        boolean flag = false;

        if (num <= 1){
            System.out.println("I am interrupting work");
        return;
    }
        for (int i = 2; i <= num / 2; ++i){
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
