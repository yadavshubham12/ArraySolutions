package com.blz.ArrayConcepts;

public class Array {
    public static void main(String[] args) {
        double[] myList = { 2, 5, 8, 15};

        for (int i = 0; i < myList.length; i++){
            System.out.println(myList[i] + " ");
        }
        double total = 0;
        for (int i = 0; i < myList.length; i++){
            total = total + myList[i];
        }
        System.out.println("Total is : " +total);

        double max = myList[0];
        for (int i = 0; i < myList.length; i++){
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Max is : " + max);
    }
}
