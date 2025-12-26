package daytwo;

import java.util.Scanner;

public class conditonal {
    public static void main(String[] args) {
        // Scanner scanner=new Scanner(System.in);
        //System.out.println("Enter a day name to print day number: ");
        //String dayNumber = scanner.nextLine();
        // switch (dayNumber){
        // case "1" :
        // System.out.println("sunday");
        //break;
        //case "2":
        //System.out.println("monday");
        //break;
        // case "3" :
        // System.out.println("tuseday");
        //break;
        // case "4" :
        // System.out.println("wednesday");
        //break;
        //case "5" :
        //  System.out.println("thursday");
        //break;
        //case "6" :
        //   System.out.println("friday");
        //break;
        // case "7":
        //System.out.println("saturday");
        // break;
        // default:
        // System.out.println("Invalid input, please enter a number between 1 and 7");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a=sc.nextInt();

        System.out.print("Enter second number: ");
        int b=sc.nextInt();

        System.out.print("Enter third number: ");
        int c=sc.nextInt();

        if(a <= b && a <= c)

        {
            System.out.println("Smallest number is: " + a);
        } else if(b <= a && b <= c)

        {
            System.out.println("Smallest number is: " + b);
        } else

        {
            System.out.println("Smallest number is: " + c);
        }

        sc.close();
    }

}




