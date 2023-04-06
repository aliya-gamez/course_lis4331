import java.util.InputMismatchException;
import java.util.Scanner;

public class travelTime
{
    public static void main(String[] args) {
        //DECLARTIONS
        double miles = 0.0;
        double mph = 0.0;
        double travelTime = 0.0;
        String response = "y";
        boolean loop = false;
        Scanner sc = new Scanner(System.in);
        
        //CODE
        do {
            System.out.println("Developer: Aliya Gamez");
            System.out.println("Program calculates approximate travel time\n");

            System.out.print("Please enter miles: ");
            do {
                try {
                    miles = sc.nextDouble();
                    while((miles < 0) || (miles > 3000)) {
                        System.out.println("Miles must be greater than 0, and no more than 3000.\n");
                        System.out.print("Please enter miles: ");
                        miles = sc.nextDouble();
                    }
                    loop = true;
                }
                catch (InputMismatchException e) {
                    System.out.println("Invalid double--miles must be a number.\n");
                    System.out.print("Please enter miles: ");
                    sc.next();
                }
            }while(loop == false);
            loop = false;

            System.out.print("Please enter MPH: ");
            do {
                try {
                    mph = sc.nextDouble();
                    while((mph < 0) || (mph > 100)) {
                        System.out.println("MPH must be greater than 0, and no more than 3000.\n");
                        System.out.print("Please enter MPH: ");
                        mph = sc.nextDouble();
                    }
                    loop = true;
                }
                catch (InputMismatchException e) {
                    System.out.println("Invalid double--MPH must be a number.\n");
                    System.out.print("Please enter MPH: ");
                    sc.next();
                }
            }while(loop == false);
            loop = false;

            travelTime = miles/mph;
            double hours = Math.floor(travelTime);
            double minutes = travelTime%60;

            System.out.print("Estimated travel time: ");
            System.out.printf("%.0f", + hours);
            System.out.print(" hr(s) ");
            System.out.printf("%.0f", + Math.floor(((minutes - hours) * 60)));
            System.out.print(" Minutes\n\n");

            System.out.print("Continue? (y/n): ");
            response = sc.next();

        }while(response.equalsIgnoreCase("y"));
    }
}
