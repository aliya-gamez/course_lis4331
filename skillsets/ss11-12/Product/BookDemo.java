import java.util.Scanner;

class BookDemo
{
    public static void main(String[] args)
    {
        String cod = "";
        String desc = "";
        double pr = 0.00;
        String aut = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Developer: Aliya Gamez");

        System.out.println("\n/////Below are *base class dafault constructor* values (instantiating p1, then using getter methods)://///");
        Product p1 = new Product();
        System.out.println("\nCode = " + p1.getCode());
        System.out.println("Description = " + p1.getDescription());
        System.out.println("Price = $" + p1.getPrice());

        System.out.println("\n\n/////Below are *base class* user-entered values (instantiating p2, then using getter methods)://///");
        System.out.print("\nCode: ");
        cod = sc.nextLine();
        System.out.print("Description: ");
        desc = sc.nextLine();
        System.out.print("Price: ");
        pr = Double.parseDouble(sc.nextLine());

        Product p2 = new Product(cod, desc, pr);
        System.out.println("\nCode = " + p2.getCode());
        System.out.println("Description = " + p2.getDescription());
        System.out.println("Price = $" + p2.getPrice());

        System.out.println("\n\n/////Below using setter methods to pass literal values to p2, then print() method to display values://///");
        p2.setCode("xyz789");
        p2.setDescription("Test Widget");
        p2.setPrice(89.99);
        p2.print();

        System.out.println();

        System.out.println("\n\n/////Below are *derived class default constructor* values (instantiating b1, then using getter methods)://///");
        Book b1 = new Book();
        System.out.println("\nCode = " + b1.getCode());
        System.out.println("Description = " + b1.getDescription());
        System.out.println("Price = $" + b1.getPrice());
        System.out.println("Author = " + b1.getAuthor());

        System.out.println("\nOr using overridden derived class print() method...");
        b1.print();

        System.out.println("\n\n/////Below are *derived class* user-entered values (instantiating b2, then using getter methods)://///");
        System.out.print("\nCode: ");
        cod =sc.nextLine();
        System.out.print("Description: ");
        desc = sc.nextLine();
        System.out.print("Price: ");
        pr = Double.parseDouble(sc.nextLine());
        System.out.print("Author: ");
        aut = sc.nextLine();

        Book b2 = new Book(cod, desc, pr, aut);
        System.out.println("\nCode = " + b2.getCode());
        System.out.println("Description = " + b2.getDescription());
        System.out.println("Price = $" + b2.getPrice());
        System.out.println("Author = " + b2.getAuthor());

        System.out.println("\nOr using derived class print() method...");
        b2.print();
    }
}