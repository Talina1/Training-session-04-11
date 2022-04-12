package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task8 {
    static void calculate(){
        System.out.println();
        System.out.println("Task 8");

        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(arr));
        int sum = 6;
        int arr1[] = new int[sum];

        for (int i = 0; i < arr.length; i++){
            arr1[arr[i]]++;
        }
        for (int j = 0; j < arr.length; j++){
            if (arr1[sum - arr[j]] == 1){
                System.out.println("The sum of " + sum+ " can be reached by adding:" + " " + arr[j]+ "," + (sum - arr[j]));
            }
        }

    }
}
