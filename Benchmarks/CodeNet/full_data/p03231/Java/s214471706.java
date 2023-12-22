import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ATwoAbbreviations solver = new ATwoAbbreviations();
        solver.solve(1, in, out);
        out.close();
    }

    static class ATwoAbbreviations {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            long n = in.longs(), m = in.longs();
            String s = in.string(), t = in.string();
            long lcm = IntMath.lcm(n, m);
            long gcd = n * m / lcm;
            int x = 0, y = 0;
            for (int i = 0; i < gcd; i++) {
                if (s.charAt(x) != t.charAt(y)) {
                    out.println(-1);
                    return;
                }
                x += n / gcd;
                y += m / gcd;
            }
            out.println(lcm);
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public long longs() {
            return Long.parseLong(string());
        }

    }

    static final class IntMath {
        private IntMath() {
        }

        public static long lcm(long a, long b) {
            long ans = a * b;
            ans /= gcd(a, b);
            return ans;
        }

        public static long gcd(long a, long b) {
            long t;
            while (a % b > 0) {
                t = b;
                b = a % b;
                a = t;
            }
            return b;
        }

    }
}

