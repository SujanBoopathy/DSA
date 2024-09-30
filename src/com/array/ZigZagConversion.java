package com.array;

public class ZigZagConversion {
    public static void main(String args[]){
        String word = "MEMBERTECHNICALSTAFF";

        int numOfRows = 4;
        int lengthOfStr = word.length();

        Character[][] tempArray= new Character[numOfRows][lengthOfStr];
        int height = 0;
        boolean travelDown = false;
        for(int i=0;i<lengthOfStr;i++) {
            tempArray[height][i] = word.charAt(i);

            if(height == 0 || height == numOfRows-1) {
                travelDown = !travelDown;
            }

            if(travelDown) {
                height += 1;
            } else {
                height -= 1;
            }
        }

        for(int i=0;i<numOfRows;i++) {
            for(int j=0;j<tempArray[0].length;j++) {
                if(tempArray[i][j] != null) {
                    System.out.print(tempArray[i][j]);
                }

            }
        }
    }
}
