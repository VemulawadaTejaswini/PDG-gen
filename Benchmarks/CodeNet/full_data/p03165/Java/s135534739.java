/**
 * @author derrick20
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
//        StringBuilder[][] dp = new StringBuilder[s.length][t.length];
        // Base case, first chars
//        dp[0][0] = new StringBuilder();
//        dp[1][0] = new StringBuilder();
//        dp[0][1] = new StringBuilder();
//        if (s[0] == t[0]) {
//            dp[0][0].append(s[0]);
//        }
//        else {
//            if (s[0] == t[1]) {
//                dp[0][1].append(s[0]);
//            }
//            if (s[1] == t[0]) {
//                dp[1][0].append(s[1]);
//            }
//        }
//
//        for (int i = 0; i < s.length; i++) {
//            for (int j = 0; j < t.length; j++) {
//                if (i > 0 && j > 0)
//                    int l
//                    dp[i][j] = new StringBuilder(dp[i - 1][j - 1]);
//                else if (i > 0) {
//                    dp[i][j] = new StringBuilder(dp[i - 1][j]);
//                }
//                else if (j > 0) {
//                    dp[i][j] = new StringBuilder(dp[i][j - 1]);
//                }
//                else {
//                    dp[i][j] = new StringBuilder();
//                }
//                if (s[i] == t[j]) {
//                    dp[i][j].append(s[i]);
//                }
//            }
//        }
//        out.println(dp[s.length - 1][t.length - 1]);
        memo = new String[s.length][t.length];
        String ans = solve(0, 0, s, t);
        out.println(ans);
        out.close();
    }

    static String[][] memo;

    static String solve(int i, int j, char[] s, char[] t) {
        if (i == s.length || j == t.length) {
            return "";
        }
        else if (memo[i][j] != null) {
            return memo[i][j];
        }
        else {
            if (s[i] == t[j]) {
                // In fact we need to append the solution to the rest to this!
                StringBuilder ans = new StringBuilder(s[i] + "").append(solve(i + 1, j + 1, s, t));
                return memo[i][j] = ans.toString();
            }
            else {
                String a = solve(i + 1, j, s, t);
                String b = solve(i, j + 1, s, t);
                if (a.length() >= b.length()) {
                    memo[i][j] = a;
                }
                else {
                    memo[i][j] = b;
                }
                return memo[i][j];
            }
        }
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        FastScanner(FileReader s) {
            br = new BufferedReader(s);
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        String nextLine() throws IOException { return br.readLine(); }

        double nextDouble() throws IOException { return Double.parseDouble(next()); }

        int nextInt() throws IOException { return Integer.parseInt(next()); }

        long nextLong() throws IOException { return Long.parseLong(next()); }
    }
}