import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        System.out.println("Developer: Aliya Gamez");
        System.out.println("Program performs the following functions: ");
        System.out.println("1. Calculates the amount of money saved for a period of years, at a specified interest rate (i.e., yearly, non-compounded");
        System.out.println("2. Returned amount is formatted in U.S. Currency, and rounded to two decimal places.");
        System.out.println();
        System.out.println("***Note***: Program checks for non-numeric values, as well as only integer values for years.");

        double currentPrinicpal = 0.0;
        double interestRate = 0.0;
        int years = 0;
        double result = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.print("\nCurrent principal: $");
        while (!input.hasNextDouble())
        {
            System.out.println("Not a valid number!\n");
            input.next();
            System.out.print("Please try again. Enter principal: $");
        }
        currentPrinicpal = input.nextDouble();

        System.out.print("\nInterest Rate (per year): ");
        while (!input.hasNextDouble())
        {
            System.out.println("Not a valid number!\n");
            input.next();
            System.out.print("Please try again. Interest Rate (per year): ");
        }
        interestRate = input.nextDouble();
        interestRate = interestRate/100;

        System.out.print("\nTotal time (in years): ");
        while (!input.hasNextInt())
        {
            System.out.println("Not a valid integer!\n");
            input.next();
            System.out.print("Please try again. Total time (in years): ");
        }

        years = input.nextInt();
        result = currentPrinicpal * ( 1 + interestRate * years);
        interestRate = interestRate*100;

        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("\nYou will have saved " + nf.format(result) + " in " + years + " years, at an interest rate of " + interestRate + "%");
    }
}