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
 * @author Washoum
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DKnapsack1 solver = new DKnapsack1();
        solver.solve(1, in, out);
        out.close();
    }

    static class DKnapsack1 {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            int w = sc.nextInt();
            int[] wei = new int[n];
            int[] v = new int[n];
            for (int i = 0; i < n; i++) {
                wei[i] = sc.nextInt();
                v[i] = sc.nextInt();
            }

            long[][] dp = new long[n + 1][w + 1];
            boolean[][] go = new boolean[n + 1][w + 1];
            go[0][0] = true;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= w; j++) {
                    if (go[i][j]) {
                        dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j]);
                        go[i + 1][j] = true;
                        if (j + wei[i] <= w) {
                            dp[i + 1][j + wei[i]] = Math.max(dp[i + 1][j + wei[i]], dp[i][j] + v[i]);
                            go[i + 1][j + wei[i]] = true;
                        }
                    }
                }
            }
            long max = 0;
            for (int i = 0; i <= w; i++) {
                max = Math.max(max, dp[n][i]);
            }
            out.println(max);
        }

    }

    static class inputClass {
        BufferedReader br;
        StringTokenizer st;

        public inputClass(InputStream in) {

            br = new BufferedReader(new InputStreamReader(in));
        }

        public String next() {
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

    }
}

