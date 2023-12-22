import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = scanner.nextInt();
        }

        long[][] dp = new long[N + 1][N + 1];
        for (int i = 0; i <= N; ++i) {
            for (int j = 0; j < N-i; ++j) {
                if ((N - i) % 2 == 1) {
                    if (i==0) {
                        dp[j][j] = arr[j];
                    } else {
                        dp[i][j] = Math.max(
                                dp[j][j+i-1] + arr[j+i],
                                dp[j+1][j+i] + arr[j]);
                    }
                } else {
                    if (i==0) {
                        dp[j][j] = 0;
                    } else {
                        dp[j][j + i] = Math.min(
                                dp[j][j+i-1],
                                dp[j+1][j+i]);
                    }
                }
            }
        }

        System.out.println(arr[0]);
    }
}