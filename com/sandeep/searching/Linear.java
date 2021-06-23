package com.sandeep.searching;

public class Linear {
    static int linearSearch(int [] array, int toFind){
        for(int i=0;i<array.length;i++){
            if(array[i] == toFind){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] array = new int[]{23,45,22,12,10,3,4,5,2};
        System.out.println(linearSearch(array,10));
    }
}
