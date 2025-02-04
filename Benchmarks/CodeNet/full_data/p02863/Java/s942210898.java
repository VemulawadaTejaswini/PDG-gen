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
     return a - b - p.a + p.b;
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
  static int mod =(int)(1e9+7); //998244353;//
   
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
    return ((1L*fact[a]*inv_fact[a-b])%mod * inv_fact[b])%mod;
}

static ArrayList<ArrayList<Integer>>adj ;
static boolean[]vis;
static void dfs(int sv,int d,int[]dis) {
	vis[sv] = true;
	dis[sv] = d;
	for(int i=0;i<adj.get(sv).size();++i) {
		int x = adj.get(sv).get(i);
		if(!vis[x]) {
			dfs(x,d+1,dis);
		}
	}
	
}
static int n,t;
static Pair[]arr;
static int[][]dp;
static int rec(int i,int prev_time) {
	if(i==n || prev_time >= t) {
		return 0;
	}
	if(dp[i][prev_time]!=-1)return dp[i][prev_time];
	int o1 = rec(i+1,prev_time+arr[i].a) + arr[i].b;
	int o2 = rec(i+1,prev_time);
	return dp[i][prev_time]=Math.max(o1, o2);
}
 public static void solve() throws Exception {
   // solve the problem here
   MyScanner s = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out), true);
        int tc = 1;//s.nextInt();
        mxx = (long)(1e18+5);
 
        while(tc-->0){
        	n = s.nextInt();
        	 t = s.nextInt();
        	arr = new Pair[n];
        	for(int i=0;i<n;i++) {
        		arr[i] = new Pair(s.nextInt(),s.nextInt());
        	}
        	Arrays.parallelSort(arr);
        	dp = new int[n][t+1];
        	for(int i=0;i<n;i++)Arrays.fill(dp[i], -1);
        		out.println(rec(0,0));
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
