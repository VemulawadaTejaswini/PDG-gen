import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		IO io = new IO();
		int h = io.nextInt();
		int w = io.nextInt();
		int d = io.nextInt();
		if (d % 2 == 1) {
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					io.print("RG".charAt((i+j)&1));
				}
				io.println();
			}
			io.flush();
			return;
		}
		int[][] color = new int[h][w];
		HashSet<Integer> used = new HashSet<>();
		Queue<Paint> q = new ArrayDeque<>();
		Paint init = new Paint(0, 0, 0, 0);
		used.add(init.hashCode());
		q.add(init);
		while(!q.isEmpty()) {
			Paint p = q.poll();
			//paint
			int r = d / 2;
			for(int oi=-r;oi<=r;oi++) {
				for(int oj=-r;oj<=r;oj++) {
					int i = p.i + oi;
					int j = p.j + oj;
					if (i < 0 || i >= h || j < 0 || j >= w) {
						continue;
					}
					boolean ok = false;
					if (d % 2 == 0) {
						ok = dist(oi,oj,0,0) <= r - 1 || dist(oi,oj,1,0) <= r - 1;
					}else{
						ok = dist(oi,oj,0,0) <= r;
					}
					if (ok) {
						color[i][j] = p.color();
					}
				}
			}
			//add
			ArrayList<Paint> neighbor = new ArrayList<>();
			if (d % 2 == 0) {
				neighbor.add(new Paint(p.i + r, p.j + r, p.colorI + 0, p.colorJ + 1));
				neighbor.add(new Paint(p.i - r, p.j - r, p.colorI + 0, p.colorJ - 1));
				neighbor.add(new Paint(p.i - r, p.j + r, p.colorI - 1, p.colorJ + 0));
				neighbor.add(new Paint(p.i + r, p.j - r, p.colorI + 1, p.colorJ + 0));
			}else{
				neighbor.add(new Paint(p.i + r, p.j + r + 1, p.colorI + 0, p.colorJ + 1));
				neighbor.add(new Paint(p.i - r, p.j - r - 1, p.colorI + 0, p.colorJ - 1));
				neighbor.add(new Paint(p.i - r - 1, p.j + r, p.colorI - 1, p.colorJ + 0));
				neighbor.add(new Paint(p.i + r + 1, p.j - r, p.colorI + 1, p.colorJ + 0));
			}
			for(Paint next: neighbor) {
				if (next.i < - d * 2 || next.i >= h + d * 2 || next.j < -d * 2 || next.j >= w + d * 2) {
					continue;
				}
				if (!used.contains(next.hashCode())) {
					used.add(next.hashCode());
					q.offer(next);
				}
			}
		}
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				io.print("RGBY".charAt(color[i][j]));
			}
			io.println();
		}
		io.flush();
	}

	public static int dist(int i1,int j1,int i2,int j2) {
		return Math.abs(i1 - i2) + Math.abs(j1 - j2);
	}
}
class Paint {
	int i, j;
	int colorI, colorJ;
	public Paint(int i, int j, int colorI, int colorJ) {
		super();
		this.i = i;
		this.j = j;
		this.colorI = colorI;
		this.colorJ = colorJ;
	}
	public int color() {
		return ((colorI * 2 + colorJ) % 4 + 4) % 4;
	}
	public int hashCode() {
		return i * 10000 + j;
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

