import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        BinomialCoefficients solver = new BinomialCoefficients();
        solver.solve(1, in, out);
        out.close();
    }

    static class BinomialCoefficients {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }
            Arrays.sort(a);
            long ans = a[n - 1];

            if (ans % 2 == 0) {
                long mid = ans / 2;
                long min = Long.MAX_VALUE;
                long ans2 = 0;
                for (int i = 0; i < n; i++) {
                    if (a[i] == ans) {
                        continue;
                    }
                    long tmp = Math.abs(mid - a[i]);
                    if (tmp < min) {
                        min = tmp;
                        ans2 = a[i];
                    }
                }
                out.print(ans + " " + ans2);
            } else {
                long mid1 = ans / 2;
                long mid2 = mid1 + 1;
                long min = Long.MAX_VALUE;
                long ans2 = 0;
                for (int i = 0; i < n; i++) {
                    if (a[i] == ans) {
                        continue;
                    }
                    long tmp = Math.min(
                            Math.abs(mid1 - a[i]),
                            Math.abs(mid2 - a[i])
                    );
                    if (tmp < min) {
                        min = tmp;
                        ans2 = a[i];
                    }
                }
                out.print(ans + " " + ans2);

            }
        }

    }
}

