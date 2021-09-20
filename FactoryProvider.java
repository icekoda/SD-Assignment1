public class FactoryProvider {
	public static AbstractFactory getFactory(String choice){
		
		if("Drink".equalsIgnoreCase(choice)){
			return new DrinkFactory();
		}
		return null;
	}
}
