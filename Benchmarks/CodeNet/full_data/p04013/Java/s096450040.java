import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int[] x = new int[N];
        for(int i=0;i<N;i++) x[i]=sc.nextInt();
        int sum=0;
        for(int w:x) sum+=w;
        long[][][] dp = new long[N+1][N+1][2501];
        dp[0][0][0]=1;
        for(int i=1;i<=N;i++){
            dp[i][0][0]=1;
            for(int j=1;j<=i;j++){
                dp[i][j][0]=0;
                for(int k=1;k<=sum;k++){
                    dp[i][j][k] += dp[i-1][j][k];
                    if(k>=x[i-1]) dp[i][j][k]+=dp[i-1][j-1][k-x[i-1]];
                }
            }
        }
        long ans = 0;
        for(int j=1;j<=N;j++){
            ans += dp[N][j][A*j];
        }
        System.out.println(ans);
    }
}
