import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner sc;

    public Main() {
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().solve();
    }

    private void solve() {
        int N = sc.nextInt();
        Arrays.fill(dp, -1);
        System.out.println(luca(N));
    }
    
    long[] dp = new long[90];
    private long luca(int n) {
        if (dp[n] != -1) {
            return dp[n];
        }
        
        if (n == 0) {
            return 2;
        }
        if (n == 1) {
            return 1;
        }
        
        return dp[n] = luca(n - 2) + luca(n - 1);
    }
}
