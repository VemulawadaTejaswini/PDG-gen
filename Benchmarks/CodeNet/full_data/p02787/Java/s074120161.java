import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        int H = in.nextInt();
        int N = in.nextInt();
        long INF = 1_000_000_000_000_000L;
        int[] A = new int[N];
        int[] B = new int[N];
        long[][] dp = new long[N+1][3*10000+1];
        for (int i=0;i<N+1;i++) {
            for (int j=0;j<3*10000+1;j++) {
                dp[i][j] = INF;
            }
        }
        dp[0][0] = 0;
        for (int i=0;i<N;i++) {
            A[i] = in.nextInt();
            B[i] = in.nextInt();
        }
        for (int i=1;i<N+1;i++) {
            for (int j=0;j<3*10000;j++) {
                if (i-1>=0) {
                    dp[i][j] = Math.min(dp[i][j], dp[i-1][j]);
                }
                if (j-A[i-1]>=0) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][j-A[i-1]]+B[i-1]);
                }
            }
        }

        long ans = INF;
        for (int j=H;j<=H+15000;j++) {
            ans = Math.min(ans, dp[N][j]);
        }
        out.println(ans);

        out.close();
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}
