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
        AdditionAndMultip solver = new AdditionAndMultip();
        solver.solve(1, in, out);
        out.close();
    }

    static class AdditionAndMultip {
        int k;
        int n;

        int rec(int cur, int times) {
            if (times == n) return cur;
            int ans = Integer.MAX_VALUE;
            ans = Math.min(ans, rec(cur * 2, times + 1));
            ans = Math.min(ans, rec(cur + k, times + 1));
            return ans;
        }

        public void solve(int testNumber, FastReader in, PrintWriter out) {
            n = in.nextInt();
            k = in.nextInt();
            out.println(rec(1, 0));
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

