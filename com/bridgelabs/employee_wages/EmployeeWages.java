package com.bridgelabs.employee_wages;

import java.util.Stack;
public class EmployeeWages {
    static int WAGESPERHOUR = 20;
    static int FULLDAYHOURS = 8;
    static int PARTIMEHOURS = 4;
    static int TOTALWAGES;


    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wages Programme");
        int Absent = 0;
        int Full_time = 1;
        int Part_time = 2;

        double empCheck = Math.floor(Math.random() * 10) % 3;
        System.out.println(empCheck);
        if (empCheck == Full_time) {
            System.out.println("Employee is present for full-time");
            TOTALWAGES = WAGESPERHOUR * FULLDAYHOURS;
            System.out.println("Wages :" + TOTALWAGES);}
         else if (empCheck == Part_time) {
            System.out.println("Employee is present for part-time");
            TOTALWAGES = WAGESPERHOUR * PARTIMEHOURS;
            System.out.println("Wages :" + TOTALWAGES);
        }else {
            System.out.println("Employee is absent");

        }
    }
}