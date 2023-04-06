import java.util.Scanner;
import java.util.*;

public class Methods 
{
    public static void getRequirements()
    {
        System.out.println("Program counts, totals, and averages total number of user-entered exam scores.");
        System.out.println("Please enter exam scores between 0 and 100, inclusive.");
        System.out.println("Enter out of range number to end program");
        System.out.println("Must *only* permit numeric entry.");
        System.out.println(); //blank line
    }

    public static void nestedStructures()
    {
        //VARIABLES
        int count = 0;
        int score = 0;
        double total = 0.0;
        double average = 0.0;
        Boolean error = false;

        //CODE
        do {
            error = false;
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter exam score: ");
                score = 0;
                score = sc.nextInt();
                if(score >= 0 && score <= 100) {
                    total += score;
                    count++;
                    error = true;
                }
            } 
            catch (InputMismatchException e)
            {
                error = true;
                System.out.println("Not valid number!\n");
                System.out.print("Please try again. ");
            }
        } while(error == true);

        average = total / count;

        System.out.printf( "\nCount: %d", count);
        System.out.printf( "\nTotal: %.1f", total);
        System.out.printf( "\nAverage: %.1f", average);

        
    }
}
