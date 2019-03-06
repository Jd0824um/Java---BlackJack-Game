import java.util.ArrayList;

public class Hand {

	private ArrayList<Card> hand;
	
	
	public Hand(){
		this.hand = new ArrayList<Card>();
	}
	
	public void showHand() {
		for (Card card : this.hand) {
			System.out.println(card);
		}
	}
	
	public void addCard(Card card) {
		this.hand.add(card);
	}
	
	public void clearHand() {
		this.hand.clear();
	}

}
