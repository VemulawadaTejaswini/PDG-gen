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
 * @author EDGE
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt(), W = in.nextInt();
            int[] w = new int[n + 1];
            long[] v = new long[n + 1];

            for (int i = 1; i < n + 1; i++) {
                w[i] = in.nextInt();
                v[i] = in.nextLong();
            }

            long[][] dp = new long[n + 1][W + 1];

            for (int i = 0; i < n + 1; i++) {

                for (int j = 0; j < W + 1; j++) {
                    if (i == 0 || j == 0)
                        dp[i][j] = 0;
                    else if (j >= w[i]) {
                        dp[i][j] = Math.max(v[i] + dp[i - 1][j - w[i]], dp[i - 1][j]);
                    } else
                        dp[i][j] = dp[i - 1][j];
                }
            }

            out.println(dp[n][W]);
        }

    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

