public class CaramelSyrup implements Coffee {
    private Coffee wrappedCoffee;

    public CaramelSyrup(Coffee coffee) 
    {
        this.wrappedCoffee = coffee;  
    }

    public String getDescription() 
    {
        return wrappedCoffee.getDescription() + ", Caramel Syrup";
    }

    public double getCost() 
    {
        return wrappedCoffee.getCost() + 40.00;
    }
}
