package com.jz.datastructure;

import org.junit.Test;

/**
 * 二维数组数组长度都相同
 */
public class Matrix {
    /**
     *
     * @param mat
     * @param target
     * @return
     */
    public boolean findTargetInMatrix(int[][] mat,int target){
        if(mat==null||mat.length==0){
            return false;
        }
        int row = mat.length-1;
        int col = 0;
        while(col < mat[0].length&&row>=0){
            if(mat[row][col]==target){
                return true;
            }
            if(mat[row][col]>target){
                row--;
            }else{
                col++;
            }
        }
        return false;
    }

    @Test
    public void testMatrix(){
        int[][] mat = new int[3][3];
        mat[0]= new int[]{1,2,3};
        mat[1]= new int[]{4,5,6};
        mat[2]= new int[]{7,8,9};
        System.out.println();
        int target = 8;
        findTargetInMatrix(mat,target);
    }

}

