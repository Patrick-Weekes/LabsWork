package com.axa.labs09;

public class Token {
	private static int maxSpeed = 65;
    private int x;
    private int y;
    private Map map;

    public Token(int x, int y, Map map) {
        this.x = x;
        this.y = y;
        this.map = map;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean move(String direction, int distance) {
    	if (distance > maxSpeed) {
    		System.out.println("Please check data (too fast).");
    		return false;
		}
        direction = direction.toLowerCase();
        if (direction.equals("north") || direction.equals("n")) {
            y += distance;
        } else if (direction.equals("south") || direction.equals("s")) {
            y -= distance;
        } else if (direction.equals("east") || direction.equals("e")) {
            x += distance;
        } else if (direction.equals("west") || direction.equals("w")) {
            x -= distance;
        } else {
            System.out.println("Invalid direction.");
            return false;
        }

        x = Math.min(x, map.getXSize());
        y = Math.min(y, map.getYSize());
        x = Math.max(x, 0);
        y = Math.max(y, 0);

        return true;
    }

    public boolean move(int degrees, int distance) {
    	if (distance > maxSpeed) {
    		System.out.println("Please check data (too fast).");
    		return false;
		}
        if (degrees % 90 != 0) {
            double radians = Math.toRadians(degrees);
            x += (int) (distance * Math.cos(radians));
            y += (int) (distance * Math.sin(radians));
        } else {
            return move(convertDegreesToDirection(degrees), distance);
        }

        x = Math.min(x, map.getXSize());
        y = Math.min(y, map.getYSize());
        x = Math.max(x, 0);
        y = Math.max(y, 0);

        return true;
    }

    private String convertDegreesToDirection(int degrees) {
        if (degrees < 45 || degrees >= 315) {
            return "north";
        } else if (degrees >= 45 && degrees < 135) {
            return "east";
        } else if (degrees >= 135 && degrees < 225) {
            return "south";
        } else {
            return "west";
        }
    }
}
