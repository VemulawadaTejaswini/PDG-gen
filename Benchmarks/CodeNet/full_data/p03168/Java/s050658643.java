
import java.util.*;

class DPValue {
    public DPValue(int heads, int tails, double val) {
        this.heads = heads;
        this.tails = tails;
        this.val = val;
    }

    public DPValue(DPValue dp) {
        this.heads = dp.heads;
        this.tails = dp.tails;
        this.val = dp.val;
    }

    public DPValue() {
    }

    int heads, tails;
    double val;


    @Override
    public String toString() {
        return "heads: " + heads + " tails: " + tails + " val: " + val;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double [][]dp = new double[n + 1][2 * n + 2];     // States are 1. Number of coins.   2. Difference between heads and tails
        double []a = new double[n];
        for(int i = 0; i < n; i++) {
            a[i] = in.nextDouble();
        }

        dp[0][n] = 1;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 2 * n + 1; j++) {
                if(dp[i][j] != 0) {
                    dp[i + 1][j + 1] += dp[i][j] * a[i];         // heads
                    dp[i + 1][j - 1] += dp[i][j] * (1 - a[i]);   // tails
                }
            }
        }
        double ans = 0;
        for(int i = n + 1; i < 2 * n + 2; i++) {
            ans += dp[n][i];
        }
        System.out.println(ans);
    }
}