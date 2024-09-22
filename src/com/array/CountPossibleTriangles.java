package com.array;

import java.util.Arrays;

public class CountPossibleTriangles {
    public static void main(String args[]){
//        int arr[] = {10,3,5,6,2,1,9,8,7,11,23};
        int arr[]={10,21,22,100,101,200,300};
        int count = 0;
        Arrays.sort(arr);
        int n = arr.length;
        for(int i=0;i<n-2;i++){
            int k= i+2;
            for(int j= i+1;j<n;j++){
                while(k<n && arr[i]+arr[j] > arr[k]){
                    ++k;
                }
                if(k>j){
                    count += k -j -1;
                }
            }
        }
        System.out.println(count);
    }
}
