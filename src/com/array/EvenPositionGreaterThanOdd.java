package com.array;

public class EvenPositionGreaterThanOdd {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,53,3,4,3,2,4,5,53,5,2,1,3,4,5,4,2,2};

        for (int i = 1; i < arr.length; i++) {
            if ((i + 1) % 2 == 0) {
                // Ensure arr[i] >= arr[i-1]
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            } else {
                if (arr[i] > arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
