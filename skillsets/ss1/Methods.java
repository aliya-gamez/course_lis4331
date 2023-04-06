import java.util.Scanner;
import java.util.*;
import java.lang.*;

public class Methods 
{
    public static void getRequirements()
    {
        System.out.println("Non-OOP program calculates diameter, circumference, and circle area.");
        System.out.println("Must use Java's built-in PI constant, printf(), and formatted to 2 decimal places.");
        System.out.println("Must *only* permit numeric entry.");
        System.out.println(); //blank line
    }

    public static void calculateCircle()
    {
        //VARIABLES
        double circumference = 0.0;
        double diameter = 0.0;
        double area = 0.0;
        int radius = 0;
        Boolean error = false;

        //CODE
        do {
            error = false;
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter circle radius: ");
                radius = sc.nextInt();
            } 
            catch (InputMismatchException e)
            {
                error = true;
                System.out.println("Not valid number!\n");
                System.out.print("Please try again. ");
            }
        } while(error == true);

        diameter = radius * 2;
        circumference = Math.PI * 2 * radius;
        area = Math.PI * (radius * radius);

        System.out.printf( "\nCircle Diameter: %.2f", diameter);
        System.out.printf( "\nCircumference: %.2f", circumference);
        System.out.printf( "\nArea: %.2f", area);
    }
}
