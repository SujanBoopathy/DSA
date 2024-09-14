package com.array;

public class MinMaxRearrange {

    public static void main(String args[]){
        //Input array
        int[] arr= {1,3,4,5,6,7,78,90,123,455,890,1111,2333,8990};

        int start = 0, end = arr.length -1;
        int[] tempArray = new int[arr.length];
        boolean flag = true;
        for(int i=0;i<arr.length;i++){
            if(flag){
                tempArray[i] = arr[end--];
            } else {
                tempArray[i] = arr[start++];
            }
            flag = !flag;
        }
        // output
        for(int i=0;i<arr.length;i++){
            System.out.print(tempArray[i]+" ");
        }
    }
}
