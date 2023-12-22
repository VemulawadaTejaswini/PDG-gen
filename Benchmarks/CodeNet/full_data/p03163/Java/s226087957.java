import java.io.*;
import java.util.*;

public class Main {

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
    }

    public static void main(String[] args) {
        FastReader scanner = new FastReader();
        int N = scanner.nextInt();
        int W = scanner.nextInt();

        int[] wt = new int[N];
        int[] val = new int[N];

        for (int i = 0; i < N; i++) {
            wt[i] = scanner.nextInt();
            val[i] = scanner.nextInt();
        }
        long[][] DP = new long[N + 1][W + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= W; j++) {
                if (wt[i - 1] <= j) {
                    DP[i][j] = Math.max(DP[i - 1][j], DP[i - 1][j - wt[i - 1]] + val[i - 1]);
                } else {
                    DP[i][j] = DP[i - 1][j];
                }
            }
        }
        System.out.println(DP[N][W]);
    }
}