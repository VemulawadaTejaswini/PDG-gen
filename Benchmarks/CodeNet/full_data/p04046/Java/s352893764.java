import java.io.*;
import java.util.*;


class Main {
    static final int N=200000;
    static final long MOD=1000000007;
    static long[] fact;
    static long[] invfact;
    static void initialize() {
	fact = new long[N];
	invfact = new long[N];
	fact[0] = invfact[0] = 1;
	for (int i = 1; i < N; ++i) {
	    fact[i] = (i * fact[i - 1]) % MOD;
	    invfact[i] = powerMod(fact[i], MOD - 2);
	}
    }
    static long powerMod(long x, long exponent) {
	long prod = 1;
	for (int i = 63; i >= 0; --i) {
	    prod = (prod * prod) % MOD;
	    if ((exponent & 1L << i) != 0) {
		prod = (prod * x) % MOD;
	    }
	}
	return prod;
    }
    static long comb(int x, int y) {
	if (x < 0) {
	    return 0;
	}
	if (y < 0 || y > x) {
	    return 0;
	}
	long r= (fact[x] * powerMod((fact[x - y] * fact[y]) % MOD, MOD - 2)) % MOD;
	return r;
    }
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int h=sc.nextInt();
        int w=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        initialize();
        long ans=0;
        for(int i=0;i<h-a;++i){
            long tmp=comb(b-1+i,i);
            tmp=tmp*comb(h-1-i+w-b-1,w-b-1);
            ans=(ans+tmp)%MOD;
        }
        out.println(ans);
        out.close();
    }
    // http://codeforces.com/blog/entry/7018
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
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
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
}
