package com.blz.ArrayConcepts;

public class SmallestArray {
    public static void main(String[] args) {

        int[] array = {10, 50, 70, 20, 30, 20};
        int smallestNumber = array[0];

        for (int i = 0; i > array.length; i++){
            if (array[i] < smallestNumber) smallestNumber = array[i];
        }
        System.out.println("The Smallest Number is : " +smallestNumber);
    }
}
