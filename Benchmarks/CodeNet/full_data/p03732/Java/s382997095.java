
import java.util.*;
import java.io.*;

public class Main{

	private static final int mod =(int)1e9+7;
	public static void main(String[] args) throws Exception  {
	      Scanner  sc=new Scanner(System.in);
	      PrintWriter out=new PrintWriter(System.out);
	   int n=sc.nextInt();
	   int w=sc.nextInt();
	   pair a[]=new pair[n];
	   for(int i=0;i<n;i++) {
	     int wt=sc.nextInt();
	     int val=sc.nextInt();
	     pair p=new pair(wt,val);
	     a[i]=p;
	   }
	   long dp[][]=new long[n+3][w+1];
	   for(int i=0;i<=n;i++)
	     for(int j=0;j<=w;j++){
	       dp[i][j]=-1;
	     }
	   System.out.println(knapsack(dp,a,n,w));
	}

static long knapsack(long dp[][],pair[] a,int n,int w) {
  if(w==0) {
    return 0;
  }
  if(n==0) {
    return 0;
  }
//  if(dp[n][w]!=-1) {
//    return dp[n][w];
//  }
  if(a[n-1].wt<=w) {
    return Math.max(a[n-1].val+knapsack(dp,a,n-1,w-a[n-1].wt),knapsack(dp,a,n-1,w) );
  }else {
    return knapsack(dp,a,n-1,w);
  }
}
	static boolean vis[]=new boolean[10001];
	      static long gcd(long a, long b) 
	      { 
	          if (a == 0) 
	              return b; 
	          return gcd(b % a, a); 
	      } 

static long nCr(int n,int r) {
  int dp[][]=new int[2001][2001];
  for(int i=0;i<2001;i++) {
    dp[0][i]=0;
  }
  for(int i=0;i<2001;i++) {
    dp[i][0]=1;
  }
  for(int i=1;i<2001;i++) {
    for(int j=1;j<2001;j++) {
      if(i==j) {
        dp[i][j]=1;
      }else {
        dp[i][j]=dp[i-1][j-1]+dp[i][j-1];
      }
    }
  }
  return dp[n][r];
}
      
}
class pair{
  int wt,val;
  pair(int wt,int val){
    this.wt=wt;
    this.val=val;
  }
}