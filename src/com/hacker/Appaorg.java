package com.hacker;

import java.util.Scanner;

public class Appaorg {
	public static void main (String [] args) {
		Scanner inp = new Scanner (System.in);
		
		System.out.println("Enter the s distance");
		int s = inp.nextInt();
		System.out.println("Enter the t distance");
		int t = inp.nextInt();
		System.out.println("Enter the no of apple");
		int a = inp.nextInt();
		System.out.println("Enter the no of orange");
		int o = inp.nextInt();
		
		int[] apple = new int[a];
		int[] orange = new int[o];
		int capple = 0;
		int corange =0;
		for(int i=0 ;i<a;i++) {
			apple[i] = inp.nextInt();
			
			if(apple[i] >= s) {
				capple++;
			}
		}
		for(int i =0 ;i<o;i++) {
			orange[i] = inp.nextInt();
			
			if(orange[i] <= t) {
				corange++;
			}
		}
		System.out.println("The count of apple "+capple);
		System.out.println("The count of apple "+corange);
	}
}
