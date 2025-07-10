public class Store {

    //fields:
    public String name;
    public String address;
    public Product[] products;

    //constructors:
    public Store(){};
    public Store(String name, String address, Product[] products){
        this.name = name;
        this.address = address;
        this.products =  products;
    }

    //methods:
    public void printAllProducts(){
        for(Product product : products){
            System.out.println(product.toString());
        }
    }

    public void printExpensiveProducts(double limit){
        for(Product product : products){
            if(product.price > limit) System.out.println(product.name);
        }
    }

    public void applyDiscountToAll(double percent){
        for(int i = 0; i<products.length; i++){
            products[i].price *=(100-percent)/100;
            System.out.println(products[i].price);
        }
    }

}
