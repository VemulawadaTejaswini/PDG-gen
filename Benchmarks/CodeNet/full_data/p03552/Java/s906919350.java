import java.util.*;
import java.io.*;

public class Main {
    static int [] a;
    static int[][] dp;
    static int n, w;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        n = sc.nextInt(); int z = sc.nextInt(); w = sc.nextInt();
        a = new int[n + 1];
        for (int i = 1; i <= n; i++) a[i] = sc.nextInt();
        dp = new int[n + 1][2];
        for (int i = 0; i <= n; i++) Arrays.fill(dp[i], -1);
        out.println(go(0, 1));
        out.close();
    }

    static int go(int cur, int turn) {
        if (dp[cur][turn] != -1) return dp[cur][turn];
        // X's turn
        if (turn == 1) {
            if (cur != 0) dp[cur][turn] = Math.abs(a[cur] - a[n]); else dp[cur][turn] = Math.abs(w - a[n]);
            for (int i = cur + 1; i <= n - 1; i++) {
                dp[cur][turn] = Math.max(dp[cur][turn], go(i, 0));
            }
        } else {
            dp[cur][turn] = Math.abs(a[cur] - a[n]);
            for (int i = cur + 1; i <= n - 1; i++) {
                dp[cur][turn] = Math.min(dp[cur][turn], go(i, 1));
            }
        }
        return dp[cur][turn];
    }


    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
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