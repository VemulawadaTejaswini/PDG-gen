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
        CDiceAndCoin solver = new CDiceAndCoin();
        solver.solve(1, in, out);
        out.close();
    }

    static class CDiceAndCoin {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            double n = in.nextInt();
            double k = in.nextInt();
            double ans = (n - k + 1) / n;
            if (ans < 0) {
                ans = 0;
            }

            for (int i = 1; i <= k - 1 && i <= n; i++) {
                long temp = i;
                double tt = 0.5;
                while (temp * 2 <= k - 1) {
                    tt /= 2;
                    temp *= 2;
                }
                ans += tt / n;
            }
            out.printf("%.9f", ans);
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

