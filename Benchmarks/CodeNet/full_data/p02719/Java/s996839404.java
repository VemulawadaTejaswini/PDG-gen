import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

			BigInteger N = scanner.nextBigInteger();
			BigInteger K = scanner.nextBigInteger();

			BigInteger newN = N;

			if(N.compareTo(K) == 1) {
				newN = N.remainder(K);
			}else {
			newN = K.remainder(N);
			}

			N = newN.subtract(K);

			if(N.compareTo(newN) == 1) {
				System.out.println(newN);
			}else {
				System.out.println(N);
			}

	}

}
