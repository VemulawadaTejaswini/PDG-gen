import java.io.*;
import java.util.*;
import java.math.*;

 
 public class Main{
   static class Pair implements Comparable<Pair>{
   int a;
   int b;
   public Pair(int x,int y){a=x;b=y;}
   public Pair(){}
   public int compareTo(Pair p1){
       if(a == p1.a)
       return b - p1.b;
       return a - p1.a;
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
  static long mod = (long)(1e9+7);
   
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
static int d,n;
static String k;
static long[][][]dp;
static long rec(int i,int sum,boolean prev_max){
    if(i==n ){
        return (sum==0?1:0);
    }
    long ans = 0;
    int wh = (prev_max?1:0);
    if(dp[i][sum][wh]!=-1)return dp[i][sum][wh];
    if(prev_max){
        int x = k.charAt(i)-'0';
        for(int j = 0; j<x; j++){
            int cur_sum = (sum+j)%d;
         //   if(cur_sum == 0)ans++;
            ans =((ans+ rec(i+1,cur_sum,false))%mod+mod)%mod;
        }
        for(int j=x;j<=x;j++){
            int cur_sum = (sum+j)%d;
         //   if(cur_sum == 0)ans++;
            ans =((ans+ rec(i+1,cur_sum,true))%mod+mod)%mod;
        }
    }
    else{
        for(int j=0;j<=9;j++){
            int cur_sum = (sum+j)%d;
      //      if(cur_sum == 0)ans++;
            ans = ((ans+ rec(i+1,cur_sum,false))%mod+mod)%mod;
        }
    }
    return dp[i][sum][wh]=ans;
}
 public static void solve() throws Exception {
   // solve the problem here
   MyScanner s = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out), true);
        int t = 1;
        int tc = 0;
        mxx = (long)(1e18+5);
        while(tc++<t){
            k = s.next();
             n = k.length();
             d = s.nextInt();
             dp = new long[n][d][2];
             for(int i=0;i<n;i++)
             for(int j=0;j<d;j++)
             Arrays.fill(dp[i][j],-1);
            long ans = 0;
        //     int x = k.charAt(0)-'0';
        //     int sum=0;
        // for(int j=1; j<x; j++){
        //     int cur_sum = (sum+j)%d;
        //     if(cur_sum == 0)ans++;
        //     ans += rec(1,cur_sum,false);
        // }
        // for(int j=x;j<=x;j++){
        //     int cur_sum = (sum+j)%d;
        //     if(cur_sum == 0)ans++;
        //     ans += rec(1,cur_sum,true);
        // }
        ans = ((rec(0,0,true)-1)%mod+mod)%mod;
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
