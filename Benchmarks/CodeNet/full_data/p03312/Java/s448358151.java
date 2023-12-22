import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		IO io = new IO();
		int n = io.nextInt();
		long[] a = io.nextLongArray(n);
		long[] sum = new long[n];
		for(int i=0;i<n;i++) {
			sum[i] = (i == 0 ? 0 : sum[i-1]) + a[i];
		}
		int idx1 = Bound.lowerBound(a, sum[n-1] / 4);
		int idx2 = Bound.lowerBound(a, sum[n-1] * 2 / 4);
		int idx3 = Bound.lowerBound(a, sum[n-1] * 2 / 4);
		long ans = Long.MAX_VALUE;
		for(int o1=-100;o1<=100;o1++) {
			int i1 = idx1 + o1;
			for(int o2=-100;o2<=100;o2++) {
				int i2 = idx2 + o2;
				for(int o3=-100;o3<=100;o3++) {
					int i3= idx3 + o3;
					if (i1 < 0 || i2 - i1 <= 0 || i3 - i2 <= 0 || i3 >= n-1) {
						continue;
					}
					long sum1 = sum[i1];
					long sum2 = sum[i2] - sum[i1];
					long sum3 = sum[i3] - sum[i2];
					long sum4 = sum[n-1] - sum[i3];
					long min = Math.min(Math.min(sum1, sum2), Math.min(sum3, sum4));
					long max = Math.max(Math.max(sum1, sum2), Math.max(sum3, sum4));
					ans = Math.min(ans, max - min);
				}
			}
		}
		System.out.println(ans);
	}
}
class Bound {
	static int lowerBound(long[] a,int fromIndex,int toIndex,long key) {
		if (a[toIndex-1] < key) {
			return toIndex;
		}else if(a[fromIndex] >= key) {
			return fromIndex;
		}
		int l = fromIndex;
		int r = toIndex - 1;
		while(l + 1 < r) {
			int c = (l + r) >>> 1;
			if (a[c] >= key) {
				r = c;
			}else{
				l = c;
			}
		}
		return r;
	}
	static int lowerBound(long[] a,long key) {
		return lowerBound(a, 0, a.length, key);
	}
	static int upperBound(long[] a,int fromIndex,int toIndex,long key) {
		if (a[toIndex-1] <= key) {
			return toIndex - 1;
		}else if(a[fromIndex] > key) {
			return fromIndex - 1;
		}
		int l = fromIndex;
		int r = toIndex - 1;
		while(l + 1 < r) {
			int c = (l + r) >>> 1;
			if (a[c] > key) {
				r = c;
			}else{
				l = c;
			}
		}
		return l;
	}
	static int upperBound(long[] a,long key) {
		return upperBound(a, 0, a.length, key);
	}
}

class IO extends PrintWriter {
	private final InputStream in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	public IO() {
		this(System.in);
	}

	public IO(InputStream source) {
		super(System.out);
		this.in = source;
	}

	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
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
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	private static boolean isNewLine(int c) {
		return c == '\n' || c == '\r';
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}

	public boolean hasNextLine() {
		while (hasNextByte() && isNewLine(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}

	public String next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
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
		while (isPrintableChar(b)) {
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
		while (!isNewLine(b)) {
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
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
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

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}

	public double[] nextDoubleArray(int n) {
		double[] a = new double[n];
		for (int i = 0; i < n; i++)
			a[i] = nextDouble();
		return a;
	}

	public void nextIntArrays(int[]... a) {
		for (int i = 0; i < a[0].length; i++)
			for (int j = 0; j < a.length; j++)
				a[j][i] = nextInt();
	}

	public int[][] nextIntMatrix(int n, int m) {
		int[][] a = new int[n][];
		for (int i = 0; i < n; i++)
			a[i] = nextIntArray(m);
		return a;
	}

	public char[][] nextCharMap(int n, int m) {
		char[][] a = new char[n][];
		for (int i = 0; i < n; i++)
			a[i] = nextCharArray(m);
		return a;
	}

	public void close() {
		super.close();
		try {
			in.close();
		} catch (IOException e) {
		}
	}
}
