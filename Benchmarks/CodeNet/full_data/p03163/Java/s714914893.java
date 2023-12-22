import java.util.*;

public class Main{
  public static long dp[][]=new long[101][100001];
  public static long go(int wt[],long v[],int w,int n){
    if(w==0 || n<0)
    return 0;
    if(dp[n][w]!=-1){
    return dp[n][w];
    }
    if(wt[n]<=w){
      dp[n][w]=Math.max(v[n]+go(wt,v,w-wt[n],n-1),
        go(wt,v,w,n-1));
    }
    else{
      dp[n][w]=go(wt,v,w,n-1);
    }
    return dp[n][w];
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in); 
    int n=sc.nextInt();
    int w=sc.nextInt();
    long v[]=new long[n];
    int wt[]=new int[n];
    for(int i=0;i<n;i++)
    {
      wt[i]=sc.nextInt();
      v[i]=sc.nextLong();
    }
    for(int i=0;i<=n;i++){
      for(int j=0;j<=w;j++)
      dp[i][j]=-1;
    }
    System.out.println(go(wt,v,w,n-1));
  }
}