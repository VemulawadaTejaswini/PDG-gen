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
        E_Topology solver = new E_Topology();
        solver.solve(1, in, out);
        out.close();
    }

    static class E_Topology {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            char[] s = in.next().toCharArray();
            boolean[] pinned = new boolean[1 << n];
            for (int i = 0; i < 1 << n; i++) {
                pinned[i] = s[i] == '0';
            }
            for (int mask = 0; mask < 1 << n; mask++) {
                boolean any = false;
                for (int i = 0; i < n; i++) {
                    if ((mask & (1 << i)) == 0) {
                        continue;
                    }
                    if (pinned[1 << i]) {
                        any = true;
                    }
                }
                if (pinned[mask] != any) {
                    out.println("Impossible");
                    return;
                }
            }

            out.println("Possible");
            out.println(1 + 2 * n);
            out.printf("%d %d\n", 0, 0);
            for (int i = 0; i < n; i++) {
                if (pinned[1 << i]) {
                    out.printf("%d %d\n", i + 1, +1);
                } else {
                    out.printf("%d %d\n", i + 1, -1);
                }
                out.printf("%d %d\n", i + 1, 0);
            }
            out.printf("%d %d\n", 0, 0);
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

