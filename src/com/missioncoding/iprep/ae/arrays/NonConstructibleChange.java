package com.missioncoding.iprep.ae.arrays;

import java.util.Arrays;

public class NonConstructibleChange {
    public static void main(String... args) {
        int[] coins = new int[]{1,1,3};
        System.out.println(approach1(coins));
    }

    public static int approach1(int[] coins) {
        int change = 0;
        Arrays.sort(coins);
        for (int i =0;i<coins.length;i++ ) {
            if (coins[i] > change + 1) {
                return change + 1;
            } else {
                change = change + coins[i];
            }
        }
        return change + 1;
    }
}
