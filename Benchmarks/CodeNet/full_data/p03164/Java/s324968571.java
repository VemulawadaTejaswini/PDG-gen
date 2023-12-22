
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int N = sc.nextInt();
    static int W = sc.nextInt();
    static long weight[] = new long[110];
    static long value[] = new long[110];
    static long dp[][] = new long[110][100100];

    public static void main(String[] args) {
        //標準入力取得
        for (int i = 0; i < N; i++){
            weight[i] = sc.nextLong();
            value[i] = sc.nextLong();
        }
        for (int i = 0; i < 110; i++){
            for (int j = 0; j < 100100; j++){
                dp[i][j] = 2147483647;
            }
        }

        dp[0][0] = 0;
        for (int i = 0; i < N; i++){
            for (int sum_v = 0; sum_v < 100100; sum_v++){
                if (sum_v - value[i] >= 0)
                    dp[i + 1][sum_v] = chmin(dp[i + 1][sum_v], dp[i][(int)(sum_v - value[i])] + weight[i]);
                dp[i + 1][sum_v] = chmin(dp[i + 1][sum_v], dp[i][sum_v]);
            }
        }
        long result = 0;
        for (int sum_v = 0; sum_v < 100100; sum_v++){
            if (dp[N][sum_v] <= W)
                result = sum_v;
        }
        System.out.println(result);
    }

    public static long chmin(long a, long b){
        if (a > b){
            return b;
        } else {
            return a;
        }
    }

}
