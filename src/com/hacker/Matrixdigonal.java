package com.hacker;

import java.util.Scanner;

public class Matrixdigonal {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the r*c value");
		int row = a.nextInt();
		int col = a.nextInt();
		int[][] matrix = new int[row][col];
		
		for(int i=0;i<matrix.length;i++) {
			for(int j =0 ; j < matrix[i].length;j++) {
				System.out.println(i+""+j);
				matrix[i][j] = a.nextInt();
			}
		}
		
		show(matrix);
		diagonal(row,matrix);
	}
	
	public static void show(int[][] matrix) {
		for(int[] arr:matrix) {
			for(int val : arr) {
				System.out.print(val);
			}
			System.out.println();
		}
	}
	
	public static void diagonal(int row ,int[][] matrix) {
		int left = 0;
		int right = 0 ;
		for(int i =0 ;i<matrix.length;i++) {
			left += Math.abs(matrix[i][i]);
			right += Math.abs(matrix[i][row-i-1]);
		}
		System.out.println("Left :"+ left +"\n"+"right :"+ right);
	}
	
}
