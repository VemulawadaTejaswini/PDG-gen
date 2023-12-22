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
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DXorSum2 solver = new DXorSum2();
        solver.solve(1, in, out);
        out.close();
    }

    static class DXorSum2 {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long[] a = new long[n + 1];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            int left = 0;
            int right = 0;

            long answer = nc2(n + 1);
            long xor = a[0];
            while (right < n && left < n) {
                if (right + 1 < n && (a[right + 1] & xor) == 0) {
                    right++;
                    xor ^= a[right];
                } else {
                    xor ^= a[left];
                    left++;
                    answer -= (n - 1 - right);
                }
            }

            out.println(answer);
        }

        static long nc2(long n) {
            return n * (n - 1) / 2;
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

