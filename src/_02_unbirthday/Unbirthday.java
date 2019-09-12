package _02_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("What is your birthday");
		if (answer.equals("9/12/19")) {
		JOptionPane.showMessageDialog(null, "happy Birthday");
		
		}
		else {
			JOptionPane.showMessageDialog(null, "happy unBirthday");
		}
	}

}
