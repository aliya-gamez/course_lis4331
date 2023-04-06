public class Book extends Product {

    private String author;

    public Book() {
        super();
        System.out.println("\nInside Book default constructer");
        author = "John Doe";
    }

    public Book(String cod, String desc, double pr, String aut) {
        super(cod, desc, pr);
        System.out.println("\nInside Book constructer with parameters");
        author = aut;
    }

    public void setAuthor(String aut) {
        author = aut; 
    }

    public String getAuthor() {
        return author;
    }

    public void print() {
        super.print();
        System.out.print(", Author: " + author);
    }
}