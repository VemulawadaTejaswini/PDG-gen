import java.util.Scanner;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
        BigInteger n = new BigInteger(String.valueOf(sc.nextInt()));
        BigInteger a = BigInteger.ZERO, b = BigInteger.ZERO;
        int ans = n.intValue();

        for (int i = 1; n.divide(new BigInteger("2")).compareTo(new BigInteger(String.valueOf(i))) > 0; i++) {
            a = new BigInteger(String.valueOf(i));
            b = n.divide(new BigInteger(String.valueOf(i)));
            if (n.mod(new BigInteger(String.valueOf(i))).compareTo(BigInteger.ZERO) == 0) {
                if (String.valueOf(a).length() > String.valueOf(b).length()) {
                    if (ans > String.valueOf(a).length()) {
                        ans = String.valueOf(a).length();
                    }
                } else {
                    if (ans > String.valueOf(b).length()) {
                        ans = String.valueOf(b).length();
                    }
                }
            }
        }

        System.out.println(ans);

		sc.close();
	}
}
