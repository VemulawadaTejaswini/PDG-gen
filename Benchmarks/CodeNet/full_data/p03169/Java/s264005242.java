import java.util.*;
import java.io.*;
public class Main{
  public static double calc(int b,int c,int d,double n,int[][][]vis,double[][][]dp){
    if(Math.min(Math.min(b,c),Math.min(d,c))<0||(b==0&&c==0&&d==0))return 0;
    if(vis[b][c][d]==1)return dp[b][c][d];
    vis[b][c][d]=1;
    double sum=b+c+d;
    dp[b][c][d]=n/sum+(double)b/sum*calc(b-1,c,d,n,vis,dp)+(double)c/sum*calc(b+1,c-1,d,n,vis,dp)+(double)d/sum*calc(b,c+1,d-1,n,vis,dp);
    return dp[b][c][d];
  }
  public static void main(String[] args){
    int n,b=0,c=0,d=0,m;
    Scanner in=new Scanner(System.in);
    n=in.nextInt();
    for(int i=0;i<n;i++){
      m=in.nextInt();
      if(m==1)b++;
      else if(m==2)c++;
      else d++;
    }
    double[][][]dp=new double[n+1][n+1][n+1];
    int[][][]vis=new int[n+1][n+1][n+1];
    System.out.println(calc(b,c,d,(double)n,vis,dp));
    
  }
}