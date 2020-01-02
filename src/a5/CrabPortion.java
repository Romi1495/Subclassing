package a5;

public class CrabPortion extends IngredientPortionImpl implements IngredientPortion {

	static IngredientImpl _crab = new Crab();
	
	public CrabPortion(double amount) {
		
		super(_crab, amount);
	}
	
	public IngredientPortion combine(IngredientPortion other) {
		if (other == null) {
			
			return this;
		}
			
		if (!this.getIngredient().equals(other.getIngredient())) {
			
			throw new IllegalArgumentException("Portions not the same");
				
		}
		else {
			return new CrabPortion(this.getAmount() + other.getAmount());
		}
		
	}
}
