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
        CPyramid solver = new CPyramid();
        solver.solve(1, in, out);
        out.close();
    }

    static class CPyramid {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long xi[] = new long[n];
            long yi[] = new long[n];
            long hi[] = new long[n];
            for (int i = 0; i < n; i++) {
                xi[i] = in.nextInt();
                yi[i] = in.nextInt();
                hi[i] = in.nextInt();
            }
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (hi[i] < hi[i + 1]) {
                        long temp = 0;
                        temp = hi[i + 1];
                        hi[i + 1] = hi[i];
                        hi[i] = temp;
                        temp = xi[i + 1];
                        xi[i + 1] = xi[i];
                        xi[i] = temp;
                        temp = yi[i + 1];
                        yi[i + 1] = yi[i];
                        yi[i] = temp;
                    }
                }
            }
            for (long x = 0; x <= 100; x++) {
                for (long y = 0; y <= 100; y++) {
                    long h = 0;
                    boolean ans = true;
                    h = hi[0] + Math.abs(xi[0] - x) + Math.abs(yi[0] - y);
                    for (int i = 0; i < n; i++) {
                        if (Math.max(h - Math.abs(xi[i] - x) - Math.abs(yi[i] - y), 0) == hi[i]) {
                            continue;
                        } else {
                            ans = false;
                            break;
                        }
                    }
                    if (ans) {
                        out.println(x + " " + y + " " + h);
                        return;
                    }
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

