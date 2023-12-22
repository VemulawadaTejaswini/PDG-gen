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
        AShiritori solver = new AShiritori();
        solver.solve(1, in, out);
        out.close();
    }

    static class AShiritori {
        private static final String YES = "YES";
        private static final String NO = "NO";

        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            String a = in.string(), b = in.string(), c = in.string();
            if (a.charAt(a.length() - 1) != b.charAt(0)) {
                out.println(NO);
            } else if (b.charAt(b.length() - 1) != c.charAt(0)) {
                out.println(NO);
            } else {
                out.println(YES);
            }
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

    }
}

