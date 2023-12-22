import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //D - Binomial Coefficients
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] ai = new long[n];
        for(int i = 0; i < n; i++) {
            ai[i] = scanner.nextLong();
        }
        Arrays.sort(ai);

        BigInteger maxComb = BigInteger.ZERO;
        int maxI = 0;
        int maxJ = 0;
        for(int j = 0; j < n - 1; j++) {
            for(int i = j + 1; i < n; i++) {
                BigInteger c = comb(ai[i], ai[j]);
                if ( maxComb.compareTo(c) < 0) {
                    maxComb = c;
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        System.out.printf("%d %d\n", ai[maxI], ai[maxJ]);
    }

    private static BigInteger comb(long n, long r) {
        if ( r == 0 ) {
            return BigInteger.valueOf(1);
        }

        if ( r > n / 2 ) {
            return comb(n, n - r);
        }

        BigInteger p = BigInteger.ONE;
        BigInteger q = BigInteger.ONE;
        for(long i = 1; i <= r; i++) {
            p = p.multiply(BigInteger.valueOf(n - i + 1));
            q = q.multiply(BigInteger.valueOf(i));
        }
        return p.divide(q);
    }
}
