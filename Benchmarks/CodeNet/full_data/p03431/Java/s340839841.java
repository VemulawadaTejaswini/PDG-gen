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
        MyScan in = new MyScan(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public void solve(int testNumber, MyScan in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();


            long r = 0;

            for (int red = 0; red <= k; red++) {
                int blue = k - red;
                if (red < blue) continue;
                int t = Math.max(red - n + 1, 0);
                r += Util.c(red, k);
                if (blue - t >= 0)
                    r -= Util.c(blue - t, blue + red);
                r += Util._m;
                r %= Util._m;
            }
            out.println(r);
        }

    }

    static class Util {
        public static final long MOD_FFT2 = 998244353;
        public static final long _m = MOD_FFT2;
        private static long[] fact;
        private static long[] inv;
        private static long[] ifact;

        public static void l() {
            fact = new long[1000001];
            inv = new long[1000001];
            ifact = new long[1000001];
            for (int s = 0; s < 2; s++) {
                fact[s] = 1;
                ifact[s] = 1;
                inv[s] = 1;
            }
            inv[0] = 0;
            for (int i = 2; i < inv.length; i++) {
                inv[i] = (_m - (_m / i) * inv[(int) (_m % i)] % _m) % _m;
            }
            for (int i = 2; i < fact.length; i++) {
                fact[i] = i * fact[i - 1];
                ifact[i] = inv[i] * ifact[i - 1];
                fact[i] %= _m;
                ifact[i] %= _m;
            }
        }

        public static long c(int a, int b) {
            if (fact == null) l();
            long res = (ifact[a] * ifact[b - a]) % _m;
            return (res * fact[b]) % _m;
        }

    }

    static class MyScan {
        BufferedReader br;
        StringTokenizer st;

        MyScan(BufferedReader br) {
            this.br = br;
        }

        public MyScan(InputStream in) {
            this(new BufferedReader(new InputStreamReader(in)));
        }

        public void findToken() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public String next() {
            findToken();
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

