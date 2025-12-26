package Assignment;
import java.util.Scanner;
public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPassword = "Aly1995";
        String input;

        do {
            System.out.print("Enter password: ");
            input = sc.next();
        } while (!input.equals(correctPassword));

        System.out.println("منور يا باشا");
    }

}
