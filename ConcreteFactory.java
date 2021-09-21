//Concrete factory will make implement AbstractFactory
// an create new concrete Drink

public class ConcreteFactory implements AbstractFactory {

    public Drink createDrink(String drinkName) {

        Drink drink = new ConcreteDrink();
        return drink;

    }

}