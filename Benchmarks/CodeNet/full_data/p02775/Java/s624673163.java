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
        EPayment solver = new EPayment();
        solver.solve(1, in, out);
        out.close();
    }

    static class EPayment {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String x = in.next();
            long ans = 0;
            int d[] = new int[x.length() + 1];
            for (int i = 0; i < x.length(); i++) d[i + 1] = x.charAt(i) - '0';
            int b = 0;
            for (int i = x.length(); i >= 0; i--) {
                d[i] += b;
                b = d[i] / 10;
                d[i] %= 10;
                if (d[i] < 11 - d[i]) {
                    ans += d[i];
                } else {
                    ans += 10 - d[i];
                    b++;
                }
            }
            out.println(ans + b);
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

    }
}

