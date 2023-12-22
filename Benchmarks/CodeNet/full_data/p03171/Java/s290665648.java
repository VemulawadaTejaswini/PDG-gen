import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int []a = IntStream.range(0, n).map(x -> in.nextInt()).toArray();
        long [][]dp = new long[n][n];

        for(int i = 0; i < n; i++) {
            dp[i][i] = a[i];
        }
        for (int i = 0; i < n - 1; i++) {
            dp[i][i + 1] = Math.max(a[i], a[i + 1]) - Math.min(a[i], a[i + 1]);
        }

        for(int len = 2; len < n; len++) {
            for(int start = 0; start + len < n; start++) {
                int end = start + len;
                dp[start][end] = Math.max(a[start] - dp[start + 1][end], a[end] - dp[start][end - 1]);
            }
        }
        System.out.println(dp[0][n - 1]);
    }
}
