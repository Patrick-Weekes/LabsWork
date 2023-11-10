package com.axa.test;

import java.util.Scanner;

public class methods {
	public static int getInt(String prompt, Scanner s) {
		System.out.println(prompt);
		int result = s.nextInt();
		s.nextLine();
		return result;
	}
	
	public static String getString(String prompt, Scanner s) {
		System.out.println(prompt);
		return s.nextLine();
	}
	
	public static void theLunchQueue() {
		Scanner s = new Scanner(System.in);
		String mainCourse = getString("What main dish would you like(Fish, Burgers or veg)?", s);
		int potatoes = getInt("How many roast potatoes would you like?", s);
		int sprouts = getInt("How many Brussel Sprouts would you like?", s);
		System.out.println("Your lunch is " + mainCourse + " with " + potatoes + " roast potatoes and " + sprouts + " Brussel Sprouts");
	    s.close();
	}
	
	public static void convertInputToStonesPounds(int pounds) {
		int stones = pounds / 14;
		int remainder = pounds % 14;
		System.out.println("You weigh " + stones + " stones and " + remainder + " pounds.");
	}
	
	public static void convertKgsToStonesPounds(int kg) {
		double pounds = kg * 2.20462;
		convertInputToStonesPounds((int)pounds);
	}
}
