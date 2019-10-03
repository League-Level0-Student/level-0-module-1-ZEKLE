package _99_extra;

import javax.swing.JOptionPane;

public class checkpoint {
public static void main(String[] args) {
	String word = JOptionPane.showInputDialog(null, "give me a word!");
	String num = JOptionPane.showInputDialog("Give me a number");
	int value = Integer.parseInt(num);
	for(int i = 0; i < value; i++) {
		System.out.println(word);
		
		}
	}
}