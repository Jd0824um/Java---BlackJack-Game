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
		if (isInt(number) && isEmpty(number) && isInRange(number)) {
			return true;			
		}
		return false;
	}
	
	/**
	 * Checks if the inputed string is not to large.
	 * @param name
	 * @return
	 */
	public boolean playerValidation(String name) {
		if (isInRange(name) && isEmpty(name)) {
			return true;
		}
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
