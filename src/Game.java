import java.util.ArrayList;

import javax.sound.midi.Soundbank;

/**
 * The main game
 * 
 * @author John Zika
 *
 */
public class Game {


	
	public static void main(String[] args) {
		
		
		Deck deck = new Deck();
		for (Card card : deck.getDeck()) {
			System.out.println(card.toString());
			card.displayBackOfCard();
		}
		
	}
}