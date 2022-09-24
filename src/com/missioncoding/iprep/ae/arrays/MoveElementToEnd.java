package com.missioncoding.iprep.ae.arrays;

import java.util.Arrays;

public class MoveElementToEnd {
    public static void main(String... args) {
        int[] arr = new int[]{2,1,2,2,2,3,4,2};
        int toMove = 2;
        approach1(arr,toMove);
    }

    public static void approach1(int[] arr,int toMove) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] == toMove && arr[j] != toMove) {
                //swap both
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else if(arr[j] == toMove ) j--;
            else if(arr[i] != toMove) i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
