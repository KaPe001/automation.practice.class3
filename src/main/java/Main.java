import java.util.*;

public class Main {

    public static void main(String[] args) {
        Payroll payroll = new Payroll();

        for (int i = 0; i <= 4; i++) {
            payroll.addEmployee(EmployeeHelper.getEmployeeFromUser(i + 1));
        }
        MenuHelper.printMenuOptions();
        new MenuHelper().handleSelectedOptions(payroll);
    }
}


