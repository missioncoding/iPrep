package com.missioncoding.iprep.ae.arrays;

import java.util.Arrays;

public class SortedSquaredArray {
    public static void main(String[] args) {
        int[] arr = new int[]{-10,-9,-5, 1, 2, 3, 5, 6, 8, 9};
        approach1(arr);
    }

    public static void approach1(int[] arr) {
        int left=0,right= arr.length -1;
        int[] resultArray = new int[arr.length];
        int i = resultArray.length -1;
        while (left <= right) {
            if (Math.abs(arr[left]) >= Math.abs(arr[right])) {
                resultArray[i] = arr[left] * arr[left];
                left ++;
            } else {
                resultArray[i] = arr[right] * arr[right];
                right --;
            }
            i--;
        }
        System.out.println(Arrays.toString(resultArray));
    }
}
