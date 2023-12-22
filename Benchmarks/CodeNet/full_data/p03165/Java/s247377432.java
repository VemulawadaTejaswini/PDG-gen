import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Problem solver = new Problem();
        solver.solve(0, in, out);
        out.close();
    }

    static class Problem {


        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String s = in.next(), t = in.next();
            StringBuilder[][] dp = new StringBuilder[s.length()][t.length()];
            StringBuilder res = lcs(s, s.length() - 1, t, t.length() - 1, dp);
            out.println(res);
        }

        public StringBuilder lcs(String s, int i, String t, int j, StringBuilder[][] dp) {
            if (i < 0 || j < 0) {
                return new StringBuilder();
            }

            if (dp[i][j] != null)
                return dp[i][j];

            if (s.charAt(i) == t.charAt(j)) {
                StringBuilder curr = lcs(s, i - 1, t, j - 1, dp);
                curr.append(s.charAt(i));
                dp[i][j] = new StringBuilder(curr);
                return curr;
            } else {
                StringBuilder curr1 = lcs(s, i - 1, t, j, dp);
                StringBuilder curr2 = lcs(s, i, t, j - 1, dp);
                dp[i][j] = new StringBuilder(curr1.length() > curr2.length() ? curr1 : curr2);
                return dp[i][j];
            }

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

