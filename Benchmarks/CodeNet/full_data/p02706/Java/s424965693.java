import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.LongStream;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Nikita Mikhailov
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BHomework solver = new BHomework();
        solver.solve(1, in, out);
        out.close();
    }

    static class BHomework {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.readInt();
            int m = in.readInt();
            long sum = in.streamLongs(m).sum();
            if (sum > n) {
                out.println("-1");
            } else {
                out.println(n - sum);
            }
        }

    }

    static class FastScanner {
        private StringTokenizer st;
        private BufferedReader in;

        public FastScanner(final InputStream in) {
            this.in = new BufferedReader(new InputStreamReader(in));
        }

        public String readToken() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(in.readLine());
                } catch (final IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int readInt() {
            return Integer.parseInt(readToken());
        }

        public long readLong() {
            return Long.parseLong(readToken());
        }

        public LongStream streamLongs(final int n) {
            return LongStream.range(0, n).map(operand -> readLong());
        }

    }
}

