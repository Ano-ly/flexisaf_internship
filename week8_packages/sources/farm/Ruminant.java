package farm;
import farm.Living;
import farm.Sellable;

public class Ruminant extends Livestock implements Living<Ruminant>, Sellable {
    public static int noOfRuminant = 0;
    public static double price;
    public boolean infected;
    public int size = 1;

    public Ruminant(String type) {
        super(type);
    }

    
    public void infect() {
        this.infected = true;
    }

    
    public void grow() {
        this.size++;
    }

    
    public Ruminant[] yield() {
        Ruminant[] ruminants = new Ruminant[10];
        for (int i = 0; i < 10; i++) {
            ruminants[i] = new Ruminant("");
        }
        return ruminants;
    }

    
    public void sell() {
        if (noOfRuminant > 0) {
            noOfRuminant--;
        }
    }

    
    public void setPrice(double price) {
        Ruminant.price = price;
    }

    
    public void changePrice(double newPrice) {
        Ruminant.price = newPrice;
    }
} 