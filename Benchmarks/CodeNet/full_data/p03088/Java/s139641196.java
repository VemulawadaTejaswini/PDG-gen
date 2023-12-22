import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		final int MOD = 1_000_000_007;

		int n = sc.nextInt();
		
		char[] acgt = {'A', 'C', 'G', 'T'};
		List<String> str = new ArrayList<>();
		Map<String, Integer> hm = new HashMap<>();
		for (int i0 = 0; i0 < 4; i0++) {
			for (int i1 = 0; i1 < 4; i1++) {
				for (int i2 = 0; i2 < 4; i2++) {
					StringBuilder sb = new StringBuilder();
					sb.append(acgt[i0]);
					sb.append(acgt[i1]);
					sb.append(acgt[i2]);
						
					str.add(sb.toString());
					hm.put(sb.toString(), str.size() - 1);
				}
			}
		}
		
//		pr.println(str);

		long[][] dp = new long[64][n];
		for (int i = 0; i < 64; i++) {
			dp[i][2] = 1;
			
			String tmp = str.get(i);
			if (tmp.equals("AGC") || tmp.equals("ACG") || tmp.equals("GAC")) {
				dp[i][2] = 0;
			}
		}

		for (int i = 2; i < n - 1; i++) {
			for (int j = 0; j < 64; j++) {
				for (char c : acgt) {
					String next4 = str.get(j) + c;

//					pr.println(next4);
					if (isOK(next4)) {
						int nj = hm.get(next4.substring(1, 4));
						dp[nj][i + 1] += dp[j][i];
						dp[nj][i + 1] %= MOD;
					}
				}
			}
		}
		
		long ans = 0;
		for (int i = 0; i < 64; i++) {
			ans += dp[i][n - 1];
			ans %= MOD;
		}
		
		pr.println(ans);
	}

	private static boolean isOK(String next4) {
		if (next4.equals("AGGC") || next4.equals("ACGC") || next4.equals("AGTC") || next4.equals("ATGC")) {
			return false;
		}
		String next3 = next4.substring(1, 4);
		if (next3.equals("AGC") || next3.equals("ACG") || next3.equals("GAC")) {
			return false;
		}

		return true;
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);
			
		solve();
			
		pr.close();
		sc.close();
	}

	static class Scanner {
		BufferedReader br;

		Scanner (InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
		}

		private boolean isPrintable(int ch) {
			return ch >= '!' && ch <= '~';
		}

		private boolean isCRLF(int ch) {
			return ch == '\n' || ch == '\r' || ch == -1;
		}

		private int nextPrintable() {
			try {
				int ch;
				while (!isPrintable(ch = br.read())) {
					if (ch == -1) {
						throw new NoSuchElementException();
					}
				}

				return ch;
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		String next() {
			try {
				int ch = nextPrintable();
				StringBuilder sb = new StringBuilder();
				do {
					sb.appendCodePoint(ch);
				} while (isPrintable(ch = br.read()));

				return sb.toString();
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		int nextInt() {
			try {
				// parseInt from Integer.parseInt()
				boolean negative = false;
				int res = 0;
				int limit = -Integer.MAX_VALUE;
				int radix = 10;

				int fc = nextPrintable();
				if (fc < '0') {
					if (fc == '-') {
						negative = true;
						limit = Integer.MIN_VALUE;
					} else if (fc != '+') {
						throw new NumberFormatException();
					}
					fc = br.read();
				}
				int multmin = limit / radix;

				int ch = fc;
				do {
					int digit = ch - '0';
					if (digit < 0 || digit >= radix) {
						throw new NumberFormatException();
					}
					if (res < multmin) {
						throw new NumberFormatException();
					}
					res *= radix;
					if (res < limit + digit) {
						throw new NumberFormatException();
					}
					res -= digit;

				} while (isPrintable(ch = br.read()));

				return negative ? res : -res;
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		long nextLong() {
			try {
				// parseLong from Long.parseLong()
				boolean negative = false;
				long res = 0;
				long limit = -Long.MAX_VALUE;
				int radix = 10;

				int fc = nextPrintable();
				if (fc < '0') {
					if (fc == '-') {
						negative = true;
						limit = Long.MIN_VALUE;
					} else if (fc != '+') {
						throw new NumberFormatException();
					}
					fc = br.read();
				}
				long multmin = limit / radix;

				int ch = fc;
				do {
					int digit = ch - '0';
					if (digit < 0 || digit >= radix) {
						throw new NumberFormatException();
					}
					if (res < multmin) {
						throw new NumberFormatException();
					}
					res *= radix;
					if (res < limit + digit) {
						throw new NumberFormatException();
					}
					res -= digit;

				} while (isPrintable(ch = br.read()));

				return negative ? res : -res;
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		float nextFloat() {
			return Float.parseFloat(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			try {
				int ch;
				while (isCRLF(ch = br.read())) {
					if (ch == -1) {
						throw new NoSuchElementException();
					}
				}
				StringBuilder sb = new StringBuilder();
				do {
					sb.appendCodePoint(ch);
				} while (!isCRLF(ch = br.read()));

				return sb.toString();
			} catch (IOException e) {
				throw new NoSuchElementException();
			}
		}

		void close() {
			try {
				br.close();
			} catch (IOException e) {
//				throw new NoSuchElementException();
			}
		}
	}

	static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
	}
}
