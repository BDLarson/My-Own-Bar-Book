package liquors;

import theEssentials.Liquor;

public class Tequila extends Liquor{
	
	public Tequila(){
		super("Tequila", "Agave", "Mexico");
	}
	
	public Tequila(String n, String lt, double ac, double rc, String c, String t, String co) {
		name = n;
		liquorType = lt;
		alcoholPercent = ac;
		rCost = rc;
		color = c;
		taste = t;	
		country = co;
	}
}
