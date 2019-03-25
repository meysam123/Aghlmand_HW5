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

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public long getPostalCode() {
        return postalCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setPostalCode(long postalCode) {
        this.postalCode = postalCode;
    }
}
