package com.missioncoding.iprep.ae.arrays;

import java.util.Arrays;

public class SmallestDifferenceBetween2Arrays {
    public static void main(String... args) {
        int[] arr1 = new int[]{-1, 5, 10, 20, 3};
        int[] arr2 = new int[]{26, 134, 135, 15, 17};
        approach1(arr1,arr2);
        approach2(arr1,arr2);
    }

    public static void approach1(int[] arr1,int[] arr2) {
        int diff = Integer.MAX_VALUE;
        int p1 = arr1[0], p2 = arr2[0];
        for (int i =0;i< arr1.length;i++) {
            for (int j = 0;j< arr2.length;j++) {
                int cdiff = Math.abs(arr1[i] - arr2[j]);
                if (cdiff < diff) {
                    diff = cdiff;
                    p1 = arr1[i];
                    p2 = arr2[j];
                }
            }
        }
        System.out.println(p1);
        System.out.println(p2);
    }

    public static void approach2(int[] arr1,int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0, j = 0;
        int[] smallestpair = new int[2];
        smallestpair[0] = arr1[0];
        smallestpair[1] = arr2[0];
        while (i < arr1.length && j < arr2.length) {
            if (Math.abs(arr1[i] - arr2[j]) == 0) {
                System.out.println(arr1[i]);
                System.out.println(arr2[i]);
                break;
            } else {
                if (arr1[i] > arr2[j]) {
                    smallestpair[1] = arr2[j];
                    j++;
                } else {
                    smallestpair[0] = arr1[i];
                    i++;
                }

            }
        }
        System.out.println(Arrays.toString(smallestpair));
    }
}
