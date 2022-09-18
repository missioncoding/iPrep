package com.missioncoding.iprep.arrays;

public class L11ContainerWithMostWater {
    public static void main (String... args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(approach1(height));
    }

    public static int approach1(int[] height) {
        int start = 0, end = height.length -1;
        int result = Integer.MIN_VALUE;
        while (start < end) {
            result = Math.max(result,Math.min(height[start],height[end])*(end-start));
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return result;
    }

}
