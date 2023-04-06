import java.util.Scanner;

class ProductDemo {
    public static void main(String[]args) {

        String cod = "";
        String desc = "";
        double price = 0.00;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n/////Below are default constructer values://///\n");
        Product p1 = new Product();
        System.out.println("\nCode = " + p1.getCode());
        System.out.println("Description = " + p1.getDescription());
        System.out.println("Price = $" + p1.getPrice());

        System.out.println("\n/////Below are user-entered values://///\n");
        System.out.print("Code: ");
        cod = sc.nextLine();
        System.out.print("Description: ");
        desc = sc.nextLine();
        System.out.print("Price: ");
        price = sc.nextDouble();

        Product p2 = new Product(cod, desc, price);
        System.out.println("\nCode = " + p2.getCode());
        System.out.println("Description = " + p2.getDescription());
        System.out.println("Price = $" + p2.getPrice());

        System.out.println("\n/////Below using setter methods to pass literal values, then print() method to display values://///");
        p2.setCode("xyz789");
        p2.setDescription("Test Widget");
        p2.setPrice(89.99);
        p2.print();
    }
}