import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Map;
import java.io.BufferedReader;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        long[] w;
        long[] v;
        Map<String, Long> memo;
        int n;
        int W;

        long f(int i, long weight) {
            if (i == n) return 0;
            String key = i + " " + weight;
            if (memo.containsKey(key)) return memo.get(key);
            long ans = 0;
            if (weight + w[i] <= W) {
                ans = Math.max(ans, f(i + 1, weight + w[i]) + v[i]);
            }
            ans = Math.max(ans, f(i + 1, weight));
            memo.put(key, ans);
            return ans;
        }

        public void solve(int testNumber, FastReader in, PrintWriter out) {
            n = in.nextInt();
            W = in.nextInt();
            w = new long[n];
            v = new long[n];
            memo = new HashMap<>();
            for (int i = 0; i < n; i++) {
                w[i] = in.nextInt();
                v[i] = in.nextInt();
            }

            out.println(f(0, 0));
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

