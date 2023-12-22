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
		long[] sum = new long[n+1];
		for(int i=0;i<n;i++) {
			sum[i+1] = sum[i] + a[i];
		}
		long ans = Long.MAX_VALUE;
		for(int mid=2;mid<n-1;mid++) { //右側の最初の要素
			long leftSum = sum[mid];
			long rightSum = sum[n] - sum[mid];
			int leftMid = Bound.lowerBound(sum, leftSum / 2);
			long bestDiffL = Long.MAX_VALUE;
			long bestLLS = 0, bestLRS = 0;
			for(int i=-2;i<=2;i++) {
				int leftMid2 = leftMid + i;
				if (leftMid2 <= 0 || leftMid2 >= mid) {
					continue;
				}
				long leftLeftSum = sum[leftMid2];
				long leftRightSum = sum[mid] - sum[leftMid2];
				long diff = Math.abs(leftLeftSum - leftRightSum);
				if (bestDiffL > diff) {
					bestDiffL = diff;
					bestLLS = leftLeftSum;
					bestLRS = leftRightSum;
				}
			}
			int rightMid = Bound.lowerBound(sum, leftSum + rightSum / 2);
			long bestDiffR = Long.MAX_VALUE;
			long bestRLS = 0, bestRRS = 0;
			for(int i=-2;i<=2;i++) {
				int rightMid2 = rightMid + i;
				if (rightMid2 <= mid || rightMid2 >= n) {
					continue;
				}
				long rightLeftSum = sum[rightMid2] - sum[mid];
				long rightRightSum = sum[n] - sum[rightMid2];
				long diff = Math.abs(rightLeftSum - rightRightSum);
				if (bestDiffR > diff) {
					bestDiffR = diff;
					bestRLS = rightLeftSum;
					bestRRS = rightRightSum;
				}
			}
			long min = Math.min(Math.min(bestLLS, bestLRS), Math.min(bestRLS, bestRRS));
			long max = Math.max(Math.max(bestLLS, bestLRS), Math.max(bestRLS, bestRRS));
			ans = Math.min(ans, max - min);
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
