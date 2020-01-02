package a5;

public class Nigiri implements Sushi {

	String _name;
	IngredientPortion[] _portions = new IngredientPortion[2];
	public enum NigiriType {
		TUNA,
		YELLOWTAIL,
		EEL,
		CRAB,
		SHRIMP
	}
	
	public Nigiri(NigiriType type) {
		switch(type) {
		case TUNA:
			_name = "tuna";
			_portions[0] = new TunaPortion(0.75);
			break;
		case YELLOWTAIL:
			_name = "yellowtail";
			_portions[0] = new YellowtailPortion(0.75);
			break;
		case EEL:
			_name = "eel";
			_portions[0] = new EelPortion(0.75);
			break;
		case CRAB:
			_name = "crab";
			_portions[0] = new CrabPortion(0.75);
			break;
		case SHRIMP:
			_name = "shrimp";
			_portions[0] = new ShrimpPortion(0.75);
		}
		_portions[1] = new RicePortion(0.50);
			
	}
	@Override
	public String getName() {
		
		return _name + " nigiri";
	}

	@Override
	public IngredientPortion[] getIngredients() {
		
		return _portions;
	}

	@Override
	public int getCalories() {
		
		double calories = 0.00;
		for (IngredientPortion portion : _portions) {
			
			calories += portion.getCalories();
		}
		
		return (int) Math.round(calories);
	}

	@Override
	public double getCost() {
		
		double cost = 0.00;
		for (IngredientPortion portion : _portions) {
			
			cost += portion.getCost();
		}
		return cost;
	}

	@Override
	public boolean getHasRice() {
		
		for (IngredientPortion portion : _portions) {
			
			if(portion.getIsRice()) {
				
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean getHasShellfish() {
		
		for (IngredientPortion portion : _portions) {
			
			if(portion.getIsShellfish()) {
				
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean getIsVegetarian() {

		for (IngredientPortion portion : _portions) {
			
			if(portion.getIsVegetarian()) {
				
				return true;
			}
		}
		return false;
	}

}
