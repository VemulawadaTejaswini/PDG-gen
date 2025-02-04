import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
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
        ASortedArrays solver = new ASortedArrays();
        solver.solve(1, in, out);
        out.close();
    }

    static class ASortedArrays {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int n = in.ints();
            int[] a = in.ints(n);
            Boolean inc = null;
            int ans = 1;
            for (int i = 1; i < n; i++) {
                if (a[i - 1] == a[i]) {
                } else if (a[i - 1] < a[i]) {
                    if (inc != null && !inc) {
                        ans++;
                        inc = null;
                    } else {
                        inc = true;
                    }
                } else {
                    if (inc != null && inc) {
                        ans++;
                        inc = null;
                    } else {
                        inc = false;
                    }
                }
            }
            out.println(ans);
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

