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

    @Override
    public String toString() {
        return String.format("%-20s %s %n","Name:",getName())+String.format("%-20s %s %n","Subject:",getSubject())+
        String.format("%-20s %s %n","authorName:",getAuthorName())+String.format("%-20s %s %n","Page:",getPageNumber());
    }
}
