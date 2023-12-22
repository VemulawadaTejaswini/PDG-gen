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
 * @author Anirudh Rayabharam
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        MultipleClocks solver = new MultipleClocks();
        solver.solve(1, in, out);
        out.close();
    }

    static class MultipleClocks {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long ans = -1;
            while (n-- > 0) {
                long t = in.nextLong();
                if (ans == -1) ans = t;
                else if (t % ans == 0) ans = t;
                else if (ans % t == 0) {
                } else ans = lcm(ans, t);
            }
            out.println(ans);
        }

        private long lcm(long a, long b) {
            long g = gcd(a, b);
            return (a / g) * (b / g);
        }

        private long gcd(long a, long b) {
            while (b != 0) {
                long t = b;
                b = a % b;
                a = t;
            }
            return a;
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

