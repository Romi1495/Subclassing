package a5;

public class SeaweedPortion extends IngredientPortionImpl implements IngredientPortion {

	static IngredientImpl _seaweed = new Seaweed();
	
	public SeaweedPortion(double amount) {
		
		super(_seaweed, amount);
	}
	public IngredientPortion combine(IngredientPortion other) {
		if (other == null) {
			
			return this;
		}
			
		if (!this.getIngredient().equals(other.getIngredient())) {
			
			throw new IllegalArgumentException("Portions not the same");
				
		}
		else {
			return new SeaweedPortion(this.getAmount() + other.getAmount());
		}
		
	}
}
