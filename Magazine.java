public class Magazine extends Readingstuff {
    private Delivered delivered;
    public Magazine(){

    }
    public Magazine(Subject subject,String publisher,Delivered delivered){
        super(subject,publisher);
        this.delivered=delivered;
    }

    public Delivered getDelivered() {
        return delivered;
    }

    public void setDelivered(Delivered delivered) {
        this.delivered = delivered;
    }
}
