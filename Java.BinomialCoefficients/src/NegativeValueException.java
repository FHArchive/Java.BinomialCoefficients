/**
 * @date 09/10/2018
 * @author Kieran
 *
 * Define an exception called NegativeValueException. This is thrown
 * when a negative value is used where it should not be.
 */
public class NegativeValueException extends Exception {
	public NegativeValueException() {
	}

	public String getMessage() {
		return "Negative values cannot be inputted for this function - input natural numbers only ";
	}

}
