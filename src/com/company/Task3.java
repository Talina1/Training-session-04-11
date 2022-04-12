package com.company;

import java.util.Scanner;

public class Task3 {
    static void calculate() {
        System.out.println();
        System.out.println("Task 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number to retrieve all divisors: ");

        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                System.out.println(i);
            }
        }



    }
}
