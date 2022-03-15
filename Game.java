package Game;

import javax.swing.*;


public class Game {

	public static void main(String[] args) {
		
	int computerNumber = (int) (Math.random()*10 + 1);
	int userAnswer = 0;
	
	//System.out.println("The correct guess was " + computerNumber);
	
	int count = 1;
	
	
	while (userAnswer != computerNumber) {
		
		String response = JOptionPane.showInputDialog(null,
				"Enter a guess of a Number between 1 & 10", "William's Guessing Game", 3);
		userAnswer = Integer.parseInt(response);
		JOptionPane.showMessageDialog(null, ""+ determineGuess(userAnswer, computerNumber, count));
		
		count++;
		
	}
	}

	public static String determineGuess(int userAnswer, int computerNumber, int count) {
		
		if (userAnswer <0 || userAnswer >10) {
			return "Wrong number guessed.";
		}
		else if (userAnswer == computerNumber) {
			return "Correct Guess!!\n Guesses made " + count;
		}
		else if (userAnswer < computerNumber) {
			return "The number you guessed was too low. Try Again\n Guesses made so far " + count;
		}
		else if (userAnswer > computerNumber) {
			return "The number you guessed was too high. Try Again\n Guesses made so far " + count;
		}
		else {
			return "Incorrect guess. Try again.\n Guesses made so far " + count;
			
		}
	}
	
	
}
