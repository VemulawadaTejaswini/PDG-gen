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
        BSs solver = new BSs();
        solver.solve(1, in, out);
        out.close();
    }

    static class BSs {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            String s = in.string();
            for (int i = 1; i < s.length(); i++) {
                String r = s.substring(0, s.length() - i - 1);
                if (r.length() % 2 == 0) {
                    String a = r.substring(0, r.length() / 2);
                    String b = r.substring(r.length() / 2);
                    if (a.equals(b)) {
                        out.println(r.length());
                        return;
                    }
                }
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

