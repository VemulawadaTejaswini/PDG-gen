
import java.util.*;
import java.io.*;

public class Main {

	private static final int mod =(int)1e9+7;
	public static void main(String[] args) throws Exception  {
	      Scanner  sc=new Scanner(System.in);
	      PrintWriter out=new PrintWriter(System.out);
	  int n=sc.nextInt();
	  long k=sc.nextLong();
	  TreeMap<Integer,Long> map=new TreeMap<>();

	  for(int i=0;i<n;i++) {
	    int a=sc.nextInt();
	   int b=sc.nextInt();
	   
	   map.put(a, map.getOrDefault(a,(long) 0)+b);
	  
	     
	}
	for(int i=1;i<=100001;i++) {
	   if(map.containsKey(i)) {
	      if(map.get(i)>=k) {
	        System.out.println(i);
	  break;
	      }else {
	        k=k-map.get(i);
	      }
	   }
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
class pair implements Comparable<pair>{
  int wt,val;
  pair(int wt,int val){
    this.wt=wt;
    this.val=val;
    
  }

  @Override
  public int compareTo(pair o) {
   
    return this.wt-o.wt;
  }
}