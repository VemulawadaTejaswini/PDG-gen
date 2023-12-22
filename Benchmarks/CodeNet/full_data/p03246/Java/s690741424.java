import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.io.UncheckedIOException;
import java.util.Arrays;
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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int n = in.ints();
            int[] a = in.ints(n);
            if (Arrays.stream(a).allMatch(i -> i == a[0])) {
                out.println(n / 2);
                return;
            }
            int[] x = new int[100001];
            int[] y = new int[100001];
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    x[a[i]]++;
                } else {
                    y[a[i]]++;
                }
            }

            int xmax = 0;
            int xmaxi = 0;
            for (int i = 1; i < 100001; i++) {
                if (xmax < x[i]) {
                    xmax = x[i];
                    xmaxi = i;
                }
            }
            int ymax = 0;
            int ymaxi = 0;
            for (int i = 1; i < 100001; i++) {
                if (ymax < x[i]) {
                    ymax = x[i];
                    ymaxi = i;
                }
            }

            int xmax2 = 0;
            for (int i = 1; i < 100001; i++) {
                if (i == ymaxi) {
                    continue;
                }
                if (xmax2 < x[i]) {
                    xmax2 = x[i];
                }
            }
            int ymax2 = 0;
            for (int i = 1; i < 100001; i++) {
                if (i == xmaxi) {
                    continue;
                }
                if (ymax2 < y[i]) {
                    ymax2 = y[i];
                }
            }
            out.println(Math.min(n - xmax - ymax2, n - xmax2 - ymax));
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

        public int[] ints(int length) {
            return IntStream.range(0, length).map(x -> ints()).toArray();
        }

    }
}

