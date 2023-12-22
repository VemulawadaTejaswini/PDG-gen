import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	public static int MAXLOGN = 17;
	
	public static void main(String[] args) {
		IO io = new IO();
		int n = io.nextInt();
		int[] x = io.nextIntArray(n);
		int l = io.nextInt();
		int[][] left = new int[n][MAXLOGN+1];
		int[][] right = new int[n][MAXLOGN+1];
		
		int i=0,j=0;
		for(i=0;i<n;i++) {
			while(j < n - 1 && x[j+1] - x[i] <= l) {
				j++;
			}
			right[i][0] = j;
		}
		i = n - 1;
		for(j=n-1;j>=0;j--) {
			while(i >= 1 && x[j] - x[i-1] <= l) {
				i--;
			}
			left[j][0] = i;
		}
		for(j=1;j<=MAXLOGN;j++) {
			for(i=0;i<n;i++) {
				left[i][j] = left[left[i][j-1]][j-1];
				right[i][j] = right[right[i][j-1]][j-1];
			}
		}
		
		int[] debug = new int[n];
		for(i=0;i<n;i++) {
			debug[i] = right[i][0];
		}
//		System.out.println(Arrays.toString(debug));
		
		int q = io.nextInt();
		for(int qq=0;qq<q;qq++) {
			int a = io.nextInt() - 1;
			int b = io.nextInt() - 1;
			int now = a;
			int t = 0;
			int ans = -1;
			if (a < b) {
				int dt = 1 << MAXLOGN;
				for(j=MAXLOGN;j>=0;j--) {
					if (right[now][j] >= b) {
						ans = t + dt;
					}else{
						t += dt;
						now = right[now][j];
					}
					dt >>>= 1;
				}
			}else{
				int dt = 1 << MAXLOGN;
				for(j=MAXLOGN;j>=0;j--) {
					if (left[now][j] <= b) {
						ans = t + dt;
					}else{
						t += dt;
						now = left[now][j];
					}
					dt >>>= 1;
				}
			}
			io.println(ans);
		}
		io.flush();
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

