import java.util.ArrayList;
import java.util.Scanner;

/**
 * The main game
 * 
 * @author John Zika
 *
 */
public class Game {

	private static Validation validation = new Validation();
	private ArrayList<Player> players;
	private static Shoe shoe;
	
	public static void main(String[] args) {
		if (mainMenu()) {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			int numOfPlayers;
			do {
				System.out.println("How many players will be playing BlackJack?...");
				
				while (!scanner.hasNextInt()) {
					System.out.println("Numbers only please!\n How many players?...\n");
					scanner.next();
				}
				numOfPlayers = scanner.nextInt();
			}
			while (numOfPlayers > 0 && numOfPlayers <= 8);
				createPlayer(numOfPlayers);
		}
	}

	
	/*
	 * Main menu method that takes the user's choice and delivers them to the proper method.
	 */
	public static boolean mainMenu() {
		Menu menu = new Menu();		
		int choice;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to BlackJack!");
		menu.showMenu();
		
		do {
			while (!scanner.hasNextInt()) {
				System.out.println("That was not a number. Please enter a number 1 - 4");
				scanner.next();
			}
			
			choice = scanner.nextInt();
			
			switch(choice) {
			case 2:
				menu.showRules();
				break;
			case 3:
				menu.showCredits();
				break;
			case 4:
				exit(scanner);
			}
		}
		while (choice != 1);
		return true;	
	}

	
	/**
	 * Gets the number of players for the game of blackjack. Creates player objects
	 * and stores it within the players ArrayList.
	 * @param numPlayers
	 */
	public static void createPlayer(int numPlayers) {
		
		if (validation.isInt(numPlayers)) { // Checks to see if it is an int.
			if (Integer.parseInt(numPlayers) < 0 && Integer.parseInt(numPlayers) >= 7) {
				for (int p = 0; p < Integer.parseInt(numPlayers); p++) {
					System.out.println("Enter your name player " + p + 1 + " !\n");				
					Scanner scanner = new Scanner(System.in);	
					String name = scanner.nextLine(); // Gets the name of the player.
					
					while (!validation.playerValidation(name)) { // While invalid information exists, this continues to loop.
						System.out.println("Not a valid name. Please keep it at 8 characters or less!\n");
						System.out.println("Please enter your name player " + p + 1 + " !\n");
						name = scanner.nextLine();		
					}
					
					Player player = new Player(); // Creates a new player object.
					player.setName(name); // Sets the player's name to the corresponding input.
					this.players.add(player); // Adds the player to the ArrayList.
					
					System.out.println("Welcome " + player.getName() + " !\n");
					
					scanner.close(); // Closes the scanner.
				}
			}
		}
	}
	
	/**
	 * A method to create decks based on the users input.
	 * @return
	 */
	public static int howManyDecks() {
		Scanner scanner = new Scanner(System.in);
		int decks;
		
		do {
			System.out.println("How many decks do you want to use?\n(Max 8 decks in a shoe.)\n");
			
			while (!scanner.hasNextInt()) {
				System.out.println("Numbers only.");
				System.out.println("How many decks would you like to use?\n ");
				scanner.next();
			}
			
			decks = scanner.nextInt();
			
			while (decks < 1 && decks >= 8); {
				System.out.println("Please enter a number from 1-8.\n");
				scanner.next();
			}

		}		
		while (decks > 1 && decks <= 8);
			scanner.close();
			return decks;
	}
	
	/**
	 * Creates a shoe for the game based on the number of decks.
	 * @param numDecks
	 * @param shuffle
	 */
	public static void createShoe(String numDecks, boolean shuffle) {
		shoe = new Shoe(Integer.parseInt(numDecks), shuffle);
	}
	
	/**
	 * Terminates program.
	 */
	public static void exit(Scanner scanner) {
		System.out.println("Thank you for playing!");
		System.out.println("Created by John Zika.");
		scanner.close();
		System.exit(0);
	}
}