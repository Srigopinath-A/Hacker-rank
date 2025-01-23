package com.hacker;

import java.util.*;
class Matrix{
    public static void main(String [] args ){
        Scanner a = new Scanner (System.in);
        int row =  a.nextInt();
        int col = a.nextInt();
        
        int[][] matrix = new int  [row][col];
        
        for (int i =0 ; i<matrix.length;i++){
            for (int j =0 ; j < matrix[i].length;j++){
                matrix[i][j] = a.nextInt();
            }
        }
        
        for (int arr[]: matrix){
            for (int fi : arr){
                System.out.print(fi + " ");
            }
            System.out.println();
        }
    }
}