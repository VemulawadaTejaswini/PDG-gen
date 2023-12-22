import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        int N,W,res=0,sum=0;
        Scanner in=new Scanner(System.in);
        N=in.nextInt();
        W=in.nextInt();
        int[] w=new int[N+1];
        int[] v=new int[N+1];
        for(int i=1;i<=N;i++){
            w[i]=in.nextInt();
            v[i]=in.nextInt();
            sum+=v[i];
        }
        long[][] dp=new long[N+1][sum+1];//价值为j的最小容积
        dp[0][0]=0;
        for(int i=1;i<=sum;i++)dp[0][i]=Integer.MAX_VALUE;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=sum;j++){
                if(j<v[i])dp[i][j]=dp[i-1][j];
                else dp[i][j]=Math.min(dp[i-1][j],dp[i-1][j-v[i]]+w[i]);
                if(dp[i][j]<=W)res=res>j?res:j;
            }
        }
        System.out.println(res);
    }
}