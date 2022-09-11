package com.missioncoding.iprep.arrays;

// problem is to move the duplicates  to end of an array and return the length of array
public class L26MoveDuplicates {
    public static void main (String... args) {
        int[] arr = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(approach1(arr));
    }

    public static int approach1(int[] arr) {
        int resIndex = 0, currIndex = 1;
        while (currIndex < arr.length) {
            if (arr[currIndex] != arr[resIndex]) {
                resIndex ++;
                arr[resIndex] = arr[currIndex];
            }
            currIndex++;
        }
        return resIndex + 1;
    }
}
