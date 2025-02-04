
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskX solver = new TaskX();
		solver.solve(1, in, out);
		out.close();
	}

	static int INF = 1 << 30;
	static long LINF = 1L << 55;
	static int MOD = 1000000007;
	static int[] mh4 = { 0, -1, 1, 0 };
	static int[] mw4 = { -1, 0, 0, 1 };
	static int[] mh8 = { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int[] mw8 = { -1, 0, 1, -1, 1, -1, 0, 1 };

	static class TaskX {

		public void solve(int testNumber, InputReader in, PrintWriter out) {

			int H = in.nextInt(), W = in.nextInt();
			int[][] s = new int[H][W];
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					s[i][j] = in.nextInt();
				}
			}

			boolean[][] used = new boolean[H][W];
			List<P> list = new ArrayList<>();


			for (int h = 0; h < H; h++) {
				for (int w = 0; w < W; w++) {

					if (s[h][w] % 2 == 1) {
						continue;
					} else {
						int count = 0;
						for (int i = 0; i < 4; i++) {
							int hm = h + mh4[i];
							int wm = w + mw4[i];
							if (hm < 0 || wm < 0 || hm >= H || wm >= W) {
								continue;
							}
							if (s[hm][wm] % 2 == 1) count++;
						}

						if (count == 1) continue;
						int gc = (count+1)/2;
						for (int i = 0; i < 4; i++) {
							int hm = h + mh4[i];
							int wm = w + mw4[i];
							if (hm < 0 || wm < 0 || hm >= H || wm >= W) {
								continue;
							}
							if (used[hm][wm]) continue;
							if (s[hm][wm] % 2 == 1 && gc > 0) {
								list.add(new P(hm+1, wm+1, h+1, w+1));
								used[hm][wm] = true;
								s[h][w]++;
								gc--;
							}
						}
					}
				}
			}

			for (int h = 0; h < H; h++) {
				for (int w = 0; w < W; w++) {

					if (s[h][w] == 0) continue;

					top:
					if (s[h][w] % 2 == 0) {
						continue;
					} else {
						for (int i = 0; i < 4; i++) {
							int hm = h + mh4[i];
							int wm = w + mw4[i];
							if (hm < 0 || wm < 0 || hm >= H || wm >= W) {
								continue;
							}
							if (used[h][w]) continue;
							if (s[hm][wm] % 2 == 1) {
								list.add(new P(h+1, w+1, hm+1, wm+1));
								s[hm][wm]++;
								used[h][w] = true;
								break top;
							}
						}
					}
				}
			}

			out.println(list.size());

			for (P p : list) {
				out.println(p);
			}

		}
	}

	static class P {
		int a,b,c,d;

		public P(int a, int b, int c, int d) {
			super();
			this.a = a;
			this.b = b;
			this.c = c;
			this.d = d;
		}

		@Override
		public String toString() {
			return a +" "+ b +" "+ c +" "+ d;
		}


	}

	static class InputReader {
		BufferedReader in;
		StringTokenizer tok;

		public String nextString() {
			while (!tok.hasMoreTokens()) {
				try {
					tok = new StringTokenizer(in.readLine(), " ");
				} catch (IOException e) {
					throw new InputMismatchException();
				}
			}
			return tok.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextString());
		}

		public long nextLong() {
			return Long.parseLong(nextString());
		}

		public double nextDouble() {
			return Double.parseDouble(nextString());
		}

		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt();
			}
			return res;
		}

		public int[] nextIntArrayDec(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt() - 1;
			}
			return res;
		}

		public int[] nextIntArray1Index(int n) {
			int[] res = new int[n + 1];
			for (int i = 0; i < n; i++) {
				res[i + 1] = nextInt();
			}
			return res;
		}

		public long[] nextLongArray(int n) {
			long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong();
			}
			return res;
		}

		public long[] nextLongArrayDec(int n) {
			long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong() - 1;
			}
			return res;
		}

		public long[] nextLongArray1Index(int n) {
			long[] res = new long[n + 1];
			for (int i = 0; i < n; i++) {
				res[i + 1] = nextLong();
			}
			return res;
		}

		public InputReader(InputStream inputStream) {
			in = new BufferedReader(new InputStreamReader(inputStream));
			tok = new StringTokenizer("");
		}
	}

	static long max(long... n) {
		long ret = n[0];
		for (int i = 0; i < n.length; i++) {
			ret = Math.max(ret, n[i]);
		}
		return ret;
	}

	static int max(int... n) {
		int ret = n[0];
		for (int i = 0; i < n.length; i++) {
			ret = Math.max(ret, n[i]);
		}
		return ret;
	}

	static long min(long... n) {
		long ret = n[0];
		for (int i = 0; i < n.length; i++) {
			ret = Math.min(ret, n[i]);
		}
		return ret;
	}

	static int min(int... n) {
		int ret = n[0];
		for (int i = 0; i < n.length; i++) {
			ret = Math.min(ret, n[i]);
		}
		return ret;
	}

	static String zeroPad(String str, int len) {
		return String.format("%" + len + "s", str).replace(" ", "0");
	}

}
