package com.axa.labs17;

public class Submarine extends Token {
	private static final int maxSpeed = 15;
    private int depth;

    public Submarine(int x, int y, Map map) {
        super(x, y, map);
    }
    
    public int getDepth() {
        return depth;
    }

    public void dive(int howDeep) {
        depth += howDeep;
    }

    public void surface() {
        depth = 0;
    }
}


