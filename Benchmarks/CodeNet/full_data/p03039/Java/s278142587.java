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
	//final int INF = Integer.MAX_VALUE / 2;
	final long INF = Long.MAX_VALUE / 2;
	
	void solve() throws Exception{
		int N = sc.nextInt(), M = sc.nextInt(), K = sc.nextInt();
		CombCalculator cc = new CombCalculator(N*M-2, MOD);
		long ans = 0;
		for(int d = 1; d <= N-1; d++){
			long res = ((((N - d) * M) % MOD) * M) % MOD;
			res = (res * cc.modComb(N * M - 2, K - 2)) % MOD;
			res = (res * d) % MOD;
			ans = (ans + res) % MOD;
		}
		for(int d = 1; d <= M-1; d++){
			long res = ((((M - d) * N) % MOD) * N) % MOD;
			res = (res * cc.modComb(N * M - 2, K - 2)) % MOD;
			res = (res * d) % MOD;
			ans = (ans + res) % MOD;
		}
		System.out.println(ans);
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
			System.out.printf("%8d ms\n", (G-S));
		}
	}
	
	
	/* end main */
}
/* end Main */

class CombCalculator{
	//引数の最大値、MOD、階乗・MODの逆元・階乗の逆元のテーブル
	static int MAX_FAC = 510000;
	static int MOD = (int)1e9+7;
	static long[] fac = new long[MAX_FAC+1];
	static long[] finv = new long[MAX_FAC+1];
	static long[] inv = new long[MAX_FAC+1];
	
	public CombCalculator(){
		this(510000, (int)1e9+7);
	}
	
	public CombCalculator(int max, int mod){
		MAX_FAC = max; MOD = mod;
		initComb();
	}
	
	//テーブルの初期化
	void initComb(){
		fac[0] = finv[0] = inv[0] = fac[1] = finv[1] = inv[1] = 1;
		for (int i = 2; i <= MAX_FAC; ++i) {
			fac[i] = fac[i - 1] * i % MOD;
			inv[i] = MOD - (MOD / i) * inv[(int) (MOD % i)] % MOD;
			finv[i] = finv[i - 1] * inv[i] % MOD;
		}
	}
	
	//nPk % MOD
	public long modPerm(int n, int k){
		return fac[n] * finv[n - k] % MOD;
	}
	
	//nCk % MOD
	public long modComb(int n, int k){
		return fac[n] * finv[k] % MOD * finv[n - k] % MOD;
	}
	
	//n! % MOD
	public long modFact(int n){
		return fac[n];
	}
	
	//(n!)^-1 % MOD
	public long modFactInv(int n){
		return finv[n];
	}
	
	//n^-1 % MOD
	public long modInv(int n){
		return inv[n];
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
