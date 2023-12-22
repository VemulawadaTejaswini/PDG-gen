import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {
	
	final boolean isDebug = false;
	String fileName = "input.txt";
	FastScanner sc;
	//PrintWriter out;
	final int MOD = (int)1e9+7;
	final int INF = Integer.MAX_VALUE / 2;
	
	/* solve */
	void solve(){
		int A = sc.nextInt();
		int B = sc.nextInt();
		int Q = sc.nextInt();
		long[] s = new long[A];
		long[] t = new long[B];
		for(int i = 0; i < A; i++) s[i] = sc.nextLong();
		for(int i = 0; i < B; i++) t[i] = sc.nextLong();
		
		for(int i = 0; i < Q; i++){
			long x = sc.nextLong();
			long min = Long.MAX_VALUE;
			int sL = lowerBound(s, x);
			int sU = upperBound(s, x);
			int tL = lowerBound(t, x);
			int tU = upperBound(t, x);
			
			if(sL != s.length && tL != t.length) min = Math.min(min, Math.abs(x - Math.max(s[sL], t[tL])));
			if(sU != -1 && tU != -1)min = Math.min(min, Math.abs(x - Math.min(s[sU], t[tU])));
			
			if(sL != s.length && tU != -1){
				long ss1 = Math.abs(x - s[sL]);
				long tt1 = Math.abs(x - t[tU]);
				min = Math.min(min, Math.min(ss1, tt1) * 2 + Math.max(ss1, tt1));
			}
			
			if(sU != -1 && tL != t.length){
				long ss2 = Math.abs(x - s[sU]);
				long tt2 = Math.abs(x - t[tL]);
				min = Math.min(min, Math.min(ss2, tt2) * 2 + Math.max(ss2, tt2));
			}
			
			System.out.println(min);
		}
 	}
	
	public static int lowerBound(long[] a, long key){
		int ng = -1;
		int ok = a.length;
		
		while(Math.abs(ok - ng) > 1){
			int mid = (ok + ng) / 2;
			if(a[mid] >= key) ok = mid;
			else ng = mid;
		}
		
		return ok;
	}
	
	public static int upperBound(long[] a, long key){
		int ok = -1;
		int ng = a.length;
		
		while(Math.abs(ok - ng) > 1){
			int mid = (ok + ng) / 2;
			if(a[mid] <= key) ok = mid;
			else ng = mid;
		}
		
		return ok;
	}
	
	/* end solve */
	
	/* main */
	public static void main(String[] args) throws IOException {
		new Main().m();
	}
	
	void m() throws IOException {
		long S = System.currentTimeMillis();
		sc = (isDebug) ? new FastScanner(new FileInputStream(fileName)) : new FastScanner(System.in);
		//out = new PrintWriter(System.out);
		solve();
		//out.flush();
		long G = System.currentTimeMillis();
		if(isDebug){
			System.out.println("---Debug---");
			System.out.printf("%8d ms", (G-S));
		}
	}
	/* end main */
}
/* end Main */

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
