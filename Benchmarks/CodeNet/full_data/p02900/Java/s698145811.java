import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
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
        DDisjointSetOfCommonDivisors solver = new DDisjointSetOfCommonDivisors();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDisjointSetOfCommonDivisors {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            HashSet<Long> a = new HashSet<>();
            HashSet<Long> b = new HashSet<>();
            long an = in.nextLong();
            long bn = in.nextLong();
            Maths.primeFactors(an, a);
            Maths.primeFactors(bn, b);
//        out.println(b);
//        out.println(a);
            long ans = 0;
            for (Long x : a) {
                if (b.contains(x)) ans++;
            }

            out.println(ans + 1);
        }

    }

    static class Maths {
        static void primeFactors(long n, HashSet<Long> set) {
            if (n % 2 == 0) set.add((long) 2);
            while (n % 2 == 0) {
                n = n / 2;
            }
            for (int i = 3; i <= Math.sqrt(n); i = i + 2) {
                if (n % i == 0) set.add((long) i);
                while (n % i == 0) {
                    n = n / i;
                }
            }
            if (n > 2) set.add(n);
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
}

