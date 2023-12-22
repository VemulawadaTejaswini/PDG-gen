
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        k = k < n ? k : n;
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = Math.abs(h[1] - h[0]);

        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + Math.abs(h[i] - h[i - 1]);
            for (int j = 2; j <= k && 0 <= i - j; j++) {
                dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(h[i] - h[i - j]));
                if (k == j) {
                    break;
                }
            }
        }

        out.println(dp[n - 1]);

        out.flush();

    }
    
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
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