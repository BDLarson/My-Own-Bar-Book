package theEssentials;

public class Liquor extends LiquorEssentials implements Comparable<Object> { //SuperClass

	public Liquor() {
		//Empty constructor
	}
	
	
	/*
	 * Liquor Constructor
	 * Used for main liquors only, since no relative cost is available
	 * 
	 */
	public Liquor(String n, String t, String c) {
		name = n;
		taste = t;
		country = c;
	}
	
	/*
	 * Liquor Constructor
	 * Used for specific liquors only (includes alcohol percent and relative cost)
	 * 
	 */
	public Liquor(String n, Double ac, Double rc, String c, String t, String co){
		name = n;
		alcoholPercent = ac;
		rCost = rc;
		color = c;
		taste = t;	
		country = co;
	}
	
	public void setLiquorType(String lt) {
		this.liquorType = lt;
	}
	
	public String getLiquorType() {
		return (this.liquorType);
	}
	
	public void setAlcoholContent(Double ac) {
		this.alcoholPercent = ac;
	}
	
	public Double getAlcoholContent() {
		return (this.alcoholPercent);
	}
	
	public void setColor(String c) {
		this.color = c;
	}
	
	public String getColor() {
		return (this.color);
	}

	public void setTaste(String t) {
		this.taste = t;
	}
	
	public String getTaste() {
		return (this.taste);
	}
	
	public void setCountry(String c) {
		this.country = c;
	}
	
	public String getCountry() {
		return (this.country);
	}
	
	public void setRelativeCost(Double rc) {
		this.rCost = rc;
	}
	
	public Double getRelativeCost() {
		return (this.rCost);
	}
	
	/*
	 * For main liquors only
	 */
	public String toString(){
		return (name + "\n" + alcoholPercent + "\n" + rCost + "\n" + color + "\n" + taste + "\n" + country);
	}
	
	/*
	 * For specific liquors only (includes a liquor type)
	 */
	public String toString2(){
		return (name + "\n" + liquorType + "\n" + alcoholPercent + "\n" + rCost + "\n" + color + "\n" + taste + "\n" + country);
	}
	
	/*
	 * Compare two different Liquors or specific types
	 * Object o = The type being compared to
	 * Return +1 = Greater than
	 * Return 0 = Equal
	 * Return -1 = Less than
	 */
	@Override
	public int compareTo(Object o) { //Comparable method
		if(this.getAlcoholContent() > ((Liquor) o).getAlcoholContent()) return +1;
		else if(this.getAlcoholContent() < ((Liquor) o).getAlcoholContent()) return -1;
		else return 0;
	}
}
