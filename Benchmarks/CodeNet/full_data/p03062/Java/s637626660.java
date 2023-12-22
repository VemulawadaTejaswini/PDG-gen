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
 * @author cplayer
 */
public class Main {
    public static void main (String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DFlippingSigns solver = new DFlippingSigns();
        solver.solve(1, in, out);
        out.close();
    }

    static class DFlippingSigns {
        public void solve (int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = in.nextIntArr(n);
            for (int i = 0; i < n - 1; ++i) {
                if (a[i] < 0) {
                    long tmp = a[i] + a[i + 1];
                    tmp *= -2;
                    if (tmp >= 0) {
                        a[i] = -a[i];
                        a[i + 1] = -a[i + 1];
                    }
                }
            }
            if (n > 1) {
                long tmp = a[n - 2] + a[n - 1];
                tmp *= -2;
                if (tmp >= 0) {
                    a[n - 2] *= -1;
                    a[n - 1] *= -1;
                }
            }
            long ans = 0;
            for (int i = 0; i < n; ++i) {
                ans += a[i];
            }
            out.println(ans);
        }

    }

    static class InputReader {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        public InputReader (InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        public String next () {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return tokenizer.nextToken();
        }

        public int[] nextIntArr (int length) {
            int[] res = new int[length];
            for (int i = 0; i < length; ++i) {
                res[i] = nextInt();
            }
            return res;
        }

        public int nextInt () {
            return Integer.parseInt(next());
        }

    }
}

