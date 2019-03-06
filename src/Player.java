import java.util.ArrayList;

/**
 * 
 * Creates a player object that stores the name and hand of the player.
 * 
 * 
 * @author John Zika
 *
 */
public class Player {

	private String name;
	private ArrayList<Hand> hand;
	
	public Player() {
		this.hand = new ArrayList<Hand>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
