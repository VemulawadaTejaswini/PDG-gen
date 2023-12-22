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
            int N = in.nextInt(), W = in.nextInt();
            int[] w = new int[N], v = new int[N];
            for(int i = 0; i < N; i++) {
                w[i] = in.nextInt();
                v[i] = in.nextInt();
            }

//            long[][] dp = new long[W + 1][N];   //dp[i][j]: the max value we can get out of the first j items with max weight i.
//            for(int i = 1; i <= W; i++) {
//                for(int j = 0; j < N; j++) {
//                    dp[i][j] = j == 0 ? 0 : dp[i][j - 1];
//                    if(i >= w[j]) {
//                        dp[i][j] = Math.max(dp[i][j], (j == 0 ? 0 : dp[i - w[j]][j - 1]) + v[j]);
//                    }
//                }
//            }
//
//            out.println(dp[W][N - 1]);
            long[] dp = new long[W + 1];    //dp[i]: the max total value of items picked with total weight exactly i.
            for(int item = 0; item < N; item++) {
                for(int weight_already = W - w[item]; weight_already >= 0; weight_already--) {
                    dp[weight_already + w[item]] = Math.max(dp[weight_already + w[item]], dp[weight_already] + v[item]);
                }
            }
            long ans = 0;
            for(int weight = 0; weight <= W; weight++) {
                ans = Math.max(ans, dp[weight]);
            }
            out.println(ans);
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


