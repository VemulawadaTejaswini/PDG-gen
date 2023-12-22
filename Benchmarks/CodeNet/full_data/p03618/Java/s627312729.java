import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskC solver = new TaskC();
		solver.solve(2, in, out);
		out.close();
	}

	static class TaskC {

		public void solve(int testNumber, InputReader in, PrintWriter out) {
			if (testNumber == 1) {
				solveA(in, out);
			} else if (testNumber == 2) {
				solveB(in, out);
			} else if (testNumber == 3) {
				solveC(in, out);
			} else if (testNumber == 4) {
				solveD(in, out);
			} else if (testNumber == 5) {
				solveE(in, out);
			} else if (testNumber == 6) {
				solveF(in, out);
			}
		}

		public void solveA(InputReader in, PrintWriter out) {
			long q = in.nextInt(), h = in.nextInt(), s = in.nextInt(), d = in.nextInt(), n = in.nextInt();
			long bestValueFor1 = Math.min(q * 4, h * 2);
			bestValueFor1 = Math.min(bestValueFor1, s);
			long bestValueFor2 = Math.min(2 * bestValueFor1, d);
			long result = (n >> 1) * bestValueFor2;
			result += (n % 2) * bestValueFor1;
			out.println(result);
		}

		public void solveB(InputReader in, PrintWriter out) {
			char[] a = in.next().toCharArray();
			long[] count = new long[26];
			for (char c : a) {
				count[c - 'a']++;
			}
			long length = a.length;
			long result = ((length * (length - 1)) >> 1) + 1;
			for (long c : count) {
				result -= (c * (c - 1)) >> 1;
			}
			out.println(result);
		}

		public void solveC(InputReader in, PrintWriter out) {
			int x1 = in.nextInt(), y1 = in.nextInt(), x2 = in.nextInt(), y2 = in.nextInt();
			if (x1 > x2) {
				int temp = x1;
				x1 = x2;
				x2 = temp;
				temp = y1;
				y1 = y2;
				y2 = temp;
			}
			int n = in.nextInt();
			int[][] xy = new int[n][2];
			for (int i = 0; i < n; i++) {
				xy[i][0] = in.nextInt();
				xy[i][1] = in.nextInt();
			}
			Arrays.sort(xy, new Comparator<int[]>() {

				@Override
				public int compare(int[] o1, int[] o2) {
					return Integer.compare(o1[0], o2[0]);
				}
			});
			int y11 = Math.min(y1, y2), y22 = Math.max(y1, y2);
			y = new int[y22 - y11 + 3];
			x = new int[y22 - y11 + 3];
			y[0] = y1;
			x[0] = x1;
			xyLength = 1;
			int l = 0, r = n;
			int mid = (l + r) >> 1;
			while (l < r) {
				mid = (l + r) >> 1;
				if (xy[mid][0] < x1) {
					l = mid + 1;
				} else if (xy[mid][0] > x1) {
					r = mid;
				} else {
					break;
				}
			}
			mid = (l + r) >> 1;
			for (int i = mid; i < n && xy[i][0] <= x2; i++) {
				if (y11 <= xy[i][1] && xy[i][1] <= y22) {
					y[xyLength] = xy[i][1];
					x[xyLength++] = xy[i][0];
				}
			}
			y[xyLength] = y2;
			x[xyLength++] = x2;

			if (y1 == y2 || x1 == x2) {
				if (xyLength == 2) {
					out.println(((long) Math.max(Math.abs(x1 - x2), Math.abs(y1 - y2))) * 100);
				} else {
					out.println((((long) Math.max(Math.abs(x1 - x2), Math.abs(y1 - y2))) * 100 - 20 + 10 * Math.PI));
				}
				return;
			}
			y1_s_y2 = y1 < y2;
			depth = 0;
			maxDepth = 0;
			maxDfs(0);
			maxDepth--;
			out.println(
					(((long) Math.abs(x1 - x2) + Math.abs(y1 - y2)) * 100 - 20 * maxDepth + 5 * maxDepth * Math.PI));
		}

		boolean y1_s_y2;
		int depth = 0;
		int[] x, y;
		int xyLength;
		int maxDepth = 0;

		void maxDfs(int i) {
			if (i == xyLength - 1) {
				maxDepth = Math.max(depth, maxDepth);
				return;
			}
			depth++;
			int originalY = y[i];
			while (xyLength - 1 - ++i + depth > maxDepth) {
				if ((y1_s_y2 && (originalY <= y[i])) || ((!y1_s_y2) && (originalY >= y[i]))) {
					maxDfs(i);
				}
			}
			depth--;
		}

		public void solveD(InputReader in, PrintWriter out) {

		}

		public void solveE(InputReader in, PrintWriter out) {

		}

		public void solveF(InputReader in, PrintWriter out) {

		}
	}

	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public double nextFloat() {
			return Double.parseDouble(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

	}
}
