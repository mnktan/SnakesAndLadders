import java.util.ArrayList;

public class Score {

	private static int finalTime;
	private static int finalScoreOne;
	private static int finalScoreTwo;
	private static int[] finalResult = SnakesLadders.getResult();
	
	
	public static int getTime() {
		finalTime = finalResult[0];
		return finalTime;
	}
	
	public static int getScoreOne() {
		finalScoreOne = finalResult[1];
		return finalScoreOne;
	}
	
	public static int getScoreTwo() {
		finalScoreTwo = finalResult[2];
		return finalScoreTwo;
	}
	
	
	
	
	
	
	
	
	
	
	
}
