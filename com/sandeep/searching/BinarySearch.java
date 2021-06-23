package com.sandeep.searching;

public class BinarySearch {
    static int binarySerarchAlgo(int [] array, int toFind,int start,int end){
        int mid =  (end + start)/2;
        if(array[mid] == toFind){
            return mid;
        }else if(array[mid]>toFind){
            return binarySerarchAlgo(array,toFind,0,mid);
        }else if(array[mid]<toFind){
            return binarySerarchAlgo(array,toFind,mid+1,end);
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[] = new int[]{3,6,8,9,12,15,27};
        System.out.println(binarySerarchAlgo(array,27,0,array.length-1));
    }
}
