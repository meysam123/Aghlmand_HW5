public abstract class Electronics extends Product {
    private Color color;
    private Brand brand;
    private double weight;
    private int size;
    public Electronics(){

    }
    public Electronics(Color color,Brand brand,double weight,String name,int productID,double price,int size){
        super(name,productID,price);
        this.color=color;
        this.brand=brand;
        this.weight=weight;
        this.size=size;
    }
    public Electronics(Brand brand,int size){
        this.brand=brand;
        this.size=size;
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

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
