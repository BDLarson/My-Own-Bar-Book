import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import theEssentials.*;
import liquors.*; 

public class barTest {

	@Test
	public void testGetName() {
		Liquor drink1 = new Vodka();
		Liquor drink2 = new Skyy();
		Liquor drink3 = new Stoli();
		Liquor drink4 = new Cuervo("Anejo");
		
	    assertEquals("Vodka", drink1.getName());
	    assertEquals("Skyy", drink2.getName());
	    assertEquals("Stolichnaya", drink3.getName());
	    assertEquals("Jose Cuervo", drink4.getName());

	}
	
	@Test
	public void testGetColor() {
		Liquor drink1 = new Vodka();
		Liquor drink2 = new Skyy();
		Liquor drink3 = new Cuervo();
		Liquor drink4 = new Cuervo("Resposado");
		
	    assertEquals("Clear", drink1.getColor());
	    assertEquals("Clear", drink2.getColor());
	    assertEquals("Clear", drink3.getColor());
	    assertEquals("Gold", drink4.getColor());

		
	}
	
	@Test
	public void testGetTaste() {
		Liquor drink1 = new Vodka();
		Liquor drink2 = new Skyy();
		Liquor drink3 = new Cuervo();
		Liquor drink4 = new Cuervo("Silver");
		
	    assertEquals("Tasteless", drink1.getTaste());
	    assertEquals("Tasteless", drink2.getTaste());
	    assertEquals("Agave", drink3.getTaste());
	    assertEquals("Agave", drink4.getTaste());
	}
	
	@Test
	public void testGetAlcoholType() {
		Liquor drink1 = new Stoli();
		Liquor drink2 = new Skyy();
		Liquor drink3 = new Cuervo();
		Liquor drink4 = new Cuervo("Anejo");

	    assertEquals("Vodka", drink1.getAlcoholType());
	    assertEquals("Vodka", drink2.getAlcoholType());
	    assertEquals("Tequila", drink3.getAlcoholType());
	    assertEquals("Tequila", drink4.getAlcoholType());
	}
	
	@Test
	public void testGetAlcoholPercent() {
		Liquor drink1 = new Stoli();
		Liquor drink2 = new Skyy();
		Liquor drink3 = new Cuervo();
		Liquor drink4 = new Cuervo("Gold");
		
	    assertEquals(40, drink1.getAlcoholPercent());
	    assertEquals(80, drink2.getAlcoholPercent());
	    assertEquals(80, drink3.getAlcoholPercent());
	    assertEquals(80, drink4.getAlcoholPercent());
	}
	
	@Test
	public void testToString() {
		Liquor[] drinks = new Liquor[1];
		
		for(int x=0; x<1; x++){
			drinks[x] = new Stoli();
		}
		assertEquals(
				"["+"Stolichnaya has a Clear tint, is from Russia, has an "
				+ "alcohol percent of: 40, and is a Vodka"+"]", Arrays.toString(drinks));
	}
	
	@Test
	public void testCompareTo() {
		Liquor[] order = new Liquor[4];
		order[0] = new Skyy();
		order[1] = new Stoli();
		order[2] = new Cuervo("Gold");
		order[3] = new Cuervo("Silver");
		
		assertEquals(-1, order[1].compareTo(order[0]));
		assertEquals(+1, order[0].compareTo(order[1]));
		assertEquals(0, order[0].compareTo(order[3]));
		assertEquals(0, order[2].compareTo(order[3]));
	}
}
