import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class EmployeeHelper {
    public static Employee getEmployeeInfo(int numberOfEmployee) {
        Scanner sc = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        int salary = 0;

        try {
            System.out.println("Enter " + numberOfEmployee + " employee first name: ");
            firstName = sc.next();
            System.out.println("Enter " + numberOfEmployee + " employee last name: ");
            lastName = sc.next();
            System.out.println("Enter " + numberOfEmployee + " employee salary: ");
            salary = sc.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("You entered string, please enter integer value.");
            getEmployeeInfo(numberOfEmployee);
        }
        return new Employee(firstName, lastName, salary);
    }

    public static void menuOptions(List<Employee> employeesList) {
        System.out.println("\n" + "1 – Print sum of all employees salary\n" +
                "2 – Display all employees data\n" +
                "3 – Add new employee\n" +
                "4 – End program");
        Scanner sc = new Scanner(System.in);
        int userChoice = sc.nextInt();
        try {
            switch (userChoice) {
                case 1:
                    int sum = 0;
                    for (Employee employee : employeesList) {
                        sum += employee.salary;
                    }
                    System.out.println("\n" + "The sum of all salaries is: " + sum);
                    menuOptions(employeesList);
                    break;
                case 2:
                    for(Employee employee : employeesList){
                        employee.getAllData();
                    }
                    menuOptions(employeesList);
                    break;
                case 3:
                    employeesList.add(getEmployeeInfo(employeesList.size() + 1));
                    menuOptions(employeesList);
                    break;
                case 4:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("You need to enter the number from 1 to 4");
                    menuOptions(employeesList);
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("You entered String, please enter integer");
        }
    }
}
