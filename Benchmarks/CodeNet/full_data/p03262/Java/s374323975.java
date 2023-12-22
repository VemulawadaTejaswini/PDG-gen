import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.math.BigInteger;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Kenji
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC109C solver = new ABC109C();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC109C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int X = in.nextInt();
            long[] arr = new long[N + 1];
            for (int i = 0; i < N; i++) {
                arr[i] = in.nextLong();
            }
            arr[N] = X;
            Arrays.sort(arr);
            long ans = 0;
            for (int i = 0; i < N; i++) {
                long a = arr[i];
                long b = arr[i + 1];
                if (i == 0) {
                    ans = b - a;
                } else {
                    ans = gcd(ans, b - a);
                }
            }
            out.println(ans);
        }

        public static long gcd(long m, long n) {
            return BigInteger.java.math.BigInteger.valueOf(m).gcd(BigInteger.java.math.BigInteger.valueOf(n)).longValue();
        }

    }
}

