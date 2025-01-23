package com.hacker;

import java.util.ArrayList;
import java.util.Scanner;

public class Camelcase {
	public static void main(String [] args) {
		Scanner a = new Scanner (System.in);
		String inp = a.nextLine();
		int word =  wordcount(inp);
		int cap = captical(inp);
		System.out.println(word +"\n"+cap);
	}
	
	public static int wordcount(String inp) {
		if(inp ==null || inp.isEmpty()) {
			return 0;
		}
		String[] line = inp.trim().split("\\s+");
		return line.length ;
	}
	public static int captical(String inp) {
		int count =0;
		for (int i=0;i<inp.length();i++) {
			char val = inp.charAt(i);
			if(val >= 'A' && val <= 'Z') {
				count ++;
			}
		}
		return count;
	}
}
