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
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DMenagerie solver = new DMenagerie();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMenagerie {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            boolean[] sheep = new boolean[n];
            boolean[] s = new boolean[n];

            String input = in.next();
            for (int i = 0; i < n; i++) {
                s[i] = input.charAt(i) == 'o';
            }

            for (int configFirstThree = 0; configFirstThree < 8; configFirstThree++) {
                sheep[0] = (configFirstThree & 1) > 0;
                sheep[1] = (configFirstThree & 2) > 0;
                sheep[2] = (configFirstThree & 4) > 0;
                for (int i = 3; i < n; i++) {
                    sheep[i] = sheep[i - 3] ^ s[i - 2] ^ s[i - 1];
                }

                boolean valid = true;
                for (int i = 0; i < n; i++) {
                    int a = i, b = (i + 1) % n, c = (i + 2) % n;
                    if (sheep[a] ^ sheep[b] ^ sheep[c] != s[b])
                        valid = false;
                }
                if (valid) {
                    out.println(stringify(sheep));
                    return;
                }
            }

            out.println(-1);
        }

        private static String stringify(boolean[] sheep) {
            StringBuilder sb = new StringBuilder();
            for (boolean s : sheep) {
                sb.append(s ? "S" : "W");
            }
            return sb.toString();
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

