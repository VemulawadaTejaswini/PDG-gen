import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {
	public static long MOD = 1000000007;
	public static void main(String[] args) {
		IO io = new IO();
		int n = io.nextInt();
		if (n > 2000) throw new RuntimeException();
		int[] parent = new int[n+1];
		int[] size = new int[n+1];
		ArrayList<Integer>[] children = new ArrayList[n+1];
		for(int i=0;i<=n;i++) {
			children[i] = new ArrayList<>();
		}
		parent[0] = -1;
		for(int i=1;i<=n;i++) {
			parent[i] = io.nextInt();
			children[parent[i]].add(i);
		}
		long[][] dp = new long[n+1][n+1];
		dfs(dp, -1, 0, 0, n, children, size);
		long ans = 0;
		for(int i=0;i<=n;i++) {
			ans += dp[0][i];
		}
//		System.err.println(Arrays.deepToString(dp));
		System.out.println(ans % MOD);
	}
	public static void dfs(long[][] dp, int p, int v, int h, int n, ArrayList<Integer>[] children, int[] size) {
		for(int u: children[v]) {
			dfs(dp, v, u, h+1, n, children, size);
			size[v] += size[u];
		}
		size[v]++;
		for(int t=h+1;t<=n;t++) {
			long pi = 1;
			for(int u: children[v]) {
				pi = n(pi * (pow(2, size[u], MOD) - dp[u][t]), MOD);
			}
			long sum = 0;
			for(int u: children[v]) {
				long pi2 = pi * inverse(n(pow(2, size[u], MOD) - dp[u][t] , MOD) , MOD) % MOD;
				sum = (sum + 2 * dp[u][t] * pi2) % MOD;
			}
			dp[v][t] = sum;
		}
		dp[v][h] = pow(2, size[v] - 1, MOD);
	}
	public static long n(long x,long mod) {
		x %= mod;
		if (x < 0) {
			x += mod;
		}
		return x;
	}
	public static long pow(long a,long n,long mod) {
		long res = 1;
		while(n > 0) {
			if ((n & 1) > 0) {
				res = (res * a) % mod;
			}
			a = (a * a) % mod;
			n/=2;
		}
		return res;
	}
	public static long inverse(long a,long mod) {
		long b = mod, u = 1, v = 0;
		while(b > 0) {
			long temp;
			long t = a / b;
			a -= t * b;
			temp = a; a = b; b = temp;
			u -= t * v;
			temp = u; u = v; v = temp;
		}
		return (u % mod + mod) % mod;
	}
}
class IO extends PrintWriter {
	private final InputStream in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	
	public IO() { this(System.in);}
	public IO(InputStream source) { super(System.out); this.in = source;}
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
	private static boolean isNewLine(int c) { return c == '\n' || c == '\r';}
	public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
	public boolean hasNextLine() { while(hasNextByte() && isNewLine(buffer[ptr])) ptr++; return hasNextByte();}
	public String next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public char[] nextCharArray(int len) {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		char[] s = new char[len];
		int i = 0;
		int b = readByte();
		while(isPrintableChar(b)) {
			if (i == len) {
				throw new InputMismatchException();
			}
			s[i++] = (char) b;
			b = readByte();
		}
		return s;
	}
	public String nextLine() {
		if (!hasNextLine()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(!isNewLine(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
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
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
			throw new NumberFormatException();
		}
		return (int) nl;
	}
	public char nextChar() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		return (char) readByte();
	}
	public double nextDouble() { return Double.parseDouble(next());}
	public int[] nextIntArray(int n) { int[] a = new int[n]; for(int i=0;i<n;i++) a[i] = nextInt(); return a;}
	public long[] nextLongArray(int n) { long[] a = new long[n]; for(int i=0;i<n;i++) a[i] = nextLong(); return a;}
	public double[] nextDoubleArray(int n) { double[] a = new double[n]; for(int i=0;i<n;i++) a[i] = nextDouble(); return a;}
	public void nextIntArrays(int[]... a) { for(int i=0;i<a[0].length;i++) for(int j=0;j<a.length;j++) a[j][i] = nextInt();}
	public int[][] nextIntMatrix(int n,int m) { int[][] a = new int[n][]; for(int i=0;i<n;i++) a[i] = nextIntArray(m); return a;}
	public char[][] nextCharMap(int n,int m) { char[][] a = new char[n][]; for(int i=0;i<n;i++) a[i] = nextCharArray(m); return a;}
	public void close() { super.close(); try {in.close();} catch (IOException e) {}}
}

