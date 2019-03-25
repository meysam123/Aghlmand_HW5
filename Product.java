public abstract class Product {
    private  String name;
    private  int productID;
    private double price;
    public Product(String name,int productID,double price){
        this.name=name;
        this.productID=productID;
        this.price=price;
    }
    public Product(){
        
    }

    public String getName() {
        return name;
    }

    public int getProductID() {
        return productID;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return String.format("ID: %s Name: %s Price: %s",getProductID(),getName(),getPrice());
    }
}
