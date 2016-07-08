
import theEssentials.*;

import java.util.Scanner;

import javax.swing.JOptionPane;

import liquors.*;

public class BarBook {
	
	public BarBook() {
		//prepareBarBook();
	}
	
	public void prepareBarBook() {

	}
	
	public void Demo() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Vodka newL = new Vodka();
		newL.toString();
	/*	headerLabel.setText("Welcome to your own Bar Book!"); 
	      Icon icon = null;
	      JButton VodkaButton = new JButton("Vodka", icon);   
	      JButton TequilaButton = new JButton("Tequila", icon);
	      JButton GinButton = new JButton("Gin", icon);
	      JButton RumButton = new JButton("Rum", icon);
	      JButton WhiskeyButton = new JButton("Whiskey", icon);
	      JButton ExitButton = new JButton("Exit Program", icon);
	      JButton StoliButton = new JButton("Stoli", icon);
	      ExitButton.setHorizontalTextPosition(SwingConstants.LEFT);   

	      VodkaButton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 statusLabel.setText("nothing yet");
	         }          
	      });

	      TequilaButton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            statusLabel.setText("Tequila Button clicked.");
	         }
	      });

	      GinButton.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		        statusLabel.setText("Gin Button clicked.");
		     }          
		  });
	      
	      RumButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				statusLabel.setText("Rum Button clicked.");
			 }          
		  });
	      
	      WhiskeyButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				statusLabel.setText("Whiskey Button clicked.");
			 }          
		  });
	      
	      ExitButton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            statusLabel.setText("Exit Button clicked.");
	            System.exit(EXIT_ON_CLOSE);
	         }
	      });

	      controlPanel.add(VodkaButton);
	      controlPanel.add(TequilaButton);
	      controlPanel.add(GinButton);
	      controlPanel.add(RumButton);
	      controlPanel.add(WhiskeyButton);
	      controlPanel.add(ExitButton);       

	      mainFrame.setVisible(true); */ 
	}

	public static void main(String[] args) throws Exception{
		String name;
		String details;
		Scanner keyboard = new Scanner(System.in);
		Object inputString = "";
		Cuervo first = new Cuervo();
		Cuervo second = new Cuervo("Anejo");
		Cuervo third =  new Cuervo("Resposado");
		Cuervo fourth = new Cuervo("Gold");
		Stoli fifth = new Stoli();
		Skyy sixth = new Skyy();
		
		while (!inputString.equals("Stop")){
			inputString = JOptionPane.showInputDialog(null, "What would you like to look up?", "Bar Book", JOptionPane.PLAIN_MESSAGE );
			if (inputString.equals("Cuervo")) {
				JOptionPane.showMessageDialog(null,"Here's what I got: " + first.toString2());
			}
			if (inputString.equals("Cuervo Anejo")) {
				JOptionPane.showMessageDialog(null,"Here's what I got:" + " " + second.toString());
			}
			if (inputString.equals("Cuervo Resposado")) {
				JOptionPane.showMessageDialog(null,"Here's what I got:" + " " + third.toString());
			}
			if (inputString.equals("Cuervo Gold")) {
				JOptionPane.showMessageDialog(null,"Here's what I got:" + " " + fourth.toString());
			}
			if (inputString.equals("Stoli")) {
				JOptionPane.showMessageDialog(null,"Here's what I got:" + " " + fifth.toString());
			}
			if (inputString.equals("Skyy")) {
				JOptionPane.showMessageDialog(null,"Here's what I got:" + " " + sixth.toString());
			}
			if (inputString.equals("")) {
				JOptionPane.showMessageDialog(null,"Please enter a valid name!");
			}
			else {
				JOptionPane.showMessageDialog(null,inputString + " " + "is not in your Bar Book.");
			}
		}
	}
	
/*	//Get the order
		System.out.println("What would you like to look up?");
		name = keyboard.nextLine();
		
		//Get the information
		Class c = Class.forName(name);
		Object o = c.newInstance();
		
		details = o.toString();
		//details = ((Liquor)o).getColor();
		
		//Display the information
		System.out.println("Here's what I got:");
		System.out.println(details);
	}*/
}
