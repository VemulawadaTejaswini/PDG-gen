import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	void solver(char[] w) {
		boolean all = true;
		for (int i = 1; i < w.length; i++) {
			if (w[i] != w[i - 1]) {
				all = false;
				break;
			}
		}
		if (all) {
			out.println(w.length + "\n" + 1);
			return;
		}
		int n = w.length;
		long b = 29;
		long[] mod = { 1000000007, 1000000009 };
		long[][] hash = new long[2][n];
		long[][] pow = new long[2][n];
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0)
					pow[i][j] = 1;
				else {
					pow[i][j] = pow[i][j - 1] * b;
					if (pow[i][j] >= mod[i])
						pow[i][j] %= mod[i];
				}
			}
		}

		for (int i = 0; i < 1; i++) {
			for (int j = n - 1; j >= 0; j--) {
				hash[i][j] = (w[j] - 'a') + (j == n - 1 ? 0 : hash[i][j + 1] * b);
				if (hash[i][j] >= mod[i])
					hash[i][j] %= mod[i];
			}
		}
		ArrayList<Integer>[] div = new ArrayList[n + 1];
		for (int i = 0; i <= n; i++) {
			div[i] = new ArrayList<>();
			if (i > 1)
				div[i].add(1);
		}
		for (int i = n - 1; i >= 1; i--) {
			for (long j = 2L * i; j <= n; j += i) {
				div[(int) j].add(i);
			}
		}
		for (int i = 0; i < 1; i++) {
			if (isGood(0, n, hash[i], mod[i], pow[i], div)) {
				out.println("1\n1");
				return;
			}
		}
		long ret = 0;
		for (int i = 1; i < n; i++) {
			boolean f = true;
			for (int j = 0; j < 1; j++) {
				if (!isGood(0, i, hash[j], mod[j], pow[j], div) || !isGood(i, n, hash[j], mod[j], pow[j], div)) {
					f = false;
					break;
				}
			}
			if (f) {
				ret++;
			}
		}
		out.println(2 + "\n" + ret);
	}

	boolean isGood(int s, int t, long[] hash, long mod, long[] pow, ArrayList<Integer>[] div) {
		int n = t - s;
		for (int period : div[n]) {
			long v1 = (hash[s] - hash[t - period] * pow[t - s - period] % mod + mod) % mod;
			long v2 = (hash[s + period] - (t == hash.length ? 0 : hash[t] * pow[t - s - period] % mod) + mod) % mod;
			if (v1 == v2)
				return false;
		}
		return true;
	}

	void run() {
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);
		solver(ns().toCharArray());
		out.flush();
	}

	static long nl() {
		try {
			long num = 0;
			boolean minus = false;
			while ((num = is.read()) != -1 && !((num >= '0' && num <= '9') || num == '-'))
				;
			if (num == '-') {
				num = 0;
				minus = true;
			} else {
				num -= '0';
			}

			while (true) {
				int b = is.read();
				if (b >= '0' && b <= '9') {
					num = num * 10 + (b - '0');
				} else {
					return minus ? -num : num;
				}
			}
		} catch (IOException e) {
		}
		return -1;
	}

	static char nc() {
		try {
			int b = skip();
			if (b == -1)
				return 0;
			return (char) b;
		} catch (IOException e) {
		}
		return 0;
	}

	static double nd() {
		try {
			return Double.parseDouble(ns());
		} catch (Exception e) {
		}
		return 0;
	}

	static String ns() {
		try {
			int b = skip();
			StringBuilder sb = new StringBuilder();
			if (b == -1)
				return "";
			sb.append((char) b);
			while (true) {
				b = is.read();
				if (b == -1)
					return sb.toString();
				if (b <= ' ')
					return sb.toString();
				sb.append((char) b);
			}
		} catch (IOException e) {
		}
		return "";
	}

	public static char[] ns(int n) {
		char[] buf = new char[n];
		try {
			int b = skip(), p = 0;
			if (b == -1)
				return null;
			buf[p++] = (char) b;
			while (p < n) {
				b = is.read();
				if (b == -1 || b <= ' ')
					break;
				buf[p++] = (char) b;
			}
			return Arrays.copyOf(buf, p);
		} catch (IOException e) {
		}
		return null;
	}

	public static byte[] nse(int n) {
		byte[] buf = new byte[n];
		try {
			int b = skip();
			if (b == -1)
				return null;
			is.read(buf);
			return buf;
		} catch (IOException e) {
		}
		return null;
	}

	static int skip() throws IOException {
		int b;
		while ((b = is.read()) != -1 && !(b >= 33 && b <= 126))
			;
		return b;
	}

	static boolean eof() {
		try {
			is.mark(1000);
			int b = skip();
			is.reset();
			return b == -1;
		} catch (IOException e) {
			return true;
		}
	}

	static int ni() {
		try {
			int num = 0;
			boolean minus = false;
			while ((num = is.read()) != -1 && !((num >= '0' && num <= '9') || num == '-'))
				;
			if (num == '-') {
				num = 0;
				minus = true;
			} else {
				num -= '0';
			}

			while (true) {
				int b = is.read();
				if (b >= '0' && b <= '9') {
					num = num * 10 + (b - '0');
				} else {
					return minus ? -num : num;
				}
			}
		} catch (IOException e) {
		}
		return -1;
	}

	static void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}
