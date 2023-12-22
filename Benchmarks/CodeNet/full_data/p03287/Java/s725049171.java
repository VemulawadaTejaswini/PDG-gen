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
        CandyDistribution solver = new CandyDistribution();
        solver.solve(1, in, out);
        out.close();
    }

    static class CandyDistribution {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long m = in.nextLong();
            long[] a = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = Long.parseLong(in.next());
            }

            long[] sum = new long[n + 1];

            long result = 0;
            for (int i = 1; i <= n; i++) {
                sum[i] = a[i] + sum[i - 1];
                if (sum[i] % m == 0L) {
                    result++;
                }
            }
            for (int i = 2; i <= n; i++) {
                long minus = a[i - 1];
                for (int j = i; j <= n; j++) {
                    sum[j] -= minus;
                    if (sum[j] % m == 0L) {
                        result++;
                    }
                }
            }
            out.println(result);

        }

    }
}

