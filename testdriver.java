import java.io.IOException;

//Main driver code

public class testdriver {
    public static void main(String[] args) throws IOException {
        AbstractFactory factory = new ConcreteFactory();

        //CHANGE THESE IF YOU WANT DIFFERENT OPTIONS
        //if we have time, we can allow user to decide what
        // two options they would like
        String choice1 = "Soda";
        String choice2 = "Shot";

        Drink drink1 = factory.createDrink(choice1);
        System.out.println(choice1 + " costs: " + drink1.drinkPrice(choice1));

        Drink drink2 = factory.createDrink(choice2);
        System.out.println(choice2 + " costs: " + drink2.drinkPrice(choice2));
        

    }

}