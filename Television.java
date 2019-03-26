public class Television extends Electronics {
    private ScreenQuality screenQuality;
    private ScreenTechnology screenTechnology;
    private int size;
    private int power;
    public Television(){

    }
    public Television(Brand brand,ScreenQuality screenQuality,ScreenTechnology screenTechnology,int size,int power){
        super(brand);
        this.screenQuality=screenQuality;
        this.screenTechnology=screenTechnology;
        this.size=size;
        this.power=power;
    }

    public ScreenQuality getScreenQuality() {
        return screenQuality;
    }

    public ScreenTechnology getScreenTechnology() {
        return screenTechnology;
    }

    public int getSize() {
        return size;
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

    public void setSize(int size) {
        this.size = size;
    }
}
