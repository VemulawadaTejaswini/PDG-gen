import java.util.*;
import java.awt.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean[][] dp = new boolean[n+1][k+1];
            dp[0][0] = true;

            for (int j = 0; j < n; j++) {
                for (int l = 0; l <= k; l++) {
                    if (i != j) {
                        if (dp[j][l] == true) {
                            dp[j+1][l] = true;
                            if (l+a[j] <= k) dp[j+1][l+a[j]] = true;
                        }
                    } else {
                        if (dp[j][l] == true) {
                            dp[j+1][l] = true;
                        }
                    }
                }
            }

            boolean f = false;
            for (int j = Math.max(k-a[i], 0); j < k; j++) {
                if (dp[n][j] == true) {
                    f = true;
                }
            }

            if (f == false) count++;
        }

        System.out.println(count);
    }
}
