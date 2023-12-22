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
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CCitySavers solver = new CCitySavers();
        solver.solve(1, in, out);
        out.close();
    }

    static class CCitySavers {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int a[] = new int[n + 1];
            int b[] = new int[n];
            long sum = 0;
            for (int i = 0; i <= n; i++) a[i] = in.nextInt();
            for (int i = 0; i < n; i++) {
                b[i] = in.nextInt();
                sum += b[i];
            }
            for (int i = 0; i < n; i++) {
                if (a[i] >= b[i]) {

                    a[i] -= b[i];
                    b[i] = 0;
                    continue;
                } else {
                    b[i] = b[i] - a[i];
                    a[i] = 0;
                }
                if (a[i + 1] >= b[i]) {
                    a[i + 1] -= b[i];
                    b[i] = 0;
                } else {
                    b[i] -= a[i + 1];
                    a[i + 1] = 0;
                }

            }
//        Array.print(a);
//        Array.print(b);
            if (a[n] >= b[n - 1]) {
                b[n - 1] = 0;
                a[n] -= b[n - 1];
            } else {
                a[n] = 0;
                b[n - 1] -= a[n];
            }

//        Array.print(b);
            long count = 0;
            for (int i = 0; i < n; i++) count += b[i];
            out.println(sum - count);
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

