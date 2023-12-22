import java.util.*;
import java.io.*;
public class Main{
    public static int dfs(int i,int j,int[][]dp,int N,int[][]vis){
        if(vis[i][j]==1)return dp[i][j];
        for(int m=1;m<=N;m++){
            if(dp[j][m]>=1){
                dp[i][m]=Math.max(dp[i][m],dp[i][j]+dfs(j,m,dp,N,vis));
                vis[i][m]=1;
            }
        }
        return dp[i][j];
    }
    public static void main(String[] args){
        int N,M,x,y,res=0;
        Scanner in=new Scanner(System.in);
        N=in.nextInt();
        M=in.nextInt();
        int[][]dp=new int[N+1][N+1];//dp[i][j]:节点i到节点j的最长路径
        int[][] vis=new int[N+1][N+1];
        for(int i=1;i<=M;i++){
            x=in.nextInt();
            y=in.nextInt();
            dp[x][y]=1;
        }
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                if(dp[i][j]>=1&&vis[i][j]==0){
                    dfs(i,j,dp,N,vis);
                    vis[i][j]=1;
                }
                res=res>dp[i][j]?res:dp[i][j];
            }
        }
        System.out.println(res);
    }
}