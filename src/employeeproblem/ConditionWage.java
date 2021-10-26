package employeeproblem;

public class ConditionWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;
    public static final int NO_WORKING_DAY = 20;
    public static final int MAX_HRS_IN_MONTH = 100;

    public void calculatewage () {
        int empHrs = 0, totalEmpHours = 0, totalWokinDays = 0;
        while (totalEmpHours <= MAX_HRS_IN_MONTH && totalWokinDays < NO_WORKING_DAY) {
            totalWokinDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHours = totalEmpHours + empHrs;
            System.out.println("Days:" +totalWokinDays+ "Employee hours:" + empHrs);
        }
        int totalEmpWage = totalEmpHours * WAGE_PER_HOUR;
        System.out.println("Total Employee Wage: " + totalEmpWage);
    }
}


