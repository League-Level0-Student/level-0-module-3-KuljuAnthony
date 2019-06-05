package _05_horoscope;

import javax.swing.JOptionPane;

public class scope {
public static void main(String[] args) {
	
	String a =JOptionPane.showInputDialog("what is your star sign"); 
		if(a.equalsIgnoreCase("Capricorn")) {
			JOptionPane.showMessageDialog(null, "Timeless, driven, calculating, ambitious.");
		}
	    if(a.equalsIgnoreCase("Leo")) {
	    	JOptionPane.showMessageDialog(null, "Generous, organized, protective, beautiful.");
	    }
	    if(a.equalsIgnoreCase("Virgo")) {
	    	JOptionPane.showMessageDialog(null, "Particular, logical, practical, sense of duty, critical.");
	    }
	    if(a.equalsIgnoreCase("Libra")) {
	    	JOptionPane.showMessageDialog(null, "Balanced, seeks beauty, sense of justice.");
	    }
	    if(a.equalsIgnoreCase("Scorpio")) {
	    	JOptionPane.showMessageDialog(null, "Passionate, exacting, loves extremes, combative, reflective.");
	    }
	    if(a.equalsIgnoreCase("Sagittarius")) {
	    	JOptionPane.showMessageDialog(null, "Happy, absent minded, creative, adventurous.");
	    }
	    if(a.equalsIgnoreCase("Aquarius")) {
	    	JOptionPane.showMessageDialog(null, "Forward thinking, communicative, people oriented, stubborn, generous, and dedicated.");
	    }
	    if(a.equalsIgnoreCase("Pisces")) {
	    	JOptionPane.showMessageDialog(null, "Likeable, energetic, passionate, sensitive.");
	    }else {
	    	JOptionPane.showMessageDialog(null, "thats not a star sign");
	    }
	
	
	
	
	
	
	
}
}
