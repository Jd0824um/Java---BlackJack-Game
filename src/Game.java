import java.util.ArrayList;
import java.util.Scanner;

/**
 * The main game
 * 
 * @author John Zika
 *
 */
public class Game {

	private Validation validation;
	private ArrayList<Player> players;
	
	public static void main(String[] args) {
		Shoe shoe = new Shoe(2, true);
		
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
				System.out.println("Enter your name player " + p + 1 + " !");				
				Scanner scanner = new Scanner(System.in);	
				String name = scanner.nextLine(); // Gets the name of the player.
				
				while (!validation.nameLength(name)) {
					System.out.println("Name is to long. Please keep it at 8 characters or less!");
					System.out.println("Please enter your name player " + p + 1 + " !");
					name = scanner.nextLine();		
				}
				
				Player player = new Player(); // Creates a new player object.
				player.setName(name); // Sets the player's name to the corresponding input.
				players.add(player); // Adds the player to the ArrayList.
				
				System.out.println("Welcome " + player.getName() + " !");
				
				scanner.close(); // Closes the scanner.
			}
		}
	}
	
	public void createShoe(int numDecks, boolean shuffle) {
		
	}
}
