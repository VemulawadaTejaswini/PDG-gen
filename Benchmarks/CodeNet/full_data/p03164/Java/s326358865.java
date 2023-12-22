import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Abhas Jain
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EKnapsack2 solver = new EKnapsack2();
        solver.solve(1, in, out);
        out.close();
    }

    static class EKnapsack2 {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.ni();
            int W = in.ni();
            long[] w = new long[n];
            int[] v = new int[n];
            for (int i = 0; i < n; ++i) {
                w[i] = in.nl();
                v[i] = in.ni();
            }
            long[] val = new long[100001];
            Arrays.fill(val, Long.MAX_VALUE);
            val[0] = 0;
            for (int i = 0; i < n; ++i) {
                for (int j = 100000; j >= 0; --j) {
                    if (j - v[i] >= 0 && val[j - v[i]] != Long.MAX_VALUE)
                        val[j] = Math.min(val[j], val[j - v[i]] + w[i]);
                }
            }
            for (int i = 100000; i >= 0; --i) {
                if (val[i] <= W) {
                    out.println(i);
                    break;
                }
            }
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

        public int ni() {
            return Integer.parseInt(next());
        }

        public long nl() {
            return Long.parseLong(next());
        }

    }
}

