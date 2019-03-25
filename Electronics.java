public abstract class Electronics extends Product {
    private Color color;
    private Brand brand;
    private double weight;
    public Electronics(){

    }
    public Electronics(Color color,Brand brand,double weight,String name,int productID,double price){
        super(name,productID,price);
        this.color=color;
        this.brand=brand;
        this.weight=weight;
    }
    public Electronics(Brand brand){
        this.brand=brand;
    }

    public Brand getBrand() {
        return brand;
    }

    public Color getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
