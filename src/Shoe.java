import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


/**
 * Implementation of a "shoe" of cards for the dealer.
 * 
 * @author John Zika
 *
 */
public class Shoe {

	private int numDecksInShoe; // The number of decks within the shoe.
	private int numCardsInShoe; // The number of cards within the shoe.
	
	/**
	 * An ArrayList that holds all the cards from all the decks.
	 */
	private ArrayList<Card> shoe = new ArrayList<Card>();
	
	/**
	 * Default constructor if arguments were not specified.
	 */
	public Shoe() {
		this(1, false);
	}
	
	/**
	 * Constructor that takes in two arguments, how many decks and to shuffle, and adds the cards
	 * from the decks to the shoe.
	 * @param howManyDecks
	 * @param shuffle
	 */
	public Shoe(int howManyDecks, boolean shuffle) {
		this.numDecksInShoe = howManyDecks;
		
		for (int d = 0; d < this.numDecksInShoe; d++) {
			ArrayList<Card> deck = new ArrayList<Card>(new Deck().getDeck());

			for (Card card : deck) { // For each card in the deck.
				this.shoe.add(card); // Add to the shoe.
			}			
		}
		
		this.numCardsInShoe = this.shoe.size(); // Sets the size of the shoe to variable
		
		if (shuffle) { // If boolean was true, shuffle the shoe.
			this.shuffle();
		}
	}
	
	public void shuffle() { // Uses the collections class to shuffle the shoe.
		Collections.shuffle(this.shoe);
	}
	
	/**
	 * Deals a card from the ArrayList. Takes the card object from the first index and
	 * removes it from the array.
	 * @return
	 */
	public Card dealCard() {
		Card card = this.shoe.get(0);
		this.shoe.remove(0);
		return card;
	}

	/**
	 * Returns the number of decks in the shoe.
	 * @return
	 */
	public int getDecksInShoe() {
		return this.numDecksInShoe;
	}
	
	/**
	 * Returns the number of cards in the shoe.
	 * @return
	 */
	public int getCardsInShoe() {
		return this.numCardsInShoe;
	}
	
	public ArrayList<Card> getShoe(){
		return this.shoe;
	}
}
