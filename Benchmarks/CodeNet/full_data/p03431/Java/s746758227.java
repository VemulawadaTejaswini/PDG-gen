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
        MyScan in = new MyScan(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        static long[] ff;

        public void solve(int testNumber, MyScan in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();

            ff = new long[k + 1];
            ff[1] = 1;
            for (int i = 2; i <= k; i++) {
                ff[i] = ff[i - 1] * 2;
                ff[i] %= Util._m;
            }
            out.print(nn(n)[k]);
        }

        static long[] nn(int f) {
            if (f == 1) {
                return ff;
            }
            long[] x = nn(f / 2);
            x = op(x, x);
            if (f % 2 == 1) {
                x = op(x, nn(1));
            }
            return x;
        }

        private static long[] op(long[] x, long[] nn) {
            long[] res = new long[1 << 19];
            FFT f = new FFT();
            f.multiply(res, x, nn, ff.length);
            long sum = res[0];
            for (int i = 1; i < ff.length; i++) {
                long ns = (sum + res[i]) % Util._m;
                res[i] = (res[i] + Util._m - sum) % Util._m;
                sum = ns;
            }
            return res;
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

        public static long pow(long v, long k, long m) {
            if (k == 0) return 1;
            long t = pow(v, k / 2, m);
            t *= t;
            t %= m;
            if (k % 2 == 1) {
                t *= v;
            }
            return t % m;

        }

        public static long powm(long v, long k) {
            return pow(v, k, _m);
        }

        public static long inv(long v) {
            if (inv == null) l();
            if (v < 1000000) return inv[(int) v];
            return powm(v, _m - 2);
        }

    }

    static class FFT {
        private int rootPower = 1 << 23;
        private long root = 31;
        private long reverseRoot = Util.inv(root);
        long[] aa;
        long[] bb;

        public void multiply(long[] result, long[] first, long[] second, int length) {
            if (aa == null) {
                aa = new long[result.length];
                bb = new long[result.length];
            }
            int resultSize = Integer.highestOneBit(length - 1) << 2;
            resultSize = Math.max(resultSize, 4);
            Arrays.fill(aa, 0, resultSize, 0);
            Arrays.fill(bb, 0, resultSize, 0);
            for (int i = 0; i < length; i++)
                aa[i] = first[i];
            for (int i = 0; i < length; i++)
                bb[i] = second[i];
            fft(aa, false, resultSize);
            if (first == second) {
                System.arraycopy(aa, 0, bb, 0, resultSize);
            } else
                fft(bb, false, resultSize);
            for (int i = 0; i < resultSize; i++) {
                aa[i] *= bb[i];
                aa[i] %= Util._m;
            }
            fft(aa, true, resultSize);
            for (int i = 0; i < length; i++)
                result[i] = aa[i];

        }

        private void fft(long[] array, boolean invert, int size) {
            for (int i = 1, j = 0; i < size; ++i) {
                int bit = size >> 1;
                for (; j >= bit; bit >>= 1)
                    j -= bit;
                j += bit;
                if (i < j) {
                    long temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

            for (int len = 2; len <= size; len <<= 1) {
                long wlen = invert ? reverseRoot : root;
                for (int i = len; i < rootPower; i <<= 1)
                    wlen = wlen * wlen % Util._m;
                int half = len >> 1;
                for (int i = 0; i < size; i += len) {
                    long w = 1;
                    for (int j = 0; j < half; ++j) {
                        long u = array[i + j], v = array[i + j + half] * w % Util._m;
                        array[i + j] = u + v < Util._m ? u + v : u + v - Util._m;
                        array[i + j + half] = u - v >= 0 ? u - v : u - v + Util._m;
                        w = w * wlen % Util._m;
                    }
                }
            }
            if (invert) {
                long reverseSize = Util.inv(size);
                for (int i = 0; i < size; ++i)
                    array[i] = array[i] * reverseSize % Util._m;
            }
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

