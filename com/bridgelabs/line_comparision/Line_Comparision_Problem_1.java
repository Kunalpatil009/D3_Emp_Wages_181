package com.bridgelabs.line_comparision;

import java.util.Scanner;

public class Line_Comparision_Problem_1 {
    public static void main(String[] args) {
        System.out.println ("Welcome to line comparison computation programme");
        Scanner length = new Scanner (System.in);
        System.out.println ("Enter the 1st co-orinate of x1");
        double x1 = length.nextDouble ();
        System.out.println ("Enter the 2nd co-orinate of x2");
        double x2 = length.nextDouble ();
        System.out.println ("Enter the 1st co-orinate of y1");
        double y1 = length.nextDouble ();
        System.out.println ("Enter the 2nd co-orinate of y2");
        double y2 = length.nextDouble ();
        double a = (x2 - x1) * (x2 - x1);
        double b = (y2 - y1) * (y2 - y1);
        double length_of_line = Math.sqrt (a + b);
        System.out.println ("Length Of Line : " +length_of_line);
//        System.out.println("NOTE:- All Units Are In MM");
    }
    }

