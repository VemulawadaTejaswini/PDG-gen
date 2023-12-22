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
            int N = in.nextInt();
            int[] a = new int[N];
            for(int i = 0; i < N; i++) {
                a[i] = in.nextInt();
            }
            long[] prefixSum = new long[N];
            prefixSum[0] = a[0];
            for(int i = 1; i < N; i++) {
                prefixSum[i] = prefixSum[i - 1] + a[i];
            }
            long[][] dp = new long[N][N];   //dp[i][j]: the min cost to merge piles [i, j]
            for(int l = 2; l <= N; l++) {
                for(int left = 0; left <= N - l; left++) {
                    int right = left + l - 1;
                    dp[left][right] = Long.MAX_VALUE;
                    for(int split = left; split < right; split++)
                    dp[left][right] = Math.min(dp[left][right], dp[left][split] + dp[split + 1][right] + prefixSum[right] - (left > 0 ? prefixSum[left - 1] : 0));
                }
            }
            out.println(dp[0][N - 1]);
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


