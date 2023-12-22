import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;
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
        A_XorCircle solver = new A_XorCircle();
        solver.solve(1, in, out);
        out.close();
    }

    static class A_XorCircle {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            Map<Integer, Integer> am = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int x = in.nextInt();
                Integer v = am.get(x);
                if (v == null) {
                    v = 0;
                }
                am.put(x, v + 1);
            }

            if (am.size() == 1) {
                if (am.containsKey(0) && am.get(0) == n) {
                    out.println("Yes");
                    return;
                }
                out.println("No");
                return;
            }

            if (am.size() == 2) {
                int z = -1;
                int nz = -1;
                for (int x : am.keySet()) {
                    if (x != 0) {
                        nz = am.get(x);
                    }
                }
                if (am.containsKey(0)) {
                    z = am.get(0);
                }
                if (z == n / 3 && nz == 2 * n / 3) {
                    out.println("Yes");
                    return;
                }
                out.println("No");
                return;
            }

            if (am.size() == 3) {
                for (int v : am.values()) {
                    if (v != n / 3) {
                        out.println("No");
                        return;
                    }
                }
                out.println("Yes");
                return;
            }

            out.println("No");
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

