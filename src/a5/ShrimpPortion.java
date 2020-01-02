package a5;

public class ShrimpPortion extends IngredientPortionImpl implements IngredientPortion {

	static IngredientImpl _shrimp = new Shrimp();
	
	public ShrimpPortion(double amount) {
		
		super(_shrimp, amount);
	}
	
	public IngredientPortion combine(IngredientPortion other) {
		if (other == null) {
			
			return this;
		}
			
		if (!this.getIngredient().equals(other.getIngredient())) {
			
			throw new IllegalArgumentException("Portions not the same");
				
		}
		else {
			return new ShrimpPortion(this.getAmount() + other.getAmount());
		}
		
	}
}
