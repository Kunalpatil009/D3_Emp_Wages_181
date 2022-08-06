package com.bridgelabs.employee_wages;

import java.util.Stack;
public class EmployeeWages {
    static int WAGESPERHOUR = 20;
    static int FULLDAYHOURS = 8;
    static int PARTIMEHOURS = 4;
    static int TOTALWAGES;
    static int WORKINGHOURS;
    static int WORKINGDAYSPERMONTH = 20;
    static int MAXWORKINGDAYS = 20;
    static int MAXWORKINGHOURS = 100;

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wages Programme");
        int Absent = 0;
        int Full_time = 1;
        int Part_time = 2;
        int total_working_hours = 0;
        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Working hours", "Wage", "Total working hrs");
        for (int day = 1; day <= MAXWORKINGDAYS && WORKINGHOURS <= MAXWORKINGHOURS; day++) {
            double empCheck = Math.floor(Math.random() * 10) % 3;
//            System.out.println(empCheck);
            if (empCheck == Full_time) {
                WORKINGHOURS = 8;
//                System.out.println("Employee is present for full-time");
                TOTALWAGES = WAGESPERHOUR * WORKINGHOURS;
//                System.out.println("Wages :" + TOTALWAGES);
            } else if (empCheck == Part_time) {
                WORKINGHOURS = 4;
//                System.out.println("Employee is present for part-time");
                TOTALWAGES = WAGESPERHOUR * WORKINGHOURS;
//                System.out.println("Wages :" + TOTALWAGES);
            } else {
//                System.out.println("Employee is absent");

//        switch (empCheck) {
//            case Full_time -> {
//                System.out.println("Employee is present for full-time");
//                TOTALWAGES = WAGESPERHOUR * FULLDAYHOURS;
//                System.out.println("Wages :" + TOTALWAGES);
//            }
//            case Part_time -> {
//                System.out.println("Employee is present for part-time");
//                TOTALWAGES = WAGESPERHOUR * PARTIMEHOURS;
//                System.out.println("Wages :" + TOTALWAGES);
//            }
//            default -> System.out.println("Employee is absent");
//        }
                int wages = WAGESPERHOUR * WORKINGHOURS;
//                System.out.println("Day " + day + " wage is:" + wages + " Working Hours : " +total_working_hours);
                System.out.printf("%5s     %5s     %5s    \n", day, WORKINGHOURS, wages );
                TOTALWAGES += wages;

            }
        }
    }
}