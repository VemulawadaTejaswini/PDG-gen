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
 * @author Tarek
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CBoxesAndCandies solver = new CBoxesAndCandies();
        solver.solve(1, in, out);
        out.close();
    }

    static class CBoxesAndCandies {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long x = in.nextLong();
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }
            long c = 0;
            for (int i = 1; i < n; i++) {
                if ((a[i] + a[i - 1]) > x) {
                    long temp = a[i] + a[i - 1] - x;
                    c += temp;
                    if (a[i - 1] > x) {
                        a[i] = 0;
                    } else {
                        a[i] -= temp;
                    }
                }
            }
            out.println(c);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

