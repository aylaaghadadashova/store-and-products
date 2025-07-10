import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("apple", 0.50, "fruit", 12);
        Product product2 = new Product("strawberry", 2.5, "fruit", 10);
        Store store = new Store("Rahat", "Baku", new Product[]{product1, product2});

        store.applyDiscountToAll(10);
        //System.out.println(product1.toString());
    }


}
