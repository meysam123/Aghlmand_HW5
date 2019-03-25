public abstract class Product {
    private final String name;
    private final int productID;
    private double price;
    public Product(String name,int productID,double price){
        this.name=name;
        this.productID=productID;
        this.price=price;
    }
}
