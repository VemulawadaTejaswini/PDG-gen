import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String input = reader.nextLine();
		String[] aaa = input.split(" ");

		BigInteger b1 = new BigInteger(aaa[0]);
		BigInteger b2 = new BigInteger(aaa[1]);
		BigInteger b3 = new BigInteger(aaa[2]);

		if (b3.compareTo(b1) < 0) {
			BigInteger multiple;

			if (b1.mod(b3).compareTo(BigInteger.ZERO) != 0) {
				multiple = b1.divide(b3).add(BigInteger.ONE);
			} else {
				multiple = b1.divide(b3);
			}

			BigInteger lowerBound = b3.multiply(multiple);

			if (lowerBound.compareTo(b2) > 0) {
				System.out.println(0);
			} else {
				System.out.println(b2.subtract(lowerBound).divide(b3).add(BigInteger.ONE));
			}
		} else if (b2.compareTo(b3) < 0) {
			System.out.println(0);
		} else {
			BigInteger result = b2.subtract(b3).divide(b3).add(BigInteger.ONE);
			if (b1.compareTo(BigInteger.ZERO) == 0) {
				System.out.println(result.add(BigInteger.ONE));
			} else {
				System.out.println(result);
			}
		}

		reader.close();
	}
}