package com.company;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(getX() - point.getX(), 2) + Math.pow(getY() - point.getY(), 2));
    }

    @Override
    public String toString() {
        return String.format("%d %d", x, y);
    }
}