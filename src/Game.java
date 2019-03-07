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
		createShoe(numberOfDecks(), true);
		for (Card card : shoe.getShoe()) {
			System.out.println(card);
		}
	}

	

	
	/**
	 * Gets the number of players for the game of blackjack. Creates player objects
	 * and stores it within the players ArrayList.
	 * @param numPlayers
	 */
	public void howManyPlayers(String numPlayers) {
		
		if (validation.isInt(numPlayers)) { // Checks to see if it is an int.
			
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
				players.add(player); // Adds the player to the ArrayList.
				
				System.out.println("Welcome " + player.getName() + " !\n");
				
				scanner.close(); // Closes the scanner.
			}
		}
	}
	
	/**
	 * A method to create decks based on the users input.
	 * @return
	 */
	public static String numberOfDecks() {
		System.out.println("How many decks do you want to use? (Max 8 decks in a shoe.)\n");
		Scanner scanner = new Scanner(System.in);
		String numDecks = scanner.nextLine();
		
		while (!validation.deckValidation(numDecks)) { // While invalid information exists, this continues to loop.
			System.out.println(numDecks.toString() + " is not valid.\n");
			System.out.println("Please make sure the number is within range (1 - 8), not empty, and a whole number.\n");
			System.out.println("How many decks wouldyou like to use?\n ");
			numDecks = scanner.nextLine();
		}
		
		scanner.close();
		return numDecks;
	}
	
	public static void createShoe(String numDecks, boolean shuffle) {
		shoe = new Shoe(Integer.parseInt(numDecks), shuffle);
	}
}
