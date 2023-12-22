import java.util.*;
import java.io.*;

public class Main {

	private static final int mod =(int)1e9+7;
	public static void main(String[] args) throws Exception  {
	      Scanner  sc=new Scanner(System.in);
	      PrintWriter out=new PrintWriter(System.out);
	     int a=sc.nextInt();
	     int b=sc.nextInt();
	     int c=sc.nextInt();
	     if(a%2==0&&b%2==0&&c%2==1) {
	       System.out.println("NO");
	     }else {
	       int  sum=a;
	       for(int i=0;i<=100;i++) {
	         sum+=a;
	         if(sum%b==c) {
	           System.out.println("YES");
	          return;
	         }
	       }
	       System.out.println("NO");
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