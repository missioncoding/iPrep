package com.missioncoding.iprep.arrays;

// Problem is to print the length of the array without duplicates
public class RemoveDuplicatesFromArray {
    public static void main (String... args) {
        int[] arr = new int[]{2, 3, 3, 4, 5, 6, 6};
        System.out.println(approach1(arr));
        System.out.println(approach2(arr));
    }

    public static int approach1(int[] arr) {
        int final_length = 0;
        for (int i = 0; i< arr.length;i++) {
            if (i == 0) final_length++;
            else if (arr[i] != arr[i-1]) {
                final_length++;
            }
        }
        return final_length;
    }

    public static int approach2(int[] arr) {
        int final_length = arr.length;
        if (arr.length <= 1) return final_length;
        for (int i = 0,j=1;i < arr.length && j < arr.length;) {
            if (arr[i] == arr[j]) {
                j++;
                i++;
                final_length--;
            } else {
                i++;j++;
            }
         }
        return final_length;
    }
}


