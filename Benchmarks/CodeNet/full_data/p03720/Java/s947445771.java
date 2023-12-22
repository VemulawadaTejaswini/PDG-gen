
import java.util.*;
import java.io.*;

public class Main {

	private static final int mod =(int)1e9+7;
	public static void main(String[] args) throws Exception  {
	      Scanner  sc=new Scanner(System.in);
	      PrintWriter out=new PrintWriter(System.out);
	     int n=sc.nextInt();
	     int m=sc.nextInt();
	     ArrayList<ArrayList<Integer>> aa=new ArrayList<>();
	     for(int i=0;i<n;i++) {
	       aa.add(new ArrayList<>());
	     }
	     for(int i=0;i<m;i++) {
	       int a=sc.nextInt();
	       int b=sc.nextInt();
	       aa.get(a-1).add(b-1);
	       aa.get(b-1).add(a-1);
	     }
	       for(ArrayList<Integer> i:aa) {
	         System.out.println(i.size());
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