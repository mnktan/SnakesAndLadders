import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.ParsingException;
import nu.xom.*;

public class Scoreboard {
	
	private static Element result = new Element("result");
	private static Document doc = new Document(result);
	private static File file = new File("myfile.xml");
	private static Builder builder = new Builder();

	public static void mainMenu() {
		
		Scanner a = new Scanner(System.in);
		String choice;
		boolean notDone = false;
		
		
		do {
		System.out.println("> Scoreboard Database");
		System.out.println();
		System.out.println("> Type view to view the leaderboard");
		System.out.println("> Type search to search the leaderboard");
		System.out.println("> Type quit to return to the main menu");
		System.out.println();
		choice = a.nextLine();
		
		if (choice.equals("view") || choice.equals("search") || choice.equals("quit"))
				notDone = true;
		
		} while (notDone == false);
		
		if (choice.equals("view")) {
			viewData();
			return;
		}
		
		else if(choice.equals("quit")) {
			return;
		}
	
	}
	
	// Adding data
	public static void addData() {
		
		previousData();
		
		Element players = new Element("players");
		Element timer = new Element("timer");
		Element playerOne = new Element("playerOne");
		Element scoreOne = new Element("scoreOne");
		Element playerTwo = new Element("playerTwo");
		Element scoreTwo = new Element("scoreTwo");

		result.appendChild(players);
		players.appendChild(timer);
		players.appendChild(playerOne);
		players.appendChild(scoreOne);
		players.appendChild(playerTwo);
		players.appendChild(scoreTwo);
		
		timer.appendChild(Integer.toString(Score.getTime()));
		playerOne.appendChild(Game.playerOne);
		scoreOne.appendChild(Integer.toString(Score.getScoreOne()));
		playerTwo.appendChild(Game.playerTwo);
		scoreTwo.appendChild(Integer.toString(Score.getScoreTwo()));
		
		try {
			FileWriter xmlfile = new FileWriter("myfile.xml");
			BufferedWriter writer = new BufferedWriter(xmlfile);

			writer.write(result.toXML());
			writer.close();
		}

		catch (IOException e) // catches input/output exceptions
								
		{

		}

	}
	
	
	public static void previousData() {
		
		try {
			doc = builder.build(file); // builds the data from the xml file
			result = doc.getRootElement(); // names will take the root element								
		}

		catch (IOException e) // catches  input/output exception 				
		{
		
		}

		catch (ParsingException e) // catches parsing exceptions
		{
			System.out.println("> The error states either");
			System.out.println("> The scoreboard is currently empty");
			System.out.println("> The format of elements in the xml document is different from the expected");
			System.out.println();
			System.out.println("> If your library is empty, please ignore this error");
			System.out.println();
		}
	}
	// Adding Data
	
	
	public static void viewData() {
		
		try
		  {
			
		   Document doc = builder.build(file);
		   Element root = doc.getRootElement();
		   Elements result2 = root.getChildElements();
		   System.out.println("> Scoreboard");
		   
		  for (int i = 0; i < result2.size(); i++) {
			 
			  
			   System.out.println("Player One: " + result2.get(i).getFirstChildElement("playerOne").getValue());
			   System.out.println("Player Two: " + result2.get(i).getFirstChildElement("playerTwo").getValue());
			   System.out.println("Player One score: " + result2.get(i).getFirstChildElement("scoreOne").getValue());
			   System.out.println("Player Two score: " + result2.get(i).getFirstChildElement("scoreTwo").getValue());
			   System.out.println("Turn Time: " + result2.get(i).getFirstChildElement("timer").getValue()); 
			   System.out.println();
		  }
		  
		  }
		
		   catch(IOException e)
			  {
			    System.out.println("The error states either");
				System.out.println("Your library is empty");
				System.out.println("The format of elements in the xml document is different from the expected");
			  }

			catch(ParsingException e)
			  {
				System.out.println("The error states either");
				System.out.println("Your library is empty");
				System.out.println("The format of elements in the xml document is different from the expected");
			  }
	}
	
	
	
}
