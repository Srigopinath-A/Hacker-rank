package com.hacker;

import java.util.Scanner;

public class Symbols {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		square(n);
		System.out.println("");
		halfrect(n);
		System.out.println("");
		uphalf(n);
		System.out.println("");
		tri(n);
		System.out.println("");
		upright(n);
		System.out.println("");
		rightri(n);
	}

	public static void square(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	public static void halfrect(int n) {
		for(int i =1; i<=n ;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void uphalf(int n) {
		for (int i=1;i<=n;i++) {
			for (int j = i;j<=n;j++) {
				System.out.print("  ");
			}
			for(int j = 1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void tri(int n) {
		for (int i =1;i<=n;i++) {
			for(int j = i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j =1 ;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	public static void upright(int n) {
		for(int i=1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j =i ; j<=n;j++) {
				System.out.print(" *");
			}
			System.out.println(" ");
		}
	}
	
	public static void rightri(int n) {
		for (int i=1;i<=n;i++) {
			for (int j = i;j<=n;j++) {
				System.out.print("  ");
			}
			for(int j = 1;j<i;j++) {
				System.out.print("* ");
			}
			for(int j = i;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
