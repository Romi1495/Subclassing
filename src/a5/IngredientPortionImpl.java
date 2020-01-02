package a5;

public class IngredientPortionImpl implements IngredientPortion {
	
	private IngredientImpl _ingredient;
	private double _amount;
	
	public IngredientPortionImpl(IngredientImpl ingredient, double amount) {
		if (amount <= 0) {
			
			throw new IllegalArgumentException("Invalid amount");
		}
		_ingredient = ingredient;
		_amount = amount;
	}
	
	@Override
	public Ingredient getIngredient() {

		return this._ingredient;
	}

	@Override
	public double getAmount() {

		return _amount;
	}

	@Override
	public String getName() {

		return getIngredient().getName();
	}

	@Override
	public boolean getIsVegetarian() {

		return getIngredient().getIsVegetarian();
	}

	@Override
	public boolean getIsRice() {

		return getIngredient().getIsRice();
	}

	@Override
	public boolean getIsShellfish() {

		return getIngredient().getIsShellfish();
	}

	@Override
	public double getCalories() {
		
		return getIngredient().getCaloriesPerOunce() * _amount;
	}

	@Override
	public double getCost() {

		return getIngredient().getPricePerOunce() * _amount;
	}

	@Override
	public IngredientPortion combine(IngredientPortion other) {

		return null;
	}

}
