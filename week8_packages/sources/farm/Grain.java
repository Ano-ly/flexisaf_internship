package farm;
import farm.Inventory;
import farm.Living;
import farm.Sellable;

public class Grain extends Crop implements Living<Grain>, Inventory, Sellable {
    public static int noOfGrain = 0;
    public static double price;
    public boolean infected;
    public int size = 1;

    public Grain(String type) {
        super(type);
    }

    
    public void infect() {
        this.infected = true;
    }

    
    public void grow() {
        this.size++;
    }

    
    public Grain[] yield() {
        Grain[] grains = new Grain[10];
        for (int i = 0; i < 10; i++) {
            grains[i] = new Grain("");
        }
        return grains;
    }

    
    public void spoil() {
        this.isSpoilt = true;
    }

    
    public void diminish() {
        if (noOfGrain > 0) {
            noOfGrain--;
        }
    }

    
    public void multiply() {
        noOfGrain++;
    }

    
    public void sell() {
        if (noOfGrain > 0) {
            noOfGrain--;
        }
    }

    
    public void setPrice(double price) {
        Grain.price = price;
    }

    
    public void changePrice(double newPrice) {
        Grain.price = newPrice;
    }

    // Default constructor
    public Grain() {
        super("");
    }
} 