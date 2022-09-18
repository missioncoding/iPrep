package com.missioncoding.iprep.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L15_3SUM {
    public static void main(String... args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        int target = 0;
        approach1(nums,target);
    }

    public static void approach1(int[] nums,int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int left,right;
        for (int i = 0;i<nums.length;i++) {
            left = i +1;
            right = nums.length - 1;
            while (left < right) {
                int cs = nums[i] + nums[left] + nums[right];
                if (cs == target) {
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while (left < right && nums[left] == nums[left+1]) left++;
                    while (left < right && nums[right] == nums[right--]) right--;
                }
                if(cs > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        System.out.println(result);
    }
}
