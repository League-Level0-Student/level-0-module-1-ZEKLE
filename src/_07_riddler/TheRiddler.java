package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;		
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
        String guess = JOptionPane.showInputDialog("hello I have a riddle. What has four legs but never moves?");
		
        // 4. If they got the answer right, pop up "correct!" and increase the score by one
        if(guess.equals("chair")){
        	JOptionPane.showMessageDialog(null, "CORRECT!");
        	score++;
        }
		// 5. Otherwise, say "wrong" and tell them the answer
        else {
        	JOptionPane.showMessageDialog(null, "Wrong!");
        	
        }
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

