import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int a = sc.nextInt();
        int[][] dp = new int[n + 1][n * 50 + 1]; // dp[個数][和]の組み合わせ数
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            for (int num = i; num >= 0; num--) {
                for (int sum = 0; sum < n * 50 + 1 - x; sum++) {
                    dp[num + 1][sum + x] += dp[num][sum];
                }
            }
            dp[1][x]++;
        }

        int ans = 0;
        for (int i = 1; i < n + 1; i++) {
            ans += dp[i][i * a];
        }
        System.out.println(ans);
    }
}