import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int w = sc.nextInt();
        int[] Weight = new int[n];
        int[] Value = new int[n];
        for (int i = 0; i < n; i++) {
            Weight[i] = sc.nextInt();
            Value[i] = sc.nextInt();
        }
        long[][] dp = new long[n][w+1]; //i madede w ika no value no max
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                for (int j = 0; j <= w; j++) {
                    if (j >= Weight[0]) {
                        dp[i][j] = Value[0];
                    } else {
                        dp[i][j] = 0;
                    }
                }
            } else {
                for (int j = 0; j <= w; j++) {
                    if (j >= Weight[i]) {
                        dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-Weight[i]] + Value[i]);
                    } else {
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
        }

        System.out.println(dp[n-1][w]);

        sc.close();
    }
}
