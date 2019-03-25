public class Readingstuff extends Product {
    private int pageNumber;
    private String publisher;
    public Readingstuff(){

    }
    public Readingstuff(int pageNumber,String publisher){
        this.pageNumber=pageNumber;
        this.publisher=publisher;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
