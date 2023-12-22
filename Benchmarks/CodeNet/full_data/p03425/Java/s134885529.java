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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int[] a = new int[26];
            int n = in.nextInt();
            for (int i = 0; i < n; ++i) {
                String s = in.next();
                a[s.charAt(0) - 'A']++;
            }
            int[] b = new int[5];
            b[0] = 'M' - 'A';
            b[1] = 'A' - 'A';
            b[2] = 'R' - 'A';
            b[3] = 'C' - 'A';
            b[4] = 'H' - 'A';
            long s = 0, k = 0;
            for (int i = 0; i < 26; ++i) {
                if (i == b[0] || i == b[1] || i == b[2] || i == b[3] || i == b[4]) {
                    if (a[i] > 0) {
                        s++;
                        k += a[i];
                    }
                }
            }
            if (s < 3) {
                out.println(0);
            } else {
                long res = binomialCoeff(k, 3) - (k - s) * (s == 3 ? 2 : 3);
                out.println(res);
            }
        }

        long binomialCoeff(long n, long k) {
            int C[][] = new int[(int) n + 1][(int) k + 1];
            int i, j;

            // Calculate  value of Binomial Coefficient in bottom up manner
            for (i = 0; i <= n; i++) {
                for (j = 0; j <= Math.min(i, k); j++) {
                    // Base Cases
                    if (j == 0 || j == i)
                        C[i][j] = 1;

                        // Calculate value using previosly stored values
                    else
                        C[i][j] = C[i - 1][j - 1] + C[i - 1][j];
                }
            }
            return C[(int) n][(int) k];
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

