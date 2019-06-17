import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

/**
 * An implementation of a deck of cards.
 * 
 * @author John Zika
 *
 */

public class Deck {
	
	/**
	 * The array of cards in the deck, where the top card is in the first index.
	 */
	private Card card;
	private ArrayList<Card> deck = new ArrayList<>();
	
	public Deck() {
		try {
			BufferedImage cardBackIMG = ImageIO.read(new File("Assets/Card_Backs/Black_Back.png"));
			for (Suit suit : Suit.values()) {
				for (Value value : Value.values()) {
					card = new Card(suit, value, ImageIO.read(new File("Assets/Card_Values/" + value.toString() + "_of_" + suit.toString() + ".png")), cardBackIMG);
					System.out.println(card.toString());
					deck.add(card);
				}
			}
		} 
		catch (IOException ex) {
			// TODO: handle exception
		}
	}

	/**
	 * Returns the number of cards within the deck.
	 * @return
	 */
	public int numberOfCardsInDeck() {
		return this.deck.size();
	}
	
	/**
	 * Returns the deck itself as an ArrayList.
	 * @return
	 */
	public ArrayList<Card> getDeck() {
		return this.deck;
	}
}

	

