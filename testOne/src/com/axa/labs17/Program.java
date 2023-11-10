package com.axa.labs17;

public class Program {

	public static void main(String[] args) {
		Map map = new Map(500, 400);

        Token t1 = new Token(70, 30, map);
        Token t2 = new Token(200, 100, map);
        Token t3 = new Token(300, 250, map);

        System.out.println("Initial Coordinates:");
        printCoordinates(t1);
        printCoordinates(t2);
        printCoordinates(t3);

        t1.move("east", 100);
        t2.move("south", 50);
        t3.move("west", 200);

        System.out.println("\nNew Coordinates:");
        printCoordinates(t1);
        printCoordinates(t2);
        printCoordinates(t3);

        if (!t3.move("north", 200)) {
            System.out.println("The token has fallen off the map.");
            t3 = null;
        }

        t1.move("N", 50);
        t2.move(180, 30);

        System.out.println("\nFinal Coordinates:");
        printCoordinates(t1);
        printCoordinates(t2);
        printCoordinates(t3);
	}
	
    private static void printCoordinates(Token token) {
        if (token != null) {
            System.out.println("Token Coordinates: (" + token.getX() + ", " + token.getY() + ")");
        } else {
            System.out.println("Token is null.");
        }
    }

}
