package employeeproblem;

public class EmpSwitchCase {
    int emp_Hour;
    final int is_Full_Time = 1;
    final int is_Part_Time = 2;
    int emp_Rate_Per_Hour = 20;

    public void calculateWage() {
        // print random number 0-2
        int emp_Check = (int) Math.floor(Math.random() * 3);
        // check condition
        switch (emp_Check) {
            // full time 1
            case is_Full_Time:
                System.out.println("Employee is Full Time");
                emp_Hour = 8;
                break;
            // part time 2
            case is_Part_Time:
                System.out.println("Employee is Part Time ");
                emp_Hour = 4;
                break;
            // default emp absent
            default:
                System.out.println("Emloyee is Absent");
                emp_Hour = 0;
        }
        // calculate emp salary
        int salary = emp_Rate_Per_Hour * emp_Hour;
        // print emp salary
        System.out.println("The salary of employee is :" + salary);
    }
}

