import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FRemovingRobots solver = new FRemovingRobots();
        solver.solve(1, in, out);
        out.close();
    }

    static class FRemovingRobots {
        long mod = 998244353;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int a[][] = new int[n][2];
            for (int i = 0; i < n; i++) {
                a[i][0] = in.nextInt();
                a[i][1] = in.nextInt();
            }
            Arrays.sort(a, (a1, a2) -> a1[0] - a2[0]);
            int next[] = new int[n];
            next[n - 1] = n;
            long dp[] = new long[n + 1];
            dp[n] = 1;
            for (int i = n - 1; i >= 0; i--) {
                int max = a[i][0] + a[i][1];
                int ne = i + 1;
                while (ne < n && max > a[ne][0]) {
                    ne = next[ne];
                }
                next[i] = ne;
            }
            for (int i = n - 1; i >= 0; i--) {
                dp[i] = dp[i + 1] + dp[next[i]];
                dp[i] %= mod;
            }
            out.println(dp[0]);
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

