import java.util.Scanner;
import java.io.IOException;
 
class Main{
    public static void main(String[] args)throws IOException{
        int N,W;
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        W = scan.nextInt();
        int[]  v = new int[N+1];  //価値
        int[]  w = new int[N+1]; //重さ
        long[][] dp = new long[N+1][4];
 
        v[0] = 0;
        w[0] = 0;
 
        //値を取得
        for(int i=1;i<=N;i++){
          w[i] = scan.nextInt();
          v[i] = scan.nextInt();
        }
        int w1 = w[1];
 
        //初期化
        for(int i = 0; i <= N; i++) {
             for(int j = 0; j < 4; j++) {
                  dp[i][j] = 0;
             }
        }
 
        //ナップサック
        for(int i=1;i<=N;i++){
          for(int j=0;j<=3;j++){
            dp[i][j] = dp[i-1][j];
            if(w[i] > j) continue;
            dp[i][j] = Math.max(v[i]+dp[i-1][j-(w[i]-w1)],dp[i-1][j]);
          }
        }
        System.out.println(dp[N][W]);
    }
}