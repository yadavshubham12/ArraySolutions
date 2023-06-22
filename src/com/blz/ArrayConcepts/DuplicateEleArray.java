package com.blz.ArrayConcepts;

public class DuplicateEleArray {
    public static void main(String[] args) {
        int[] array = {100, 200, 50, 20, 70, 20, 100, 80};
        System.out.println("Duplicate element in given array");

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[j]);
                }
            }
        }
    }
}
