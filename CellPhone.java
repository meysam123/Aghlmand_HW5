public class CellPhone extends Electronics {
    private OperatingSystem operatingSystem;
    private ScreenType screenType;
    private int memory;
    private int ram;
    private int cameraPixelSize;
    public CellPhone(){

    }
    public CellPhone(OperatingSystem operatingSystem,ScreenType screenType,int memory,int ram,int cameraPixelSize){
        this.operatingSystem=operatingSystem;
        this.screenType=screenType;
        this.memory=memory;
        this.ram=ram;
        this.cameraPixelSize=cameraPixelSize;
    }
    public CellPhone(Brand brand,int size,OperatingSystem operatingSystem,ScreenType screenType,int memory,int ram,int cameraPixelSize){
        super(brand,size);
        this.operatingSystem=operatingSystem;
        this.screenType=screenType;
        this.memory=memory;
        this.ram=ram;
        this.cameraPixelSize=cameraPixelSize;
    }
    

}
