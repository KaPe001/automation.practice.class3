import java.util.*;

public class Main {
    static List<Employee> employeesList = new ArrayList<>();

    public static void main(String[] args) {

        for (int i = 0; i <= 4; i++) {
            employeesList.add(EmployeeHelper.getEmployeeInfo(i + 1));
        }
        EmployeeHelper.menuOptions(employeesList);
    }
}


