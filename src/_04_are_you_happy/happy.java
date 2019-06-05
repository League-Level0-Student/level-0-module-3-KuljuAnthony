package _04_are_you_happy;

import javax.swing.JOptionPane;

public class happy {
public static void main(String[] args) {
	
	String s =JOptionPane.showInputDialog("are you happy?");
	
	if(s.equals("yes")) {
		JOptionPane.showMessageDialog(null, "keep doing whatever your doing");
	}else if(s.equals("no")) {
	String d = JOptionPane.showInputDialog("do you want to be happy?");
	if(d.equals("yes")) {
		JOptionPane.showMessageDialog(null, "change something"); 
	}
		if(d.equals("no")) {
			JOptionPane.showMessageDialog(null, "keep doing whatever your doing");
		}
		
	}
	}
	
	
	
	
	
	
	
	
  }


