package farm;

public class Tractor extends Machine implements Tool, Buyable {
    public static int noOfTractor = 0;
    public static double cost;
    public boolean isWorking = true;

    
    public void function() {
        // No operation
    }

    
    public void breakdown() {
        isWorking = false;
    }

    
    public void service() {
        isWorking = true;
    }

    
    public void buy() {
        noOfTractor++;
    }

    
    public void setCost(double cost) {
        Tractor.cost = cost;
    }

    
    public void changeCost(double newCost) {
        Tractor.cost = newCost;
    }
} 