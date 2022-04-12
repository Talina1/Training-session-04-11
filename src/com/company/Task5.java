package com.company;

public class Task5 {
    static void FrequencyCheck(){
        System.out.println();
        System.out.println("Task 5");
        int[] arr = new int[]{1, 9, 10, 6, 5, 7, 6, 4, 1, 3, 5, 3, 5, 9, 4, 5, 6, 4, 8, 8, 2, 1};
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

        int[] fr = new int[arr.length];
        int visited = -1;
        for (int i = 0; i < arr.length; i++){
            int count = 1;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    count++;
                    fr[j] = visited;
                }
            }
            if (fr[i] != visited)
                fr[i] = count;
        }
        System.out.println("________________________");
        System.out.println(" Element | Frequency");
        System.out.println("________________________");
        for (int i = 0; i < fr.length; i++){
            if(fr[i] != visited)
                System.out.println("   " + arr[i] + "     |     " + fr[i]);
        }
        System.out.println("________________________");
    }

}
