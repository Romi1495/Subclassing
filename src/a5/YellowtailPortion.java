package a5;

public class YellowtailPortion extends IngredientPortionImpl implements IngredientPortion {

	static IngredientImpl _yellowtail = new Yellowtail();
	
	public YellowtailPortion(double amount) {
		
		super(_yellowtail, amount);
	}
	
	public IngredientPortion combine(IngredientPortion other) {
		if (other == null) {
			
			return this;
		}
			
		if (!this.getIngredient().equals(other.getIngredient())) {
			
			throw new IllegalArgumentException("Portions not the same");
				
		}
		else {
			return new YellowtailPortion(this.getAmount() + other.getAmount());
		}
		
	}
}
