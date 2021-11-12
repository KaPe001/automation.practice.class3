import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class EmployeeHelper {
    public static Employee getEmployeeFromUser(int numberOfEmployee) {
        UserInputHelper userInputHandler = new UserInputHelper();

        System.out.println("Enter " + numberOfEmployee + " employee first name: ");
        String firstName = userInputHandler.getTextFromUser();

        System.out.println("Enter " + numberOfEmployee + " employee last name: ");
        String lastName = userInputHandler.getTextFromUser();

        System.out.println("Enter " + numberOfEmployee + " employee salary: ");
        int salary = userInputHandler.getIntFromUser();

        return new Employee(firstName, lastName, salary);
    }


}
