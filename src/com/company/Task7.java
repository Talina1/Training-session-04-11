package com.company;

import java.util.Arrays;

public class Task7 {
    static void calculate(){
        System.out.println();
        System.out.println("Task 7");
        int[] arr = new int[]{1, 2, 5, 10, 100, 12, 13, 199};
        System.out.println("Original array: " + Arrays.toString(arr));
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
        }
int dif = max - min;
        System.out.println("The difference between the maximum value and the minimum value is: " + dif);
    }
}
