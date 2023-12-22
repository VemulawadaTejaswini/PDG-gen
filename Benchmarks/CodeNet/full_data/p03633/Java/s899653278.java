import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		BigInteger[] A = new BigInteger[N];
		BigInteger ans = new BigInteger("1");
		for (int i = 0; i < N;i++) {
			A[i] = new BigInteger(reader.next());
			BigInteger gcd = A[i].gcd(ans);
			BigInteger mul = A[i].multiply(ans);
			ans = mul.divide(gcd);
		}

		System.out.println(ans);
		reader.close();

	}
}