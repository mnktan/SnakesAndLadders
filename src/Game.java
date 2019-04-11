import java.util.ArrayList;
import java.util.Scanner;

public class Game {

public static String playerOne;
public static String playerTwo;


	public static void main(String[] args) {
		
		Scanner intro = new Scanner(System.in);
		String introChoice;
		boolean notDone = false;
		boolean play = false;
		boolean score = false;
		boolean playAgain = false;
		String outroChoice;
		Scanner outro = new Scanner(System.in);
		boolean finished = false;
		
		//Whole loop
		do {
		System.out.println("> Welcome to Java Snakes and Ladders");
		System.out.println("> What would you want to do today kids");
		System.out.println();
		
		
		//Game
		do {
		System.out.println("Type play to play a game of snakes and ladders");
		System.out.println("Type board to see the player leaderboard");
		System.out.println("Type exit to quit");
	
		introChoice = intro.nextLine();
		if (introChoice.equals("play")) {
		   play = true;
		   notDone = true;
		}
		else if (introChoice.equals("board")) {
			score = true;
			notDone = true;
		}
		else if (introChoice.equals("exit")) {
			finished = true;
			notDone = true;
			play = false;
		}
		else {
			System.out.println("> Please enter a valid command");
			notDone = false;
		}
		} while (notDone == false);
		
		if (play == true) {
		//Game Loop
		do {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the first player's name");
		playerOne = kb.nextLine();
		System.out.println("Enter the second player's name");
		playerTwo = kb.nextLine();
		
		System.out.println("> It's time to play, snakes and ladders!");
		System.out.println("Player 1: " + playerOne);
		System.out.println("Player 2: " + playerTwo);
		System.out.println();
		
		SnakesLadders.play();
	    // Game over
		// Results
		System.out.println();
		System.out.println("> Final Results");
		System.out.println("Turn Time: " + Score.getTime());
		System.out.println(playerOne + " score: " + Score.getScoreOne());
		System.out.println(playerTwo + " score: " + Score.getScoreTwo());
		System.out.println();
		// Results
		
		Scoreboard.addData();
		System.out.println("The results have been saved to the leaderboard!");
		System.out.println();
		
		System.out.println("> Game Over");
		System.out.println("> Would you like to play again?");
		System.out.println();
		boolean outroChoice2 = false;
		
		//reset
		notDone = false;
		play = false;
		score = false;
		playAgain = false;
		//reset
		
		do {
		System.out.println("Type p to play a new game");
		System.out.println("Type b to return to the main menu");
		outroChoice = outro.nextLine();
		
		
		if (outroChoice.equals("p")) {
			playAgain = false;
			outroChoice2 = true; }
		else if (outroChoice.equals("b")) {
			playAgain = true;
			outroChoice2 = true; }
		else 
			outroChoice2 = false;
		} while(outroChoice2 == false);
		//Game
		} while(playAgain == false);
		}
		//Game loop
		
		else if (score == true) {
			
			Scoreboard.viewData();
			finished = false;
			
		}
		
	
		 
		} while(finished == false);
		//Whole loop
		
	
		
		
	}
	
	
	
	
}
