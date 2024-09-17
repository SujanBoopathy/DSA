package com.array;

public class RotateArray {
    public static void main(String args[]){
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 3;

        if(d == 0 ){
            return;
        }

        d = d% arr.length;
        rotateArray(arr,0,d-1);
        rotateArray(arr,d,arr.length -1 );
        rotateArray(arr,0,arr.length -1 );

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    private static void rotateArray(int arr[],int start ,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
