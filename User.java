import java.util.ArrayList;

public class User {
    private Address address;
    private String userName;
    private String passWord;
    private ArrayList<Product> shoppingBasket=new ArrayList<Product>();
    public User(){

    }
    public User(String userName,String passWord){
        this.userName=userName;
        this.passWord=passWord;
    }

    public User(Address address, String userName, String passWord) {
        this.address = address;
        this.userName = userName;
        this.passWord = passWord;
    }

    public Address getAddress() {
        return address;
    }

    public String getUserName() {
        return userName;
    }
    public void addProductTobasket(Product product){
        shoppingBasket.add(product);
    }

    public void addShoppingBasket(Product product) {
        boolean flag=true;
        for(Product x:shoppingBasket){
            if(x.getProductID()==product.getProductID()){
                x.setQuantity(x.getQuantity()+product.getQuantity());
                flag=false;
            }
        }
        if(flag)
            shoppingBasket.add(product);

    }

    public void removeShoppingBasket(Product product) {
        shoppingBasket.remove(product);
    }
    public void clearShoppingBasket(){
        shoppingBasket.clear();
    }
    public void showShoppingBasket(){
        System.out.println("Basket Items: "+"\n"+"------------------------");
    }
}
