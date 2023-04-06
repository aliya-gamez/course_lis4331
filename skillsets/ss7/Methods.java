import java.util.Scanner;
import java.util.*;

public class Methods 
{
    public static void getRequirements()
    {
        System.out.println("Program converts inches to centimeters, meters. feet, yards, and miles.");
        System.out.println("***Notes***:");
        System.out.println("1) Use interger for inches (must validate integer input).");
        System.out.println("2) Use printf() function to print (format values per below output).");
        System.out.println("3) Create Java \"constants\" for the following values:");
        System.out.println("\tINCHES_TO_CENTIMETER, \n\tINCHES_TO_METER, \n\tINCHES_TO_FOOT, \n\tINCHES_TO_YARD, \n\tINCHES_TO_MILE.");
        System.out.println(); //blank line
    }

    //CONSTANTS
    public static final double INCHES_TO_CENTIMETER = 2.54;
    public static final double INCHES_TO_METER = 0.0254;
    public static final double INCHES_TO_FOOT = 0.083333;
    public static final double INCHES_TO_YARD = 0.027778;
    public static final double INCHES_TO_MILE = 0.000015782828283;

    public static void measurementConversion()
    {
        //VARIABLES
        int inches = 0;
        boolean error = false;
        Scanner sc = new Scanner(System.in);
        

        //CODE
        do {
            error = false;
            try {
                System.out.print("Please enter number of inches: ");
                inches = sc.nextInt();
                System.out.println(inches + " inch(es) equals\n");
                System.out.printf("%,.6f centimeter(s)\n", inches * INCHES_TO_CENTIMETER);
                System.out.printf("%,.6f meter(s)\n", inches * INCHES_TO_METER);
                System.out.printf("%,.6f feet\n", inches * INCHES_TO_FOOT);
                System.out.printf("%,.6f yard(s)\n", inches * INCHES_TO_YARD);
                System.out.printf("%,.8f mile(s)\n\n", inches * INCHES_TO_MILE);
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("Not valid integer!\n");
                error = true;
                sc.next();
            }
        }
        while(error == true);
        

        
    }
}
