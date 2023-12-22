import java.io.*;
import java.math.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws Exception {
		new Main().solve();
	}
	@SuppressWarnings("unchecked")
	void solve() throws Exception {
		FastScanner in = new FastScanner(System.in);

		long mod = 1000000007;
		int N = in.nextInt();
		int M = in.nextInt();

		int X = N - 1;
		int Y = M - 1;
		long[] x = new long[X];
		long[] y = new long[Y];
		{
			long _x0 = in.nextLong();
			for (int i = 0; i < X; i++) {
				long xx = in.nextLong();
				x[i] = xx - _x0;
				_x0 = xx;
			}
		}
		{
			long _y0 = in.nextLong();
			for (int i = 0; i < Y; i++) {
				long yy = in.nextLong();
				y[i] = yy - _y0;
				_y0 = yy;
			}
		}

		long xx = 0;
		for (int i = 0; i < X; i++) {
			xx += ((i + 1) * (X - i)) % mod * x[i];
			xx %= mod;
		}
		long yy = 0;
		for (int i = 0; i < Y; i++) {
			yy += ((i + 1) * (Y - i)) % mod * y[i];
			yy %= mod;
		}
		System.out.println(xx * yy % mod);
	}

	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	class FastScanner {

		private InputStream _stream;
		private byte[] _buf = new byte[1024];
		private int _curChar;
		private int _numChars;
		private StringBuilder _sb = new StringBuilder();

		FastScanner(InputStream stream) {
			this._stream = stream;
		}

		public int read() {
			if (_numChars == -1) throw new InputMismatchException();
			if (_curChar >= _numChars) {
				_curChar = 0;
				try {
					_numChars = _stream.read(_buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (_numChars <= 0) return -1;
			}
			return _buf[_curChar++];
		}

		public String next() {
			int c = read();
			while (isWhitespace(c)) {
				c = read();
			}
			_sb.setLength(0);
			do {
				_sb.appendCodePoint(c);
				c = read();
			} while (!isWhitespace(c));
			return _sb.toString();
		}

		public int nextInt() {
			return (int) nextLong();
		}
		public long nextLong() {
			int c = read();
			while (isWhitespace(c)) {
				c = read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9') throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isWhitespace(c));
			return res * sgn;
		}

		public boolean isWhitespace(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}
	}
}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
