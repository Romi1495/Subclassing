package a5;

public class Roll implements Sushi {
	
	String _name;
	IngredientPortion[] _portions = new IngredientPortion[2];
	
	public Roll(String name, IngredientPortion[] roll_ingredients) {
		if (roll_ingredients == null) {
			throw new IllegalArgumentException("null ingredient portions array");
		}
		for (IngredientPortion ingredient : roll_ingredients) {
			if (ingredient == null) {
				throw new IllegalArgumentException("null ingredient portion");
			}
		}
		_name = name;
		_portions = roll_ingredients.clone();
	}
	@Override
	public String getName() {
		
		return _name;
	}

	@Override
	public IngredientPortion[] getIngredients() {
		IngredientPortion[] _ingredients = new IngredientPortion[_portions.length];
		for (int i = 0; i < _portions.length; i++) {
			
			_ingredients[i] = _portions[i];
		}
		return _ingredients;
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
		return (double) cost;
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