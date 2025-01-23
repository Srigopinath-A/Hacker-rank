package com.hacker;

import java.util.Scanner;

public class Grading {
	public static void main(String [] args) {
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		int[]  arr = new int[n];
		int lower=0;
		int upper = 0;
		for (int i=0;i<arr.length;i++) {
			arr[i] = a.nextInt();
			if(arr[i] <= 38) {
				continue ;
			}
			
			lower = 5* (arr[i]/5);
			upper = lower  + 5 ; 
			
			int n1 = upper - arr[i];
			int n2 = arr[i] - lower;
			
			if(n1 < 3 ) {
				System.out.println(arr[i]+"has the nearest"+ upper);
			}else {
				System.out.println(arr[i]+"has the nearest"+ lower);
			}
		}
		
	}
}
