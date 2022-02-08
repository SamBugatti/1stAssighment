package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AssignmentOne {
    public void run() throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("C:/Users/acer/IdeaProjects/Java/src/file1.txt"));
        Scanner sc2 = new Scanner(new File("C:/Users/acer/IdeaProjects/Java/src/file2.txt"));
        int x, y;

        Shape firstShape = new Shape();
        while(sc1.hasNextLine()) {
            x = sc1.nextInt();
            y = sc1.nextInt();
            firstShape.addPoint(new Point(x, y));
        }
        firstShape.getPoints();
        firstShape.addDistance();
        System.out.println(firstShape.perimeter());
        System.out.println(firstShape.longestSide());
        System.out.println(firstShape.averageSide());

        Shape secondShape = new Shape();
        while(sc2.hasNextLine()) {
            x = sc2.nextInt();
            y = sc2.nextInt();
            secondShape.addPoint(new Point(x, y));
        }
        secondShape.getPoints();
        secondShape.addDistance();
        System.out.println(secondShape.perimeter());
        System.out.println(secondShape.longestSide());
        System.out.println(secondShape.averageSide());
    }
}