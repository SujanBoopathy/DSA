package com.array;

public class RearrangeArray {
    private static void fixArray(int arr[],int n){
        Set<Integer> set = new HashSet<>();
        for(Integer i : arr){
            set.add(i);
        }
        for(int i=0;i<arr.length;i++){
            if(set.contains(i)){
                arr[i]=i;
            } else{
                arr[i]=-1;
            }
        }        
    }


    public static void main(String args[]){
        int n, ar[] = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
        n = ar.length;
        // Function Call
        fixArray(ar, n);

        for(Integer i : ar){
            System.out.print(" "+i);
        }
    }
}
