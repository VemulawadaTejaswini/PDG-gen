import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BSortingASegment solver = new BSortingASegment();
        solver.solve(1, in, out);
        out.close();
    }

    static class BSortingASegment {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            int ans[] = new int[n];
            int c = 0;
            TreeSet<Integer> ts = new TreeSet<>();
            int p = 0;
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            for (int i = 0; i < k; i++) {
                ts.add(a[i]);
            }
            long count = 0;
            count++;
            for (int i = 0; i < n - k; i++) {

                ts.add(a[i + k]);
                int nmax = ts.last();
                int nmin = ts.first();
                if (nmin == a[i] && nmax == a[i + k]) {
                    ans[i] = 0;
                } else {
                    ans[i + 1] = 1;
                }
                ts.remove(a[i]);
            }
            for (int i = 0; i < n; i++) {
                if (ans[i] == 1) {
                    count++;
                }
            }
            out.println(count);
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

