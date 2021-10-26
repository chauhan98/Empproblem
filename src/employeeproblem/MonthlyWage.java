package employeeproblem;

public class MonthlyWage {
    // initialize variable and assign value
    int emp_Hour;
    final int is_Full_Time = 1;
    final int is_Part_Time = 2;
    int total_Salary = 0;
    int working_Days = 20;
    int emp_Rate_Per_Hour = 20;

    public void calculateWage() {
        for (int i = 0; i <= working_Days; i++) {
            // generate random number
            int emp_Check = (int) Math.floor(Math.random() * 3);
            // check condition
            switch (emp_Check) {
                // full time = 1
                case is_Full_Time:
                    emp_Hour = 8;
                    break;
                // part time = 2
                case is_Part_Time:
                    emp_Hour = 4;
                    break;
                // absent = 0
                default:
                    emp_Hour = 0;
            }
            // calculate emp salary
            int salary = emp_Rate_Per_Hour * emp_Hour;
            // calculate total salary
            total_Salary += salary;
        }
        System.out.println("Monthly salary of employee is : " + total_Salary);
    }
}
