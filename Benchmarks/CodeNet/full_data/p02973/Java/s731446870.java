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
      return Integer.compare(a, p.a);
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

static ArrayList<ArrayList<Integer>>adj ;
static int bs_ceil(int[]tail,int st,int e,int val) {
	if(st == e) {
		if(tail[st] >= val)return st;
		else return -1;
	}
	int mid = (st+e)/2;
	if(tail[mid] > val) {
		return bs_ceil(tail,st,mid,val);
	}
	else return bs_ceil(tail,mid+1,e,val);
}
 public static void solve() throws Exception {
   // solve the problem here
   MyScanner s = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out), true);
        int t = 1;//s.nextInt();
        mxx = (long)(1e18+5);
 
        while(t-->0){
        	int n = s.nextInt();
        	int[]a=new int[n+1];
        	for(int i=n;i>=1;i--) {
        		a[i] = s.nextInt();
        	}
        	int[]tail = new int[n+1];
        	tail[1] = a[1];
        	int len = 1;
        	for(int i=2;i<=n;i++) {
        		if(a[i] < tail[0]) {
        			tail[1] = a[i];
        		}
        		else if(a[i] >= tail[len]) {
        			tail[(len++)+1] = a[i];
        		}
        		else {
        			int ind = bs_ceil(tail,0,len,a[i]);
        			tail[ind] = a[i];
        		}
        	}
        	out.println(len);
        	
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
