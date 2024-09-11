package com.array;

public class SecondLargest {
    public static void main(String args[]){
        int arr[] = {1,3,4,9,504,849,38,93,90,123,345,6854,983};

        int max = -1, secondMax = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            } else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }
}
