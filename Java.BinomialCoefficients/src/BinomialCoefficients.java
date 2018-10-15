/**
 * @date 09/10/2018
 * @author Kieran
 *
 */
public class BinomialCoefficients {

	/**
	 * Main method used with the test case 4c2, this will return 6
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			System.out.println(c(4, 2));
		}
		// Catch any exception
		catch (NegativeValueException e) {
			System.err.println(e.getMessage());
		}
	}

	/**
	 * Perform the function nCk = (n!)/k!(n-k)! Where n and k are integers and
	 * the answer is an integer
	 * 
	 * @param n
	 * @param k
	 * @return answer
	 * @throws NegativeValueException
	 */
	public static int c(int n, int k) throws NegativeValueException {
		if (n < 0 || k < 0) {
			throw new NegativeValueException();
		}
		// When k = 0, nCk = (n!)/k!(n-k)! = n!/(1*n!) = 1
		if (k == 0) {
			return 1;
		}
		// When k = n, nCk = (n!)/k!(n-k)! = n!/(n!*1) = 1
		else if (k == n) {
			return 1;
		}
		// When k > n, return 0
		else if (k > n) {
			return 0;
		} else {
			return c(n - 1, k - 1) + c(n - 1, k);
		}
	}

}
