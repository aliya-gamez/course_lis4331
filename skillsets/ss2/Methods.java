import java.util.Scanner;
import java.util.*;

public class Methods 
{
    public static void getRequirements()
    {
        System.out.println("Program determines if first number is multiple of second, prints result.");
        System.out.println("Example: 2, 4, 6, 8 are multiples of 2.");
        System.out.println("1) Use integers. 2) Use printf() function to print.");
        System.out.println("Must *only* permit integer entry.");
        System.out.println(); //blank line
    }

    public static void multipleNumber()
    {
        //VARIABLES
        int firstInt = 0;
        int secondInt = 0;
        Boolean error = false;

        //CODE
        do {
            error = false;
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Num1: ");
                firstInt = sc.nextInt();
            } 
            catch (InputMismatchException e)
            {
                error = true;
                System.out.println("Not valid integer!\n");
                System.out.print("Please try again. ");
            }
        } while(error == true);

        do {
            error = false;
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Num2: ");
                secondInt = sc.nextInt();
            } 
            catch (InputMismatchException e)
            {
                error = true;
                System.out.println("Not valid integer!\n");
                System.out.print("Please try again. ");
            }
        } while(error == true);

        if(firstInt%secondInt == 0) {
            System.out.println(firstInt + " is a multiple of " + secondInt);
            System.out.println("The product of " + firstInt/secondInt + " and " + secondInt + " is " + firstInt);
        }
        else {
            System.out.println(firstInt + " is not a multiple of" + secondInt);
        }
        
    }
}
