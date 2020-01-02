package a5;

public class AvocadoPortion extends IngredientPortionImpl implements IngredientPortion {
	
	static IngredientImpl _avocado = new Avocado();
	
	public AvocadoPortion(double amount) {
		
		super(_avocado, amount);
	}
	
	public IngredientPortion combine(IngredientPortion other) {
		if (other == null) {
			
			return this;
		}
			
		if (!this.getIngredient().equals(other.getIngredient())) {
			
			throw new IllegalArgumentException("Portions not the same");
				
		}
		else {
			return new AvocadoPortion(this.getAmount() + other.getAmount());
		}
		
	}
}
 