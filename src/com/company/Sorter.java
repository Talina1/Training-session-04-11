package com.company;

public class Sorter {
    static void sort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int index = i;

            // Loop through array to find the smallest number and set the position to index
            for (int j = i + 1; j < arr.length; j++) {
                // Check if item in index J is less than item in index [index]
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            // Assign smallest number at particular iteration to variable smaller number
            int smallerNumber = arr[index];

            // Copy value of current item to index of smaller item
            arr[index] = arr[i];
            // Copy value of smaller item to current index
            arr[i] = smallerNumber;

        }
    }
}
