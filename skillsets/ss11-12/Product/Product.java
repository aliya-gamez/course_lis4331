public class Product {

    private String code;
    private String description;
    private double price;

    public Product() {
        System.out.println("\nInside Product default constructor");
        code = "abc123";
        description = "My Widget";
        price = 49.99;
    }

    public Product(String code, String description, double price) {
        System.out.println("\nInside Product constructer with parameters");
        this.code = code;
        this.description = description;
        this.price = price;
    }

    public void setCode(String cod) {
        code = cod;
    }

    public void setDescription(String desc) {
        description = desc;
    }

    public void setPrice(double pr) {
        price = pr;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void print() {
        System.out.print("\nCode: " + code + ", Description: " + description + ", Price: $" + price);
    }
}