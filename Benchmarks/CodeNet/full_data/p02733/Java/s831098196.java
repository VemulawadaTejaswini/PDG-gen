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
static int mxN = (int)(1e6+5);
static long[]fact,inv_fact;
static long my_inv(long a) {
	return pow(a,mod-2);
}
static long bin(int a,int b) {
	if(b>a)return 0;
    return ((fact[a]*inv_fact[a-b])%mod * inv_fact[b])%mod;
}
static char[][]arr;
static int[][]dp;
static int h,w,k;

 public static void solve() throws Exception {
   // solve the problem here
   MyScanner s = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out), true);
        int tc = 1;//s.nextInt();
        mxx = (long)(1e18+5);
 
        while(tc-->0){
        	h = s.nextInt();
        	w = s.nextInt();
        	k = s.nextInt();
        	arr=new char[h][w];
        	for(int i=0;i<h;i++) {
        		arr[i] = s.nextLine().toCharArray();
        	}
        	
        	dp = new int[h+1][w+1];
        	for(int i=1;i<=h;i++) {
        		for(int j=1;j<=w;j++) {
        			dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1];
        			if(arr[i-1][j-1] == '1')
        				dp[i][j]++;
        		//	out.print(dp[i][j]+" ");
        		}
        		//out.println();
        	}
        	int ans = (int)1e9;
        	for(int i=0;i<(1<<(h-1));i++) {
        			int set = Integer.bitCount(i);
        			int[]ones = new int[set+1];
        			int cnt[]=new int[set+1];
        			for(int j=0;j<w;j++) {
        				Arrays.fill(cnt,0);
        				int ind = 0;
        				for(int l=0;l<h;l++) {
        					if(arr[l][j]=='1')
        					cnt[ind] ++;
        					if((i & (1<<l)) > 0) {
        						ind++;
        					}
        				}
        				int max = 0 , comb = 0;
        				for(int l=0;l<cnt.length;l++) {
        					max = Math.max(max, cnt[l]);
        					ones[l] += cnt[l];
        					comb = Math.max(comb, ones[l]);
        				}
        				if(max > k) {
        					set = (int)1e9;
        					break;
        				}
        				if(comb > k) {
        					set++;
        					for(int l=0;l<cnt.length;l++)ones[l] = cnt[l];
        				}
        			}
        			ans = Math.min(ans, set);
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
