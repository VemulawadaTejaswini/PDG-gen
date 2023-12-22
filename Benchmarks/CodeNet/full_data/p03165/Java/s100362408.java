import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
            int[][] dp = new int[s.length() + 1][t.length() + 1];

            for (int i = 1; i <= s.length(); i++) {
                for (int j = 1; j <= t.length(); j++) {
                    if (s.charAt(i - 1) == t.charAt(j - 1))
                        dp[i][j] = 1 + dp[i - 1][j - 1];
                    else
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
            
            int i = s.length(), j = t.length();
            StringBuilder res = new StringBuilder();

            while (i > 0 && j > 0 && dp[i][j] != 0) {
                if(s.charAt(i - 1) == t.charAt(j - 1)) {
                    res.append(s.charAt(i - 1));
                    i--;
                    j--;
                }
                else if(dp[i - 1][j] > dp[i][j - 1])
                    i--;
                else
                    j--;
            }

            out.println(res.reverse());
        }

//        public void solve2(int testNumber, InputReader in, PrintWriter out) {
//            String s = in.next(), t = in.next();
//            StringBuilder[][] dp = new StringBuilder[s.length()][t.length()];
//            StringBuilder res = lcs2(s, s.length() - 1, t, t.length() - 1, dp);
//            out.println(res);
//        }
//
//        public StringBuilder lcs2(String s, int i, String t, int j, StringBuilder[][] dp) {
//            if (i < 0 || j < 0) {
//                return new StringBuilder();
//            }
//
//            if (dp[i][j] != null)
//                return dp[i][j];
//
//            if (s.charAt(i) == t.charAt(j)) {
//                StringBuilder curr = lcs2(s, i - 1, t, j - 1, dp);
//                curr.append(s.charAt(i));
//                dp[i][j] = new StringBuilder(curr);
//                return curr;
//            } else {
//                StringBuilder curr1 = lcs2(s, i - 1, t, j, dp);
//                StringBuilder curr2 = lcs2(s, i, t, j - 1, dp);
//                dp[i][j] = new StringBuilder(curr1.length() >= curr2.length() ? curr1 : curr2);
//                return dp[i][j];
//            }
//
//        }

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

