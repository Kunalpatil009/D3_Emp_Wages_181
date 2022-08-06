package com.bridgelabs.employee_wages;

import java.util.Stack;
public class EmployeeWages {
    static int WAGESPERHOUR = 20;
    static int FULLDAYHOURS = 8;
    static int TOTALWAGES;

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wages Programme");
        int Present = 1;
        int Absent = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        System.out.println(empCheck);
        if (empCheck == Present) {
            System.out.println("Employee is present");
            TOTALWAGES = WAGESPERHOUR * FULLDAYHOURS;
            System.out.println("Wages :" + TOTALWAGES);
        } else {
            System.out.println("Employee is absent");

        }
    }
}