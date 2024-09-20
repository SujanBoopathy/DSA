package com.array;

public class PrintLeftRotation {

    static void leftRotate(int arr[],int position){
        int n = arr.length;
        /* To get the starting point of
        rotated array */
        int mod = position % n;

        // Prints the rotated array from
        // start position
        for (int i = 0; i < n; ++i)
            System.out.print(arr[(i + mod) % n] + " ");

        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {1,3,4,5,6,7,8,9,13,45};

        leftRotate(arr,3);

        leftRotate(arr,5);
    }
}
