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
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        int[] rs;
        long[][] dist;
        final long INF = 2000000000L;
        int nvis;
        int acc;
        int min;
        boolean[] vis;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int r = in.nextInt();
            rs = new int[r];
            dist = new long[n][n];
            for (int i = 0; i < n; i++) {
                Arrays.fill(dist[i], INF);
            }
            for (int i = 0; i < r; i++) {
                rs[i] = in.nextInt() - 1;
            }

            for (int i = 0; i < m; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                int c = in.nextInt();

                dist[a][b] = dist[b][a] = c;
            }

            for (int k = 0; k < n; k++) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }

            vis = new boolean[n];
            nvis = r;
            min = Integer.MAX_VALUE;
            rec(-1);
            out.println(min);
        }

        private void rec(int prev) {
            if (nvis == 0) {
                min = Math.min(acc, min);
                return;
            }
            for (int i : rs) {
                if (!vis[i]) {
                    if (prev == -1 || dist[i][prev] != INF) {
                        nvis--;
                        vis[i] = true;
                        if (prev != -1) {
                            acc += dist[i][prev];
                        }
                        rec(i);
                        nvis++;
                        vis[i] = false;
                        if (prev != -1) {
                            acc -= dist[i][prev];
                        }
                    }
                }
            }
        }

    }

    static class InputReader {
        StringTokenizer st;
        BufferedReader br;

        public InputReader(InputStream is) {
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            this.br = br;
        }

        public String next() {
            if (st == null || !st.hasMoreTokens()) {
                String nextLine = null;
                try {
                    nextLine = br.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (nextLine == null)
                    return null;
                st = new StringTokenizer(nextLine);
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

