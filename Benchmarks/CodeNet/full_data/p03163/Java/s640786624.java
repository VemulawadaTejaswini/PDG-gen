
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int n = sc.nextInt();
        int W = sc.nextInt();

        int[][] mono = new int[n][2];
        for (int i = 0; i < n; i++) {
            mono[i][0] = sc.nextInt();
            mono[i][1] = sc.nextInt();
        }

        long[][] dp = new long[n][W + 1];
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < W + 1; k++) {
                int weight = mono[i][0];
                if (i == 0) {
                    if (k < weight) {
                        dp[i][k] = 0;
                    } else {
                        dp[i][k] = mono[i][1];
                    }
                } else {
                    if (k < weight) {
                        dp[i][k] = dp[i - 1][k];
                    } else {
                        dp[i][k] = Math.max(dp[i - 1][k], dp[i - 1][k - weight] + mono[i][1]);
                    }
                }
            }
        }

        out.println(dp[n - 1][W]);
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