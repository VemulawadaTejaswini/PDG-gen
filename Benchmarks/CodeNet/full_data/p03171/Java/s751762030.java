import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long S = 0;
        int[] a = new int[N];
        for (int i = 0; i < N; ++i) {
            a[i] = scanner.nextInt();
            S += a[i];
        }

        long[][] dp = new long[N + 1][N + 1];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N-i; j++) {
                if ((N - i) % 2 == 1) {
                    if (i==0) {
                        dp[j][j] = a[j];
                    } else {
                        dp[j][j+i] = Math.max(dp[j][j+i-1] + a[j+i], dp[j+1][j+i]+ a[j]);
                    }
                } else {
                    if (i==0) {
                        dp[j][j] = 0;
                    } else {
                        dp[j][j + i] = Math.min(dp[j][j+i-1], dp[j+1][j+i]);
                    }
                }
            }
        }

        long X = dp[0][N-1];
        long Y = S-X;

        System.out.println(X-Y);
    }
}