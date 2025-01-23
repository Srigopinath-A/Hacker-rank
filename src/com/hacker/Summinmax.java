package com.hacker;

import java.lang.reflect.Array;
import java.util.*;

public class Summinmax {
	static Scanner a = new Scanner(System.in);
	public static void main(String [] args) {
		
		ArrayList<Integer> sum = new ArrayList<Integer>() ;
		
		
		while (true) {
			String inp = a.nextLine();
			if(inp.equalsIgnoreCase("end")) {
				break;
			}
			int val = Integer.parseInt(inp);
			sum.add(val);
		}
		
		for(int show : sum) {
			System.out.println(show);
		}
		minmax(sum);
	}
	
	public static void minmax(ArrayList<Integer> sum) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for( int num : sum) {
			if(num < min) {
				min = num;
			}
			if(num > max) {
				max = num;
			}
		}
		
		System.out.println(min +" "+ max);
		
		}
	}
