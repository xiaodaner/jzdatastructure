package com.jz.datastructure;

import org.junit.Test;

public class SpiralOrder {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int rows = matrix.length, columns = matrix[0].length;
        int[] order = new int[rows * columns];
        int index = 0;
        int left = 0, right = columns - 1, top = 0, bottom = rows - 1;
        while (left <= right && top <= bottom) {
            for (int column = left; column <= right; column++) {
                order[index++] = matrix[top][column];
            }
            for (int row = top + 1; row <= bottom; row++) {
                order[index++] = matrix[row][right];
            }
            if (left < right && top < bottom) {
                for (int column = right - 1; column > left; column--) {
                    order[index++] = matrix[bottom][column];
                }
                for (int row = bottom; row > top; row--) {
                    order[index++] = matrix[row][left];
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return order;
    }
    @Test
    public void test(){
        int[][] matrix = new int[3][3];
        matrix[0]= new int[]{1,2,3};
        matrix[1]= new int[]{4,5,6};
        matrix[2]= new int[]{7,8,9};
        int[] ordered = spiralOrder(matrix);
        for (int i = 0; i <ordered.length ; i++) {
            System.out.println(ordered[i]);
        }
    }
}
