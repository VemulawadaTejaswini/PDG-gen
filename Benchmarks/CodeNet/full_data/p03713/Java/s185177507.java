import java.util.*;
import java.io.*;

public class Main {

	private static final int mod =(int)1e9+7;
	public static void main(String[] args) throws Exception  {
	      Scanner  sc=new Scanner(System.in);
	      PrintWriter out=new PrintWriter(System.out);
	      sieve();
	  long h=sc.nextLong();
	  long w=sc.nextLong();
	  long c=h*w;
	  long ans=Long.MAX_VALUE;
	  if(h%3==0||w%3==0){
	    System.out.println(0);
	  }else {
	 for(long i=1;i<=h;i++) {
	   long A1=i*w;
	   long A2=(h-i)*(w/2);
	   long A3=(h-i)*((w+1)/2);
	   long max1=Math.max(A1,A2);
	   long max2=Math.max(A3,max1);
	   long min1=Math.min(A1,A2);
    long min2=Math.min(A3,min1);
    ans=Math.min(ans,max2-min2);
	 }

  for(long i=1;i<=w;i++) {
    long A1=i*h;
    long A2=(w-i)*(h/2);
    long A3=(w-i)*((h+1)/2);
    long max1=Math.max(A1,A2);
    long max2=Math.max(A3,max1);
    long min1=Math.min(A1,A2);
    long min2=Math.min(A3,min1);
    ans=Math.min(ans,max2-min2);
  }
  System.out.println(ans);
	}
	}
	static int  prime[]=new int[100001];
	static void sieve() {
	  Arrays.fill(prime,1);
	  prime[0]=0;
	  prime[1]=1;
	  for(int i=2;i*i<100001;i++) {
	   if(prime[i]!=0) {
	     for(int j=i;j<10001;j+=i) {
	       prime[j]=0;
	     }
	   }
	  }
	}
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
class pair {
  int src;
 int  des;
 long val;
  pair(int src,int des,long val){
    this.src=src;
    this.des=des;
    this.val=val;
    
  }

//  @Override
//  public int compareTo(pair o) {
//   
//    return this.wt-o.wt;
//  }
}