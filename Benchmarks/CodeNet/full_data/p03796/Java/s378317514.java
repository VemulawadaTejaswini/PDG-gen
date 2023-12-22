import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = Long.parseLong(sc.next());
		sc.close();

		BigInteger power = new BigInteger("1");
		for(int i = 1; i <= N; i++) {
			BigInteger tmp = new BigInteger(String.valueOf(i));
			power = power.multiply(tmp);
		}

		BigInteger check = new BigInteger("100000007");
		power.remainder(check);

		System.out.println(power);

	}

}