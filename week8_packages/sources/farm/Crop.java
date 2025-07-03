package farm;

public abstract class Crop {
    protected String type;
    protected boolean isSpoilt;
    public Crop(String type) {
        this.type = type;
        this.isSpoilt = false;
    }
} 