package com.missioncoding.iprep.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L1TwoSum {

    public static void main (String... args) {
        int[] arr = new int[]{2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(approach1(arr,target)));
    }

    public static int[] approach1(int[] arr, int target) {
        Map<Integer,Integer> indexMap = new HashMap<>();
        for (int i =0;i< arr.length;i++) {
            int lookup = target - arr[i];
            if (indexMap.containsKey(lookup)) {
                return new int[]{i,indexMap.get(lookup)};
            } else {
                indexMap.put(arr[i],i);
            }
        }
        return new int[]{};
    }
}
