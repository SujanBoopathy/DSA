package com.array;

public class SegregateEvenOddNumber {
    public static void main(String args[]){
        int arr[] = {1, 3, 2, 4, 7, 6, 9, 10};

        int k = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                k++;

                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
