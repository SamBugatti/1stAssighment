package com.company;

import java.util.ArrayList;
import java.util.List;

public class Shape {
    ArrayList<Point> points = new ArrayList<>();
    ArrayList<Double> distance = new ArrayList<>();

    public void addDistance () {
        for (int i = 0; i < points.size()-1; i++) {
            if(i==points.size()-1){
                distance.add(distance.size()-1,points.get(points.size()-1).distance(points.get(0)));
            }
            else
                distance.add(i,points.get(i).distance(points.get(i+1)));
        }
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    public List<Point> getPoints() {
        return points;
    }

    public double perimeter() {
        double sum = 0;
        for (int i = 0; i < distance.size(); i++) {
            sum+=distance.get(i);
        }
        return sum;
    }

    public double longestSide() {
        double max = distance.get(0);
        for (double distance: distance) {
            if (distance > max) {
                max = distance;
            }
        }
        return max;
    }

    public double averageSide() {
        return perimeter() / points.size();
    }
}
