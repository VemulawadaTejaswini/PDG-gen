import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }

        System.out.println(solve(H, N, A, B));
    }

    private static int solve(int H, int N, int[] A, int[] B) {
        int dp[] = new int[H+1];

        dp[0] = 0;
        dp[1] = B[0];
        for (int j=2; j<=H; j++) {
            if (j <= A[0]) {
                dp[j] = B[0];
            } else {
                dp[j] = B[0] * (j/A[0]);
                dp[j] += j%A[0] == 0 ? 0 : B[0];
            }
        }

        for (int i=1; i<N; i++) {
            for (int j = A[i]; j <= H; j++) {
                dp[j] = Math.min(dp[j], dp[j - A[i]] + B[i]);
            }
        }

        return dp[H];
    }
}