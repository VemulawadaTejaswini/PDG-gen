import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int l = sc.nextInt();
		UnionFindTree roadTree = new UnionFindTree(n);
		for (int i = 0; i < k; i++) {
			roadTree.unite(sc.nextInt() - 1, sc.nextInt() - 1);
		}
		UnionFindTree trainTree = new UnionFindTree(n);
		for (int i = 0; i < l; i++) {
			trainTree.unite(sc.nextInt() - 1, sc.nextInt() - 1);
		}
		HashMap<Integer, HashSet<Integer>> roadMap = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int x = roadTree.find(i);
			if (roadMap.containsKey(x)) {
				roadMap.get(x).add(i);
			} else {
				HashSet<Integer> set = new HashSet<>();
				set.add(i);
				roadMap.put(x, set);
			}
		}
		HashMap<Integer, HashSet<Integer>> trainMap = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int x = trainTree.find(i);
			if (trainMap.containsKey(x)) {
				trainMap.get(x).add(i);
			} else {
				HashSet<Integer> set = new HashSet<>();
				set.add(i);
				trainMap.put(x, set);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				sb.append(" ");
			}
			int x = roadTree.find(i);
			HashSet<Integer> roadSet = roadMap.get(x);
			int y = trainTree.find(i);
			HashSet<Integer> trainSet = trainMap.get(y);
			int same = 0;
			for (int z : roadSet) {
				if (trainSet.contains(z)) {
					same++;
				}
			}
			sb.append(same);
		}
		System.out.println(sb);
	}
	
	static class UnionFindTree {
		int[] parents;
		
		public UnionFindTree (int size) {
			parents = new int[size];
			for (int i = 0; i < size; i++) {
				parents[i] = i;
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
		
		public void unite(int x, int y) {
			int xx = find(x);
			int yy = find(y);
			if (xx == yy) {
				return;
			}
			parents[xx] = yy;
		}
	}
	
}
