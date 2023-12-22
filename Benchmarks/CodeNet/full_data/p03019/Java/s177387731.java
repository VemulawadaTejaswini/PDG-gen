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
        C_Tests solver = new C_Tests();
        solver.solve(1, in, out);
        out.close();
    }

    static class C_Tests {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            long x = in.nextInt();
            Test[] tests = new Test[n];
            long need = 0;
            for (int i = 0; i < n; i++) {
                Test t = new Test();
                t.b = in.nextInt();
                t.l = in.nextInt();
                t.u = in.nextInt();
                tests[i] = t;

                need += t.b * t.l;
            }

            Arrays.sort(tests, (u, v) -> (-Long.compare(u.profitAt(x), v.profitAt(x))));
            long[] prefix = new long[n + 1];
            for (int i = 0; i < n; i++) {
                prefix[i + 1] = prefix[i] + tests[i].profitAt(x);
            }
            long l = -1;
            long r = x * n;
            while (r - l > 1) {
                long m = l + (r - l) / 2;
                long best = 0;
                for (int i = 0; i < n; i++) {
                    long cur = tests[i].profitAt(m % x);
                    int numFull = (int) (m / x);
                    cur += prefix[numFull];
                    if (i < numFull) {
                        cur -= tests[i].profitAt(x);
                        if (numFull < n) {
                            cur += tests[numFull].profitAt(x);
                        }
                    }
                    best = Math.max(best, cur);
                }
                if (need <= best) {
                    r = m;
                } else {
                    l = m;
                }
            }
            out.println(r);
        }

        class Test {
            long b;
            long l;
            long u;

            long profitAt(long n) {
                long ls = Math.min(n, b);
                long us = n - ls;
                return ls * l + us * u;
            }

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

