import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        int N = nextInt(r);
        int K = nextInt(r);
        int h[] = new int[N+K];
        for (int i = 0; i < N; i++) {
            h[i] = nextInt(r);
        }

        int dp[] = new int[N+K];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= K; j++) {
                int abs = Math.abs(h[i+j]-h[i]);
                dp[i+j] = Math.min(dp[i+j], dp[i]+abs);
            }
        }
        System.out.println(dp[N-1]);
    }

    public static String nextString(InputStreamReader r) throws Exception {
        String res = "";
        while (true) {
            int c = r.read();
            if (c == 32 || c == 10 || c == -1) {
                break;
            }
            res += (char)c;
        }
        return res;
    }

    public static int nextInt(InputStreamReader r) throws Exception {
        return Integer.parseInt(nextString(r));
    }

    public static long nextLong(InputStreamReader r) throws Exception {
        return Long.parseLong(nextString(r));
    }
}
