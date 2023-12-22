
import java.util.*;
import java.io.*;

public class Main {

	private static final int mod =(int)1e9+7;
	public static void main(String[] args) throws Exception  {
	      Scanner  sc=new Scanner(System.in);
	      PrintWriter out=new PrintWriter(System.out);
	        int n=sc.nextInt();
	       long a[]=new long[3*n];
	        for(int i=0;i<3*n;i++) {
	          a[i]=sc.nextLong();  
	        }
	        long ans=Long.MIN_VALUE;
	        for(int i=n;i<=2*n;i++) {
	      long temp=solve(a,0,i,n)-solve1(a,i,3*n,n);
	  
	      ans=Math.max(ans,temp);
	        }
	        System.out.println(ans);
	
	}
	static long solve(long a[],int i,int j,int n) {
	  
	        PriorityQueue<Long> pq=new PriorityQueue<>(Collections.reverseOrder());
	        for(int k=i;k<j;k++) {
	          pq.add(a[k]);
	        }
	        long sum=0;
	       while(n!=0) {
	         sum+=pq.poll();
	         n--;
	       }
	       return sum;
	}
 static long solve1(long a[],int i,int j,int n) {
   
   PriorityQueue<Long> pq=new PriorityQueue<>();
   for(int k=i;k<j;k++) {
   
     pq.add(a[k]);
   }
   
   long sum=0;
  while(n!=0) {
    sum+=pq.poll();
    n--;
  }
  return sum;
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