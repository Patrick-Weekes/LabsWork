package com.axa.labs04;
import com.axa.test.methods;
import java.util.Scanner;
public class Lab4 {
	public void part1() {
        Scanner s = new Scanner(System.in);
        int price = methods.getInt("Price of a bag please.", s);
        int money = methods.getInt("How much money do you have?", s);
        if (price <= 0) {
			System.out.println("The price must be > 0");
		}
        else if (money <= 0) {
			System.out.println("You poor sod, come back with money");
		}
        else {
		    int numBags = money / price;
            System.out.printf("If the price is %dp and you have %dp then you will be able to buy %d bags", price, money, numBags);
        }
        s.close();
	}
}
