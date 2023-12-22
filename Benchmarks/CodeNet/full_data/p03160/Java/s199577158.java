import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    private static int getInt() {
        try {
            return Integer.parseInt(READER.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int[] getIntArr(int n) {
        int[] ans = new int[n];

        StringTokenizer stringTokenizer = null;
        try {
            stringTokenizer = new StringTokenizer(READER.readLine(), " ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < n && stringTokenizer.hasMoreTokens(); i++) {
            ans[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        return ans;
    }

    private static int solve() {
        int n = getInt();
        if (n == 0) {
            return 0;
        }
        int[] hs = getIntArr(n);
        return solveInternal(n, hs);
    }

    private static int solveInternal(int n, int[] hs) {
        if (n <= 3) {
            return hs[n - 1] - hs[0];
        }

        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = hs[1] - hs[0];
        for (int i = 2; i < n; i++) {
            dp[i] = Math.min(dp[i - 1] + Math.abs(hs[i] - hs[i - 1]), dp[i - 2] + Math.abs(hs[i] - hs[i - 2]));
        }

//        for (int i = 0; i < dp.length; i++) {
//            System.out.println(dp[i]);
//        }
        return dp[n - 1];
    }

    public static void main(String... args) {
        System.out.println(solve());
//        System.out.println(solveInternal(4, new int[]{10, 30, 40, 20}));
    }
}