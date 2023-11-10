package com.axa.labs05;
import com.axa.test.methods;
import java.util.Scanner;

public class Lab5 {
	
	public void grades() {
		Scanner s = new Scanner(System.in);
		int mark = methods.getInt("Enter a mark", s);
		if (mark < 1 || mark > 100) {
			System.out.println("Error: marks MUST be between 1 and 100");
		} else if (mark < 50) {
			System.out.println("Fail");
		} else if (mark < 61) {
			System.out.println("Pass");
		} else if (mark < 71) {
			System.out.println("Merit");
		} else {
			System.out.println("Distinction");
		}
		s.close();
	}
	
	public void part2() {
		Scanner s = new Scanner(System.in);
		boolean summer = methods.getString("Is it summer?", s).equals("yes");
		boolean evening = methods.getString("Is it early evening?", s).equals("yes");
		System.out.println("Take a shower");
		System.out.println("Contact friends");
		if (evening) {
		    System.out.println("Eat " + (summer ? "outside" : "inside"));
		    System.out.println("Do " + (summer ? "outdoors hobby" : "Take a walk"));
		} else {
		    System.out.println("Eat inside");
		    if (summer) {
		        System.out.println("Do outdoors hobby");
		    }
		}
	}

}
