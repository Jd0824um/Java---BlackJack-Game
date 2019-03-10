import java.util.Scanner;

/**
 * Menu class for Blackjack
 * 
 * 
 * @author John Zika
 *
 */
public class Menu {
	
	/**
	 * Shows the menu choices.
	 */
	public void showMenu() {
		System.out.println("Please choose an option from below...\n");
		System.out.println("1) Play!\n");
		System.out.println("2) Rules\n");
		System.out.println("3) Credits\n");
		System.out.println("4) Exit\n");
		
	}
	
	/**
	 * Shows author and any contributing sources.
	 */
	public void showCredits() {
		System.out.println("Created by John Zika");
	}
		
	/**
	 * Shows the rules to the game.	
	 */
	public void showRules() {
		System.out.println("How to Play - General Game Rules\r\n" + 
				"				In each round of Blackjack, players seated at the table begin by placing a bet into their respective betting positions, also known as ‘boxes’. Each table clearly states the minimum and maximum stakes that players can bet, and bet sizes can be chosen by clicking on the chip icon which denotes the correct value of a desired wager. After all wager(s) are placed, players will be dealt two cards face-up in front of their boxes, and the dealer will receive either one card (European style) or two cards with one face-up and one face-down (Atlantic City style), depending on the variant they are playing.\r\n" + 
				"\r\n" + 
				"				The goal in any hand of Blackjack is to beat the dealer. To do this, you must have a hand that scores higher than the dealer's hand, but does not exceed 21 in total value. Alternatively, you can win by having a score lower than 22 when the value of the dealer's hand exceeds 21. When the total value of your hand is 22 or more, this is more commonly known as ‘busting’, and you will automatically lose any money wagered.\r\n" + 
				"\r\n" + 
				"				When prompted, you can draw cards to your hand(s) in order to increase its total value. When you have finished drawing cards, the dealer will complete their hand. There are strict rules as to how they do so, which differ depending on the Blackjack variant you are playing. Make sure you understand each variant’s rules, as this is a major aspect of how Blackjack is played and allows you to make important strategic decisions in each hand.\r\n" + 
				"\r\n" + 
				"				The best hand in Blackjack is, unsurprisingly, ‘Blackjack’. The game’s best hand pays more than any other combination (up to 3:2 on your wager, depending on which game variant you are playing), and is made up of an ace and any card valued at ten - including any jack, queens, king or ten. Blackjack must be dealt on your two first cards to count, and is unbeatable. It can, however, be tied if the dealer's hand is also Blackjack.\r\n" + 
				"\r\n" + 
				"				In Blackjack, tens, jacks, queens and kings each have a value of ten. Aces can have two different values, of either one or eleven (you can choose which). For example, when you combine an ace and four, your hand can be worth either five or 15. Whenever an ace is valued at 11, the higher total is often referred to as a ‘soft’ total, so in the given example, 15 would be a ‘soft 15’. Players can request an extra card, or ‘hit’, or double on a soft hand without the risk of busting. However, a soft hand is not guaranteed to improve after you’ve hit.\r\n" + 
				"\r\n" + 
				"				Winning hands in Blackjack will generally pay one-to-one (1:1), also known as ‘evens’ or ‘even money’. Therefore, if you wager $20 and win your hand, you will usually receive $20 in profit on top of your original wager. Get dealt Blackjack while playing a game variant which pays 3:2 and you would receive $30 in profit on top of your original wager, if the dealer does not get dealt Blackjack as well.\r\n" + 
				"\r\n" + 
				"				Whenever your hand ties with the dealer's, this is known as a ‘push’. Should this happen, you will be returned your wager, but will not be awarded additional money. Lose a hand and you will forfeit your wager to the house. There are exceptions to these general rules, which are outlined below, and on each game variant's rules page.\r\n" + 
				"\r\n" + 
				"				Usually, you will be awarded your payout after the dealer has completed their hand. It's very important than you read each variant’s rules to check for any specific differences, as the rules by which the dealer plays and pays are strict, and will often differ. The most common rule difference between variants will be whether or not the dealer draws cards on a soft 17. In some variants the dealer must stand on a soft 17, while in others the dealer must hit. In all Blackjack games, the dealer will hit on any hard or soft total of 16 or under.\r\n" + 
				"\r\n" + 
				"				How to Split, Double Down and Surrender\r\n" + 
				"				Your actions in Blackjack are not just limited to drawing cards or sticking with what you are initially dealt. In certain circumstances you will be presented with several additional options. These options are dependent on the initial two cards you are dealt. These options include:\r\n" + 
				"\r\n" + 
				"				Splitting\r\n" + 
				"				In essence, splitting turns one hand into two, giving you more chances to win. Whenever you split a hand, you can place an additional wager on the newly formed second hand, of equal value to your initial wager. Splitting can occur in the following situations:\r\n" + 
				"\r\n" + 
				"				You are dealt two starting cards of equal rank (king-ten, six-six and so on). Both hands are then played independently and will win, lose or push on their own merit\r\n" + 
				"				In some blackjack variants, you may split equal cards more than once\r\n" + 
				"				Splitting also has restrictions when it comes to being dealt aces. When you split two aces, almost all variants of Blackjack allow only one card to be drawn to each of the new hands, restricting your chances of hitting, splitting or doubling down to improve your hand.\r\n" + 
				"\r\n" + 
				"				Doubling Down\r\n" + 
				"				The option to Double Down allows you to double your initial wager, but only in certain circumstances:\r\n" + 
				"\r\n" + 
				"				After the first two cards are dealt, you can add an additional wager (equal to the starting bet) and then receive one extra card with the aim of improving your hand\r\n" + 
				"				All PokerStars Casino Blackjack games allow you to double down on any two first cards.\r\n" + 
				"				In certain game variants, doubling down is allowed after splitting. However, other elements must be taken into account:\r\n" + 
				"\r\n" + 
				"				After splitting a hand into two hands (or more), you may have the option to double down, adding another bet to the table\r\n" + 
				"				If you choose to double down following a split, the same rules as a normal double down will apply thereafter\r\n" + 
				"				Surrender\r\n" + 
				"				In some Blackjack games, surrendering allows you to forfeit your hand and take back 50% of your initial wager if you feel you are bound to lose to the dealer, provided it is allowed in the variant you are playing.\r\n" + 
				"\r\n" + 
				"				Game Play Options\r\n" + 
				"				You will be presented with a number of decisions to make during each round of Blackjack. The decisions open to you will depend upon the cards you are dealt and the game variant you are playing. Here are the options traditionally open to you in Blackjack:\r\n" + 
				"\r\n" + 
				"				Hit\r\n" + 
				"				You can request additional cards to improve your hand(s). Cards will be drawn one at a time until the total hand value is 21 or higher.\r\n" + 
				"\r\n" + 
				"				Stand\r\n" + 
				"				When the total value of your hand is 21 or lower, and can choose to stand and not to risk the chance of your hand(s) exceeding 21 in total value.\r\n" + 
				"\r\n" + 
				"				Split\r\n" + 
				"				In certain variants, when your first two cards have equal value (eight-eight, jack-ten etc), you can make additional wagers (equal to the starting bet) and create a second hand with which to play against the dealer.\r\n" + 
				"\r\n" + 
				"				Double Down\r\n" + 
				"				You may place an additional wager, equal to the starting bet, in exchange for just one more card for your hand(s), after which you will automatically stand.\r\n" + 
				"\r\n" + 
				"				Surrender\r\n" + 
				"				In certain game variants, you may forfeit half of your bet and end the hand immediately.\r\n" + 
				"\r\n" + 
				"				Insurance\r\n" + 
				"				In certain game variants, when the dealer's first card is an ace, you can wager half of your original bet amount and receive a 2:1 payout if the dealer hits Blackjack. If the dealer does have Blackjack, you will break-even on the hand.\r\n" + 
				"\r\n" + 
				"				Even Money\r\n" + 
				"				If you have been dealt Blackjack, and the dealer is showing an ace, even money is a special type of insurance bet that can be made. If you decide to take even money, the payout will be 1:1, regardless of whether the dealer has Blackjack or not. If you do not take even money, the hand will play out as normal.");
	}
}
