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
		road.makeMap();
		train.makeMap();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				sb.append(" ");
			}
			HashSet<Integer> roadSet = road.getSet(i);
			HashSet<Integer> trainSet = train.getSet(i);
			int count = 0;
			if (roadSet.size() < trainSet.size()) {
				for (Integer x : roadSet) {
					if (trainSet.contains(x)) {
						count++;
					}
				}
			} else {
				for (Integer x : trainSet) {
					if (roadSet.contains(x)) {
						count++;
					}
				}
			}
			sb.append(count);
		}
		System.out.println(sb);
	}
	
	static class UnionFindTree {
		int[] parent;
		HashMap<Integer, HashSet<Integer>> map;
		
		public UnionFindTree(int size) {
			parent = new int[size];
			for (int i = 0; i < size; i++) {
				parent[i] = i;
			}
			map = new HashMap<Integer, HashSet<Integer>>();
		}
		
		public void makeMap() {
			for (int i = 0; i < parent.length; i++) {
				find(i);
				HashSet<Integer> set = map.get(parent[i]);
				if (set == null) {
					set = new HashSet<Integer>();
				}
				set.add(i);
				map.put(parent[i], set);
			}
		}
		
		public HashSet<Integer> getSet(int x) {
			return map.get(find(x));
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
