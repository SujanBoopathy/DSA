package com.array;
import java.util.*;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startColumn = 0;
        int startRow = 0;
        int endColumn = matrix[0].length - 1;
        int endRow = matrix.length -1;
        List<Integer> result = new ArrayList<>();

        while(startColumn <= endColumn && startRow <= endRow){
            for(int i=startColumn;i<=endColumn;i++){
                result.add(matrix[startRow][i]);
            }
            for(int i=startRow+1;i<=endRow;i++){
                result.add(matrix[i][endColumn]);
            }
            for(int i=endColumn-1;i>=startColumn;i--){
                if(startRow == endRow){
                    break;
                }
                result.add(matrix[endRow][i]);
            }
            for(int i=endRow-1;i>=startColumn+1;i--){
                if(startColumn==endColumn){
                    break;
                }
                result.add(matrix[i][startColumn]);
            }
            startRow++;
            endRow--;
            startColumn++;
            endColumn--;

        }
        return result;
    }

    public static void main(String args[]){
        SpiralMatrix obj = new SpiralMatrix();

        List<Integer>  result = obj.spiralOrder(new int[][]{{1,2,3},{2,4,5},{3,5,6}});
        System.out.println(result);

    }

}
