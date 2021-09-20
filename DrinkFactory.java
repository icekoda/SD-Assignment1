public class DrinkFactory implements AbstractFactory<Drink>{
	
	public Drink create(String drinkType){
		if ("Beer".equalsIgnoreCase(drinkType)){
			return new Beer();
		}
		else if ("Soda".equalsIgnoreCase(drinkType)) {
			return new Soda();
		}
		else if ("Wine".equalsIgnoreCase(drinkType)) {
			return new Wine();
		}

		return null;
	}
}

