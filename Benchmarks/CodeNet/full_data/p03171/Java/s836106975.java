import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = sc.nextInt();
        int ar[] = new int[n];
        for(int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        long dp[][] = new long[n][n];
        for(int L = 1; L <= n; L++) {
            for(int i = 0; i + L - 1 < n; i++) {
                int j = i + L - 1;
                if(L == 1) {
                    dp[i][j] = ar[i];
                    continue;
                }
                dp[i][j] = Math.max(ar[i] - dp[i + 1][j], -dp[i][j - 1] + ar[j]);
            }
        }
        System.out.println(dp[0][n - 1]);
    }
}
