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
 * @author dyominov
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CWhenIHitMyPocket solver = new CWhenIHitMyPocket();
        solver.solve(1, in, out);
        out.close();
    }

    static class CWhenIHitMyPocket {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long k = in.nextLong();
            long a = in.nextLong();
            long b = in.nextLong();
            long res = 0;
            long count = a - 1;
            while (count + 1 < k) {
                res += b - a;
                count += 2;
            }
            res += a;
            out.println(Math.max(k + 1, res + k - count));

        }

    }

    static class InputReader implements AutoCloseable {
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

        public void close() {
        }

    }
}

