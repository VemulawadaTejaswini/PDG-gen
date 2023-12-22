
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {
	public static long MOD = 1000000007;
	public static void main(String[] args) {
		IO io = new IO();
		int n = io.nextInt();
		int x = io.nextInt();
		int y = io.nextInt();
		Ball[] b = new Ball[n];
		for(int i=0;i<n;i++) {
			int c = io.nextInt();
			int w = io.nextInt();
			b[i] = new Ball(i, c, w);
		}
		UnionFind uf = new UnionFind(n);
		Arrays.sort(b,(b1,b2)->{
			if (b1.c != b2.c) {
				return Integer.compare(b1.c, b2.c);
			}
			return Integer.compare(b1.w, b2.w);
		});
		for(int l=0;l<n;) {
			int r = l;
			while(r < n - 1 && b[r+1].c == b[l].c) {
				r++;
			}
			for(int i=l;i<=r;i++) {
				if (b[l].w + b[i].w <= x) {
					uf.union(b[l].i, b[i].i);
				}else{
					break;
				}
			}
			l = r + 1;
		}
		Arrays.sort(b,(b1,b2)->Integer.compare(b1.w, b2.w));
		for(int i=0;i<n;i++) {
			if (b[0].w + b[i].w <= y) {
				uf.union(b[0].i, b[i].i);
			}
		}
		//System.out.println(uf.groups());
		Arrays.sort(b, (b1,b2) -> Integer.compare(b1.i, b2.i));
		long[] fact = Mod.factorialArray(200010, MOD);
		long[] factInv = Mod.factorialInverseArray(200010, MOD, Mod.inverseArray(200010, MOD));
		long ans = 1;
		for(ArrayList<Integer> g: uf.groups()) {
			ArrayList<Integer> cs = new ArrayList<>();
			for(int i:g) {
				cs.add(b[i].c);
			}
			cs.sort(null);
			int m = g.size();
			long pi = fact[m];
			for(int l=0;l<m;) {
				int r = l;
				while(r < m - 1 && cs.get(r+1) == cs.get(l)) {
					r++;
				}
				pi = pi * factInv[r-l+1] % MOD;
				l = r + 1;
			}
//			System.out.println(pi);
			ans = ans * pi % MOD;
		}
		System.out.println(ans);
	}
}
class Ball {
	int i,c,w;

	public Ball(int i, int c, int w) {
		super();
		this.i = i;
		this.c = c;
		this.w = w;
	}
	
}
class Mod {
	public static long[] inverseArray(int maxN,long modP) {
		long[] inv = new long[maxN+1];
		inv[1] = 1;
		for(int i=2;i<=maxN;i++) {
			inv[i] = modP - (modP / i) * inv[(int) (modP%i)] % modP;
		}
		return inv;
	}
	public static long[] factorialArray(int maxN,long mod) {
		long[] fact = new long[maxN+1];
		fact[0] = 1 % mod;
		for(int i=1;i<=maxN;i++) {
			fact[i] = fact[i-1] * i % mod;
		}
		return fact;
	}
	public static long[] factorialInverseArray(int maxN,long modP,long[] inverseArray) {
		long[] factInv = new long[maxN+1];
		factInv[0] = 1;
		for(int i=1;i<=maxN;i++) {
			factInv[i] = factInv[i-1] * inverseArray[i] % modP;
		}
		return factInv;
	}
}
class UnionFind {
	private int[] parent;
	public UnionFind(int size) {
		parent = new int[size];
		Arrays.fill(parent, -1);
	}
	public boolean union(int x,int y) {
		x = root(x);
		y = root(y);
		if (x!=y) {
			if (parent[y] < parent[x]) {
				int tmp = y;
				y = x;
				x = tmp;
			}
			parent[x] += parent[y];
			parent[y] = x;
			return true;
		}
		return false;
	}
	public boolean isConnected(int x,int y) {
		return root(x)==root(y);
	}
	private int root(int x) {
		return parent[x] < 0 ? x : (parent[x] = root(parent[x]));
	}
	public int size(int x) {
		return -parent[root(x)];
	}
	public ArrayList<ArrayList<Integer>> groups() {
		int n = parent.length;
		ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();
		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++) {
			int r = root(i);
			if (!hm.containsKey(r)) {
				hm.put(r, g.size());
				g.add(new ArrayList<Integer>());
			}
			g.get(hm.get(r)).add(i);
		}
		return g;
	}
	public String toString() {
		return Arrays.toString(parent);
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

