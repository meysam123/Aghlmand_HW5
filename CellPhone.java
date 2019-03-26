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

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public ScreenType getScreenType() {
        return screenType;
    }

    public int getMemory() {
        return memory;
    }

    public int getRam() {
        return ram;
    }

    public int getCameraPixelSize() {
        return cameraPixelSize;
    }

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setScreenType(ScreenType screenType) {
        this.screenType = screenType;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setCameraPixelSize(int cameraPixelSize) {
        this.cameraPixelSize = cameraPixelSize;
    }
}
