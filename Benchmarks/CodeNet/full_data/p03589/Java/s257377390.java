import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created on 2017/09/30 21:17.
 */
public class Main {
    private static long[] reduce(long p, long q) {
        BigInteger P = new BigInteger(Long.toString(p));
        BigInteger Q = new BigInteger(Long.toString(q));
        BigInteger gcd = P.gcd(Q);
        P = P.divide(gcd);
        Q = Q.divide(gcd);
        return new long[]{P.longValue(), Q.longValue()};
    }

    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLong()) {
            long N = sc.nextLong();
            long hAns = -1;
            long nAns = -1;
            long wAns = -1;

            for (long h = 1; hAns == -1 && h <= 3500; h++) {
                for (long n = h; n <= 3500; n++) {
                    long p = 4 * h * n - N * n - N * h;
                    if (p <= 0) {
                        continue;
                    }

                    long q = N * h * n;
                    long[] r = reduce(p, q);
                    if (r[0] == 1) {
                        hAns = h;
                        nAns = n;
                        wAns = r[1];
                        break;
                    }
                }
            }

            System.out.println(hAns + " " + nAns + " " + wAns);
        }
    }
}