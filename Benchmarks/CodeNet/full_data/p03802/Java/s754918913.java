import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
		TaskF solver = new TaskF();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskF {
		Point[] ps;

		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			// n <= 10^4, TL 5 sec.
			int n = in.nextInt();
			int[] x = new int[n];
			int[] y = new int[n];
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < n; i++) {
				x[i] = in.nextInt();
				y[i] = in.nextInt();
				min = Math.min(min, x[i]);
				min = Math.min(min, y[i]);
				max = Math.max(max, x[i]);
				max = Math.max(max, y[i]);
			}
			ps = new Point[2 * n];
			for (int i = 0; i < n; i++) {
				ps[2 * i] = new Point(x[i], i, true);
				ps[2 * i + 1] = new Point(y[i], i, false);
			}
			Arrays.sort(ps);
			int l = 0;
			int r = max - min + 1;
			while (r - l > 1) {
				int m = l + (r - l) / 2;
				if (can(n, x, y, m)) {
					l = m;
				} else {
					r = m;
				}
			}
			out.println(l);
		}

		private boolean can(int n, int[] x, int[] y, int d) {
			List<Clause> clauses = new ArrayList<>();
			for (int i = 0; i < ps.length; i++) {
				int j = i;
				while (j < ps.length && ps[j].x - ps[i].x < d) {
					++j;
				}
				for (int k = i + 1; k < j; k++) {
					clauses.add(new Clause(ps[i].id, ps[k].id, ps[i].f, !ps[k].f));
					clauses.add(new Clause(ps[k].id, ps[i].id, ps[k].f, !ps[i].f));
				}
			}
			return new SAT2Solver(n).solve(clauses);
		}

		class Point implements Comparable<Point> {
			int x;
			int id;
			boolean f;

			Point(int x, int id, boolean f) {
				this.x = x;
				this.id = id;
				this.f = f;
			}

			public int compareTo(Point o) {
				return x - o.x;
			}

		}

		class Clause {
			int v1;
			int v2;
			boolean neg1;
			boolean neg2;

			Clause(int v1, int v2, boolean pos1, boolean pos2) {
				this.v1 = v1;
				this.v2 = v2;
				this.neg1 = !pos1;
				this.neg2 = !pos2;
			}

		}

		class SAT2Solver {
			List<Integer>[] g;
			boolean[] isTrue;
			int n;
			int numComps;
			int[] low;
			int[] vis;
			int[] comp;
			boolean[] onStack;
			int[] stack;
			int sp;
			int globalTime;

			SAT2Solver(int n) {
				this.n = n;
				isTrue = new boolean[2 * n];
				vis = new int[2 * n];
				low = new int[2 * n];
				stack = new int[2 * n];
				comp = new int[2 * n];
				onStack = new boolean[2 * n];
				g = new List[2 * n];
			}

			public boolean solve(List<Clause> clauses) {
				for (int i = 0; i < 2 * n; i++) {
					g[i] = new ArrayList<Integer>();
				}
				for (Clause clause : clauses) {
					int v1 = clause.v1;
					int v2 = clause.v2;
					if (clause.neg1) {
						v1 = negate(v1);
					}
					if (clause.neg2) {
						v2 = negate(v2);
					}
					//g[negate(v1)].add(v2);
					//g[negate(v2)].add(v1);
					g[v1].add(v2);
				}
				Arrays.fill(vis, -1);
				Arrays.fill(onStack, false);
				sp = 0;
				globalTime = 0;
				numComps = 0;
				for (int i = 0; i < 2 * n; i++) {
					if (vis[i] < 0) {
						dfsTarjan(i);
					}
				}
				int[] firstInComp = new int[numComps];
				Arrays.fill(firstInComp, -1);
				int[] nextSameComp = new int[2 * n];
				for (int i = 0; i < 2 * n; i++) {
					int c = comp[i];
					nextSameComp[i] = firstInComp[c];
					firstInComp[c] = i;
				}
				List<Integer>[] invertedCompEdges = new List[numComps];
				for (int i = 0; i < numComps; i++) {
					invertedCompEdges[i] = new ArrayList<Integer>();
				}
				for (int i = 0; i < 2 * n; i++) {
					for (int j : g[i]) {
						invertedCompEdges[comp[j]].add(comp[i]);
					}
				}
				boolean[] compIsTrue = new boolean[numComps];
				Arrays.fill(compIsTrue, true);
				for (int c = 0; c < numComps; c++) {
					if (!compIsTrue[c]) {
						continue;
					}
					for (int i = firstInComp[c]; i >= 0; i = nextSameComp[i]) {
						int nc = comp[negate(i)];
						if (c == nc) {
							return false;
						}
					}
					for (int i = firstInComp[c]; i >= 0; i = nextSameComp[i]) {
						int nc = comp[negate(i)];
						dfsReject(nc, invertedCompEdges, compIsTrue);
					}
				}
				for (int i = 0; i < 2 * n; i++) {
					isTrue[i] = compIsTrue[comp[i]];
				}
				for (int i = 0; i < n; i++) {
					if (isTrue[i] && isTrue[negate(i)]) {
						throw new AssertionError();
					}
					if (!isTrue[i] && !isTrue[negate(i)]) {
						return false;
					}
				}
				return true;
			}

			private int negate(int i) {
				return i + (i < n ? n : -n);
			}

			private void dfsReject(int c, List<Integer>[] invertedCompEdges, boolean[] compIsTrue) {
				if (!compIsTrue[c]) {
					return;
				}
				compIsTrue[c] = false;
				for (int p : invertedCompEdges[c]) {
					dfsReject(p, invertedCompEdges, compIsTrue);
				}
			}

			void dfsTarjan(int v) {
				vis[v] = globalTime;
				low[v] = globalTime;
				++globalTime;
				stack[sp++] = v;
				onStack[v] = true;
				for (int u : g[v]) {
					if (vis[u] < 0) {
						dfsTarjan(u);
						if (low[v] > low[u]) {
							low[v] = low[u];
						}
					} else if (onStack[u] && low[v] > vis[u]) {
						low[v] = vis[u];
					}
				}
				if (low[v] == vis[v]) {
					while (true) {
						int u = stack[--sp];
						onStack[u] = false;
						comp[u] = numComps;
						if (u == v) {
							break;
						}
					}
					++numComps;
				}
			}

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

