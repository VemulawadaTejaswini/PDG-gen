import java.math.BigInteger;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
        int a = sc.nextInt();
        int b = sc.nextInt();
        BigInteger c = BigInteger.ZERO;

        c = (new BigInteger(String.valueOf(a)).add(new BigInteger(String.valueOf(b))).divide(new BigInteger("2")));

        System.out.println(c);

		sc.close();
	}
}
