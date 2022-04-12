package com.company;

import java.util.Arrays;

public class Task6 {
    static void DuplicateCheck(){
        System.out.println();
        System.out.println("Task 6");
        int[] arr = new int[]{1, 2, 3, 4, 5, 1, 2};
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Duplicate elements in given array: ");
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}
