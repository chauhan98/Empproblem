package employeeproblem;

import java.util.Random;

public class EmployeeProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage problem");
        //generating random number
        Random random = new Random();
        //variableS
        int WAGE_PER_HOUR = 20;
        int TOTAL_NO_OF_HOUR = 8;
        int number = random.nextInt(2);
        //checking if emp is present or absent
        if (number == 1) {
            System.out.println("Employee is present");
            //computation of emp wage
            System.out.println("DailyWage = " + WAGE_PER_HOUR * TOTAL_NO_OF_HOUR);
        }
                else
                System.out.println("Employee is absent");
    }
}


