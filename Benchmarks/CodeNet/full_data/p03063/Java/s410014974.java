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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.ni();
            String s = in.ns();
            int[] wCnt = new int[n + 1];
            for (int i = 0; i < n; i++) {
                wCnt[i + 1] = wCnt[i];
                if (s.charAt(i) == '.')
                    wCnt[i + 1]++;
            }
            int best = n;
            for (int i = 0; i <= n; i++) {
                int blackLeft = i - wCnt[i];//excl
                int whiteRight = wCnt[n] - wCnt[i];
                best = Math.min(best, blackLeft + whiteRight);
            }
            out.println(best);
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

        public int ni() {
            return Integer.parseInt(ns());
        }

    }
}

