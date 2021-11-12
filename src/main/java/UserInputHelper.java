import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputHelper {
    Scanner sc;

    public UserInputHelper() {
        this.sc = new Scanner(System.in);
    }

    public String getTextFromUser() {
        return sc.next();
    }

    public int getIntFromUser() {
        try {
            return sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You entered string, please enter integer value.");
            return getIntFromUser();
        }
    }
}
