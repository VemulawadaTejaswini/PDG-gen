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
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        F_LCS solver = new F_LCS();
        solver.solve(1, in, out);
        out.close();
    }

    static class F_LCS {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            String s = in.ns();
            String t = in.ns();
            int sn = s.length();
            int tn = t.length();
            int[][] dp = new int[sn + 1][tn + 1];
            int[][][] path = new int[sn + 1][tn + 1][2];
            for (int i = 0; i < sn; i++) {
                for (int j = 0; j < tn; j++) {
                    if (s.charAt(i) == t.charAt(j)) {
                        dp[i + 1][j + 1] = dp[i][j] + 1;
                        path[i + 1][j + 1][0] = i;
                        path[i + 1][j + 1][1] = j;
                    } else {
                        if (dp[i + 1][j] > dp[i][j + 1]) {
                            dp[i + 1][j + 1] = dp[i + 1][j];
                            path[i + 1][j + 1][0] = i + 1;
                            path[i + 1][j + 1][1] = j;
                        } else {
                            dp[i + 1][j + 1] = dp[i][j + 1];
                            path[i + 1][j + 1][0] = i;
                            path[i + 1][j + 1][1] = j + 1;
                        }
                    }
                }
            }
            int i = sn, j = tn;
            StringBuilder sb = new StringBuilder();
            while (i > 0 && j > 0) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    sb.append(s.charAt(i - 1));
                }
                int ti = path[i][j][0];
                j = path[i][j][1];
                i = ti;
            }
            out.println(sb.reverse().toString());
        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String ns() {
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

    }
}

