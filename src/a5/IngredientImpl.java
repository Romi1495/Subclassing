package a5;

abstract public class IngredientImpl implements Ingredient {
	
	private String _name;
	private double _price_ounce;
	private int _calories_ounce;
	private boolean _vegetarian;
	private boolean _has_rice;
	private boolean _has_shellfish;
	public IngredientImpl(String name, double price_ounce, int calories_ounce, boolean vegetarian, boolean has_rice, boolean has_shellfish) {
		_name = name;
		_price_ounce = price_ounce;
		_calories_ounce = calories_ounce;
		_vegetarian = vegetarian;
		_has_rice = has_rice;
		_has_shellfish = has_shellfish;
	}
	@Override
	public String getName() {
		
		return this._name;
	}

	@Override
	public double getCaloriesPerDollar() {
		double cals_dol = (1.00/this.getPricePerOunce()) * this.getCaloriesPerOunce();
		return cals_dol;
	}

	@Override
	public int getCaloriesPerOunce() {
		
		return this._calories_ounce;
	}

	@Override
	public double getPricePerOunce() {
		
		return this._price_ounce;
	}

	@Override
	public boolean getIsVegetarian() {
		
		return this._vegetarian;
	}

	@Override
	public boolean getIsRice() {
		
		return this._has_rice;
	}

	@Override
	public boolean getIsShellfish() {
		
		return this._has_shellfish;
	}

	@Override
	public boolean equals(Ingredient other) {
		if (other == null) {
			return false;
		}
		if (this.getName() == other.getName() && this.getCaloriesPerOunce() == other.getCaloriesPerOunce() && (Math.abs(this.getPricePerOunce() - other.getPricePerOunce())) < 0.01 && this.getIsVegetarian() == other.getIsVegetarian() && this.getIsRice() == other.getIsRice()) {
			return true;
		}
		return false;
	}

}
