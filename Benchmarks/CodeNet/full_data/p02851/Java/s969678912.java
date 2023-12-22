import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ERemOfSumIsNum solver = new ERemOfSumIsNum();
        solver.solve(1, in, out);
        out.close();
    }

    static class ERemOfSumIsNum {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = in.readIntArray(n);
            for (int i = 0; i < n; i++)
                a[i] %= k;
            long[] prefix = new long[n + 1];
            for (int i = 0; i < n; i++) {
                prefix[i + 1] = prefix[i] + a[i];
            }
            for (int i = 0; i <= n; i++) {
                prefix[i] = ((prefix[i] - i) % k + k) % k;
            }

            HashMap<Long, Integer> count = new HashMap<>();
            count.put(0L, 1);
            long answer = 0;
            for (int i = 1; i <= n; i++) {
                if (i - k >= 0) {
                    count.merge(prefix[i - k], -1, Integer::sum);
                }
                answer += count.getOrDefault(prefix[i], 0);
                count.merge(prefix[i], 1, Integer::sum);
            }

            out.println(answer);
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] readIntArray(int n) {
            int[] x = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = nextInt();
            }
            return x;
        }

    }
}

