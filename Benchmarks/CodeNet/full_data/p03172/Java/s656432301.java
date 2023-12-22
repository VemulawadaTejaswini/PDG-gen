import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class Main {
	
	//final boolean isDebug = true;
	final boolean isDebug = false;
	String fileName = "input.txt";
	FastScanner sc;
	PrintWriter out;
	final int MOD = (int)1e9+7;
	final int INF = Integer.MAX_VALUE / 2;
	
	void solve() throws Exception{
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] a = new int[N+1];
		for(int i = 1; i <= N; i++) a[i] = sc.nextInt();
		
		//long[][] dp = new long[N+1][K+1];
		//dp[0][K] = 1;
		BinaryIndexedTree[] dp = new BinaryIndexedTree[N+1];
		for(int i = 0; i <= N; i++) dp[i] = new BinaryIndexedTree(K+1);
		dp[0].add(K+1, 1);
		
		for(int i = 1; i <= N; i++){
			for(int j = 0; j <= K; j++){
				/*
				for(int m = 0; m <= a[i]; m++){
					if(j+m <= K) dp[i][j] += dp[i-1][j+m];
				}
				*/
				long sum = dp[i-1].getSum(Math.min(j+a[i]+1, K+1)) - dp[i-1].getSum(j-1+1);
				sum += MOD;
				sum %= MOD;
				dp[i].add(j+1, sum);
				
			}
		}
		//System.out.println(dp[N][0]);
		System.out.println(dp[N].getSum(0+1));
	}
	
	/* end solve */
	
	/* main */
	public static void main(String[] args) throws Exception {
		new Main().m();
	}
	
	void m() throws Exception {
		long S = System.currentTimeMillis();
		sc = (isDebug) ? new FastScanner(new FileInputStream(fileName)) : new FastScanner(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.flush();
		long G = System.currentTimeMillis();
		if(isDebug){
			System.out.println("---Debug---");
			System.out.printf("%8d ms", (G-S));
		}
	}
	/* end main */
}
/* end Main */

class BinaryIndexedTree{
	int n;
	long[] node;
	int MOD = (int)1e9+7;
	
	/* 初期値は0 */
	public BinaryIndexedTree(int n){
		this.n = n;
		node = new long[n+1];
	}
	
	/* 1-indexed */
	public void add(int x, long val){
		for(int i = x; i <= n; i += (i & -i)){
			node[i] += val;
			node[i] %= MOD;
		}
	}
	
	/* 
	 * [1,a], 1-indexed
	 * sum(0) == 0
	 */
	public long getSum(int a){
		long res = 0;
		for(int i = a; i > 0; i -= (i & -i)){
			res += node[i];
			res %= MOD;
		}
		return res;
	}
}

class FastScanner {
    private InputStream in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public FastScanner(InputStream in) {
		this.in = in;
	}
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() {
    	if (hasNextByte()) return buffer[ptr++];
    	else return -1;
    }
    private static boolean isPrintableChar(int c){
    	return 33 <= c && c <= 126;
    }
    public boolean hasNext() {
    	while(hasNextByte() && !isPrintableChar(buffer[ptr]))
    		ptr++; return hasNextByte();
    }
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public String nextLine() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(b != 10) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() {
    	return Double.parseDouble(next());
    }
}