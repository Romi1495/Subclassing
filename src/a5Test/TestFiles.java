package a5Test;

import org.junit.jupiter.api.Test;
import a5.*;
import a5.Nigiri.NigiriType;
import a5.Sashimi.SashimiType;

public class TestFiles {
	
	TunaPortion tuna = new TunaPortion(1);
	ShrimpPortion shrimp = new ShrimpPortion(1);
	Sashimi s1 = new Sashimi(SashimiType.TUNA);
	Nigiri n1 = new Nigiri(NigiriType.TUNA);
	IngredientPortion[] roll_ings = new IngredientPortion[]{tuna, shrimp};
	Roll r1 = new Roll("Romi Roll", roll_ings);
	
	@Test
	public void getSashimiCals() {
		
		System.out.println(s1.getCalories());
	}
	
	@Test 
	public void getNigiriCals() {
		System.out.println(n1.getCalories());
	}
	
	@Test
	public void getRollIngs() {
		
		
	}
	
	@Test
	public void getRollCost() {
		
		System.out.println(r1.getCost());
	}
}
