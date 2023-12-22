import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    private static final class FastInput {
        private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        private StringTokenizer st;

        private int nextInt() throws Exception {
            return Integer.parseInt(nextWord());
        }

        private long nextLong() throws Exception {
            return Long.parseLong(nextWord());
        }

        private String nextWord() throws Exception {
            if (st == null || !st.hasMoreElements()) st = new StringTokenizer(br.readLine(), " ");
            return st.nextToken();
        }

        private long[] lineToIntArr(int len) throws Exception {
            long[] arr = new long[len];
            for (int i = 0; i < arr.length; i++) arr[i] = nextLong();
            return arr;
        }
    }

    public static void main(String[] args) throws Exception {
        FastInput in = new FastInput();
        int n = in.nextInt();
        long[] stones = in.lineToIntArr(n);
        long[] dp = new long[n + 1];
        dp[0] = 0;
        dp[1] = Math.abs(stones[1] - stones[0]);
        for (int i = 2; i < stones.length; i++) {
            dp[i] = Math.min(dp[i - 1] + Math.abs(stones[i] - stones[i - 1]), dp[i - 2] + Math.abs(stones[i] - stones[i - 2]));
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(dp[n - 1]));
        bw.flush();
    }
}
