package liquors;

import theEssentials.Liquor;

public class Vodka extends Liquor {

	public Vodka(){
		super("Vodka", "Tasteless", "Multiple Countries");
	}
	
	public Vodka(String n, String lt, double ac, double rc, String c, String t, String co) {
		name = n;
		liquorType = lt;
		alcoholPercent = ac;
		rCost = rc;
		color = c;
		taste = t;	
		country = co;
	}
	
}
