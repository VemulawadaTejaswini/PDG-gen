import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {
	public static int INF = 1000000100;
	public static void main(String[] args) {
		IO io = new IO();
		int n = io.nextInt();
		int l = io.nextInt();
		int t = io.nextInt();
		int[] x = new int[n];
		int[] w = new int[n];
		io.nextIntArrays(x,w);
		ArrayList<Integer> tl = new ArrayList<>();
		ArrayList<Integer> tr = new ArrayList<>();
		for(int i=0;i<n;i++) {
			if (w[i] == 1) {
				tr.add((l-x[i]) % l);
			}else{
				tl.add(x[i]);
			}
		}
		tl.sort(null);
		tr.sort(null);
		tl.add(INF);
		tr.add(INF);
		
		int delta = advance(l, tl, tr);
		int rank = (x[0] == 0 && w[0] == 1) ? n-1 : 0;
		int t2 = t;
		int cycle = t / l;
		t2 -= cycle * l;
		rank = mod(rank + (long) delta * cycle, n);
		rank = mod(rank + advance(t2, tl, tr), n);
		if (tr.contains(t % l)) {
			rank = (rank + 1) % n;
		}
		
		int[] x2 = new int[n];
		for(int i=0;i<n;i++) {
			if (w[i] == 1) {
				x2[i] = mod(x[i] + t, l);
			}else{
				x2[i] = mod(x[i] - t, l);
			}
		}
		Arrays.sort(x2);
		
		int[] ans = new int[n];
		for(int i=0;i<n;i++) {
			ans[i] = x2[(i + rank) % n];
		}
		for(int i=0;i<n;i++) {
			io.println(ans[i]);
		}
		io.flush();
	}
	private static int advance(int l, ArrayList<Integer> tl, ArrayList<Integer> tr) {
		int idx1 = 0;
		int idx2 = 0;
		int delta = 0;
		while(tl.get(idx1) < l || tr.get(idx2) < l) {
			if (tl.get(idx1) == tr.get(idx2)) {
				idx1++;
				idx2++;
			}else if(tl.get(idx1) < tr.get(idx2)) {
				delta--;
				idx1++;
			}else{
				delta++;
				idx2++;
			}
		}
		return delta;
	}
	private static int mod(long a,int m) {
		a = a % m;
		if (a < 0) a += m;
		return (int) a;
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

