package com.blz.ArrayConcepts;

public class OddNum {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < arr.length; i=i+2){
            System.out.println("Element of array is : " +arr[i]);
            if ((arr[i] % 2) != 0){
                System.out.println("Number is odd number : " +arr[i]);
            }
            else {
                System.out.println("Number is even number : " +arr[i]);
            }
        }
    }
}
