package com.array;

import java.util.HashSet;
import java.util.Set;

public class PrintDistinctElements {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,10,8393,23,23,12,12,34,1,2,3,4,5};
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                System.out.print(arr[i]+" ");
            }
        }
    }
}
