import java.util.Scanner;

public class Main {
    static int N, A;
    static int[] x;
    static long[][][] dp;

    static long dfs(int idx, int sum, int cnt) {
        if (dp[idx][sum][cnt] != -1) {
            return dp[idx][sum][cnt];
        }
        if (idx == N) {
            if (cnt > 0 && sum % cnt == 0 && sum / cnt == A) {
                return 1;
            }
            return 0;
        }
        long res = 0;
        res += dfs(idx + 1, sum, cnt);
        res += dfs(idx + 1, sum + x[idx], cnt + 1);
        return dp[idx][sum][cnt] = res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            N = sc.nextInt();
            A = sc.nextInt();
            x = new int[N];
            for (int i = 0; i < N; i++) {
                x[i] = sc.nextInt();
            }
            dp = new long[N + 1][N * 50 + 1][N + 1];
            for (int i = 0; i < N + 1; i++) {
                for (int j = 0; j < N * 50 + 1; j++) {
                    for (int k = 0; k < N + 1; k++) {
                        dp[i][j][k] = -1;
                    }
                }
            }
            System.out.println(dfs(0, 0, 0));
        }
    }
}
