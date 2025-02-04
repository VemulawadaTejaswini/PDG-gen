
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
public class Main {

	public static long INF = 1L << 60L;
	public static void main(String[] args) {
		IO io = new IO();
		int n = io.nextInt();
		int[] a = io.nextIntArray(n);
		int[] b = Arrays.copyOf(a, n + 1);
		b[n] = 1000000007;
		Arrays.sort(b);
		int left = 0;
		int right = n;
		while(left + 1 < right) {
			int center = (left + right) / 2;
			long all = (long) n * (n + 1) / 2;
			long x = count(0,n,a,n,b[center]);
//			System.err.println(center + "," + b[center] + "," + x + "," + (all + 1) / 2);
			if (x >= (all + 1) / 2) { //半分以上がcenter以上
				left = center;
			}else {
				right = center;
			}
		}
		System.out.println(b[left]);
	}
	
	public static int[] left = new int[100000];
	public static int[] right = new int[100000];
	public static long count(int l, int r, int[] a, int n, int thr) {
		if (r - l == 1) {
			return a[l] >= thr ? 1 : 0;
		}
		int c = (l + r) / 2;
		int countLeft = 0;
		int pl = 0;
		int pr = 0;
		for(int i=c-1;i>=l;i--) {
			if (a[i] >= thr) {
				countLeft++;
			}
			left[pl++] = (countLeft * 2 - (c - i));
		}
		int countRight = 0;
		for(int i=c;i<r;i++) {
			if (a[i] >= thr) {
				countRight++;
			}
			right[pr++] = (countRight * 2 - (i - c + 1));
		}
		Arrays.sort(left, 0, pl);
		Arrays.sort(right, 0, pr);
		//System.err.println((r - l) + "," + pl + "," + pr);
		long sum = 0;
		int j = pr; //left[i] + right[j] >= 0
		for(int i=0;i<pl;i++) {
			while(j > 0 && left[i] + right[j-1] >= 0) {
				j--;
			}
			sum += pr - j;
		}
		sum += count(l, c, a, n, thr) + count(c, r, a, n, thr);
//		System.err.println(l + "," + r + "," + sum + "," + thr);
		return sum;
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
