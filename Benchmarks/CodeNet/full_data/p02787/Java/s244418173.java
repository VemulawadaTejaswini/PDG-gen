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
 * @author AnandOza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ECrestedIbisVsMonster solver = new ECrestedIbisVsMonster();
        solver.solve(1, in, out);
        out.close();
    }

    static class ECrestedIbisVsMonster {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int h = in.nextInt(), n = in.nextInt();
            int[] a = new int[n], b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                b[i] = in.nextInt();
            }

            long[] dp = new long[h + 1];
            Arrays.fill(dp, Long.MAX_VALUE);
            dp[0] = 0;

            for (int i = 0; i < h; i++) {
                if (dp[i] == Long.MAX_VALUE)
                    continue;
                for (int j = 0; j < n; j++) {
                    int next = Math.min(h, i + a[j]);
                    long cost = dp[i] + b[j];
                    dp[next] = Math.min(dp[next], cost);
                }
            }

            out.println(dp[h]);
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

