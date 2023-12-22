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

static void dfs
(ArrayList<ArrayList<Integer>>adj,int sv,boolean[]vis,int[]x){}
static TrieNode root;
 public static void solve() throws Exception {
   // solve the problem here
   MyScanner s = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out), true);
        int t = 1;
        int tc = 0;
      //  maxV = 300000;
        while(tc++<t){
            int n = s.nextInt();
            int k = s.nextInt();
            int[]a=new int[n];
            for(int i=0;i<n;i++)
            a[i]=s.nextInt();
            long ans = 0;
            long[]dp = new long[k+1];
            dp[0]=1;
            
           // pre[0]=1;
           for(int i=0;i<n;i++){
               long[]pre = new long[k+1];
               for(int j=k;j >= 0; j--){
                   int st = j+1;
                   int e = j+Math.min(a[i],k-j);
                   if(st<=e)
                   pre[st] = (pre[st]+dp[j])%mod;
                   if(e+1<=k)
                   pre[e+1] = (pre[e+1]-dp[j])%mod;
                 //  for(int l=1;l<=Math.min(a[i],k-j);l++){
                   //    dp[j+l] += dp[j];
                   //}
               }
               long pre_sum = 0;
           for(int x=0;x<=k;x++){
               pre_sum = (pre_sum + pre[x])%mod;
               dp[x] =(dp[x]+ pre_sum)%mod;
           }
          }
          if(dp[k]<0)dp[k]+=mod;
           
            
            out.println(dp[k]);
            
            
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
