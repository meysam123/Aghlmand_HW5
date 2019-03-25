public class Address {
    private String province;
    private String city;
    private String street;
    private long postalCode;
    public Address(){

    }
    public Address(String city,long postalCode){
        this.city=city;
        this.postalCode=postalCode;
    }
    public Address(String province,String city,String street,long postalCode){
        this.province=province;
        this.city=city;
        this.street=street;
        this.postalCode=postalCode;
    }
}
