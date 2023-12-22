import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int l = sc.nextInt();
		UnionFindTree road = new UnionFindTree(n);
		for (int i = 0; i < k; i++) {
			road.union(sc.nextInt() - 1, sc.nextInt() - 1);
		}
		UnionFindTree train = new UnionFindTree(n);
		for (int i = 0; i < l; i++) {
			train.union(sc.nextInt() - 1, sc.nextInt() - 1);
		}
		HashMap<Pair, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			Pair p = new Pair(road.find(i), train.find(i));
			if (map.containsKey(p)) {
				map.put(p, map.get(p) + 1);
			} else {
				map.put(p, 1);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				sb.append(" ");
			}
			Pair p = new Pair(road.find(i), train.find(i));
			sb.append(map.get(p));
		}
		System.out.println(sb);
	}
	
	static class Pair {
		int x;
		int y;
		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public int hashCode() {
			return x + y;
		}
		
		public boolean equals(Object o) {
			Pair p = (Pair) o;
			return p.x == x && p.y == y;
		}
	}
	
	static class UnionFindTree {
		int[] parent;
		
		public UnionFindTree(int size) {
			parent = new int[size];
			for (int i = 0; i < size; i++) {
				parent[i] = i;
			}
		}
		
		public int find(int x) {
			if (parent[x] == x) {
				return x;
			} else {
				int v = find(parent[x]);
				parent[x] = v;
				return v;
			}
		}
		
		public boolean same(int x, int y) {
			return find(x) == find(y);
		}
		
		public void union(int x, int y) {
			int rootX = find(x);
			int rootY = find(y);
			parent[rootX] = rootY;
		}
	}
}
