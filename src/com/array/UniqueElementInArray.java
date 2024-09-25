package com.array;

public class UniqueElementInArray {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,2,3,4,1,5,6,6,7,7,8,9,8,9};

        int result = arr[0];
        for(int i=1;i<arr.length;i++){
            result ^= arr[i];
        }
        System.out.println("Unique element : "+result);
    }
}
