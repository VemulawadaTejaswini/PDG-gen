
import java.util.*;
import java.io.*;

public class Main {

	private static final int mod =(int)1e9+7;
	public static void main(String[] args) throws Exception  {
	      Scanner  sc=new Scanner(System.in);
	      PrintWriter out=new PrintWriter(System.out);
int n=sc.nextInt();
Long m=sc.nextLong();
ArrayList<ArrayList<pair>> aa=new ArrayList<>();
for(int i=0;i<n;i++) {
  aa.add(new ArrayList<pair>());
}

for(int i=0;i<m;i++) {
  int x=sc.nextInt()-1;
  int y=sc.nextInt()-1;
  long c=sc.nextLong();
  c=-c;
  pair p=new pair(y,c);
  aa.get(x).add(p);
}

//for(pair p:aa.get(n-1)) {
//  if(p.wt==0) {
//    System.out.println("inf");
//    return;
//  }
//} 
long dis[]=new long[n];

Arrays.fill(dis,Long.MAX_VALUE);
dis[0]=0;
boolean finalize[]=new boolean[n];
for(int i=0;i<n;i++) {
    int u=-1;
    for(int j=0;j<n;j++) {
      if(finalize[j]==false&&(u==-1||dis[i]<dis[u])) {
        u=j;
      }
        
    }
    finalize[u]=true;

    for(pair j :aa.get(u)){
   
      if(finalize[j.wt]==false&&dis[j.wt]>dis[u]+j.val) {
        dis[j.wt]=dis[u]+j.val;
    
      }
    }
  
}  
//System.out.println(Arrays.toString(dis));
boolean negative=false;
for (int i = 0; i <n; i++) { 
 
    for(pair p:aa.get(i)) {
    if(dis[p.wt]!=Long.MAX_VALUE&&dis[i]+p.val<dis[p.wt]) {
      dis[p.wt]=dis[i]+p.val;
      negative=true;
    }
    }
  
  }
//System.out.println(Arrays.toString(dis));
	System.out.println(negative==true?"inf":-dis[n-1]);




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
  int wt;
 long  val;
  pair(int wt,long val){
    this.wt=wt;
    this.val=val;
    
  }

//  @Override
//  public int compareTo(pair o) {
//   
//    return this.wt-o.wt;
//  }
}