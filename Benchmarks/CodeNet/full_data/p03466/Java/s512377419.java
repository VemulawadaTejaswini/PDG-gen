import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		FastScanner in = new FastScanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		ProblemD solver = new ProblemD();
		solver.solve(1, in, out);
		out.close();
	}

	static class ProblemD {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int numQueries = in.nextInt();
			for (int queryId = 0; queryId < numQueries; queryId++) {
				int a = in.nextInt();
				int b = in.nextInt();
				int c = in.nextInt() - 1;
				int d = in.nextInt() - 1;
				if (a > 1000 || b > 1000) {
					throw new AssertionError();
				}
				int bestPartsA = -1;
				int bestPartsB = -1;
				int bestLenA = -1;
				int bestLenB = -1;
				int bestFirst = -1;
				for (int partsA = 1; partsA <= a; partsA++) {
					for (int partsB = partsA - 1; partsB <= partsA + 1; partsB++) {
						if (partsB < 1 || partsB > b) {
							continue;
						}
						int lenA = (a + partsA - 1) / partsA;
						int lenB = (b + partsB - 1) / partsB;
						int len = Math.max(lenA, lenB);
						int bestLen = Math.max(bestLenA, bestLenB);
						int first = partsA >= partsB ? 0 : 1;
						if (bestLen < 0 || bestLen > len ||
								bestLen == len && construct(a, b, bestPartsA, bestPartsB, bestFirst).compareTo(
										construct(a, b, partsA, partsB, first)
								) > 0) {
							bestPartsA = partsA;
							bestPartsB = partsB;
							bestLenA = lenA;
							bestLenB = lenB;
							bestFirst = first;
						}
					}
				}

				String ans = construct(a, b, bestPartsA, bestPartsB, bestFirst);
				out.println(ans.substring(c, d + 1));
			}
		}

		private String construct(int a, int b, int partsA, int partsB, int first) {
			char[] res = new char[a + b];
			int[] pa = new int[partsA];
			Arrays.fill(pa, a / pa.length);
			for (int i = 0; i < a % pa.length; i++) {
				++pa[i];
			}
			int[] pb = new int[partsB];
			Arrays.fill(pb, b / pb.length);
			for (int i = 0; i < b % pb.length; i++) {
				++pb[pb.length - i - 1];
			}
			int ia = 0;
			int ib = 0;
			int cur = first;
			for (int i = 0; i < a + b; i++) {
				if (cur == 0) {
					res[i] = 'A';
					--pa[ia];
					if (pa[ia] == 0) {
						++ia;
						cur ^= 1;
					}
				} else {
					res[i] = 'B';
					--pb[ib];
					if (pb[ib] == 0) {
						++ib;
						cur ^= 1;
					}
				}
			}
			return new String(res);
		}

	}

	static class FastScanner {
		private BufferedReader in;
		private StringTokenizer st;

		public FastScanner(InputStream stream) {
			in = new BufferedReader(new InputStreamReader(stream));
		}

		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					String rl = in.readLine();
					if (rl == null) {
						return null;
					}
					st = new StringTokenizer(rl);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

	}
}

