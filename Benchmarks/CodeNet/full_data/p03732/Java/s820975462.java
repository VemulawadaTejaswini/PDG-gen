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
        long[][] dp = new long[N+1][W+1];
 
        v[0] = 0;
        w[0] = 0;
 
        //値を取得
        for(int i=1;i<=N;i++){
          w[i] = scan.nextInt();
          v[i] = scan.nextInt();
        }
 
        //初期化
        for(int i=0;i<=N;i++) for(int j=0;j<=W;j++) dp[i][j] = 0;
 /*
        //ナップサック
        for(int i=1;i<=N;i++){
          for(int j=1;j<=W;j++){
            dp[i][j] = dp[i-1][j];
            if(w[i] > j) continue;
            dp[i][j] = Math.max(v[i]+dp[i-1][j-w[i]],dp[i-1][j]);
          }
        }
        System.out.println(dp[N][W]);
 */
/*
       for(long[] a : dp){
          for(long b : a){
            System.out.print(b +" " );
          }
          System.out.println();
        }
*/
    }
}