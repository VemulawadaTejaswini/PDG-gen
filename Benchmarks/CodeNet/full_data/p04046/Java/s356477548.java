import java.io.*;
import java.util.*;

public class Main {
	
	static int MAX_FAC = 510000;
	static int MOD = 1000000007;
	static long[] fac = new long[MAX_FAC];
	static long[] finv = new long[MAX_FAC];
	static long[] inv = new long[MAX_FAC];
	
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		
		int H = sc.nextInt();
		int W = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		long ans = 0;
		initComb();
		
		int MAX = 100;
		long[][] C = new long[MAX][MAX];
		C[0][0] = 1;
		for (int i = 1; i < C.length; ++i) {
			C[i][0] = 1;
			for (int j = 1; j < C[i].length; ++j) {
				C[i][j] = C[i - 1][j] + C[i - 1][j - 1];
			}
		}
		
		
		for(int w = 1; w <= W-B; w++){
			int c1 = H-A-1+B+w-1;
			int c2 = B+w-1;
			int c3 = W-B-w+A;
			int c4 = W-B-w;
			if(w == 1){
				//ans += C[c1][c2] * 1 * C[c3][c4];
				ans = (ans + (comb(c1, c2) * comb(c3, c4)) % MOD) % MOD;
			}else{
				//ans += (C[c1][c2] - C[c1-1][c2-1]) * 1 * C[c3][c4];
				long sub = comb(c1, c2) - comb(c1-1, c2-1);
				if(sub < 0) sub += MOD;
				ans = (ans + (sub * comb(c3, c4)) % MOD) % MOD;
			}
		}
		
		System.out.println(ans);
		
	}//end main
	
	//テーブルの初期化
	public static  void initComb(){
		fac[0] = finv[0] = inv[0] = fac[1] = finv[1] = inv[1] = 1;
		for (int i = 2; i < MAX_FAC; ++i) {
			fac[i] = fac[i - 1] * i % MOD;
			inv[i] = MOD - (MOD / i) * inv[(int) (MOD % i)] % MOD;
			finv[i] = finv[i - 1] * inv[i] % MOD;
		}
	}
	
	//nCk % MOD
	public static  long comb(int n, int k){
		return fac[n] * finv[k] % MOD * finv[n - k] % MOD;
	}
	
	//n! % MOD
	public static  long fact(int n){
		return fac[n];
	}
	
	//(n!)^-1 with % MOD
	public static long finv(int n){
		return finv[n];
	}
	
}//end Main

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
