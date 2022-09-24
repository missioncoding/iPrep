package com.missioncoding.iprep.ae.arrays;

import java.util.Arrays;

public class ProductArrays {
    public static void main(String... args) {
        int[] arr = new int[]{1,2,3,4,5};
        approach1(arr);
        approach2(arr);
        approach3(arr);
    }

    public static void approach1(int[] arr){
        int[] output = new int[arr.length];
        Arrays.fill(output,1);
        for (int i = 0;i< arr.length;i++) {
            for (int j = 0;j< arr.length;j++) {
                if (i == j) continue;
                output[i] = output[i]*arr[j];
            }
        }
        System.out.println(Arrays.toString(output));
    }
    public static void approach2(int[] arr) {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        int[] output = new int[arr.length];
        Arrays.fill(left,1);
        Arrays.fill(right,1);
        Arrays.fill(output,1);
        int product = 1;
        for (int i =0;i< arr.length;i++) {
            left[i] = product;
            product = product * arr[i];
        }
        product = 1;
        for (int i = arr.length-1;i>=0;i--) {
            right[i] = product;
            product = product * arr[i];
        }
        for (int i =0;i< arr.length;i++) {
            output[i] = left[i] * right[i];
        }

        System.out.println(Arrays.toString(output));
    }
    public static void approach3(int[] arr) {
        int[] left = new int[arr.length];
        int[] output = new int[arr.length];
        Arrays.fill(left,1);
        Arrays.fill(output,1);
        int product = 1;
        for (int i =0;i< arr.length;i++) {
            left[i] = product;
            product = product * arr[i];
        }
        product = 1;
        for (int i = left.length -1 ;i>=0;i--) {
            output[i] = product * left[i];
            product = product * arr[i];
        }
        System.out.println(Arrays.toString(output));
    }
}
