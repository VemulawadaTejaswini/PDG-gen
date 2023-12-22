import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		IO io = new IO();
		int n = io.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n-1;i++) {
			a[i] = io.nextInt();
		}
		int m = io.nextInt();
		if (m > 1) {
			throw new RuntimeException();
			//m = 1;
		}
		a[n-1] = io.nextInt();
		BIT bit = new BIT(n);
		for(int i=0;i<n;i++) {
			bit.set(i, a[i]);
		}
		StarrySkyTree sst = new StarrySkyTree(n);
		sst.accumulate(n-1, n, a[n-1]);
		long ans = 0;
		for(int i=n-2;i>=1;i--) {
			long dp = sst.max(i+1, n);
			ans = dp;
			sst.accumulate(i, i+1, a[i] - dp);
			sst.accumulate(i+1, n, -a[i]);
		}
		System.out.println(ans + a[0] - a[1]);

	}

}
/* 0-indexed */
class BIT {
	private int n;
	private long[] bit;
	public BIT(int n) {
		this.n = n;
		bit = new long[n+1];
	}

	public void accumulate(int index,long num) {
		index++;
		while(index<=n) {
			bit[index] += num;
			index+=index&-index;
		}
	}

	/* [begin , end) */
	public long sum(int begin,int end) {
		return sum(end) - sum(begin);
	}

	private long sum(int i) {
		long s = 0;
		while(i>0) {
			s+=bit[i];
			i-=i&-i;
		}
		return s;
	}

	public long get(int index) {
		return sum(index,index+1);
	}

	public void set(int index,long num) {
		accumulate(index,num-get(index));
	}

	public String toString() {
		long[] value = new long[n];
		for(int i=0;i<n;i++) {
			value[i] = get(i);
		}
		return Arrays.toString(value);
	}
}

class StarrySkyTree {
	public static final long INF = (1L << 60);
	private int size,n = 1;
	private long[] max,add;
	public StarrySkyTree(int size) {
		this.size = size;
		while(n < size) {
			n <<= 1;
		}
		max = new long[n*2-1];
		add = new long[n*2-1];
	}

	public void accumulate(int begin,int end,long x) {
		accumulate(begin, end, x, 0, 0, n);
	}

	private void accumulate(int a,int b,long x,int k,int l,int r) {
		if (r <= a || b <= l) {
			return;
		}
		if (a <= l && r <= b) {
			add[k] += x;
			while(k > 0) {
				k = (k - 1) / 2;
				max[k] = Math.max(max[k*2+1] + add[k*2+1], max[k*2+2] + add[k*2+2]);
			}
		}else{
			accumulate(a, b, x, k*2+1, l, l+r>>>1);
			accumulate(a, b, x, k*2+2, l+r>>>1, r);
		}
	}

	public long max(int begin,int end) {
		return max(begin,end,0,0,n);
	}

	private long max(int a,int b,int k,int l,int r) {
		if (r <= a || b <= l) {
			return -INF;
		}
		if (a <= l && r <= b) {
			return max[k] + add[k];
		}else{
			return Math.max(max(a, b, k*2+1, l, l+r>>>1), max(a, b, k*2+2, l+r>>>1, r)) + add[k];
		}
	}

	public String toString() {
		return Arrays.toString(Arrays.copyOfRange(add, n-1, size+n-1));
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

