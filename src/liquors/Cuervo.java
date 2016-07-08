package liquors;
public class Cuervo extends Tequila{
	
	public Cuervo() {
		super("Jose Cuervo", "Tequila", 80, 15, "Multiple colors", "Agave", "Mexico");
	}
	
	public Cuervo(String c){
		super("Jose Cuervo", "Tequila", 80, 15, "Multiple colors", "Agave", "Mexico");
		switch(c) {
		
		case "Gold":
			super.setColor("Gold");
			break;
			
		case "Anejo":
			super.setColor("Gold");
			break;
			
		case "Resposado":
			super.setColor("Gold");
			break;
			
		case "Silver":
			super.setColor("Clear");
			break;
		}
		
		/*if (c.equals("Gold")) {
			super.setColor("Gold");
			System.out.println(getColor());
		}else 
			super.setColor("Clear");
		
		if (c.equals("Anejo"))
			super.setColor("Gold");
		else
			super.setColor("Clear");
	
		if (c.equals("Resposado"))
			super.setColor("Gold");
		else
			super.setColor("Clear");
		}*/
}
}
