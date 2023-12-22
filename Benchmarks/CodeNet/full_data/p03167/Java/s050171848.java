
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int h = sc.nextInt();
        int w = sc.nextInt();

        char[][] grid = new char[h][w];

        for (int i = 0; i < h; i++) {
            grid[i] = sc.next().toCharArray();
        }

        int[][] dp = new int[h][w];
        dp[0][0] = 1;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i + 1 < h && grid[i + 1][j] == '.') {
                    dp[i + 1][j] += dp[i][j];
                    dp[i + 1][j] %= 1000000007;
                }

                if (j + 1 < w && grid[i][j + 1] == '.') {
                    dp[i][j + 1] += dp[i][j];
                    dp[i][j + 1] %= 1000000007;
                }
            }
        }

        out.println(dp[h-1][w-1]);
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