package com.array;

public class BasicOperation {
    private static int[] numArray;

    private static void print(){
        for(int i=0;i<10;i++){
            System.out.print(" "+numArray[i]);
        }
        System.out.println();
    }

    private static int search(int number){
        for(int i=0;i<10;i++){
            if(number == numArray[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        numArray = new int[10];

        for(int i=0;i<10;i++){
            numArray[i] = i * 10;
        }

        print();

        // replace the element at index 5
        numArray[5] = 400;

        print();

        System.out.println("element found at index :"+search(10));
    }
}
