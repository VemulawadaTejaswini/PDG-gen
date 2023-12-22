import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.stream.LongStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.math.BigInteger;
import java.io.BufferedReader;
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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int p = in.nextInt();
            long[] a = in.nextLongArray(n);

            long odd = Arrays.stream(a).filter(x -> x % 2 == 1).count();
            long even = n - odd;

            if (p == 1) {
                if (odd == 0) {
                    out.println(0);
                } else {
                    long ans = 0;
                    for (int i = 0; i <= odd; i++) {
                        if (i % 2 == 0) continue;
                        ans += Combination.combSimple((int) odd, i);
                    }
                    for (int i = 0; i < even; i++) {
                        ans *= 2;
                    }
                    out.println(ans);
                }
            } else {
                long ans = 0;
                for (int i = 0; i <= odd; i++) {
                    if (i % 2 == 1) continue;
                    ans += Combination.combSimple((int) odd, i);
                }
                for (int i = 0; i < even; i++) {
                    ans *= 2;
                }
                out.println(ans);
            }
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

        public long[] nextLongArray(int n) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong();
            }
            return res;
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

        public static long combSimple(int n, int k) {
            BigInteger ret = BigInteger.ONE;
            for (int i = 0; i < k; i++) {
                ret = ret.multiply(BigInteger.valueOf(n - i));
            }
            for (int i = 1; i <= k; i++) {
                ret = ret.divide(BigInteger.valueOf(i));
            }
            return ret.longValue();
        }

    }
}

