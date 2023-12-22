import java.util.Arrays;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	long start = System.currentTimeMillis();
	long fin = System.currentTimeMillis();
	final int MOD = 1000000007;
	int[] dx = { 1, 0, 0, -1 };
	int[] dy = { 0, 1, -1, 0 };

	int n;
	long ans;
	String s;
	char[] c;

	void run() {
		s = sc.next();
		n = s.length();
		c = new char[n + (n - 1)];
		for (int i = 0, j = 0; i < c.length; i++) {
			if (i % 2 == 0)
				c[i] = s.charAt(j++);
		}
		ans = 0;
		dfs(1);
		System.out.println(ans);
	}

	void dfs(int d) {
		if (d == n + (n - 1)) {
			String tmp = "";
			for(int i=0;i<c.length;i++) {
				if(c[i] != '-') tmp += c[i];
			}
			ans += new Parse().expression(tmp);
			return;
		}
		c[d] = '+';
		dfs(d+2);
		c[d] = '-';
		dfs(d+2);
	}
	
	public class Parse {
		int index = 0;

		long expression(String sb) {
			long res = term(sb);
			for (; index < sb.length();) {
				if (sb.charAt(index) == '+') {
					index++;
					res += term(sb);
				} else if (sb.charAt(index) == '-') {
					index++;
					res -= term(sb);
				} else {
					break;
				}
			}
			return res;
		}

		long term(String sb) {
			long res = factor(sb);
			for (; index < sb.length();) {
				if (sb.charAt(index) == '*') {
					index++;
					res *= factor(sb);
				} else if (sb.charAt(index) == '/') {
					index++;
					res /= factor(sb);
				} else {
					break;
				}
			}
			return res;
		}

		long factor(String sb) {
			long res = 0;
			if (index < sb.length() && sb.charAt(index) == '(') {
				index++;
				res = expression(sb);
				index++;
			} else {
				res = number(sb);
			}
			return res;
		}

		long number(String sb) {
			long res = 0;
			while (index < sb.length() && Character.isDigit(sb.charAt(index))) {
				res *= 10;
				res += sb.charAt(index) - '0';
				index++;
			}
			return res;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	void debug2(char[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	boolean inner(int h, int w, int limH, int limW) {
		return 0 <= h && h < limH && 0 <= w && w < limW;
	}

	void swap(int[] x, int a, int b) {
		int tmp = x[a];
		x[a] = x[b];
		x[b] = tmp;
	}

	// find minimum i (k <= a[i])
	int lower_bound(int a[], int k) {
		int l = -1;
		int r = a.length;
		while (r - l > 1) {
			int mid = (l + r) / 2;
			if (k <= a[mid])
				r = mid;
			else
				l = mid;
		}
		// r = l + 1
		return r;
	}

	// find minimum i (k < a[i])
	int upper_bound(int a[], int k) {
		int l = -1;
		int r = a.length;
		while (r - l > 1) {
			int mid = (l + r) / 2;
			if (k < a[mid])
				r = mid;
			else
				l = mid;
		}
		// r = l + 1
		return r;
	}

	long gcd(long a, long b) {
		return a % b == 0 ? b : gcd(b, a % b);
	}

	long lcm(long a, long b) {
		return a * b / gcd(a, b);
	}

	boolean palindrome(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	class MyScanner {
		int nextInt() {
			try {
				int c = System.in.read();
				while (c != '-' && (c < '0' || '9' < c))
					c = System.in.read();
				if (c == '-')
					return -nextInt();
				int res = 0;
				do {
					res *= 10;
					res += c - '0';
					c = System.in.read();
				} while ('0' <= c && c <= '9');
				return res;
			} catch (Exception e) {
				return -1;
			}
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String next() {
			try {
				StringBuilder res = new StringBuilder("");
				int c = System.in.read();
				while (Character.isWhitespace(c))
					c = System.in.read();
				do {
					res.append((char) c);
				} while (!Character.isWhitespace(c = System.in.read()));
				return res.toString();
			} catch (Exception e) {
				return null;
			}
		}

		int[] nextIntArray(int n) {
			int[] in = new int[n];
			for (int i = 0; i < n; i++) {
				in[i] = nextInt();
			}
			return in;
		}

		int[][] nextInt2dArray(int n, int m) {
			int[][] in = new int[n][m];
			for (int i = 0; i < n; i++) {
				in[i] = nextIntArray(m);
			}
			return in;
		}

		double[] nextDoubleArray(int n) {
			double[] in = new double[n];
			for (int i = 0; i < n; i++) {
				in[i] = nextDouble();
			}
			return in;
		}

		long[] nextLongArray(int n) {
			long[] in = new long[n];
			for (int i = 0; i < n; i++) {
				in[i] = nextLong();
			}
			return in;
		}

		char[][] nextCharField(int n, int m) {
			char[][] in = new char[n][m];
			for (int i = 0; i < n; i++) {
				String s = sc.next();
				for (int j = 0; j < m; j++) {
					in[i][j] = s.charAt(j);
				}
			}
			return in;
		}
	}
}