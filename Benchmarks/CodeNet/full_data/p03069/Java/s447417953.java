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
 */
public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CStones solver = new CStones();
        solver.solve(1, in, out);
        out.close();
    }

    static class CStones {

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            String s = in.next();
            int maxWhite = -1;
            int minBlack = n;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '.') {
                    maxWhite = i;
                } else {
                    if (minBlack == n) {
                        minBlack = i;
                    }
                }
            }

            int minSum = 0;
            StringBuilder sb = new StringBuilder(s);
            for (int i = 0; i < maxWhite; i++) {
                if (s.charAt(i) == '#') {
                    minSum++;
                    sb.setCharAt(i, '.');
                }
            }
            String ans = sb.toString();
            int sum = 0;
            sb = new StringBuilder(s);
            for (int i = n - 1; i >= minBlack; i--) {
                if (s.charAt(i) == '.') {
                    sum++;
                    sb.setCharAt(i, '#');
                }
            }
            if (sum < minSum) {
                minSum = sum;
                ans = sb.toString();
            }
            out.println(minSum);
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

