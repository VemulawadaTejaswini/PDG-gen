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
        CDubiousDocument solver = new CDubiousDocument();
        solver.solve(1, in, out);
        out.close();
    }

    static class CDubiousDocument {
        static final char a = 'a';
        static final char z = 'z';

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();

            int[] count = new int[z + 1];
            for (int i = a; i <= z; i++)
                count[i] = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                String s = in.next();
                for (int c = a; c <= z; c++) {
                    int tot = 0;
                    for (int j = 0; j < s.length(); j++) {
                        if (s.charAt(j) == c) {
                            tot++;
                        }
                    }
                    count[c] = Math.min(count[c], tot);
                }
            }

            StringBuilder sb = new StringBuilder();
            for (char c = a; c <= z; c++) {
                for (int i = 0; i < count[c]; i++) {
                    sb.append(c);
                }
            }

            out.println(sb.toString());
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

