import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arrA = new int[m];
		int[] arrB = new int[m];
		for (int i = 0; i < m; i++) {
			arrA[i] = sc.nextInt() - 1;
			arrB[i] = sc.nextInt() - 1;
		}
		UnionFindTree uft = new UnionFindTree(n);
		long[] ans = new long[m];
		ans[m - 1] = (long)n * (long)(n - 1) / 2L;
		for (int i = m - 1; i >= 1; i--) {
			if (uft.same(arrA[i], arrB[i])) {
				ans[i - 1] = ans[i];
			} else {
				ans[i - 1] = ans[i] - uft.getCount(arrA[i]) * uft.getCount(arrB[i]);
				uft.unite(arrA[i], arrB[i]);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (long x : ans) {
			sb.append(x).append("\n");
		}
		System.out.print(sb);
	}
	
	static class UnionFindTree {
		int[] parents;
		int[] counts;
		public UnionFindTree(int size) {
			parents = new int[size];
			counts = new int[size];
			for (int i = 0; i < size; i++) {
				parents[i] = i;
				counts[i] = 1;
			}
		}
		
		public int find(int x) {
			if (x == parents[x]) {
				return x;
			}
			int ans = find(parents[x]);
			parents[x] = ans;
			return ans;
		}
		
		public boolean same(int x, int y) {
			return find(x) == find(y);
		}
		
		public long getCount(int x) {
			return counts[find(x)];
		}
		
		public void unite(int x, int y) {
			if (same(x, y)) {
				return;
			}
			int xx = find(x);
			int yy = find(y);
			parents[xx] = yy;
			counts[yy] += counts[xx];
		}
	}
}
