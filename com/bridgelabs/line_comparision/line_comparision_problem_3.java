package com.bridgelabs.line_comparision;

import static java.lang.Math.sqrt;

public class line_comparision_problem_3 {
    public static void main(String[] args) {
        int x1 = 10, x2 = 21, x3 = 12, x4 = 20, y1 = 18,  y2 = 16, y3 = 8, y4 = 16;

        double Length_1 = sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        System.out.println("Length_1 is :" + Length_1);
        double Length_2 = sqrt((x4 - x3) ^ 2 + (y4 - y3) ^ 2);
        System.out.println("Length_2 is :" + Length_2);
        if (Length_1 < Length_2) {
            System.out.println("length2 is greater than length1");
        } else  {
            System.out.println("length1 is greater than length 2");
        }
        boolean compare = (Length_1 == Length_2);
        System.out.println("Length of line comparison is :"+compare );
    }
}
