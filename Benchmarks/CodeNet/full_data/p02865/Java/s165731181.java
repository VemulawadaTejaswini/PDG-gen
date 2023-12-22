/**
 * 
 */

/**
 * @author aiba-student
 *
 */
public class SumofTwoIntegers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 1000000;//input
		int result = 0;
		if (N % 2 ==1) {
			result = (N - 1)/2;
		}
		else {
			result = N/2 -1;
		}
		System.out.println("input N is "+N+" , then the result is " +result);
	}

}
