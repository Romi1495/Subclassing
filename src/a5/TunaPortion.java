package a5;

public class TunaPortion extends IngredientPortionImpl implements IngredientPortion {

	static IngredientImpl _tuna = new Tuna();
	
	public TunaPortion(double amount) {
		
		super(_tuna, amount);
	}
	
	public IngredientPortion combine(IngredientPortion other) {
		if (other == null) {
			
			return this;
		}
			
		if (!this.getIngredient().equals(other.getIngredient())) {
			
			throw new IllegalArgumentException("Portions not the same");
				
		}
		else {
			return new TunaPortion(this.getAmount() + other.getAmount());
		}
		
	}
}
