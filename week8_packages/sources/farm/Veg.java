package farm;

public class Veg extends Crop implements Living<Veg>, Inventory, Sellable {
    public static int noOfVeg = 0;
    public static double price;
    public boolean infected;
    public int size = 1;

    public Veg(String type) {
        super(type);
    }

    
    public void infect() {
        this.infected = true;
    }

    
    public void grow() {
        this.size++;
    }

    
    public Veg[] yield() {
        Veg[] vegs = new Veg[10];
        for (int i = 0; i < 10; i++) {
            vegs[i] = new Veg("");
        }
        return vegs;
    }

    
    public void spoil() {
        this.isSpoilt = true;
    }

    
    public void diminish() {
        if (noOfVeg > 0) {
            noOfVeg--;
        }
    }

    
    public void multiply() {
        noOfVeg++;
    }

    
    public void sell() {
        if (noOfVeg > 0) {
            noOfVeg--;
        }
    }

    
    public void setPrice(double price) {
        Veg.price = price;
    }

    
    public void changePrice(double newPrice) {
        Veg.price = newPrice;
    }

} 