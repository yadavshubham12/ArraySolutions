package com.blz.ArrayConcepts;

public class FrequencyOfArray {
    public static void main(String[] args) {
        int [] arr = { 15, 10, 5, 20, 15};
        int [] fr = new int [arr.length];
        int visit = -1;
        for (int i = 0; i < arr.length; i++){
            int count = 1;
            for (int j = i+1; i < arr.length; j++){
                if (arr[j] == arr[i]){
                    count++;
                    fr[j] = visit;
                }
            }
            if(fr[i] != visit)
                fr[i] = count;
        }
        System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");
        for(int i = 0; i < fr.length; i++){
            if(fr[i] != visit)
                System.out.println("    " + arr[i] + "    |    " + fr[i]);
        }
        System.out.println("----------------------------------------");
    }
}
