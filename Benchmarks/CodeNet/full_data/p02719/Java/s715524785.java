import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

			BigInteger N = scanner.nextBigInteger();
			BigInteger K = scanner.nextBigInteger();

			BigInteger newN = N;

			while(true) {
				if(N.compareTo(K) == 1) {
					newN = (N.subtract(K));
				}else {
					newN = (K.subtract(N));
				}
//				System.out.println(N);
//				System.out.println(K);
//				System.out.println(newN);

				if(newN.add(N).compareTo(K) == 0) {
					break;
				}
				N = newN;
			}

			if(N.compareTo(newN) == 1) {
				System.out.println(newN);
			}else {
				System.out.println(N);
			}

	}

}
