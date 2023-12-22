import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.Set;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author MaxHeap
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DigitMultiplication solver = new DigitMultiplication();
        solver.solve(1, in, out);
        out.close();
    }

    static class DigitMultiplication {
        int f(long a) {
            return Long.toString(a).length();
        }

        public void solve(int testNumber, FastReader in, PrintWriter out) {
            long n = in.nextLong();
            Set<Long> divisors = new HashSet<>();
            long ans = 9999999999L;
            for (long i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    if (i != n / i) {
                        ans = Math.min(Math.max(f(i), f(n / i)), ans);
                    } else {
                        ans = Math.min(Math.max(f(i), f(i)), ans);
                    }
                }
            }
            out.println(ans);
        }

    }

    static class FastReader {
        BufferedReader reader;
        StringTokenizer st;

        public FastReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            st = null;
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String line = reader.readLine();
                    if (line == null) {
                        return null;
                    }
                    st = new StringTokenizer(line);
                } catch (Exception e) {
                    throw new RuntimeException();
                }
            }
            return st.nextToken();
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

