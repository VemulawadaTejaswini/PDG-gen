import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		UnionFindTree uft = new UnionFindTree(n);
		for (int i = 0; i < m; i++) {
			uft.union(sc.nextInt() - 1, sc.nextInt() - 1);
			int z = sc.nextInt();
		}
		HashSet<Integer> set = new HashSet<>();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (!uft.isExist(i)) {
				count++;
				continue;
			}
			boolean flag = false;
			for (int x : set) {
				if (uft.same(i, x)) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				set.add(i);
			}
		}
		System.out.println(set.size() + count);
	}
	
	static class UnionFindTree {
		int[] parents;
		int[] exists;
		
		public UnionFindTree(int size) {
			parents = new int[size];
			exists = new int[size];
			for (int i = 0; i < size; i++) {
				parents[i] = i;
			}
		}
		
		public boolean isExist(int x) {
			return exists[x] != 0;
		}
		
		public int find(int x) {
			if (parents[x] == x) {
				return x;
			}
			int y = find(parents[x]);
			parents[x] = y;
			return y;
		}
		
		public boolean same(int x, int y) {
			return find(x) == find(y);
		}
		
		public void union(int x, int y) {
			exists[x]++;
			exists[y]++;
			if (same(x, y)) {
				return;
			}
			parents[find(x)] = find(y);
		}
	}
}
