/**
 * The main 
 * 
 * @author John Zika
 *
 */
public class Game {

	public static void main(String[] args) {
		Shoe shoe = new Shoe(2, false);
		
		for (Card card : shoe.getShoe()) {
			System.out.println(card);
		}
		

	}

}
