package oop;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class MenuApplication{
//Video can be found here:
// https://www.screencast.com/t/fg2KsgMOM3
	public static void main(String[] args) {
		//Creates an ArrayList to hold videogame objects, and their child classes. A scanner is then opened to accept user input,
		//which is then saved in opChar. 
		ArrayList<Videogame> games = new ArrayList<Videogame>();
		Scanner input = new Scanner(System.in);
		char opChar;
		
		System.out.println("Welcome! Input the appropriate character to begin an operation: ");
		displayOptions();
		opChar = input.nextLine().charAt(0);
		
		//While opChar is not 'i', the char that ends the program, creates a switch case that does a different action depending 
		//on what the user set as opChar.
		while(opChar != 'i'){
			//opChar = input.nextLine().charAt(0);
			switch (opChar){
			case 'a' :
				games.add(addVideogame());
				break;
			case 'b' :
				//InputG is the string will hold the input Genre name.
				String inputG; 
				System.out.println("What genre of game would you like to add?");
				System.out.println("The options are: Platformer, RPG, Adventure, FPS, or Sandbox");
				inputG = input.nextLine();
				
				//Depending on what exact genre name the user input, switch case will create a child object based on the InputG string.
				switch (inputG){
					case "Platformer" :		
						games.add(addPlatformer());
						break;
					case "RPG" :
						games.add(addRPG());
						break;
					case "Adventure" :
						games.add(addAdventure());
						break;
					
					case "FPS" :
						games.add(addFPS());
						break;
					
					case "Sandbox" :
						games.add(addSandbox());
						break;
					default:
						//If the InputG is not any of the genres, the switch defaults, and exits the create genre operation.
						System.err.println("Invalid input, try again");
					}
				break;
			case 'c':
				deleteGame(games);
				break;
			case 'd':			
				printGames(games);
				break;
			case 'e':
				printGenre(games);
				break;
			case 'f':
				findGame(games);
				break;
			case 'g':
				printToFile(games);
				break;
			case 'h':
				printGenreToFile(games);
				break;
			case 'i':
				break;
			default:
				//Breaks switch if opChar is none of the case statements.
				System.out.println("Invalid input, try again");
	} 
	//After a case has completed and opChar is not 'i', prints out the options again and opens up for user to update opChar.
	System.out.println("Okay, what's next?");
	displayOptions();
	opChar = input.nextLine().charAt(0);
			}
		input.close(); //Closes scanner
		System.exit(0); //Exits program.
}
	
	public static void displayOptions(){
		//These are the options that the user can choose from depending on the character they input, from a-i.
		System.out.println("a: Create a new video game to be added!");
		System.out.println("b: Create a new specific genre to be added!");
		System.out.println("c: Delete a game!");
		System.out.println("d: Print all current games");
		System.out.println("e: Print all games of a specific genre!");
		System.out.println("f: Search for a game!");
		System.out.println("g: Print all games to a file!");
		System.out.println("h: Print all games of a specific genre to a file!");
		System.out.println("i: End program!");
	}
	
	public static Videogame addVideogame(){
		Scanner input = new Scanner(System.in);
		Videogame v = new Videogame(); //Creates a new videogame object
		System.out.println("Enter a title: ");
		v.setTitle(input.nextLine()); //Sets user input game title
	
		System.out.println("Enter a Company: ");
		v.setCompany(input.nextLine());//Sets user input game company name
	
		System.out.println("Enter an ESRB rating: ");
		v.setRating(input.next().charAt(0)); //Sets user input rating
	
	
		System.out.println("Enter a price: ");
		v.setPrice(input.nextDouble()); //Sets user input price.
		
		return v;
	}
	
	public static Platformer addPlatformer(){
		Scanner input = new Scanner(System.in);
		Platformer p = new Platformer(); //Creates a new Platformer object
		System.out.println("Enter a title: ");
		p.setTitle(input.nextLine()); //Sets user input game title
	
		System.out.println("Enter a Company: ");
		p.setCompany(input.nextLine()); //Sets user input game company name
	
		System.out.println("Enter a rating: ");
		p.setRating(input.next().charAt(0)); //Sets user input rating
	
		System.out.println("Enter a price: ");
		p.setPrice(input.nextDouble()); //Sets user input price.
	
		return p;
	}
	
	public static RPG addRPG(){
		Scanner input = new Scanner(System.in);
		RPG r = new RPG(); //Creates a new RPG object
		System.out.println("Enter a title: ");
		r.setTitle(input.nextLine()); //Sets user input game title
	
		System.out.println("Enter a Company: ");
		r.setCompany(input.nextLine()); //Sets user input game company name
	
		System.out.println("Enter a rating: ");
		r.setRating(input.next().charAt(0)); //Sets user input rating
	
		System.out.println("Enter a price: ");
		r.setPrice(input.nextDouble()); //Sets user input price.
		

		return r;
	}
	
	public static AdventureGame addAdventure(){
		Scanner input = new Scanner(System.in);
		AdventureGame a = new AdventureGame(); //Creates a new AdventureGame object
		System.out.println("Enter a title: ");
		a.setTitle(input.nextLine()); //Sets user input game title
	
		System.out.println("Enter a Company: ");
		a.setCompany(input.nextLine()); //Sets user input game company name
	
		System.out.println("Enter a rating: ");
		a.setRating(input.next().charAt(0)); //Sets user input rating
	
	
		System.out.println("Enter a price: ");
		a.setPrice(input.nextDouble()); //Sets user input price.
		return a;
	}
	
	public static FPS addFPS(){
		Scanner input = new Scanner(System.in);
		FPS f = new FPS(); //Creates a new FPS object
		System.out.println("Enter a title: ");
		f.setTitle(input.nextLine()); //Sets user input game title
	
		System.out.println("Enter a Company: ");
		f.setCompany(input.nextLine()); //Sets user input game company name
	
		System.out.println("Enter a rating: ");
		f.setRating(input.next().charAt(0)); //Sets user input rating
	
	
		System.out.println("Enter a price: ");
		f.setPrice(input.nextDouble()); //Sets user input price.
		return f;
	}
	
	public static Sandbox addSandbox(){
		Scanner input = new Scanner(System.in);
		Sandbox s = new Sandbox(); //Creates a new Sandbox object
		System.out.println("Enter a title: ");
		s.setTitle(input.nextLine()); //Sets user input game title
	
		System.out.println("Enter a Company: ");
		s.setCompany(input.nextLine()); //Sets user input game company name
	
		System.out.println("Enter a rating: ");
		s.setRating(input.next().charAt(0));//Sets user input rating
	 
	
		System.out.println("Enter a price: ");
		s.setPrice(input.nextDouble()); //Sets user input price.
		return s;
	}
	
	public static void deleteGame(ArrayList<Videogame> games){
		//Deletes a game object if found.
		
		//if 'games' isnt empty 
		if(games.size() >= 1){
			Scanner input = new Scanner(System.in);
			System.out.print("What is the exact title of the game you'd like to delete?");
			String chosenTitle = input.nextLine(); //Holds the user input title of the game they wish to delete
		
			//Loops through the contents of 'games'
			boolean gameFound = false;//Determines if an error message should be sent if game is found or not.
			for (int i = 0; i < games.size(); i++){
				if (games.get(i).getTitle().equals(chosenTitle)){ //If title and chosenTitle match, index is removed.
					games.remove(i);
					gameFound = true;
				}
			}
			
			if(!gameFound){
				System.err.println("Game could not be found."); //Returns an error message if no game was found.
			}
		
		}
		else
			//Message is printed if no objects are added to 'games'
			System.out.print("There are no games stored");
	}
	
	public static void printGames(ArrayList<Videogame> games){
		//Loops through the entirety of 'games' and uses toString() to print all necessary info.
		for (int j = 0; j < games.size(); j++){
			System.out.println("Game " + (j + 1)+ ": "  + games.get(j).toString());
		}
	}
	
	public static void printGenre(ArrayList<Videogame> games){
		//Does the same thing as printGames, but user inputs a genre string and only prints information if getGenre() matches chosenGenre
		System.out.println("What is the exact genre of game you'd like to print?");
		Scanner input = new Scanner(System.in);
		String chosenGenre = input.nextLine();
		
		for (int j = 0; j < games.size(); j++){
			if(games.get(j).getGenre().equals(chosenGenre))
				System.out.println("Game " + (j + 1)+ ":"  + games.get(j).toString());
			}
}
	public static void findGame(ArrayList<Videogame> games){
		//Does the same thing as deleteGame(), instead doesn't remove it from the ArrayList,
		//but prints the specified game's information.
		Scanner input = new Scanner(System.in);
		System.out.print("What is the exact title of the game you'd like to find?:");
		String chosenTitle = input.nextLine();
		
	boolean gameFound = false;
		for (int i = 0; i < games.size(); i++){
			if (games.get(i).getTitle().equals(chosenTitle)){
				System.out.println(games.get(i).toString());
				gameFound = true;
			}
		}
		if (!gameFound){
			System.err.println("Game could not be found.");
		}
	}
	
	public static void printToFile(ArrayList<Videogame> games){
		try{
		File gameFile = new File("gameInfo.txt"); //Creates a file named "gameInfo.txt" for game info to be output to.
		FileWriter writeFile = new FileWriter(gameFile);
		
		for(int i = 0; i < games.size(); i++){
			//Writes toString() info to "gameInfo.txt"
			writeFile.write("Game " + (i + 1)+ ":"  + games.get(i).toString());
		}
		writeFile.close(); //Closes file
		}
		catch (IOException e){
			//If error is encountered, catches it and prints an error message.
			System.err.println("Operation failed: Encountered problem during file actions");
		}
		
	}
	
	public static void printGenreToFile(ArrayList<Videogame> games){
		System.out.println("What is the exact genre of game you'd like to print to a file?");
		Scanner input = new Scanner(System.in);
		String chosenGenre = input.nextLine();
		//Does the exact same thing as printToFile(), but with a user input Genre to print.
		
		try{
		File gameFile = new File("gameGenreInfo.txt");
		FileWriter writeFile = new FileWriter(gameFile);
		
		for(int i = 0; i < games.size(); i++){
			if(games.get(i).getGenre().equals(chosenGenre))
				writeFile.write("Game " + (i + 1)+ ":"  + games.get(i).toString());
		}
		writeFile.close();
		}
		catch (IOException e){
			System.err.println("Operation failed: Encountered problem during file actions");
		}
	}
}
