import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ADividingAString solver = new ADividingAString();
        solver.solve(1, in, out);
        out.close();
    }

    static class ADividingAString {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            char[] s = in.next().toCharArray();
            int[][] dp = new int[s.length + 1][3];
            for (int[] i : dp) {
                Arrays.fill(i, Integer.MIN_VALUE);
            }
            dp[0][0] = 0;
            for (int pos = 0; pos < s.length; pos++) {
                for (int len = 0; len <= 2; len++) {
                    if (dp[pos][len] != Integer.MIN_VALUE) {
                        for (int newLen = 1; newLen <= 2 && pos + newLen <= s.length; newLen++) {
                            if (!eq(s, pos, len, newLen)) {
                                dp[pos + newLen][newLen] = Math.max(dp[pos + newLen][newLen], dp[pos][len] + 1);
                            }
                        }
                    }
                }
            }
            out.println(Math.max(dp[s.length][2], dp[s.length][1]));
        }

        private boolean eq(char[] s, int pos, int len, int newLen) {
            if (len != newLen) {
                return false;
            }
            if (pos == 0) {
                return false;
            }
            for (int i = 0; i < len; i++) {
                if (s[pos - len + i] != s[pos + i]) {
                    return false;
                }
            }
            return true;
        }

    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        public FastScanner(String fileName) {
            try {
                br = new BufferedReader(new FileReader(fileName));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                String line = null;
                try {
                    line = br.readLine();
                } catch (IOException e) {
                }
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

    }
}

