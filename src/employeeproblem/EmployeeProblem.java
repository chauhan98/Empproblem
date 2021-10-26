package employeeproblem;

import java.util.Random;

public class EmployeeProblem {
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Problem");
        // to check if Employee is present or absent
        Random random = new Random();
        //define variable
        int number = random.nextInt(2);
        if (number == 1)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");
    }
}
