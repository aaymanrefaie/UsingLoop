package Assignment;
import java.util.Scanner;
public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter a number: ");
            num = sc.nextInt();
        } while (num % 5 != 0);

        System.out.println("Number is divisible by 5");
    }
}
