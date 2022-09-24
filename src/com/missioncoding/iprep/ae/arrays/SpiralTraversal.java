package com.missioncoding.iprep.ae.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralTraversal {
    public static void main(String... args) {
        int [][] arr = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        approach1(arr);
    }

    public static void approach1(int[][] arr) {
        int startrow = 0;
        int startcol = 0;
        int endrow = arr.length-1;
        int endcol = arr[0].length -1;
        List<Integer> output =  new ArrayList<>();
        int p = 0;
        while(startrow  <= endrow && startcol <= endcol) {
            for (int i = startcol;i <= endcol;i++) {
                output.add(arr[startrow][i]);
            }
            for (int i = startrow + 1;i <= endrow;i++) {
                output.add(arr[i][endcol]);
            }
            for (int i  = endcol-1;i >= startcol;i--) {
                if (startrow == endrow) break;
                output.add(arr[endrow][i]);
            }
            for (int i = endrow-1;i>startrow;i--) {
                if (startcol == endcol) break;
                output.add(arr[i][startcol]);
            }
            startrow++;
            startcol++;
            endcol--;
            endrow--;

        }
        System.out.println(output.toString());
    }
}
