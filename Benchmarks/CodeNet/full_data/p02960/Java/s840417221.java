import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        DDigitsParade solver = new DDigitsParade();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDigitsParade {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String x = in.next();
            int dp[][] = new int[x.length() + 1][13];
            dp[0][0] = 1;
            long mod = 1000000007;
            for (int i = 0; i < x.length(); i++) {
                if (x.charAt(i) != '?') {
                    int k = Integer.parseInt(Character.toString(x.charAt(i)));
                    for (int j = 0; j < 13; j++) {
                        dp[i + 1][((10 * j + k) % 13)] += dp[i][j];
                        dp[i + 1][((10 * j + k) % 13)] %= mod;
                    }
                } else {
                    for (int k = 0; k < 10; k++) {
                        for (int j = 0; j < 13; j++) {
                            dp[i + 1][((10 * j + k) % 13)] += dp[i][j];
                            dp[i + 1][((10 * j + k) % 13)] %= mod;
                        }

                    }
                }
            }
            out.println(dp[x.length()][5]);
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

    }
}

