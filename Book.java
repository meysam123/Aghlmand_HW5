public class Book extends Readingstuff {
    private int pageNumber;
    private String authorName;
    public Book(){

    }
    public Book(Subject subject,String publisher,int pageNumber,String authorName){
        super(subject,publisher);
        this.pageNumber=pageNumber;
        this.authorName=authorName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
