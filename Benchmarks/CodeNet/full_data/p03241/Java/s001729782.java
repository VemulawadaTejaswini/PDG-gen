import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	static FastScanner sc;
	static PrintWriter out;
	public static void main(String[] args){
		sc = new FastScanner();
		out = new PrintWriter(System.out);
		out.println(solve());
		out.flush();
	}

	static int solve(){
		int N = sc.nextInt();
		int M = sc.nextInt();
		if(N==1) return M;
		int rootM = (int)Math.sqrt(M);
		int div = M/N;
		int max = 1;
		for(int i=rootM;i>1;i--){
			if(M%i==0 && i<=div){
				max = Math.max(max, Math.max(i, M/i));
			};
		}
		return max;
	}
}

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
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
	private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
	private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
	public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
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
	public double nextDouble() { return Double.parseDouble(next());}
}