import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {

		FastScanner sc = new FastScanner();
		int H = sc.nextInt();
		int W = sc.nextInt();
		int[][] a = new int[H + 1][W + 1];
		for (int i = 1; i <= H; i++)
			for (int j = 1; j <= W; j++)
				a[i][j] = sc.nextInt();
		int N = 0;
		int[] y = new int[H * W + 1];
		int[] x = new int[H * W + 1];
		int[] yy = new int[H * W + 1];
		int[] xx = new int[H * W + 1];

		for (int i = 1; i <= H; i++) {
			for (int j = 1; j <= W; j++) {
				if (i == H && j == W) {
					break;
				}
				if (a[i][j] % 2 != 0) {
					N++;
					if (i == H) {
						a[i][j + 1]++;
						y[N] = i;
						x[N] = j;
						yy[N] = i;
						xx[N] = j + 1;
						continue;
					}
					if (j == W) {
						a[i + 1][j]++;
						y[N] = i;
						x[N] = j;
						yy[N] = i + 1;
						xx[N] = j;
						break;
					}
					if (a[i][j + 1] % 2 != 0 && a[i + 1][j] % 2 == 0) {
						a[i][j + 1]++;
						y[N] = i;
						x[N] = j;
						yy[N] = i;
						xx[N] = j + 1;
					} else if (a[i][j + 1] % 2 == 0 && a[i + 1][j] % 2 != 0) {
						a[i + 1][j]++;
						y[N] = i;
						x[N] = j;
						yy[N] = i + 1;
						xx[N] = j;
					} else {
						a[i][j + 1]++;
						y[N] = i;
						x[N] = j;
						yy[N] = i;
						xx[N] = j + 1;
					}

				}

			}
		}

		System.out.println(N);
		for (int i = 1; i <= N; i++)
			System.out.println(y[i] + " " + x[i] + " " + yy[i] + " " + xx[i]);

	}
	//以下、自作ライブラリ

	//最大公約数
	public static long gcd(long a, long b) {
		if (a < b)
			return gcd(b, a);
		long c = 0;
		c = a % b;
		if (c == 0)
			return b;
		return gcd(b, c);
	}

	//最小公倍数
	public static long lcm(long m, long n) {
		return m * n / gcd(m, n);
	}

	//素数判定
	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;

		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}

//以下、高速スキャナークラス
class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

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

	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
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
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
