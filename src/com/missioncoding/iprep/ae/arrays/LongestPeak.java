package com.missioncoding.iprep.ae.arrays;

public class LongestPeak {
    public static void main(String... args) {
        //int[] arr = new int[]{1,2,3,3,4,0,10,6,5,-1,-3,2,3}; // ans is 6
        int[] arr = new int[]{1,2,3}; // ans is -1
        System.out.println(approach(arr));
    }

    public static int approach(int[] arr) {
        if (arr.length < 3) return -1;
        int max_peak = 0;

        for (int i = 1;i< arr.length-1;i++) {
            if (arr[i-1] < arr[i] && arr[i+1] < arr[i]) {
                int curr_peak =1;
                for (int j = i-1;j>=0;j--) {
                    if (arr[j] < arr[j+1]) {
                        curr_peak ++;
                    } else {
                        break;
                    }
                }
                for (int k=i+1;k< arr.length;k++) {
                    if (arr[k] < arr[k-1]) {
                        curr_peak ++;
                    } else {
                        break;
                    }
                }
                max_peak = Math.max(max_peak,curr_peak);
            } else {
                continue;
            }
        }
        return max_peak;

    }
}
