//Program that uses enum, nested classes and super and sub classes
import java.util.ArrayList;

//enum 'Day'
enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

//enum 'Restaurant'
enum Restaurant {
    IVORYBITES,
    CHICKENREPUBLIC,
    CAPTAINCOOK,
    COUNTRYKITCHEN
}

//class 'Order'
class Order {
    private String customerName;
    private Day dayOfOrder;
    private OrderDetails details;
    private static ArrayList<Order> allOrders = new ArrayList<>();
    public static ArrayList<Day> busyDays = new ArrayList<>();

    //Order class constructor
    public Order(String customerName, Day dayOfOrder, String item, int qty) {
        this.customerName = customerName;
        this.dayOfOrder = dayOfOrder;
        this.details = new OrderDetails(item, qty);
        allOrders.add(this);
        if (!busyDays.contains(dayOfOrder)) {
            busyDays.add(dayOfOrder);
        }
    }

    public void showOrderDetails() {
        System.out.println(details.getOrderDetails());
    }
    public OrderDetails getDetails() {
        return details;
    }

    //Nested class 'OrderDetails'
    public static class OrderDetails {
        private String item;
        private int qty;

        public OrderDetails(String item, int qty) {
            this.item = item;
            this.qty = qty;
        }

        public String getOrderDetails() {
            return "Item: " + item + ", quantity: " + qty;
        }
    }
}

class FoodOrder extends Order {
    private Restaurant chosenRestaurant;

    public FoodOrder(String customerName, Day dayOfOrder, String item, int qty, Restaurant restaurant) {
        super(customerName, dayOfOrder, item, qty);
        this.chosenRestaurant = restaurant;
    }

    public Restaurant getChosenRestaurant() {
        return chosenRestaurant;
    }

    @Override
    public void showOrderDetails() {
        System.out.println(this.getDetails().getOrderDetails() + ", Preferred restaurant: " + chosenRestaurant);
    }
}

//Class 'OrderPrg'
public class OrderPrg {
    /** 
     * main - entrypoint or program
     * @args: command line arguments 
    */
    public static void main(String[] args) {
        FoodOrder firstOrder = new FoodOrder("Amarachi", Day.TUESDAY, "Shawarma", 2, Restaurant.IVORYBITES);
        Order secondOrder = new Order("Catherine", Day.WEDNESDAY, "Electric Cooker", 1);
        Order thirdOrder = new Order("Toyin", Day.TUESDAY, "Set of Plates", 2);

        System.out.println("Details:\n");
        firstOrder.showOrderDetails();
        secondOrder.showOrderDetails();
        thirdOrder.showOrderDetails();

        //Print days of the week using enum 'Day'
        System.out.println("\nOut of the following days of the week:\n");
        for (Day d : Day.values()) {
            System.out.println(d);
        }

        System.out.println("\nOnly these days had orders:\n");
        for (Day d : Order.busyDays) {
            System.out.println(d);
        }
    }
}