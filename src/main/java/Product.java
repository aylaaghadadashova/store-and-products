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


    //methods:

    public String toString() {
        return ("Product = {name: %s\n price: %.2f\n category: %s\n stock: %d\n}").formatted(this.name, this.price, this.category, this.stock);
    }

    public double discountPrice(double percent){
        this.price *= (100-percent)/100;
        return this.price;

    }

}
