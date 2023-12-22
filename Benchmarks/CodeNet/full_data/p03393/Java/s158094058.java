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
        ADiverseWord solver = new ADiverseWord();
        solver.solve(1, in, out);
        out.close();
    }

    static class ADiverseWord {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            String m = in.string();
            if (m.equals("zyxwvutsrqponmlkjihgfedcba")) {
                out.println(-1);
            } else if (m.length() < 26) {
                boolean[] app = new boolean[26];
                for (char c : m.toCharArray()) {
                    app[c - 'a'] = true;
                }
                for (int i = 0; i < 26; i++) {
                    if (!app[i]) {
                        out.println(m + (char) (i + 'a'));
                        return;
                    }
                }
            } else {
                for (int i = m.length() - 2; i >= 0; i--) {
                    if (m.charAt(i) < m.charAt(m.length() - 1)) {
                        out.println(m.substring(0, i) + m.charAt(m.length() - 1));
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

