package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    static void calculate(){
        System.out.println();
        System.out.println("Task 10");
        Scanner scanner = new Scanner(System.in);

        int [] myArray = new int[] {2, 4, 6, 8, 10};
        System.out.println("Please provide multiplier: ");
        int multiplier = scanner.nextInt();
        System.out.println("Original Array: " + Arrays.toString(myArray));

        for (int i = 1; i < myArray.length - 1; i++) {
            myArray[i] = myArray[i] * multiplier;
        }

        System.out.println("Multiplied array: " + Arrays.toString(myArray));

        }
    }

