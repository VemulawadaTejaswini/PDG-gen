import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    /**
     * Consider small intervals and evaluate them before larger intervals
     * @param a
     * @return max difference when the game is played optimally
     */
    public static long maxDiff(long[] a){
        long[][] dp = new long[a.length+1][a.length+1];
        for (int L = a.length-1; L >= 0; L--) {
            for (int R = L; R < a.length; R++) {
                if (L==R){
                    dp[L][R] = a[L];
                } else {
                    dp[L][R] = Math.max(a[L] - dp[L+1][R], a[R] - dp[L][R-1]);
                }
            }
        }
        return dp[0][a.length - 1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        StringTokenizer st = new StringTokenizer(reader.readLine());
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(st.nextToken());
        }
        System.out.println(maxDiff(a));
    }
}
