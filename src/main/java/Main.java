import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("Apple",  0.80, "Food", 100 );
        Product product2 = new Product("Bread",  1.20, "Food", 49);
        Product product3 = new Product("Shampoo", 5.75, "Personal Care", 30);
        Product product4 = new Product("Toothpaste", 2.50, "Personal Care", 0);

        Product[] products = {product1, product2, product3, product4};

        Store store = new Store("Gozel&Ayla", "Baku", products);


    }


}
