import java.util.*;

public class Main {
    public static final long INF = Long.MAX_VALUE >> 2;
    public static long[] dp = new long[110000]; //制約に応じてテーブル規模を調節する
    public static long[] steps = new long[110000];//制約に応じてテーブル規模を調節する
    public static int K = 0;
    public static void main(String[] args) throws Exception {
    for(int i=0;i<110000;++i)dp[i] = INF;
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       K = sc.nextInt();
       for(int i=0;i<N;i++){
           steps[i] = sc.nextLong();
       }
       long result = rec(N-1);
       System.out.println(result);
    }
       //最初に考えたやり方
    //   for(int i=0;i<N;i++){
    //       if(i == 0){
    //           dp[i] = 0;
    //       }else if(i == 1){
    //           dp[i] = height(steps[0],steps[1]);
    //       }else{
    //           if(K == 1){
    //               dp[i] = dp[i - 1] + height(steps[i],steps[i-1]);
    //           }else{
    //             for(int j=1;j<=i && j<=K;j++){
    //             dp[i] = chmin(dp[i] ,dp[i-j] + height(steps[i],steps[i-j]));
    //             }
    //           }
    //       }
    //   }
    
     //こっちの方が記述しやすい(貰うDP)
    //  for(int i=0;i<N;i++){
    //      if(i == 0){
    //          dp[i] = 0;
    //      }else{
    //         for(int j=1;j<=i && j<=K;j++){
    //             dp[i] = chmin(dp[i],(dp[i-j] + height(steps[i],steps[i-j])));
    //         }
    //      }
    //  }
    
    //別解1(配るDP)
    // dp[0] = 0;
    // for(int i=0;i<N;i++){
    //         for(int j=1;j<=K;j++){
    //             dp[i + j] = chmin(dp[i+j],dp[i] + height(steps[i] , steps[i + j]));
    //         }
    // }
    //   System.out.println(dp[N - 1]);
    // }
    
    //別解2(メモ化再帰)
    public static long rec(int i){
        if(dp[i] < INF)return dp[i]; //メモがあればそれを返す  
        if(i == 0)return 0; //
        long res = INF;
        for(int j=1;j<=i && j<=K;j++){
            res = chmin(res,rec(i-j) + height(steps[i],steps[i-j]));
        }
        dp[i] = res;
        return res;
    }
    
    public static long height(long h1,long h2){
        return Math.abs(h1 - h2);
    }
    
    public static long chmin(long a , long b){
        return Math.min(a,b);
    }
}
