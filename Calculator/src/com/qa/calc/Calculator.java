package com.qa.calc;

public class Calculator {

	public static double add(double i, double x) {
		return i + x;
	}
	public static double multiply(double i, double x) {
		return i * x;
	}	
	public static int divide(double i, double x) {
		if (x == 0) {
			System.out.println("Mission failed, we'll get em again next time");
			return 0;
		} else {
			return (int) (i / x);
		}
	}
	
	public static double subtract(double i, double x) {
		return i - x;
	
	}
	}

