//Creates abstract drink
public interface AbstractFactory{
    //this will be implemented by the ConcreteFactory
    Drink createDrink(String drinkName);

}