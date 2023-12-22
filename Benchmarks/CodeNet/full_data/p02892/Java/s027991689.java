import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
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
        BGraphPartition solver = new BGraphPartition();
        solver.solve(1, in, out);
        out.close();
    }

    static class BGraphPartition {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int[][] a = new int[n][n];
            int INF = Integer.MAX_VALUE / 3;
            for (int i = 0; i < n; i++) {
                String s = in.next();
                Arrays.fill(a[i], INF);
                a[i][i] = 0;
                for (int j = 0; j < n; j++) {
                    if (s.charAt(j) == '1') {
                        a[i][j] = 1;
                    }
                }
            }
            for (int k = 0; k < n; k++) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        a[i][j] = Math.min(a[i][j], a[i][k] + a[k][j]);
                    }
                }
            }
            int mx = -1;
            for (int start = 0; start < n; start++) {
                int[] pos = new int[n];
                for (int i = 0; i < n; i++) {
                    pos[i] = a[start][i];
                }
                boolean ok = true;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (a[i][j] == 1) {
                            ok &= Math.abs(pos[i] - pos[j]) == 1;
                        }
                    }
                }
                if (ok) {
                    for (int i = 0; i < n; i++) {
                        mx = Math.max(a[start][i] + 1, mx);
                    }
                }
            }
            out.println(mx);
        }

    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        public FastScanner(String fileName) {
            try {
                br = new BufferedReader(new FileReader(fileName));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                String line = null;
                try {
                    line = br.readLine();
                } catch (IOException e) {
                }
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

    }
}

