import java.util.*;
import java.io.*;
public class Main {
    static InputStreamReader r;
    public static void main(String[] args) throws Exception {
        r = new InputStreamReader(System.in);
        int N = nextInt();
        int W = nextInt();
        int dp[][] = new int[N+1][100001];
        for (int i = 0; i <= N; i++) {
            Arrays.fill(dp[i], 1000000001);
        }

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            int wi = nextInt();
            int vi = nextInt();
            for (int j = 0; j <= 100000; j++) {
                if (j <= vi) {
                    dp[i][j] = Math.min(dp[i-1][j], wi);
                } else {
                    dp[i][j] = Math.min(dp[i-1][j], dp[i-1][j-vi]+wi);
                }

                if (dp[i][j] <= W) {
                    ans = Math.max(ans, j);
                } else {
                    break;
                }
            }
        }
        System.out.println(ans);
    }

    public static String nextString() throws Exception {
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

    public static int nextInt() throws Exception {
        return Integer.parseInt(nextString());
    }

    public static long nextLong() throws Exception {
        return Long.parseLong(nextString());
    }
}
