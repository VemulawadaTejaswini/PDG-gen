import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {
	
	final boolean isDebug = false;
	String fileName = "input.txt";
	FastScanner sc;
	PrintWriter out;
	final int MOD = (int)1e9+7;
	final int INF = Integer.MAX_VALUE / 2;
	
	int N, Q;
	String s;
	char[] alp;
	boolean[] isLeft;
	
	void solve() throws Exception{
		N = sc.nextInt();
		Q = sc.nextInt();
		s = sc.next();
		alp = new char[Q];
		isLeft = new boolean[Q];
		for(int i = 0; i < Q; i++){
			alp[i] = sc.next().charAt(0);
			isLeft[i] = (sc.next().equals("L") ? true : false);
		}
		
		int okLeft = -1, ngLeft = N;
		while(Math.abs(okLeft - ngLeft) > 1){
			int midLeft = (okLeft + ngLeft) / 2;
			if(isOkLeft(midLeft)) okLeft = midLeft;
			else ngLeft = midLeft;
		}
		
		int okRight = N, ngRight = -1;
		while(Math.abs(okRight - ngRight) > 1){
			int midRight = (okRight + ngRight) / 2;
			if(isOkRight(midRight)) okRight = midRight;
			else ngRight = midRight;
		}
		
		System.out.println((okRight - okLeft - 1));
	}
	
	boolean isOkLeft(int index){
		int now = index;
		for(int i = 0; i < Q && now >= 0 && now < N; i++){
			if(s.charAt(now) == alp[i]){
				now += (isLeft[i] ? -1 : 1);
			}
		}
		if(now == -1) return true;
		else return false;
	}
	
	boolean isOkRight(int index){
		int now = index;
		for(int i = 0; i < Q && now >= 0 && now < N; i++){
			if(s.charAt(now) == alp[i]){
				now += (isLeft[i] ? -1 : 1);
			}
		}
		if(now == N) return true;
		else return false;
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