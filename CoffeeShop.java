public class CoffeeShop {
    public static void main(String[] args) 
    {

        Coffee order1 = new BlackCoffee();
        System.out.println(order1.getDescription() + " -> ₱ " + order1.getCost());

        Coffee order2 = new Milk(new BlackCoffee());
        System.out.println(order2.getDescription() + " -> ₱ " + order2.getCost());

        Coffee order3 = new CaramelSyrup(new Milk(new BlackCoffee()));
        System.out.println(order3.getDescription() + " -> ₱ " + order3.getCost());
    }
}

