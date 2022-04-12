package com.company;

import java.util.Arrays;
import java.util.HashSet;

public class Task9 {
    public static int longest_sequence() {
        System.out.println();
        System.out.println("Task 9");
        int[] arr = {49, 1, 3, 200, 2, 4, 70, 5};
        int n = arr.length;

        System.out.println("The original array: " + Arrays.toString(arr));

        //  Sorter sorter = new Sorter();
        //  Sorter.sort(arr);

        //  System.out.println("The sorted array: " + Arrays.toString(arr));

        HashSet<Integer> h_set = new HashSet<Integer>();
        int ans = 0;
        for (int i = 0; i < n; ++i)
            h_set.add(arr[i]);

            for (int i = 0; i < n; ++i) {
                if (!h_set.contains(arr[i] - 1)) {

                    int j = arr[i];
                    while (h_set.contains(j))
                        j++;
                    if (ans < j - arr[i])
                        ans = j - arr[i];
                }
            }
        System.out.println("The longest consecutive elements sequence is: " + ans);
        return n;
    }
}




