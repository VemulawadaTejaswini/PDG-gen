import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        int A;
        int[] Xi;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            A = sc.nextInt();
            Xi = new int[N];
            for (int i = 0; i < Xi.length; i++) {
                Xi[i] = sc.nextInt();

            }
        }

        //i番目のXを加えていきながら、選んだカード枚数 pで総数がjになる個数
        //dp[p][j] = dp[p-1][j-x](i番目のXを選んだ) + dp[p][j](i番目のXを選ばなかった)
        long[][][] dp;
        //B枚選んだ
        int B = 0;

        dp = new long[N + 1][N + 1][50 * 50 + 1];
        dp[0][0][0] = 1;

        while (B < N) {
            int x = Xi[B];
            //p=0だけはコピー
            for (int j = 0; j < dp[B + 1][0].length; j++) {
                dp[B + 1][0][j] += dp[B][0][j];
            }
            for (int p = 1; p < dp[B + 1].length; p++) {
                for (int j = 0; j < dp[B + 1][p].length; j++) {
                    dp[B + 1][p][j] += dp[B][p][j];
                    if (j - x >= 0) {
                        dp[B + 1][p][j] += dp[B][p - 1][j - x];
                    }
                }
            }
            B++;
        }
        long result = 0;
        for (int i = 1; i <= N; i++) {
            result += dp[N][i][(i * A)];

        }
        System.out.println(result);
    }

}
