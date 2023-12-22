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
        CAntiDivision solver = new CAntiDivision();
        solver.solve(1, in, out);
        out.close();
    }

    static class CAntiDivision {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long l = in.nextLong();
            long r = in.nextLong();
            long c = in.nextLong();
            long d = in.nextLong();
            long lcm = (c * d) / Maths.gcd(c, d);
            long p = r / c - (l - 1) / c;
            long q = r / d - (l - 1) / d;
            long ext = r / lcm - (l - 1) / lcm;
//        out.println(p);
//        out.println(q);
//        out.println(ext);
            long ans = r - l + 1 - p - q + ext;
            out.println(ans);
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
        static long gcd(long a, long b) {
            if (a == 0) {
                return b;
            }
            if (b == 0) {
                return a;
            }

            long r, i;
            while (b != 0) {
                r = a % b;
                a = b;
                b = r;
            }
            return a;
        }

    }
}

