package com.array;

public class OuterElementOfMatrix {
    public static void main(String args[]){
        //Input array
        int arr[][] = { {1,2,3,4},
                        {2,3,4,5},
                        {3,4,5,6}};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                //check for outer index of the matrix
                if((i==0 || i== arr.length-1) || (j==0 || j == arr[0].length-1)){
                    System.out.print(" "+arr[i][j]);
                }
            }
        }
    }
}
