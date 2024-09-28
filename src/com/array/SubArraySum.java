package com.array;

import java.util.ArrayList;

public class SubArraySum {
    private static ArrayList<Integer> arraySum(int[] arr, int n,long sum)
    {

        // To store the result
        ArrayList<Integer> res = new ArrayList<>();

        // Flag to indicate if the subarray is found
        boolean flag = false;

        for (int i = 0; i < n; i++) {

            // Initialize the current sum
            int currentSum = arr[i];

            // Check if the single element is the sum
            if (currentSum == sum) {
                res.add(i + 1);
                res.add(i + 1);
                flag = true;
                break;
            }
            else {
                // Try all subarrays starting with 'i'
                for (int j = i + 1; j < n; j++) {
                    currentSum += arr[j];

                    if (currentSum == sum) {
                        res.add(i + 1);
                        res.add(j + 1);
                        flag = true;
                        break;
                    }
                }
                if (flag)
                    break;
            }
        }
        if (flag)
            return res;
        res.add(-1); // If no subarray is found
        return res;
    }

    public static void main(String args[]){
        int[] arr = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        long sum = 23;
        ArrayList<Integer> result
                = arraySum(arr, n, sum);
        for (int i : result)
            System.out.print(i + " ");
        }
    }


