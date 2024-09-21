package com.array;

public class SortInWaveForm {
    static void swap(int arr[],int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String args[]){
        int arr[] = {1,4,6,89,32,82,43,81,77,7,123};
        int n = arr.length;
        for(int i=0;i<n -1;i+=2){
            if(i>0 && arr[i-1] > arr[i]){
                swap(arr,i-1,i);
            }
            if(arr[i+1] > arr[i]) {
                swap(arr, i + 1, i);
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
