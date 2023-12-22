import java.util.Arrays;
import java.util.Scanner;

class C {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int[][] abc = new int[N][3];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < 3; j++)
                abc[i][j] = sc.nextInt();
        final int[][] dp = new int[N][];
        Arrays.setAll(dp, i -> i > 0 ? new int[3] : abc[0]);
        for (int i = 1; i < N; i++)
            for (int j = 0; j < 3; j++)
                for (int k = 0; k < 3; k++)
                    if (j != k)
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][k] + abc[i][j]);
        System.out.println(Math.max(dp[N - 1][0], Math.max(dp[N - 1][1], dp[N - 1][2])));
    }
}
public class Main {
    public static void main(String... args) {
        C.main();
    }
}
