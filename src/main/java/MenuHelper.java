import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuHelper {

    public static void printMenuOptions() {
        System.out.println("\n" + "1 – Print sum of all employees salary\n" +
                "2 – Display all employees data\n" +
                "3 – Add new employee\n" +
                "4 – End program");
    }

    public void handleSelectedOptions(Payroll payroll) {
        Scanner sc = new Scanner(System.in);
        int userChoice = sc.nextInt();
        try {
            switch (userChoice) {
                case 1:
                    payroll.printSalarySum();
                    printMenuOptions();
                    handleSelectedOptions(payroll);
                    break;
                case 2:
                    payroll.getAllData();
                    printMenuOptions();
                    handleSelectedOptions(payroll);
                    break;
                case 3:
                    for (int i = 0; i < 1; i++) {
                        payroll.addEmployee(EmployeeHelper.getEmployeeFromUser(i + 1));
                    }
                    printMenuOptions();
                    handleSelectedOptions(payroll);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("You need to enter the number from 1 to 4");
                    printMenuOptions();
                    handleSelectedOptions(payroll);
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("You entered String, please enter integer");
        }
    }
}
