import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        GCDonBlackboard solver = new GCDonBlackboard();
        solver.solve(1, in, out);
        out.close();
    }

    static class GCDonBlackboard {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long[] a = new long[n];

            long[] left = new long[n + 1];
            long[] right = new long[n + 1];

            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }

            left[0] = a[0];
            right[n - 1] = a[n - 1];

            for (int i = 1; i < n; i++) {
                left[i] = gcd(left[i - 1], a[i]);
                right[n - i - 1] = gcd(right[n - i], a[n - i - 1]);
            }

            long result = Math.max(right[1], left[n - 2]);
            for (int i = 1; i < n - 1; i++) {
                result = Math.max(result, gcd(left[i - 1], right[i + 1]));
            }

            out.println(result);
        }

        static long gcd(long a, long b) {
            return b == 0 ? a : gcd(b, a % b);
        }

    }
}

