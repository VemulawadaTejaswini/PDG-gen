import java.math.BigInteger;
import java.util.Scanner;

/**
 * TITLE : Almost Everywhere Zero
 * URL : https://atcoder.jp/contests/abc154/tasks/abc154_e
 */
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int K = sc.nextInt();
		int count = 0;

		for (BigInteger bi = new BigInteger(N);
	            bi.compareTo(BigInteger.ZERO) > 0;
	            bi = bi.subtract(BigInteger.ONE)) {
			String target = bi.toString();
			if (target.replace("0", "").length() == K) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}