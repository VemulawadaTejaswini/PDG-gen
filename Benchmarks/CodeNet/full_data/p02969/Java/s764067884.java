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
        DPreparingBoxes solver = new DPreparingBoxes();
        solver.solve(1, in, out);
        out.close();
    }

    static class DPreparingBoxes {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int a[] = new int[n + 1];
            for (int i = 1; i <= n; i++) a[i] = in.nextInt();
            int b[] = new int[n + 1];
            int count = 0;
            for (int i = n; i >= 1; i--) {
                long sum = 0;
                for (int k = 2; ; k++) {
                    if (i * k <= n) {
                        sum += b[i * k];
                    } else {
                        break;
                    }
                }
                if (sum % 2 == a[i]) {
                    b[i] = 0;
                } else {
                    b[i] = 1;
                    count++;
                }
            }
            out.println(count);
            for (int i = 1; i <= n; i++) {
                if (b[i] == 1)
                    out.print(i + " ");
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

