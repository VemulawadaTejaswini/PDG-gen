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
        BResale solver = new BResale();
        solver.solve(1, in, out);
        out.close();
    }

    static class BResale {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            int[] value = new int[n];
            for (int i = 0; i < n; i++) {
                value[i] = sc.nextInt();
            }
            int[] cost = new int[n];
            for (int i = 0; i < n; i++) {
                cost[i] = sc.nextInt();
            }

            int[][] dp = new int[n + 1][51 * n];
            boolean[][] go = new boolean[n + 1][51 * n];

            go[0][0] = true;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 51 * n; j++) {
                    if (go[i][j]) {
                        if (!go[i + 1][j]) {
                            dp[i + 1][j] = dp[i][j];
                        } else {
                            if (j - dp[i + 1][j] < j - dp[i][j]) {
                                dp[i + 1][j] = dp[i][j];
                            }
                        }
                        go[i + 1][j] = true;

                        if (!go[i + 1][j + value[i]]) {
                            dp[i + 1][j + value[i]] = dp[i][j] + cost[i];
                        } else {
                            if (j + value[i] - dp[i + 1][j + value[i]] < j + value[i] - dp[i][j] - cost[i]) {
                                dp[i + 1][j + value[i]] = dp[i][j] + cost[i];
                            }
                        }
                        go[i + 1][j + value[i]] = true;
                    }
                }
            }

            int max = 0;
            for (int i = 0; i < 51 * n; i++) {
                if (go[n][i])
                    max = Math.max(max, i - dp[n][i]);
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

