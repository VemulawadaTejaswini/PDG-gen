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
        long[] a = new long[n];
        long[] b = new long[n];
        long[] c = new long[n];
        long[] dp = new long[n + 1];
        for (int i = 0; i <= n - 1; ++i) {
            a[i] = in.nextLong();
            b[i] = in.nextLong();
            c[i] = in.nextLong();
        }
        int[] index = new int[n + 1];
        dp[0] = Math.max(a[0], Math.max(b[0], c[0]));
        if (b[0] > c[0]) {
            if (b[0] > a[0]) {
                index[0] = 2;
            } else {
                index[0] = 1;
            }
        } else {
            if (c[0] > a[0]) {
                index[0] = 3;
            } else {
                index[0] = 1;
            }
        }
        for (int i = 1; i < n; i++) {
            if (index[i - 1] == 1) {
                dp[i] = Math.max(b[i], c[i]) + dp[i - 1];
                if (b[i] >= c[i]) {
                    index[i] = 2;
                } else {
                    index[i] = 3;
                }
            } else if (index[i - 1] == 2) {
                dp[i] = Math.max(a[i], c[i]) + dp[i - 1];
                if (a[i] >= c[i]) {
                    index[i] = 1;
                } else {
                    index[i] = 3;
                }
            } else {
                dp[i] = Math.max(a[i], b[i]) + dp[i - 1];
                if (a[i] >=  b[i]) {
                    index[i] = 1;
                } else {
                    index[i] = 2;
                }
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(dp[n - 1]));
        bw.flush();
    }
}
