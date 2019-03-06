import java.util.ArrayList;


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
	private ArrayList<Card> deck = new ArrayList<>();
	
	public Deck() {
		for (int s = 0; s < 4; s++) { //For suit.
			for (int v = 0; v < 13; v++) { //For value.
				this.deck.add(new Card(Suit.values()[s], Value.values()[v])); //Create this card and put it in the deck array.
			}
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

	

