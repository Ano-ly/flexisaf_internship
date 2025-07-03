package farm;
import farm.Buyable;

public class Silo extends Store implements Buyable {
    public static int noOfSilo = 0;
    public static double cost;
    public int grainContent;

    
    public void buy() {
        noOfSilo++;
    }

    // Silo does not implement sell(), as it is not Sellable
    
    public void setCost(double cost) {
        Silo.cost = cost;
    }

    
    public void changeCost(double newCost) {
        Silo.cost = newCost;
    }
} 