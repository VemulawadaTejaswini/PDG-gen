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
        CABSubstrings solver = new CABSubstrings();
        solver.solve(1, in, out);
        out.close();
    }

    static class CABSubstrings {
        static final char A = 'A';
        static final char B = 'B';

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();


            String[] strings = new String[n];
            for (int i = 0; i < n; i++) {
                strings[i] = in.next();
            }

            int ans = 0;

            int a = 0, b = 0, ab = 0;
            for (String s : strings) {
                if (s.charAt(0) == B) {
                    b++;
                    if (s.charAt(s.length() - 1) == A) {
                        ab++;
                    }
                }
                if (s.charAt(s.length() - 1) == A) {
                    a++;
                }
                for (int i = 0; i + 1 < s.length(); i++) {
                    if (s.charAt(i) == A && s.charAt(i + 1) == B) {
                        ans++;
                    }
                }
            }

            a -= ab;
            b -= ab;

            int extra = Math.min(a, b) + ab;

            extra = Math.min(extra, n - 1);
            ans += extra;

            out.println(ans);
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

