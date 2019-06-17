/**
 * A class to handle all the validation checks of the game.
 * 
 * 
 * @author John Zika
 *
 */
public class Validation {
	
	/**
	 * Checks to see that the deck being created is valid.
	 * @param number
	 * @return
	 */
	public boolean deckValidation(String number) {
		if (!isEmpty(number) && isInRange(number)) {
			return true;			
		}
		return false;
	}
	
	public boolean menuValidation(String number) {
		if (isInt(number)) {
			return true;
		}
		System.out.println("Please enter a number 1 - 4");
		return false;
	}
	/**
	 * Checks if the inputed string is not to large.
	 * @param name
	 * @return
	 */
	public boolean playerValidation(String name, int p) {
		if (isInRange(name) && isEmpty(name)) {
			return true;
		}
		System.out.println("Not a valid name. Please keep it at 8 characters or less!\n");
		System.out.println("Please enter your name player " + p + 1 + " !\n");
		return false;
	}
	
	
	/**
	 * Checks to see if the inputed string is a int.
	 * @param number
	 * @return
	 */
	public boolean isInt(String number) {
		try {
			Integer.parseInt(number);
			return true;
		} 
		catch (NumberFormatException e) {
			System.out.println("Numbers only please!\n");
			return false;
		}
	}
	
	/**
	 * Checks to see if the number is in range.
	 * @param number
	 * @return
	 */
	public boolean isInRange(String number) {
		
		if (Integer.parseInt(number) > 0 && Integer.parseInt(number) <= 8) {			
			return true;
		}
		return false;
	}
		
	/**
	 * Checks to see if the string is empty. No input or all whitespace.
	 * @param string
	 * @return
	 */
	public boolean isEmpty(String string) {
		if(string.isBlank()) {
			return false;
		}
		return true;
	}
}