public abstract class Readingstuff extends Product {
    private Subject subject;
    private String publisher;
    public Readingstuff(){

    }
    public Readingstuff(Subject subject,String publisher){
        this.subject=subject;
        this.publisher=publisher;
    }

    public Subject getSubject() {
        return subject;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
