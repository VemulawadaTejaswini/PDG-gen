import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int[] abcde = new int[5];
		for (int i = 0; i < 5; i++) {
			abcde[i] = sc.nextInt();
		}

		Permutation np = new Permutation(5);
		int min = Integer.MAX_VALUE;
		for (List<Integer> perm : np) {
			int tmp = 0;
			for (int i = 0; i < 4; i++) {
				tmp += (abcde[perm.get(i)] + 9) / 10 * 10;
			}
			
			tmp += abcde[perm.get(4)];
			min = Math.min(min, tmp);
		}

		pr.println(min);
	}

	private static class Permutation implements Iterable<List<Integer>>{
		int n;
		long nn;

		Permutation(int n) {
			this.n = n;

			nn = 1;
			for (int i = 2; i <= n; i++) {
				nn *= i;
			}
		}

		@Override
		public Iterator<List<Integer>> iterator() {
			return new PermutationIterator();
		}

		private class PermutationIterator implements Iterator<List<Integer>> {
			boolean[] used;
			List<Integer> perm;
			Deque<Integer> ist;
			long cnt = 0;

			PermutationIterator() {
				used = new boolean[n];
				perm = new ArrayList<Integer>(n);
				ist = new ArrayDeque<Integer>();
				ist.add(-1);
			}

			@Override
			public boolean hasNext() {
				return cnt < nn;
			}

			@Override
			public List<Integer> next() {
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
							cnt++;
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

	static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
	}
}
