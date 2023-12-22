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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        B_GraphPartition solver = new B_GraphPartition();
        solver.solve(1, in, out);
        out.close();
    }

    static class B_GraphPartition {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            boolean[][] g = new boolean[n][n];
            for (int i = 0; i < n; i++) {
                char[] s = in.next().toCharArray();
                for (int j = 0; j < n; j++) {
                    g[i][j] = s[j] == '1';
                }
            }

            int ans = -1;
            for (int s = 0; s < n; s++) {
                int[] q = new int[n];
                int qt = 0;
                int qh = 1;
                q[0] = s;
                int[] d = new int[n];
                Arrays.fill(d, n);
                d[s] = 0;
                boolean ok = true;
                while (qt < qh) {
                    int i = q[qt++];
                    for (int j = 0; j < n; j++) {
                        if (!g[i][j]) {
                            continue;
                        }
                        if (d[j] > 1 + d[i]) {
                            d[j] = 1 + d[i];
                            q[qh++] = j;
                        }
                        if (d[j] == d[i]) {
                            ok = false;
                        }
                    }
                }
                if (ok) {
                    ans = Math.max(ans, 1 + d[q[qh - 1]]);
                }
            }

            out.println(ans);
        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(in.readLine());
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

