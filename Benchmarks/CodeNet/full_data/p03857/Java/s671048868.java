import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int L = sc.nextInt();
		DJSet ds1 = new DJSet(N);
		DJSet ds2 = new DJSet(N);
		for (int i = 0; i < K; ++i) {
			int p = sc.nextInt() - 1;
			int q = sc.nextInt() - 1;
			ds1.setUnion(p, q);
		}
		for (int i = 0; i < L; ++i) {
			int r = sc.nextInt() - 1;
			int s = sc.nextInt() - 1;
			ds2.setUnion(r, s);
		}
		HashMap<List<Integer>, Integer> count = new HashMap<>();
		for (int i = 0; i < N; ++i) {
			int v1 = ds1.root(i);
			int v2 = ds2.root(i);
			List<Integer> pair = Arrays.asList(v1, v2);
			if (count.containsKey(pair)) {
				count.put(pair, count.get(pair) + 1);
			} else {
				count.put(pair, 1);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; ++i) {
			int v1 = ds1.root(i);
			int v2 = ds2.root(i);
			sb.append(count.get(Arrays.asList(v1, v2)));
			if (i + 1 < N)
				sb.append(" ");
			else
				sb.append("\n");
		}
		System.out.println(sb.toString());

	}

	static class DJSet {
		int n;
		int[] upper;

		public DJSet(int n) {
			this.n = n;
			upper = new int[n];
			Arrays.fill(upper, -1);
		}

		boolean equiv(int x, int y) {
			return root(x) == root(y);
		}

		int root(int x) {
			return (upper[x] < 0 ? x : root(upper[x]));
		}

		boolean setUnion(int x, int y) {
			x = root(x);
			y = root(y);
			if (x != y) {
				if (upper[x] > upper[y]) {
					int d = x;
					x = y;
					y = d;
				}

				upper[x] += upper[y];
				upper[y] = x;

			}
			return x != y;
		}
	}
}
