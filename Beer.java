//Beer with its necessary components
public class Beer implements Drink{
	
	public String createGlass(){
		System.out.println("Beerglass");
		return "Beerglass";
	}

	public String createLiquid(){
		System.out.println("Beer");
		return "Beer";
	}
}
