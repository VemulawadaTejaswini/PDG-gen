import java.io.*;
import java.util.*;
import java.math.*;

 
 public class Main	{
   static class Pair implements Comparable<Pair>{
   long a;
   int b;
   public Pair(long x,int y){a=x;b=y;}
   public Pair(){}
   public int compareTo(Pair p){
      return Long.compare(p.a, a);
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
  static long mod =(long)(1e9+7); //998244353;//
   
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
static int mxN = (int)(1e5+5);
static long[]fact,inv_fact;
static long my_inv(long a) {
	return pow(a,mod-2);
}
static long bin(int a,int b) {
    return ((fact[a]*inv_fact[a-b])%mod * inv_fact[b])%mod;
}
 public static void solve() throws Exception {
   // solve the problem here
   MyScanner s = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out), true);
        int t = 1;//s.nextInt();
        mxx = (long)(1e18+5);
 
        while(t-->0){
        	int n = s.nextInt();
        	long[]a=new long[n+1];
        	Pair[]arr=new Pair[n];
        	for(int i=0;i<n;i++) {
        		a[i] = s.nextLong();
        		arr[i] = new Pair(a[i],i);
        	}
        	Arrays.sort(arr);
        	long[][]dp=new long[n+1][n+1];
        	dp[1][0] = arr[0].a*arr[0].b;
        	dp[0][1] = arr[0].a*(n-1-arr[0].b);
        	for(int i=1;i<n;i++) {
        		for(int j=0;j<=i;j++) {
        			int l = j;
        			int r = i - j;
        			dp[l+1][r] = Math.max(dp[l+1][r] , dp[l][r] + arr[i].a*Math.abs(arr[i].b-l));
        			dp[l][r+1] = Math.max(dp[l][r+1] , dp[l][r] + arr[i].a*Math.abs(arr[i].b-(n-1-r)));
        		}
        	}
        	long ans = 0;
        	for(int i=0;i<=n;i++) {
        		ans = Math.max(ans, dp[i][n-i]);
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
