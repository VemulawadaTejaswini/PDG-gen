import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author @MaxHeap
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        NoShortestPath solver = new NoShortestPath();
        solver.solve(1, in, out);
        out.close();
    }

    static class NoShortestPath {
        private static final int INF = (int) 1e8;

        public void solve(int testNumber, FastReader fs, PrintWriter pw) {
            int n = fs.nextInt();
            int m = fs.nextInt();
            int[][] f = new int[n][n];
            int[][] g = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i != j)
                        f[i][j] = f[j][i] = INF;
                }
            }
            for (int i = 0; i < m; i++) {
                int a = fs.nextInt() - 1, b = fs.nextInt() - 1, c = fs.nextInt();
                g[a][b] = g[b][a] = f[a][b] = f[b][a] = c;
            }
            for (int k = 0; k < n; k++) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        f[i][j] = Math.min(f[i][j], f[i][k] + f[k][j]);
                    }
                }
            }

            int ans = 0;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (g[i][j] > f[i][j])
                        ++ans;
                }
            }
            pw.println(ans);
        }

    }

    static class FastReader {
        BufferedReader bf;
        StringTokenizer st;

        public FastReader(InputStream is) {
            bf = new BufferedReader(new InputStreamReader(is));
            st = null;
        }

        public String next() {
            try {
                while (st == null || !st.hasMoreTokens()) {
                    String line = bf.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                }
            } catch (Exception e) {
            }

            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

