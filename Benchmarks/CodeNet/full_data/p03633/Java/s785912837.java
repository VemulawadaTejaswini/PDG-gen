import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger[] t = new BigInteger[n];
        for (int i = 0; i < t.length; i++) {
            t[i] = sc.nextBigInteger();
        }
        BigInteger ans = BigInteger.ONE;
        for (int i = 0; i < t.length; i++) {
            ans = lcm(ans, t[i]);
        }
        System.out.println(ans);

    }

    public static BigInteger lcm(BigInteger a, BigInteger b) {
        return a.multiply(b).divide(gcd(a, b));
    }

    public static BigInteger gcd(BigInteger a, BigInteger b) {
        if(b == BigInteger.ZERO) return a;
        else return gcd(b, a.mod(b));
    }
}
