package a5;

public class RicePortion extends IngredientPortionImpl implements IngredientPortion {

	static IngredientImpl _rice = new Rice();
	
	public RicePortion(double amount) {
		
		super(_rice, amount);
	}
	
	public IngredientPortion combine(IngredientPortion other) {
		if (other == null) {
			
			return this;
		}
			
		if (!this.getIngredient().equals(other.getIngredient())) {
			
			throw new IllegalArgumentException("Portions not the same");
				
		}
		else {
			return new RicePortion(this.getAmount() + other.getAmount());
		}
		
	}
}
