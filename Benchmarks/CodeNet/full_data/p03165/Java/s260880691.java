//package atcoder.dpContest;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        try {
//            FastScanner in = new FastScanner(new FileInputStream("src/input.in"));
//            PrintWriter out = new PrintWriter(new FileOutputStream("src/output.out"));
        FastScanner in = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(1, in, out);

//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    private static void solve(int q, FastScanner in, PrintWriter out) {
        for(int qq = 0; qq < q; qq++) {
            String s = in.next(), t = in.next();
            int n = s.length(), m = t.length();
            int[][] dp = new int[n + 1][m + 1];

            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= m; j++) {
                    if(s.charAt(i - 1) == t.charAt(j - 1)) {
                        dp[i][j] = 1 + dp[i - 1][j - 1];
                    }
                    else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            int i = n, j = m;
            while(i > 0 && j > 0) {
                if(s.charAt(i - 1) == t.charAt(j - 1)) {
                    sb.append(s.charAt(i - 1));
                    i--;
                    j--;
                }
                else {
                    if(dp[i - 1][j] >= dp[i][j - 1]) {
                        i--;
                    }
                    else {
                        j--;
                    }
                }
            }
            out.println(sb.reverse().toString());
        }
        out.close();
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}


