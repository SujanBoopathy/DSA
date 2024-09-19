package com.array;

public class SumOfAllSubArray {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8};

        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i] * (i+1) * (arr.length-i);
        }
        System.out.println("Result-" + sum);
    }
}
