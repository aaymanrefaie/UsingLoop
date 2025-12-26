package Assignment;
import java.util.Scanner;
public class MenuProgram {
    public static void main(String[] args) {
        System.out.println("\n1. على");
        System.out.println("2. خلاص");
        System.out.println("3. لاء خلاص");
        System.out.println("4. مش قايل ");

        System.out.println("اختار");
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("يا نعم");
                    break;
                case 2:
                    System.out.println("لاء قول");
                    break;
                case 3:
                    System.out.println("يا عم قول");
                    break;
                default:
                    System.out.println("خلاص غور");
            }
        }while(choice!=3);
    }
}
