package com.axa.test;

import java.util.Scanner;

public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		//System.out.println(methods.getInt("Enter an intager", s));
		//System.out.println(methods.getString("Enter a string", s));
		//s.close();
		//methods.theLunchQueue();
		methods.convertInputToStonesPounds(methods.getInt("How many pounds are you?", s));
		methods.convertKgsToStonesPounds(methods.getInt("How many Kgs are you?", s));
		s.close();
	}
	


}
