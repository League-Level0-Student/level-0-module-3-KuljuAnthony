
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "idk";
		String dadsBirthday = "idk";
		String myBirthday = "plubby 132nd";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String s =JOptionPane.showInputDialog("whos birthday do you want to know");
		// 3. Print out what the user typed
		if(s.equals("mom")) {
			JOptionPane.showMessageDialog(null, "idk");
		}else if(s.equals("dad")) {
			JOptionPane.showMessageDialog(null, "idk");
		}else if(s.equals("you")) {
			JOptionPane.showMessageDialog(null, "plubby 132nd");
		}else {
			JOptionPane.showMessageDialog(null, "Sorry, i don't remember that person's birthday!");
		}
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
