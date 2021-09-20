//Daniel LoPresti (100748818)
import java.util.Scanner;

interface ProductFactory {
	createGlass();
	createLiquid();
}

class BeerFactory implements ProductFactory{
	private
	public Beerglass createGlass(){
		return BeerGlass;
	}

	public BeerLiquid createLiquid(){
		return BeerLiquid;
	}
}

class SodaFactory implements ProductFactory{
	public SodaGlass createGlass(){
		return SodaGlass;
	}

	public SodaLiquid createLiquid(){
		return SodaLiquid;
	}
}

public class Driver {
	public static void main(String[] args) {
		Scanner Obj = new Scanner(System.in);
		System.out.println("Would you like: \n 1) Beer? \n (2) Soda? :");
		
		String choice = Obj.nextLine();
		
		if (choice == 1) {
			System.out.println("You chose Beer");
		}
	}
}
