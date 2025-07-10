public class Product {

    public String name;
    public double price;
    public String category;
    public int stock;

    public Product(String name, double price, String category, int stock) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }

    public String toString() {
        return ("Product = name:%s\n price%d\n category%s\n stock%d\n");
    }
}
