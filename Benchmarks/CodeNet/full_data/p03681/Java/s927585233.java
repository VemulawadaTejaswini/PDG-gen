import java.util.Scanner;
import java.lang.Math;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        BigInteger ans = BigInteger.ZERO;

        BigInteger X = BigInteger.ONE;
        BigInteger Y = BigInteger.ONE;

        for (int i = 1; i <= x; i++) {
            X = X.multiply(new BigInteger(String.valueOf(i)));
        }

        for (int i = 1; i <= y; i++) {
            Y = Y.multiply(new BigInteger(String.valueOf(i)));
        }

        if (x == y) {
            ans = (X.multiply(Y)).multiply(new BigInteger("2")).remainder(new BigInteger("1000000007"));
            System.out.println(ans);
        } else if (Math.abs(x-y) == 1) {
            ans = X.multiply(Y).remainder(new BigInteger("1000000007"));
            System.out.println(ans);
        } else {
            System.out.println(0);
        }

		sc.close();
	}
}
