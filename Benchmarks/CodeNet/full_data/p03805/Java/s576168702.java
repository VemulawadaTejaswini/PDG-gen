import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		boolean[][] edges = new boolean[n][n];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;

			edges[a][b] = true;
			edges[b][a] = true;
		}

		Permutation np = new Permutation(n);
		int cnt = 0;
		out:
		for (List<Integer> perm : np) {
			if (perm == null) {
				break;
			}

			if (perm.get(0) != 0) {
				continue;
			}

			for (int i = 1; i < n; i++) {
				if (!edges[perm.get(i - 1)][perm.get(i)]) {
					continue out;
				}
			}
			cnt++;
		}

		pr.println(cnt);
	}

	private static class Permutation implements Iterable<List<Integer>>{
		int n;

		boolean[] used;
		List<Integer> perm;
		Deque<Integer> ist;
		PermutationIterator it;

		Permutation(int n) {
			this.n = n;
			used = new boolean[n];
			perm = new ArrayList<Integer>();
			ist = new ArrayDeque<Integer>();
			ist.add(-1);
			it = new PermutationIterator(this);
		}

		List<Integer> next() {
			out:
			while (!ist.isEmpty()) {
				int k = ist.pop();

				if (k != -1) {
					// ループ途中での戻り
					used[k] = false;
					perm.remove(perm.size() - 1);
				} else {
					// 最初から
					int pos = perm.size();

					if (pos == n) {
						// perm に対する操作 =========================
						return perm;
						// perm に対する操作 =========================
					}
				}

				for (int i = k + 1; i < n; i++) {
					if (!used[i]) {
						ist.push(i);

						used[i] = true;
						perm.add(i);
						ist.push(-1);
						continue out;
					}
				}
			}

		return null;
		}

		@Override
		public Iterator<List<Integer>> iterator() {
			return it;
		}

		private static class PermutationIterator implements Iterator<List<Integer>> {

			Permutation p;
			PermutationIterator(Permutation p) {
				this.p = p;
			}

			@Override
			public boolean hasNext() {
				return !p.ist.isEmpty();
			}

			@Override
			public List<Integer> next() {
				return p.next();
			}

		}
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);

		solve();

		pr.close();
		sc.close();
	}

	private static class Printer extends PrintWriter {
		Printer(PrintStream out) {
			super(out);
		}
	}
}
