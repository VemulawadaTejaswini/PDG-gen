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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int K = in.nextInt();
            if (K <= 9) {
                out.println(K);
                return;
            }
            int[][] dp = new int[20][10];
            for (int i = 0; i < 10; i++) {
                dp[0][i] = 1;
            }
            int a = 0, b = 0;
            int cnt = 9;
            for (int j = 1; j < 20; j++) {
                for (int i = 0; i < 10; i++) {
                    if (i == 0) {
                        dp[j][i] += dp[j - 1][i] + dp[j - 1][i + 1];
                    } else if (i == 9) {
                        dp[j][i] += dp[j - 1][i] + dp[j - 1][i - 1];
                        cnt += dp[j][i];
                    } else {
                        dp[j][i] += dp[j - 1][i] + dp[j - 1][i + 1] + dp[j - 1][i - 1];
                        cnt += dp[j][i];
                    }
                    if (K <= cnt) {
                        a = i;
                        b = j;
                        break;
                    }
                }
                if (a != 0) {
                    break;
                }
            }
            long ans = 0;
            while (true) {
                ans = ans * 10 + a;
                if (b <= 0) break;
                if (0 < a && a < 9) {
                    if (cnt - dp[b - 1][a + 1] < K) {
                        a += 1;
                    } else if (cnt - dp[b - 1][a + 1] - dp[b - 1][a] < K) {
                        cnt -= dp[b - 1][a + 1];
                    } else {
                        cnt -= dp[b - 1][a + 1] + dp[b - 1][a];
                        a -= 1;
                    }
                } else if (a == 9) {
                    if (cnt - dp[b - 1][a] < K) {
                    } else {
                        cnt -= dp[b - 1][a];
                        a -= 1;
                    }
                } else {
                    if (cnt - dp[b - 1][a + 1] < K) {
                        a += 1;
                    } else {
                        cnt -= dp[b - 1][a + 1];
                    }
                }
                b--;
            }
            out.println(ans);
        }

    }

    static class MyScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public MyScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

