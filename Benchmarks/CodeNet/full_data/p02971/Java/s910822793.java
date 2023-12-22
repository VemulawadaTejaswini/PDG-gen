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
        CExceptionHandling solver = new CExceptionHandling();
        solver.solve(1, in, out);
        out.close();
    }

    static class CExceptionHandling {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int max = 0;
            int smax = 0;
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                int temp = in.nextInt();
                a[i] = temp;
                if (temp >= max) {
                    smax = max;
                    max = temp;
                } else if (temp >= smax) {
                    smax = temp;
                }
            }
            for (int i = 0; i < n; i++) {
                if (a[i] == max) {
                    out.println(smax);
                } else {
                    out.println(max);
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

