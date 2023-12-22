import java.util.*;
import java.io.*;
public class Main{
    public static int cal(int i,int[]visit,int[]dp,int[]len,int[][]reversed_edges){
        if(visit[i]==1)return dp[i];
        else{
            dp[i]=0;
            visit[i]=1;
            for(int j=0;j<len[i];j++)dp[i]=Math.max(dp[i],cal(reversed_edges[i][j],visit,dp,len,reversed_edges)+1);
        }
        return dp[i];
    }
    public static void main(String[] args){
        int N,M,x,y,res=0;
        Scanner in=new Scanner(System.in);
        N=in.nextInt();
        M=in.nextInt();
        int[]dp=new int[N+1];//dp[i]:以i为终点的最长路径
        int[][] reversed_edges=new int[N+1][N+1];
        int[] visit=new int[N+1];
        int[]len=new int[N+1];
        visit[0]=1;
        for(int i=1;i<=M;i++){
            x=in.nextInt();
            y=in.nextInt();
            reversed_edges[y][len[y]]=x;
            len[y]++;
        }
        for(int i=1;i<=N;i++){
            for(int j=0;j<len[i];j++){
                dp[i]=Math.max(dp[i],cal(reversed_edges[i][j],visit,dp,len,reversed_edges)+1);
            }
        }
        for(int i=1;i<=N;i++)res=Math.max(res,dp[i]);
        System.out.println(res);
    }
}