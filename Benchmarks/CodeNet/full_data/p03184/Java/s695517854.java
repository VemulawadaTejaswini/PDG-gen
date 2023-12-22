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
      return a+b-p1.a-p1.b;
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
static int nax = (int)(2e5+5);
static long[]fac,inv_fac;
static long my_inv(long x){
    return pow(x,mod-2);
}
static long f(int a,int b){
    
    return binomial(a+b,b);
}
static long binomial(int x,int y){
    if(x<0||y<0 || x<y)
    return 0;
    return (((fac[x]*inv_fac[x-y])%mod)*(inv_fac[y]))%mod;
}
 public static void solve() throws Exception {
   // solve the problem here
   MyScanner s = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out), true);
        int t = 1;
        int tc = 0;
        mxx = (long)(1e18+5);
        while(tc++<t){
            int h = s.nextInt();
            int w = s.nextInt();
            int n = s.nextInt();
            Pair[]arr=new Pair[n+1];
            fac = new long[nax];
            inv_fac = new long[nax];
            fac[0]=inv_fac[0]=1;
            for(int i=1;i<nax;i++){
                fac[i] = (fac[i-1]*i)%mod;
                inv_fac[i] = my_inv(fac[i]);
            }
            for(int i=0;i<n;i++){
                arr[i]=new Pair(s.nextInt(),s.nextInt());
            }
            arr[n]=new Pair(h,w);
            Arrays.sort(arr);
            long ways = 0;
            long[]dp=new long[n+1];
            for(int i = 0; i<=n;i++){
                long temp = f(arr[i].a-1,arr[i].b-1);
                for(int j=0;j<i;j++){
                    if(arr[j].a <= arr[i].a && arr[j].b <= arr[i].b){
                        temp = ((temp - (dp[j]*f(arr[i].a-arr[j].a,arr[i].b-arr[j].b))%mod)+mod)%mod;
                    }
                }
                dp[i] = temp;
            }
            out.println(dp[n]);
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
