package com.hacker;

import java.util.ArrayList;
import java.util.Scanner;

public class Maxarry {

	static Scanner a = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Integer> inp = new ArrayList<>();
		while (true) {
			String val = a.nextLine();
			if (val.equalsIgnoreCase("end")) {
				break;
			}
			int add = Integer.parseInt(val);
			inp.add(add);
		}

		for (int arr : inp) {
			System.out.println(arr);
		}
		mac(inp);
	}

	public static void mac(ArrayList<Integer> inp) {
		int max = Integer.MIN_VALUE;
		int count = 0;
		for (int i = 0; i < inp.size(); i++) {
			if (inp.get(i) > max) {
				max = inp.get(i);
			}
		}
		for (int i = 0; i < inp.size(); i++) {
			if (inp.get(i) == max) {
				count++;
			}
		}
		System.out.println("The count is "+count);
	}
}