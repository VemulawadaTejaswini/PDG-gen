import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		BigInteger N = new BigInteger(String.valueOf(sc.next()));
		BigInteger M = new BigInteger(String.valueOf(sc.next()));
		BigInteger m = M.subtract(N.multiply(new BigInteger("2")));
				
		if (m.compareTo(BigInteger.ZERO) == 0) {
			// equal
			System.out.println(N);
			sc.close();
			return;
		} else if (m.compareTo(BigInteger.ZERO) < 0) {
			// n big
			System.out.println(M.divide(new BigInteger("2")));
			sc.close();
			return;
		} else {
			// m big
			System.out.println(N.add(m.divide(new BigInteger("4"))));
		}
		
		sc.close();
	}
}
