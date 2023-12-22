import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author vdewansa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        MCandies solver = new MCandies();
        solver.solve(1, in, out);
        out.close();
    }

    static class MCandies {
        final int MOD = 1_000_000_000 + 7;

        int add(int a, int b) {
            return (a + b) % MOD;
        }

        int sub(int a, int b) {
            return (a + MOD - b) % MOD;
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int K = in.nextInt();
            int[] a = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                a[i] = in.nextInt();
            }
            int[] ways = new int[K + 1];
            int[] cumsum = new int[K + 1];
            for (int n = 1; n <= N; n++) {
                cumsum[0] = ways[0] = 1;
                for (int k = 1; k <= K; k++) {
                    cumsum[k] = add(cumsum[k - 1], ways[k]);
                }
                for (int k = 1; k <= K; k++) {
                    ways[k] = cumsum[k];
                    if (k - a[n] - 1 >= 0) {
                        ways[k] = sub(ways[k], cumsum[k - a[n] - 1]);
                    }
                }
            }
            out.println(ways[K]);
        }

    }
}

