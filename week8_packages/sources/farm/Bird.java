package farm;
import farm.Living;
import farm.Sellable;

public class Bird extends Livestock implements Living<Bird>, Sellable {
    public static int noOfBird = 0;
    public static double price;
    public boolean infected;
    public int size = 1;

    public Bird(String type) {
        super(type);
    }

    public void infect() {
        this.infected = true;
    }

    
    public void grow() {
        this.size++;
    }

    
    public Bird[] yield() {
        Bird[] birds = new Bird[10];
        for (int i = 0; i < 10; i++) {
            birds[i] = new Bird("");
        }
        return birds;
    }

    
    public void sell() {
        if (noOfBird > 0) {
            noOfBird--;
        }
    }

    
    public void setPrice(double price) {
        Bird.price = price;
    }

    
    public void changePrice(double newPrice) {
        Bird.price = newPrice;
    }

    // Default constructor
    public Bird() {
        super("");
    }
} 