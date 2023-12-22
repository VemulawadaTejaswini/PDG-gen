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
        ProblemC_Swaps solver = new ProblemC_Swaps();
        solver.solve(1, in, out);
        out.close();
    }

    static class ProblemC_Swaps {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = in.nextInt();
            }

            Pair[] p = new Pair[n];
            for (int i = 0; i < n; i++) {
                p[i] = new Pair();
                p[i].a = a[i];
                p[i].b = i;
            }

            Arrays.sort(p, (u, v) -> -(u.a - v.a));
            Arrays.sort(b);
            Pair[] c = new Pair[n];
            {
                int j = n;
                for (int i = 0; i < n; i++) {
                    while (j > 0 && b[j - 1] >= p[i].a) {
                        --j;
                    }
                    c[i] = new Pair();
                    c[i].a = p[i].b;
                    c[i].b = j;
                }
            }

            Arrays.sort(c, (u, v) -> -(u.b - v.b));

            int numSwaps = 0;
            boolean[] frozen = new boolean[n];
            Pair[] who = new Pair[n];
            for (int i = 0; i < n; i++) {
                who[c[i].a] = c[i];
//            System.out.println(c[i].a + " " + c[i].b);
            }
            int last = n - 1;
            for (int i = 0; i < n; i++) {
                // .a = position now
                // .b = leftmost possible position after swap
                if (c[i].a >= c[i].b) {
                    frozen[c[i].a] = true;
                    continue;
                }
                while (frozen[last]) {
                    --last;
                }
                swap(c[i].a, last, who);
                frozen[c[i].a] = true;
                if (c[i].a < c[i].b) {
                    out.println("No");
                    return;
                }
                ++numSwaps;
            }

            out.println(numSwaps <= n - 2 ? "Yes" : "No");
        }

        private void swap(int i, int j, Pair[] who) {
            Pair pi = who[i];
            Pair pj = who[j];
            if (pi.a != i) {
                throw new AssertionError();
            }
            if (pj.a != j) {
                throw new AssertionError();
            }
            pi.a = j;
            pj.a = i;
            who[i] = pj;
            who[j] = pi;
        }

        class Pair {
            int a;
            int b;

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

