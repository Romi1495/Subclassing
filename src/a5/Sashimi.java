package a5;

public class Sashimi implements Sushi {
	
	String _name;
	IngredientPortion[] _portions = new IngredientPortion[1];
	public enum SashimiType {
		TUNA,
		YELLOWTAIL,
		EEL,
		CRAB,
		SHRIMP 
	}
	
	public Sashimi(SashimiType type) {
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
		
			
	}
	@Override
	public String getName() {
		
		return _name + " sashimi";
	}

	@Override
	public IngredientPortion[] getIngredients() {
		
		return _portions;
	}

	@Override
	public int getCalories() {
		
		double calories = 0;
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
