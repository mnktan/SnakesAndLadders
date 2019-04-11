import java.util.ArrayList;
import java.util.Scanner;

public class SnakesLadders {

	private static int rollValue;
	private static int positionOne;
	private static int positionTwo;
	private static boolean winner = false;
	private static int turnTimer = 0;
	private static int scoreOne;
	private static int scoreTwo;
	
	public static int[] result = new int[3];
	
	
	public static int generator() {
		
		int a = (int)(Math.random() * 6) + 1;
		return a;
	}
	
	public static int[] getResult() {
		return result;
	}
	
	public static void play() {
		
		positionOne = 0;
		positionTwo = 0;
		
		scoreOne = 0;
		scoreTwo = 0;
		
		turnTimer = 0;
		
		winner = false;
		boolean turnOne = false;
		boolean turnTwo = false;
		Scanner a = new Scanner(System.in);
		String choice;
		
		// Game algo
		do {
		
		// Player action 1
		do {
			System.out.println(Game.playerOne + " it's your turn");
			System.out.println("Type r to roll dice");
			choice = a.nextLine();
			
			if (choice.equals("r")) {
				rollValue = generator();
				turnOne = true;
				choice = new String();
			}
			else
				turnOne = false;
			
		} while(turnOne == false);
		
		// Player action 1
		
		playerOneResult(); // result
		
		// Player action 2
				
		if (!winner) {
			
		do {
			System.out.println(Game.playerTwo + " it's your turn");
			System.out.println("Type r to roll dice");
			choice = a.nextLine();
			
			if (choice.equals("r")) {
				rollValue = generator();
				turnTwo = true;
				choice = new String();
			}
			else
				turnTwo = false;
			
		} while(turnTwo == false);
			
		// Player action 2
		
		playerTwoResult(); // result
		}
			
		} while(!winner);
		//game algo
		
		result[0] = turnTimer;
		result[1] = scoreOne;
		result[2] = scoreTwo;
		
		// winner declared
		if (positionOne >= 100) 
			System.out.println(Game.playerOne + " wins!");
		
		else if (positionTwo >= 100) 
			System.out.println(Game.playerTwo + " wins!");
		
		
		// winner declared	
			
	
	}
	
	
	public static void playerOneResult() {
		
		// Player result 1
				turnTimer++;
				System.out.println("You rolled a dice with a value of " + rollValue);
				positionOne += rollValue;
				scoreOne += rollValue;
				if (positionOne < 100)
				System.out.println(Game.playerOne + ", you moved to position " + positionOne);
				else if (positionOne >= 100)
					System.out.println(Game.playerOne + " has reached position 100!");
				
				// ladders
				if (positionOne == 3) {
					positionOne = 51;
					System.out.println(Game.playerOne + " has climbed to position, " + positionOne);
					System.out.println();
				}
				else if (positionOne == 6) {
					positionOne = 27;
					System.out.println(Game.playerOne + " has climbed to position, " + positionOne);
					System.out.println();
				}
				else if (positionOne == 20) {
					positionOne = 70;
					System.out.println(Game.playerOne + " has climbed to position, " + positionOne);
					System.out.println();
				}
				else if (positionOne == 63) {
					positionOne = 95;
					System.out.println(Game.playerOne + " has climbed to position, " + positionOne);
					System.out.println();
				}
				else if (positionOne == 68) {
					positionOne = 98;
					System.out.println(Game.playerOne + " has climbed to position, " + positionOne);
					System.out.println();
				}
				// snakes
				else if (positionOne == 34) {
					positionOne = 1;
					System.out.println(Game.playerOne + " was brought down by a snake to position, " + positionOne);
					System.out.println();
				}
				else if (positionOne == 25) {
					positionOne = 5;
					System.out.println(Game.playerOne + " was brought down by a snake to position, " + positionOne);
					System.out.println();
				}
				else if (positionOne == 47) {
					positionOne = 19;
					System.out.println(Game.playerOne + " was brought down by a snake to position, " + positionOne);
					System.out.println();
				}
				else if (positionOne == 65) {
					positionOne = 52;
					System.out.println(Game.playerOne + " was brought down by a snake to position, " + positionOne);
					System.out.println();
				}
				else if (positionOne == 87) {
					positionOne = 57;
					System.out.println(Game.playerOne + " was brought down by a snake to position, " + positionOne);
					System.out.println();
				}
				else if (positionOne == 91) {
					positionOne = 61;
					System.out.println(Game.playerOne + " was brought down by a snake to position, " + positionOne);
					System.out.println();
				}
				else if (positionOne == 99) {
					positionOne = 69;
					System.out.println(Game.playerOne + " was brought down by a snake to position, " + positionOne);
					System.out.println();
				}
				
				else if (positionOne >= 100) {
					winner = true;
					System.out.println(Game.playerOne + " has reached the peak!");
					System.out.println();
				}
				
				else {
					System.out.println(Game.playerOne + " your position is now, " + positionOne);
					System.out.println();
					
				// Player result 1
	}
	}


	
	public static void playerTwoResult() {
		
		// Player result 2
				turnTimer++;
				System.out.println("You rolled a dice with a value of " + rollValue);
				positionTwo += rollValue;
				scoreTwo += rollValue;
				if (positionTwo < 100)
				System.out.println(Game.playerTwo + ", you moved to position " + positionTwo);
				else if (positionTwo >= 100)
					System.out.println(Game.playerTwo + ", has reached position 100!");
				
				// ladders
				if (positionTwo == 3) {
					positionTwo = 51;
					System.out.println(Game.playerTwo + " has climbed to position, " + positionTwo);
					System.out.println();
				}
				else if (positionTwo == 6) {
					positionTwo = 27;
					System.out.println(Game.playerTwo + " has climbed to position, " + positionTwo);
					System.out.println();
				}
				else if (positionTwo == 20) {
					positionTwo = 70;
					System.out.println(Game.playerTwo + " has climbed to position, " + positionTwo);
					System.out.println();
				}
				else if (positionTwo == 63) {
					positionTwo = 95;
					System.out.println(Game.playerTwo + " has climbed to position, " + positionTwo);
					System.out.println();
				}
				else if (positionTwo == 68) {
					positionTwo = 98;
					System.out.println(Game.playerTwo + " has climbed to position, " + positionTwo);
					System.out.println();
				}
				// snakes
				else if (positionTwo == 34) {
					positionTwo = 1;
					System.out.println(Game.playerTwo + " was brought down by a snake to position, " + positionTwo);
					System.out.println();
				}
				else if (positionTwo == 25) {
					positionTwo = 5;
					System.out.println(Game.playerTwo + " was brought down by a snake to position, " + positionTwo);
					System.out.println();
				}
				else if (positionTwo == 47) {
					positionTwo = 19;
					System.out.println(Game.playerTwo + " was brought down by a snake to position, " + positionTwo);
					System.out.println();
				}
				else if (positionTwo == 65) {
					positionTwo = 52;
					System.out.println(Game.playerTwo + " was brought down by a snake to position, " + positionTwo);
					System.out.println();
				}
				else if (positionTwo == 87) {
					positionTwo = 57;
					System.out.println(Game.playerTwo + " was brought down by a snake to position, " + positionTwo);
					System.out.println();
				}
				else if (positionTwo == 91) {
					positionTwo = 61;
					System.out.println(Game.playerTwo + " was brought down by a snake to position, " + positionTwo);
					System.out.println();
				}
				else if (positionTwo == 99) {
					positionTwo = 69;
					System.out.println(Game.playerTwo + " was brought down by a snake to position, " + positionTwo);
					System.out.println();
				}
				
				else if (positionTwo >= 100) {
					winner = true;
					System.out.println(Game.playerTwo + " has reached the peak!");
					System.out.println();
				}
				else {
					System.out.println(Game.playerTwo + " your position is now, " + positionTwo);
					System.out.println();
				}
				// Player result 2
		
	}
	
	
	
	
	
}

