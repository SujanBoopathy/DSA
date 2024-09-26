package com.array;

/**
 * Print the elements which is greater than all the elements in right.
 */
public class LeadersInArray {
    public static void main(String args[]){
        int arr[] = {16, 17, 4, 3, 5, 2};

        //Approach 1
        for(int i=0;i<arr.length;i++){
            int j;
            for(j=i+1;j<arr.length;j++){
                if(arr[j] > arr[i]){
                    break;
                }
            }
            if(j==arr.length){
                System.out.print(" "+arr[i]);
            }
        }

        // Approach 2
        int n= arr.length;
        int max = arr[n-1];
        System.out.println();

        System.out.print(" "+max);
        for(int i=n-2;i>=0;i--){
            if(max < arr[i]){
                System.out.print(" "+arr[i]);
                max = arr[i];
            }
        }
    }
}
