/**\
 * A class to handle all the validation of the game.
 * 
 * 
 * @author John Zika
 *
 */
public class Validation {

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
	 * Checks if the inputed string is not to large.
	 * @param name
	 * @return
	 */
	public boolean nameLength(String name) {
		if (name.matches("........") || name.length() <= 8) {
			return true;
		}
		else {
			return false;
		}
	}
}
