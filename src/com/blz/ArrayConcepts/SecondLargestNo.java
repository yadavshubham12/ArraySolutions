package com.blz.ArrayConcepts;

import java.util.Arrays;

public class SecondLargestNo {
    public static int getSecondLargestNum(int[] a, int num) {
        Arrays.sort(a);
        return a[num - 2];
    }

    public static void main(String[] args) {
        int[] arr = {10, 450, 120, 150, 200, 400, 1000};
        System.out.println("Second Largest :" + getSecondLargestNum(arr, 7));
    }
}
