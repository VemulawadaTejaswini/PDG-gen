
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int[][] vac = new int[n][3];
    static int[][] dp = new int[n + 1][3];
    public static void main(String[] args) {
        //dp初期化
        for (int i = 0; i < n; i++){
            for (int j = 0; j < 3; j++)
            dp[i][j] = 0;
        }
        //標準入力を取得
        for (int i = 0; i < n; i++){
            for (int j = 0; j < 3; j++){
                vac[i][j] = sc.nextInt();
            }
        }
         for (int i = 0; i < n; i++){
             for (int j = 0; j < 3; j++){
                 for (int k = 0; k < 3; k++){
                     if (j == k)
                         continue;
                     dp[i + 1][k] = chmax(dp[i + 1][k], dp[i][j] + vac[i][k]);
                 }
             }
         }

        System.out.println(Math.max(Math.max(dp[n][0], dp[n][1]), dp[n][2]));
    }

    static int chmax(int a, int b){
        if (a < b) {
            return b;
        } else {
            return a;
        }
    }
}
