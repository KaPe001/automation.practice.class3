import java.util.ArrayList;
import java.util.List;

public class Payroll {
    private List<Employee> employeesList;

    public Payroll() {
        this.employeesList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeesList.add(employee);
    }

    public void printSalarySum() {
        int sum = 0;
        for (Employee employee : employeesList) {
            sum += employee.getSalary();
        }
        System.out.println("\n" + "The sum of all salaries is: " + sum);
    }

    public void getAllData() {
        for (Employee employee : employeesList) {
            employee.getAllData();
        }
    }
}
