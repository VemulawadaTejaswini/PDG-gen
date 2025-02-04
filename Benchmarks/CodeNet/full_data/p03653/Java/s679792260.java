import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Comparator;
import java.io.InputStreamReader;
import java.util.TreeSet;
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
		TaskC solver = new TaskC();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskC {
		long sum;

		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int x = in.nextInt();
			int y = in.nextInt();
			int z = in.nextInt();
			int n = x + y + z;
			int[] a = new int[n];
			int[] b = new int[n];
			int[] c = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
				b[i] = in.nextInt();
				c[i] = in.nextInt();
			}

			TreeSet<Integer> ab = new TreeSet<>(diffComparator(a, b));
			TreeSet<Integer> ac = new TreeSet<>(diffComparator(a, c));
			TreeSet<Integer> ba = new TreeSet<>(diffComparator(b, a));
			TreeSet<Integer> bc = new TreeSet<>(diffComparator(b, c));
			TreeSet<Integer> ca = new TreeSet<>(diffComparator(c, a));
			TreeSet<Integer> cb = new TreeSet<>(diffComparator(c, b));

			sum = 0;
			for (int i = 0; i < n; i++) {
				if (i < x) {
					sum += a[i];
					ab.add(i);
					ac.add(i);
				} else if (i < x + y) {
					sum += b[i];
					ba.add(i);
					bc.add(i);
				} else {
					sum += c[i];
					ca.add(i);
					cb.add(i);
				}
			}

			while (true) {
				if (move(ab, ba, ac, bc, a, b)) continue;
				if (move(ba, ab, bc, ac, b, a)) continue;

				if (move(ac, ca, ab, cb, a, c)) continue;
				if (move(ca, ac, cb, ab, c, a)) continue;

				if (move(bc, cb, ba, ca, b, c)) continue;
				if (move(cb, bc, ca, ba, c, b)) continue;

				break;
			}

			out.println(sum);
		}

		private Comparator<Integer> diffComparator(int[] a, int[] b) {
			return (i, j) -> {
				int u = a[i] - b[i];
				int v = a[j] - b[j];
				if (u != v) {
					return u > v ? -1 : 1;
				}
				if (!i.equals(j)) {
					return i < j ? -1 : 1;
				}
				return 0;
			};
		}

		private boolean move(TreeSet<Integer> ab, TreeSet<Integer> ba, TreeSet<Integer> ac, TreeSet<Integer> bc, int[] a, int[] b) {
			int i = ab.last();
			int j = ba.last();
			// long add = -(a[i]-b[i]) -(b[j]-a[j]);
			long add = (long) -a[i] + b[i] - b[j] + a[j];
			if (add > 0) {
				ab.remove(i);
				ac.remove(i);
				ab.add(j);
				ac.add(j);
				ba.add(i);
				bc.add(i);
				ba.remove(j);
				bc.remove(j);
				sum += add;
				return true;
			}
			return false;
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
					st = new StringTokenizer(in.readLine());
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

