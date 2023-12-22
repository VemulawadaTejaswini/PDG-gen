import java.io.*;
import java.util.*;
import java.math.*;

 
 public class Main	{
   static class Pair implements Comparable<Pair>{
   int a;
   int b;
   public Pair(int x,int y){a=x;b=y;}
   public Pair(){}
   public int compareTo(Pair p){
	 return p.a - a;
   }



 }
static class TrieNode{
  TrieNode[]child;
  int w;
  boolean term;
  TrieNode(){
    child = new TrieNode[26];  
  }
}
  public static int gcd(int a,int b)
  {
    if(a<b)

      return gcd(b,a);
    if(b==0)
      return a;
    return gcd(b,a%b);
    
  }
  //static long ans = 0;
  static long mod = 998244353;/// (long)(1e9+7); 
   
    public static void main(String[] args) throws Exception {
       new Thread(null, null, "Anshum Gupta", 99999999) {
            public void run() {
                try {
                    solve();
                } catch(Exception e) {
                    e.printStackTrace();
                    System.exit(1);
                }
            }
        }.start();
    }

static long pow(long x,long y){
    if(y == 0)return 1;
    if(y==1)return x;
    long a = pow(x,y/2);
    a = (a*a)%mod;
    if(y%2==0){
        return a;
    }
    return (a*x)%mod;
}

static long mxx;
static int mxN = (int)(1e6+5);
static long[]fact,inv_fact;
static long my_inv(long a) {
	return pow(a,mod-2);
}
static long bin(int a,int b) {
	if(b>a)return 0;
    return ((fact[a]*inv_fact[a-b])%mod * inv_fact[b])%mod;
}
static int sum,n;
static int[]a;

 public static void solve() throws Exception {
   // solve the problem here
   MyScanner s = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out), true);
        int tc = 1;//s.nextInt();
        mxx = (long)(1e18+5);
 
        while(tc-->0){
        	 n = s.nextInt();
        	sum = s.nextInt();
        	a = new int[n+1];
        	for(int i=1;i<=n;i++) {
        		a[i] = s.nextInt();
        	}
        	long[][]dp = new long[n+1][sum+1];
           //dp[i][j] --> no of subsequences in the range (1,i) with sum 
        	for(int i=1;i<=n;i++) {
        		for(int j=1;j<=sum;j++) {
        			dp[i][j] += dp[i-1][j];
        			if(j - a[i] >= 0) {
        				if(j == a[i])
        				dp[i][j]+=i;
        				else dp[i][j] += dp[i-1][j-a[i]];
        			}
        			dp[i][j] %= mod;
        		}
        	}
//        	for(int i=0;i<=n;i++) {
//        		for(int j=0;j<=sum;j++)out.print(dp[i][j]+" ");out.println();
//        	}
        	long ans = 0;
        	for(int i=1;i<=n;i++) {
        		//out.print(dp[i][sum]+" ");
        		ans += dp[i][sum];
        		ans %= mod;
        	}
        	out.println(ans);
        	
        }
        
           
        out.flush();
}
 
     
 
 
 
    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;
 
    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
 
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
         
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    //--------------------------------------------------------
}
