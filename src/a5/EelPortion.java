package a5;

public class EelPortion extends IngredientPortionImpl implements IngredientPortion {

	static IngredientImpl _eel = new Eel();
	
	public EelPortion(double amount) {
		
		super(_eel, amount);
	}
	
	public IngredientPortion combine(IngredientPortion other) {
		if (other == null) {
			
			return this;
		}
			
		if (!this.getIngredient().equals(other.getIngredient())) {
			
			throw new IllegalArgumentException("Portions not the same");
				
		}
		else {
			return new EelPortion(this.getAmount() + other.getAmount());
		}
		
	}
}
