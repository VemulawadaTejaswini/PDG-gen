import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.InputMismatchException;

public class Main {

	public Main() {
		InputReaderB in = new InputReaderB(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] a = new int[n][m];
		boolean[] vis = new boolean[m + 1];
		int[] cnt = new int[n];
		int max = 0, ind = -1, ans = 1 << 30;
		for (int i = 0; i < n; i++)
			a[i] = in.nextIntArray(m);
		for (int i = 0; i < m; i++) {
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			max = 0;
			ind = -1;
			for (int j = 0; j < n; j++) {
				int v = 0;
				if (map.get(a[j][cnt[j]]) != null)
					v = map.get(a[j][cnt[j]]);
				map.put(a[j][cnt[j]], v + 1);
				if (max < v + 1) {
					max = v + 1;
					ind = a[j][cnt[j]];
				}
			}
			vis[ind] = true;
			for (int j = 0; j < n; j++)
				while (cnt[j] < m && vis[a[j][cnt[j]]])
					cnt[j]++;
			ans = Math.min(ans, max);
		}
		out.println(ans);
		out.close();
	}

	public static void main(String[] args) {
		new Main();
	}
}

class InputReaderB {
	private InputStream stream;
	private byte[] buf = new byte[16384];
	private int curChar;
	private int numChars;

	public InputReaderB(InputStream stream) {
		this.stream = stream;
	}

	public int read() {
		if (numChars == -1)
			throw new InputMismatchException();
		if (curChar >= numChars) {
			curChar = 0;
			try {
				numChars = stream.read(buf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (numChars <= 0)
				return -1;
		}
		return buf[curChar++];
	}

	public String nextLine() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		StringBuilder res = new StringBuilder();
		do {
			res.appendCodePoint(c);
			c = read();
		} while (!isEndOfLine(c));
		return res.toString();
	}

	public String next() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		StringBuilder res = new StringBuilder();
		do {
			res.appendCodePoint(c);
			c = read();
		} while (!isSpaceChar(c));
		return res.toString();
	}

	public long nextLong() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		long res = 0;
		do {
			if (c < '0' || c > '9')
				throw new InputMismatchException();
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}

	public int nextInt() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		int res = 0;
		do {
			if (c < '0' || c > '9')
				throw new InputMismatchException();
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}

	public int[] nextIntArray(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = nextInt();
		return arr;
	}

	public long[] nextLongArray(int n) {
		long[] arr = new long[n];
		for (int i = 0; i < n; i++)
			arr[i] = nextLong();
		return arr;
	}

	private boolean isSpaceChar(int c) {
		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	}

	private boolean isEndOfLine(int c) {
		return c == '\n' || c == '\r' || c == -1;
	}
}