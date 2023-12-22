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
        DBannedK solver = new DBannedK();
        solver.solve(1, in, out);
        out.close();
    }

    static class DBannedK {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int a[] = new int[n];
            long c[] = new long[n + 5];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                c[a[i]]++;
            }
            long ans = 0;
            for (int i = 1; i <= n; i++) {
                if (c[i] >= 2) {
                    ans += (c[i] * (c[i] - 1)) / 2;
                }
            }
            for (int i = 0; i < n; i++) {
                long temp1 = 0;
                long temp2 = 0;
                if (c[a[i]] >= 2) {
                    temp1 = (c[a[i]] * (c[a[i]] - 1)) / 2;
                    temp2 = ((c[a[i]] - 1) * (c[a[i]] - 2)) / 2;
                }
                out.println(ans - temp1 + temp2);
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

