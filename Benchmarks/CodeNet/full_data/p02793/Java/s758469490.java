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
     return a  - p.a ;
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

static ArrayList<ArrayList<Integer>>adj ;
static boolean[]vis;
static long[]dp;
static void dfs(int sv,int k,int par) {
	vis[sv] = true;
	int temp = k;
	if(par == -1) temp --;
	else temp-=2;
	if( k < adj.get(sv).size()) return;
	long pr = 1;
	for(int i=0;i<adj.get(sv).size();++i) {
		int x = adj.get(sv).get(i);
		if(x==par)continue;
		pr*=temp--;
		pr%=mod;
	}
	for(int i=0;i<adj.get(sv).size();++i) {
		int x = adj.get(sv).get(i);
		if(x==par)continue;
		dfs(x,k,sv);
		pr*=dp[x];
		pr%=mod;
	}
	dp[sv]=pr;
	
}

 public static void solve() throws Exception {
   // solve the problem here
   MyScanner s = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out), true);
        int tc = 1;//s.nextInt();
        mxx = (long)(1e18+5);
 
        while(tc-->0){
        	int n = s.nextInt();
        	int[]a=new int[n];
        	for(int i=0;i<n;i++) {
        		a[i] = s.nextInt();
        	}
        	int[]lpf = new int[mxN];
        	for(int i=2;i < mxN;i++) {
        		if(lpf[i] == 0) {
        			for(int j=i;j<mxN;j+=i) {
        				lpf[j] = i;
        			}
        		}
        	}
        	
        	TreeMap<Integer,Integer> tm = new TreeMap<Integer, Integer>();
        		for(int i=0;i<n;i++) {
        			int x = a[i];
        			while( x > 1) {
        				int lowest = lpf[x];
        				int cnt = 0;
        				while(lpf[x] == lowest) {
        					x /= lowest;
        					cnt++;
        				}
        				if(tm.containsKey(lowest)) {
        					tm.put(lowest,Math.max(tm.get(lowest), cnt));
        				}
        				else tm.put(lowest, cnt);
        			}
        		}
        		long lcm = 1;
        		for(Map.Entry<Integer, Integer> es : tm.entrySet()) {
        			lcm = (lcm*pow(es.getKey(),es.getValue()))%mod; 
        		}
        		///out.println(lcm);
        		long sum = 0;
        		for(int i=0;i<n;i++) {
        			int x = a[i];
        			long temp = lcm;
        			while( x > 1) {
        				int lowest = lpf[x];
        				int cnt = 0;
        				while(lpf[x] == lowest) {
        					x /= lowest;
        					cnt++;
        				}
        				long pow_val = pow(lowest,cnt);
        				temp = (temp * my_inv(pow_val))%mod;
        			}
        			sum = (sum + temp)%mod;
        		}
        		out.println(sum);
        		
        		
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
