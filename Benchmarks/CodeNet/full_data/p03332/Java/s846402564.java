import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.InputMismatchException;
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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            long k = in.nextLong();

            long ans = 0;
            long MOD = 998244353;
            Combination comb = new Combination(n, MOD);
            for (int red = 0; red <= n; red++) {
                long redSum = (long) a * red;
                if (k < redSum || (k - redSum) % b != 0) continue;
                long blue = (k - redSum) / b;
                if (blue < 0 || n < blue) continue;

                ans = (ans + comb.combMod(n, red) * comb.combMod(n, (int) blue)) % MOD;
            }

            out.println(ans);
        }

    }

    static class Combination {
        Modulo modulo;
        long[] nors;
        long[] revs;

        public Combination(int n, long m) {
            nors = new long[n + 1];
            revs = new long[n + 1];
            modulo = new Modulo(m);

            nors[0] = 1;
            for (int i = 1; i <= n; i++) {
                nors[i] = modulo.mlt(nors[i - 1], i);
            }

            revs[n] = modulo.rev(nors[n]);
            for (int i = n - 1; i >= 0; i--) {
                revs[i] = (revs[i + 1] * (i + 1)) % m;
            }
        }

        public long combMod(int n, int k) {
            long ret = nors[n];
            ret = modulo.mlt(ret, revs[k]);
            ret = modulo.mlt(ret, revs[n - k]);
            return ret;
        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tok;

        public String nextString() {
            while (!tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(in.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public long nextLong() {
            return Long.parseLong(nextString());
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }

    static class Modulo {
        long m;

        public Modulo(long m) {
            this.m = m;
        }

        public long mlt(long a, long b) {
            return (a * b) % m;
        }

        public long rev(long a) {
            return pow(a, m - 2);
        }

        public long pow(long a, long x) {
            long ans = 1;
            while (x > 0) {
                if ((x & 1) != 0) {
                    ans = (ans * a) % m;
                }
                x >>= 1;
                a = (a * a) % m;
            }
            return ans;
        }

    }
}

