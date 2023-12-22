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
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskF solver = new TaskF();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskF {
        static final int MODULO = 998244353;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[1 << n];
            long sa = 0;
            for (int i = 0; i < a.length; ++i) {
                a[i] = in.nextInt();
                sa += a[i];
            }
            long mul = pow(sa, MODULO - 2);
            for (int i = 0; i < a.length; ++i) {
                a[i] = (int) (a[i] * mul % MODULO);
            }
            //int[] savedA = a.clone();
            fastWalshHadamardTransform(a);
            int[] minusOne = new int[1 << n];
            for (int i = 0; i < minusOne.length; ++i) minusOne[i] = MODULO - 1;
            fastWalshHadamardTransform(minusOne);
            int[] oneAtZero = new int[1 << n];
            oneAtZero[0] = 1;
            fastWalshHadamardTransform(oneAtZero);
            if (oneAtZero[0] == 0) throw new RuntimeException();
            long alpha = (MODULO - minusOne[0]) * pow(oneAtZero[0], MODULO - 2) % MODULO;
            int[] sol1 = new int[1 << n];
            for (int i = 1; i < a.length; ++i) {
                long denom = (a[i] - 1 + MODULO) % MODULO;
                if (denom == 0) {
                    throw new RuntimeException();
                }
                denom = pow(denom, MODULO - 2);
                sol1[i] = (int) ((minusOne[i] + alpha * oneAtZero[i]) % MODULO * denom % MODULO);
            }
            long sum1 = 0;
            for (int i = 0; i < a.length; ++i) {
                sum1 += sol1[i];
            }
            sum1 %= MODULO;
            sol1[0] = (int) ((MODULO - sum1) % MODULO);
            fastWalshHadamardTransform(sol1);
            long p2 = pow(a.length, MODULO - 2);
            for (int i = 0; i < a.length; ++i) {
                sol1[i] = (int) (sol1[i] * p2 % MODULO);
            }
            for (int i = 0; i < a.length; ++i) {
                out.println(sol1[i]);
            }
        }

        private long pow(long a, int k) {
            long res = 1;
            while (k > 0) {
                if (k % 2 != 0) {
                    res = res * a % MODULO;
                }
                a = a * a % MODULO;
                k /= 2;
            }
            return res;
        }

        private void fastWalshHadamardTransform(int[] poly) {
            int h = 1;
            while (h < poly.length) {
                for (int i = 0; i < poly.length; i += h * 2) {
                    for (int j = i; j < i + h; ++j) {
                        int p = poly[j];
                        int q = poly[j + h];
                        int s = p + q;
                        if (s >= MODULO) s -= MODULO;
                        int m = p - q;
                        if (m < 0) m += MODULO;
                        poly[j] = s;
                        poly[j + h] = m;
                    }
                }
                h *= 2;
            }
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

