import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger lcm = BigInteger.ONE;
        BigInteger[] a = new BigInteger[n];
        for(int i=0; i<n; i++) {
            a[i] = new BigInteger(in.next());
            BigInteger gcd = gcd(lcm, a[i]);
            lcm =  lcm.multiply(a[i]).divide(gcd);
        }
        long result = 0;
        for(int i=0; i<n; i++) {
            result += lcm.divide(a[i]).longValue();
            result %= 1000000007;
        }
        System.out.println(result);
    }
    private static BigInteger gcd(BigInteger a, BigInteger b) {
        if(b.equals(BigInteger.ZERO)) {
            return a;
        }
        return gcd(b, a.remainder(b));
    }
}
