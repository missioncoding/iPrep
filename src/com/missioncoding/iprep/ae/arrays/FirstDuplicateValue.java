package com.missioncoding.iprep.ae.arrays;

import java.util.HashSet;

public class FirstDuplicateValue {
    public static void main(String... args) {
        int[] arr = new int[]{2,1,5,3,2,3,4};
        System.out.println(approach1(arr));
        System.out.println(approach2(arr));
        System.out.println(approach3(arr));
    }

    public static int approach1(int[] arr) {
        int min_index = arr.length;
        for (int i = 0;i< arr.length;i++ ) {
            for (int j = i + 1;j < arr.length;j++) {
                if (arr[i] == arr[j]) {
                    min_index = Math.min(min_index,j);
                }
            }
        }
        return arr[min_index];
    }
    public static int approach2(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i =0;i< arr.length;i++) {
            if (set.contains(arr[i])) {
                return arr[i];
            } else {
                set.add(arr[i]);
            }
        }
        return -1;
    }
    public static int approach3(int[] arr) {
        for (int i =0;i< arr.length;i++) {
            int temp = arr[i];
            int temp_index = Math.abs(temp) -1;
            if (arr[temp_index] < 0) {
                return Math.abs(temp);
            } else {
                arr[temp_index] = -arr[temp_index];
            }
        }
        return -1;
    }

}
