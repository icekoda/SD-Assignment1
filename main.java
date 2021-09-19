interface ProductFactory {
	createGlass();
	createLiquid();
}

class BeerFactory implements ProductFactory{
	private
	public Beerglass createGlass(){
		return BeerGlass
	}

	public BeerLiquid createLiquid(){
		return BeerLiquid
	}
}

class SodaFactory implements ProductFactory{
	public SodaGlass createGlass(){
		return SodaGlass
	}

	public SodaLiquid createLiquid(){
		return SodaLiquid
	}
}

