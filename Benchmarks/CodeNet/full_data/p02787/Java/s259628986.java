import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        long H = sc.nextLong(), N = sc.nextLong();
        long[] A = new long[(int) N], B = new long[(int) N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
            B[i] = sc.nextLong();
        }

        long INF = 1 << 60;
        long[][] dp = new long[(int) N][(int) H + 10001];
        for (long[] i : dp) {
            Arrays.fill(i, INF);
            i[0] = 0;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= H + 10000; j++) {
                if (i > 0) dp[i][j] = dp[i - 1][j];
                if (j >= A[i]) {
                    dp[i][j] = Math.min(dp[i][j - (int) A[i]] + B[i], dp[i][j]);
                }
            }
        }

        long ans = INF;
        for (long j = H; j <= H + 10000; j++) {
            ans = Math.min(ans, dp[(int) N - 1][(int) j]);
        }

        out.println(ans);

        out.close();
    }


    public static PrintWriter out;

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
