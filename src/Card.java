import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * An implementation of a card type
 * 
 * @author John Zika
 *
 */

public class Card {
	
	private Suit suit; //The suit of this card
	private Value value; //The value of this card	
	private BufferedImage cardFrontImage; //The representation of this card
	private BufferedImage cardBackImage;
	private JFrame cardFrontFrame = new JFrame();
	private JPanel cardFrontPanel = new JPanel();
	private JLabel cardFrontLabel = new JLabel();
	private JFrame cardBackFrame = new JFrame();
	private JPanel cardBackPanel = new JPanel();
	private JLabel cardBackLabel = new JLabel();

	
	/**
	 * 
	 * @param 
	 * 	suit = "Spades, Clubs, Hearts, Diamonds"
	 * @param 
	 * 	value = "Ace, 2, 3, 4... 10, Jack, Queen, King"
	 * @param 
	 * 	cardFrontImage = BufferedImage that represents the card
	 */
 Card(Suit suit, Value value, BufferedImage cardFrontImage, BufferedImage cardBackImage) {
		this.suit = suit;
		this.value = value;
		this.cardFrontImage = cardFrontImage;
		this.cardBackImage = cardBackImage;
		
		cardBackImage = resize(cardBackImage, 200, 100);
		cardBackFrame.setSize(100, 200);
		cardBackFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cardBackFrame.setUndecorated(true);
		cardBackFrame.setShape(new RoundRectangle2D.Double(0, 0, cardBackImage.getWidth(), cardBackImage.getHeight(), 20, 20));

		cardBackLabel = new JLabel(new ImageIcon(cardBackImage));
		
		cardBackFrame.add(cardBackPanel.add(cardBackLabel));
		
		cardFrontImage = resize(cardFrontImage, 200, 100);
		cardFrontFrame.setSize(100, 200);
		cardFrontFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cardFrontFrame.setUndecorated(true);
		cardFrontFrame.setShape(new RoundRectangle2D.Double(0, 0, cardFrontImage.getWidth(), cardFrontImage.getHeight(), 20, 20));

		cardFrontLabel = new JLabel(new ImageIcon(cardFrontImage));
		
		cardFrontFrame.add(cardFrontPanel.add(cardFrontLabel));
	}
	
	/**
	 * Returns the number of the card.
	 * @return
	 */
	public Value getValue() {
		return this.value;
	}
	
	/**
	 * Returns the suit of the card.
	 * @return
	 */
	public Suit getSuit() {
		return this.suit;
	}
	
	/**
	 * Returns the name of the card.
	 */
	public String toString() {
		return this.value.toString() + " of " + this.suit.toString();
		}
	
	/**
	 * Displays the card image.
	 */
	public void displayCard() {
		cardFrontFrame.setVisible(true);
	}	
	
	public void displayBackOfCard() {
		cardBackFrame.setVisible(true);
	}
	/**
	 * Helper method that resizes the card image.
	 * @param
	 * 	IMG The image to resize.
	 * @param height
	 * 	The height to resize to.
	 * @param width
	 * 	The width to resize to.
	 * @return
	 */
	private static BufferedImage resize(BufferedImage img, int height, int width) {
        Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        return resized;
	}
}



