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
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DKnight solver = new DKnight();
        solver.solve(1, in, out);
        out.close();
    }

    static class DKnight {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long x = in.nextLong();
            long y = in.nextLong();
            if ((2 * x - y) % 3 != 0 || (2 * y - x) % 3 != 0) {
                out.println(0);
                return;
            }
            long p = (2 * x - y) / 3;
            long q = (2 * y - x) / 3;
            long ans = 1;
            long anp = 1;
            long anq = 1;
            long mod = 1000000007;
            for (int i = 1; i <= p + q; i++) {
                ans *= i % mod;
                if (i <= p) anp *= i % mod;
                if (i <= q) anq *= i % mod;
                ans %= mod;
                anp %= mod;
                anq %= mod;
            }
            out.println((ans * ((Maths.power(anp, mod - 2, mod) * Maths.power(anq, mod - 2, mod)) % mod)) % mod);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }

    static class Maths {
        static long power(long x, long y, long p) {
            long res = 1;
            x = x % p;
            while (y > 0) {
                if ((y & 1) == 1)
                    res = (res * x) % p;
                y = y >> 1;
                x = (x * x) % p;
            }
            return res;
        }

    }
}


