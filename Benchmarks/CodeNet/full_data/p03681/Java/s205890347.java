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

        if (Math.abs(x-y) > 1) {
            System.out.println(ans);
            sc.close();
            return;
        }


        if (x == y) {

            for (int i = 1; i <= x; i++) {
                X = X.multiply(new BigInteger(String.valueOf(i)));
            }

            ans = (X.multiply(X)).multiply(new BigInteger("2")).remainder(new BigInteger("1000000007"));
            System.out.println(ans);
        } else if (x > y) {
    
            for (int i = 1; i <= y; i++) {
                X = X.multiply(new BigInteger(String.valueOf(i)));
            }

            ans = X.multiply(X.multiply(new BigInteger(String.valueOf(x)))).remainder(new BigInteger("1000000007"));
            System.out.println(ans);
        } else {
    
            for (int i = 1; i <= x; i++) {
                X = X.multiply(new BigInteger(String.valueOf(i)));
            }

            ans = X.multiply(X.multiply(new BigInteger(String.valueOf(y)))).remainder(new BigInteger("1000000007"));
            System.out.println(ans);
        }

		sc.close();
	}
}
