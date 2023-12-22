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
        ARangeFlipFindRoute solver = new ARangeFlipFindRoute();
        solver.solve(1, in, out);
        out.close();
    }

    static class ARangeFlipFindRoute {
        int[][] a;
        int h;
        int w;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            h = in.nextInt();
            w = in.nextInt();
            a = new int[h + 1][w + 1];
            long dp[][] = new long[h + 1][w + 1];
            long dp2[][] = new long[h + 1][w + 1];
            for (int i = 0; i <= h; i++) {
                for (int j = 0; j <= w; j++) {
                    dp[i][j] = Integer.MAX_VALUE;
                    dp2[i][j] = Integer.MAX_VALUE;

                }
            }
            for (int i = 1; i <= h; i++) {
                String x = in.next();
                for (int j = 1; j <= w; j++) {
                    if (x.charAt(j - 1) == '.')
                        a[i][j] = 1;
                }
            }
//        dfs(0,0,1,0);
            dp[0][1] = 0;
            dp[1][0] = 0;
            a[0][1] = 1;
            a[1][0] = 1;
            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= w; j++) {
                    if (a[i][j] != a[i - 1][j]) {
                        dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + 1);
                    } else {
                        dp[i][j] = Math.min(dp[i][j], dp[i - 1][j]);
                    }
                    if (a[i][j] != a[i][j - 1]) {
                        dp[i][j] = Math.min(dp[i][j], dp[i][j - 1] + 1);
                    } else {
                        dp[i][j] = Math.min(dp[i][j], dp[i][j - 1]);
                    }
                }
            }

            out.println((int) Math.ceil((double) dp[h][w] / 2));
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

