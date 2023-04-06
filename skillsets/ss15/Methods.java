import java.util.Scanner;

public class Methods {
   static final Scanner sc = new Scanner(System.in);

   public static void getRequirements() {
      System.out.println("Developer: Aliya Gamez");
      System.out.println("Program creates an array with user-entered integers,");
      System.out.println("and performs the operations below using user defined methods.\n");
   }  

   public static int validateArraySize() {
      int arraySize = 0;
      System.out.print("Please enter array size: ");
      while(!sc.hasNextInt())
      {
         System.out.println("Not valid integer!\n");
         sc.next();
         System.out.print("Please try again. Enter array size: ");
      }
      arraySize = sc.nextInt();
      System.out.println();
      return arraySize;
   }

   public static int[] validateUserInput(int arraySize) {
      System.out.print("Please enter " + arraySize + " integers.\n");
      int numsArray[] = new int[arraySize];
      for(int i = 0; i < arraySize; i++)
      {
         System.out.print("Enter num " + (i + 1) + ": ");
  
         while(!sc.hasNextInt())
         {
            System.out.println("Not valid integer!\n");
            sc.next();
            System.out.print("Please try again. Enter integer " + (i + 1) + ": ");
         }
         numsArray[i] = sc.nextInt();
      }
      return numsArray;
   }

   public static void displayNums(int[] numbers) {
      System.out.print("\nNumbers entered: ");
      for(int i = 0; i < numbers.length; i++)
         System.out.print(numbers[i] + " ");
   }

   public static void displayReverse(int[] numbers) {
      System.out.print("\nNumbers in reverse order are: ");
      for(int i = numbers.length - 1; i >=0; --i)
         System.out.print(numbers[i] + " ");
   }

   public static void displaySum(int[] numbers) {
      int total = 0;
      for(int i = 0; i < numbers.length; i++)
      {
         total += numbers[i];
      }
      System.out.print("\nSum of all numbers is " + total);
   }

   public static void displayHigherThanAverage(int[] numbers) {
      int sum = 0;
      double average;
      for(int i = 0; i < numbers.length; ++i)
         sum += numbers[i];
      average = sum * 1.0/numbers.length;
      System.out.print("\nAverage is: " + average);
      System.out.println();
      for(int i = 0; i < numbers.length; i++)
         if(numbers[i] > average)
            System.out.print(numbers[i] + " ");
      
      System.out.println("is/are greater than the average of " + average);
   }
}