package com.missioncoding.iprep.arrays;

import java.util.Arrays;

public class L75SortColors {
    public static void main(String... args) {
        int[] arr = new int[]{2, 0, 2, 1, 1, 0};
        approach1(arr);
    }

    public static void approach1(int[] arr) {
        int c0=0, c1=0,c2= arr.length-1;
        while (c1 <= c2) {
            if (arr[c1] == 0) {
                // swap with c1 element
                int tmp = arr[c1];
                arr[c1] = arr[c0];
                arr[c0] = tmp;
                c0++;
                c1++;
            } else if (arr[c1] == 1) {
                c1++;
            } else {
                int tmp = arr[c2];
                arr[c2] = arr[c1];
                arr[c1] = tmp;
                c2--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
