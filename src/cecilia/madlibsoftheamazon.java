package cecilia;

import javax.swing.JOptionPane;

public class madlibsoftheamazon {
public static void main(String[] args) {
	String noun = JOptionPane.showInputDialog("give a band name." );
	String second_noun = JOptionPane.showInputDialog("what instrument does miguel play?");
	String third_noun = JOptionPane.showInputDialog("what instrument does huke lemmings play?");
	String fourth_noun = JOptionPane.showInputDialog("what instrument does calpal play?");
	String fifth_noun = JOptionPane.showInputDialog("what instrument does trashton play?");
	String location = JOptionPane.showInputDialog("give a location.");
	
	JOptionPane.showMessageDialog(null, noun + " is a 'punk rock' band");
	JOptionPane.showMessageDialog(null, " miguel plays the " + second_noun);
	JOptionPane.showMessageDialog(null, " huke lemmings plays the " + third_noun);
	JOptionPane.showMessageDialog(null, " calpal plays the "+ fourth_noun);
	JOptionPane.showMessageDialog(null, " and trashton plays the " + fifth_noun);
	JOptionPane.showMessageDialog(null, " they are all kangaroos from " + location + ".");
}
}
