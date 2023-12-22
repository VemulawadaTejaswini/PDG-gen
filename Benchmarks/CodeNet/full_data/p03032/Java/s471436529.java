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
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DEqueue solver = new DEqueue();
        solver.solve(1, in, out);
        out.close();
    }

    static class DEqueue {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), k = in.nextInt();

            long[] v = new long[n];
            for (int i = 0; i < n; i++) {
                v[i] = in.nextInt();
            }

            long[][] dp = new long[n + 1][k + 1]; // dp[i][j] is the most points you can have using j operations in the leftmost i items
            long[][] dp2 = new long[n + 1][k + 1]; // dp2[i][j] is the most points you can have using j operations in the rightmost i items

            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <= k; j++) {
                    dp[i][j] = Long.MIN_VALUE / 2;
                    dp2[i][j] = Long.MIN_VALUE / 2;
                }
            }


            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= k; j++) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + v[i - 1]); // take jewel
                    if (j >= 2) {
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 2]); // skip jewel
                    }
                }
            }

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= k; j++) {
                    dp2[i][j] = Math.max(dp2[i][j], dp2[i - 1][j - 1] + v[(n - 1) - (i - 1)]); // take jewel
                    if (j >= 2) {
                        dp2[i][j] = Math.max(dp2[i][j], dp2[i - 1][j - 2]); // skip jewel
                    }
                }
            }

            long answer = 0;

            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= k; j++) {
                    for (int j2 = j + 1; j2 <= k; j2++) {
                        dp[i][j2] = Math.max(dp[i][j2], dp[i][j]);
                        dp2[i][j2] = Math.max(dp2[i][j2], dp2[i][j]);
                    }
                    for (int i2 = i + 1; i2 <= n; i2++) {
                        dp[i2][j] = Math.max(dp[i2][j], dp[i][j]);
                        dp2[i2][j] = Math.max(dp2[i2][j], dp2[i][j]);
                    }
                }
            }


//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <= k; j++) {
//                if (dp[i][j] < -100000) System.out.print("X\t");
//                else System.out.print(dp[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <= k; j++) {
//                if (dp2[i][j] < -100000) System.out.print("X\t");
//                else System.out.print(dp2[i][j] + "\t");
//            }
//            System.out.println();
//        }


            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= k; j++) {
                    answer = Math.max(answer, dp[i][j] + dp2[n - i][k - j]);
                }
            }

            out.println(answer);

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

