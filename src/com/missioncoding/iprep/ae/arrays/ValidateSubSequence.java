package com.missioncoding.iprep.ae.arrays;

public class ValidateSubSequence {
    public static void main(String... args) {
        int[] arr1 = new int[]{5, 1, 22, 25, 6, -1, 8, 10};
        int[] arr2 = new int[]{1, 6, -1, 10};
        approach1(arr1,arr2);
    }

    public static void approach1(int[] arr1, int[] arr2) {
        int seq = 0;
        for (int i =0;i<arr1.length;i++) {
            if (arr1[i] == arr2[seq]) {
                seq++;
            }
        }
        System.out.println(seq == arr2.length);
    }
}

