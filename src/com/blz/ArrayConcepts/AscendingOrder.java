package com.blz.ArrayConcepts;

public class AscendingOrder {
    public static void main(String[] args) {

        int[] arr = {15, 10, 5, 20, 15};
        int temp = 0;

        System.out.println("Element of original array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(" ");

        System.out.println("Element of Array is Sorted in Ascending Order");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
