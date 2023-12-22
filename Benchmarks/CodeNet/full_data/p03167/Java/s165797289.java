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

//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    private static void solve(int q, FastScanner in, PrintWriter out) {
        for (int qq = 0; qq < q; qq++) {
            int h = in.nextInt(), w = in.nextInt();
            char[][] grid = new char[h][w];
            for(int i = 0; i < h; i++) {
                grid[i] = in.next().toCharArray();
            }
            int mod = (int)1e9 + 7;
            long[][] dp = new long[h][w];
            for(int i = 0; i < w && grid[0][i] == '.'; i++) {
                dp[0][i] = 1;
            }
            for(int i = 0; i < h && grid[i][0] == '.'; i++) {
                dp[i][0] = 1;
            }
            for(int i = 1; i < h; i++) {
                for(int j = 1; j < w; j++) {
                    if(grid[i][j] == '.') {
                        dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % mod;
                    }
                }
            }
            out.println(dp[h - 1][w - 1]);
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


