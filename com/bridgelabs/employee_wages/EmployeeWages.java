package com.bridgelabs.employee_wages;

import java.util.Stack;

public class EmployeeWages {

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wages Programme");
        int Present = 1;
        int Absent = 0;

        double empCheck = Math.floor(Math.random() * 10) % 2;
        System.out.println(empCheck);
        if (empCheck == Present) {
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is absent");

        }
    }
    }

