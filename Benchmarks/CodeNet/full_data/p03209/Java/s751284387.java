import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DChristmas solver = new DChristmas();
        solver.solve(1, in, out);
        out.close();
    }

    static class DChristmas {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int n = in.ints();
            long x = in.longs();
            long b = x;
            long ans = 0;
            for (int i = n; i >= 0; i--) {
                long h = height(i);
                long mid = (h + 1) / 2;
                if (b == mid) {
                    ans += patties(i - 1);
                    ans++;
                    break;
                } else if (b == 1) {
                    break;
                } else if (b == h) {
                    ans += patties(i);
                    break;
                } else if (b < mid) {
                    b--;
                } else {
                    ans += patties(i - 1);
                    ans++;
                    b -= mid;
                }
            }
            out.println(ans);
        }

        public long height(int n) {
            return (1L << (n + 2)) - 3;
        }

        public long patties(int n) {
            if (n < 0) {
                return 0;
            }
            return (1L << (n + 1)) - 1;
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

        public long longs() {
            return Long.parseLong(string());
        }

    }
}

