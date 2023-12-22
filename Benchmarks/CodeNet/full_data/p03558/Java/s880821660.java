import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
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
        DigitSum solver = new DigitSum();
        solver.solve(1, in, out);
        out.close();
    }

    static class DigitSum {
        int digSum(long a) {
            int ret = 0;
            while (a > 0) {
                ret += (a % 10);
                a /= 10;
            }
            return ret;
        }

        public void solve(int testNumber, FastReader in, PrintWriter out) {
            long n = in.nextInt();
            long cur = 1;
            int mx = (int) 1e4;
            while (cur < (long) 10000000) {
                mx = Math.min(mx, digSum(cur * n));
                ++cur;
            }
            out.println(mx);
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

