package com.blz.ArrayConcepts;

public class LargestArray {
    public static void main(String[] args) {

        int[] array = {10, 50, 70, 20, 30, 20};
        int largestNumber = array[0];

        for (int i = 0; i < array.length; i++){
            if (array[i] > largestNumber) largestNumber = array[i];
        }
        System.out.println("Largest Number is : " +largestNumber);
    }
}
