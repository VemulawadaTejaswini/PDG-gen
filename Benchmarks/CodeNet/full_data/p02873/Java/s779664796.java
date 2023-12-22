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
        ProblemA_MoreLess solver = new ProblemA_MoreLess();
        solver.solve(1, in, out);
        out.close();
    }

    static class ProblemA_MoreLess {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            char[] s = in.next().toCharArray();
            int n = s.length;
            int[] l = new int[n];
            int[] r = new int[n];
            for (int i = 0; i < n; i++) {
                if (s[i] == '<') {
                    l[i] = 1;
                    if (i > 0) {
                        l[i] += l[i - 1];
                    }
                }
            }
            for (int i = n - 1; i >= 0; i--) {
                if (s[i] == '>') {
                    r[i] = 1;
                    if (i + 1 < n) {
                        r[i] += r[i + 1];
                    }
                }
            }
            long ans = r[0] + l[n - 1];
            for (int i = 0; i + 1 < n; i++) {
                ans += Math.max(l[i], r[i + 1]);
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

