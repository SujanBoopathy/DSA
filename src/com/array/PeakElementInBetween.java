package com.array;
// Find the peak element which is greater than , both of the elements at left and right of the array;
public class PeakElementInBetween {

    public static void main(String args[]){
        int arr[] = {1,3,90,89,78,34,9393,234,5,54,2,2,3939,4,4,5,6,1888282,5,5,5,5,5,5,90,90,98393};

        int max = -1;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]> arr[i-1] && arr[i] > arr[i+1] && max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Peak Element : "+max);
    }
}
