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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; ++i) {
                a[i] = in.nextInt();
            }
            int[] prev = new int[n];
            for (int i = 0; i < n; ++i) {
                int j = i - 1;
                while (j >= 0 && a[j] < a[i]) j = prev[j];
                prev[i] = j;
            }
            int[] next = new int[n];
            for (int i = n - 1; i >= 0; --i) {
                int j = i + 1;
                while (j < n && a[j] > a[i]) j = next[j];
                next[i] = j;
            }
            int[] chain = new int[n];
            for (int i = 0; i < n; ++i) {
                chain[i] = 1;
                if (i > 0 && a[i] > a[i - 1]) chain[i] += chain[i - 1];
            }
            int res = 1;
            boolean have = chain[k - 1] >= k;
            for (int left = 1; left + k <= n; ++left) {
                int right = left + k - 1;
                if (next[left - 1] >= right && prev[right] < left) {
                    res += 0;
                } else {
                    if (chain[right] >= k) {
                        if (!have) {
                            ++res;
                            have = true;
                        }
                    } else {
                        res += 1;
                    }
                }
            }
            out.println(res);
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

    }
}

