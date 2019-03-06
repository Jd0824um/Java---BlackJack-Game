/**
 * An implementation of a card type
 * 
 * @author John Zika
 *
 */
public class Card {
	
	/**
	 * One of the four valid suits for this card.
	 */
	private Suit mySuit;
	
	/**
	 * The number of this card.
	 */
	private Value myValue;
	
	/**
	 * Card constructor
	 * 
	 * @param aSuit
	 * @param aValue
	 */
	public Card(Suit aSuit, Value aValue) {
		this.mySuit = aSuit;
		this.myValue = aValue;
	}
	
	/**
	 * Returns the number of the card.
	 * @return
	 */
	public Value getValue() {
		return this.myValue;
	}
	
	/**
	 * Returns the suit of the card.
	 * @return
	 */
	public Suit getSuit() {
		return this.mySuit;
	}
	
	/**
	 * Returns the name of the card.
	 */
	public String toString() {
		return this.myValue.toString() + " of " + this.mySuit.toString();
		}
	}

