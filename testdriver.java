import java.io.IOException;

public class testdriver {
    public static void main(String[] args) throws IOException {
        AbstractFactory factory = new ConcreteFactory();

        Drink beer = factory.createDrink("Beer");
        System.out.println("Beer costs: " + beer.drinkPrice("Beer"));

        Drink wine = factory.createDrink("Wine");
        System.out.println("Wine costs: " + wine.drinkPrice("Wine"));


    }

}