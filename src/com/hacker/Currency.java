package com.hacker;

import java.io.*;
import java.util.*;
import java.text.*;

public class Currency {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		double amount = a.nextDouble();

		NumberFormat Usformat = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat ChinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat Franceformat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

		DecimalFormatSymbols symbols = new DecimalFormatSymbols(new Locale("en", "IN"));
		symbols.setCurrencySymbol("Rs.");
		DecimalFormat indiaFormat = (DecimalFormat) NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		indiaFormat.setDecimalFormatSymbols(symbols);

		String us = Usformat.format(amount);
		String China = ChinaFormat.format(amount);
		String india = indiaFormat.format(amount);
		String France = Franceformat.format(amount);

		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + China);
		System.out.println("France: " + France);

		a.close();
	}
}
