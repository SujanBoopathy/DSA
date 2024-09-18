package com.array;

public class LeftRotateAndPrint {
    static void leftRotate(int arr[], int n, int k)
    {
        /* To get the starting point of
        rotated array */
        int mod = k % n;

        // Prints the rotated array from
        // start position
        for (int i = 0; i < n; ++i)
            System.out.print(arr[(i + mod) % n] + " ");

        System.out.println();
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 1, 3, 5, 7, 9 };
        int n = arr.length;

        int k = 2;

        // Function Call
        leftRotate(arr, n, k);

        k = 3;

        // Function Call
        leftRotate(arr, n, k);

        k = 4;

        // Function Call
        leftRotate(arr, n, k);
    }
}
