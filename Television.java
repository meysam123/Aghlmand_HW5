public class Television extends Electronics {
    private ScreenQuality screenQuality;
    private ScreenTechnology screenTechnology;
    private int power;
    public Television(){

    }
    public Television(Brand brand,int size,ScreenQuality screenQuality,ScreenTechnology screenTechnology,int power){
        super(brand,size);
        this.screenQuality=screenQuality;
        this.screenTechnology=screenTechnology;
        this.power=power;
    }

    public ScreenQuality getScreenQuality() {
        return screenQuality;
    }

    public ScreenTechnology getScreenTechnology() {
        return screenTechnology;
    }



    public int getPower() {
        return power;
    }

    public void setScreenQuality(ScreenQuality screenQuality) {
        this.screenQuality = screenQuality;
    }

    public void setScreenTechnology(ScreenTechnology screenTechnology) {
        this.screenTechnology = screenTechnology;
    }

    @Override
    public String toString() {
       return String.format("%-20s %s %n","Brand",getBrand())+String.format("%-20s %s inch %n","size ",getSize())+
        String.format("%-20s %s %n","Screen Quality",getScreenQuality())+String.format("%-20s %s %n","Screen Technology",getScreenTechnology());
    }
}
