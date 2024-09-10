package com.array;

public class LargestThreeElements {
    public static void main(String args[]){
        int[][] arr = {{10, 4, 3, 50, 23, 90},{ 6, 8, 9, 2, 1, 10},{4,34,90,87,344,2,30,5,3,999,99,111,322,787,453,879}};


        for(int j=0;j<arr.length;j++){
            int max1 = -1, max2 = -1, max3 = -1;
            for(int i=0;i<arr[j].length;i++){
                if(max1 < arr[j][i]){
                    max3 = max2;
                    max2 = max1;
                    max1 = arr[j][i];
                }
                else if(max2 < arr[j][i]){
                    max3 = max2;
                    max2 = arr[j][i];
                }
                else if(max3 < arr[j][i]){
                    max3 = arr[j][i];
                }
            }
            System.out.println("Array"+j+" - "+max1+", "+max2+", "+max3);
        }
    }
}
