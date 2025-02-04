import java.util.*;

public class Main {
	static ArrayList<Path>[] graph;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		graph = new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {
			graph[i] = new ArrayList<Path>();
		}
		UnionFindTree uft = new UnionFindTree(n);
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			graph[a].add(new Path(b, c));
			graph[b].add(new Path( a, -c));
			uft.unite(a, b);
		}
		HashSet<Integer> set = new HashSet<>();
		for (int i = 1; i <= n; i++) {
			int x = uft.find(i);
			if (set.contains(x)) {
				continue;
			}
			set.add(x);
			int[] arr = new int[n + 1];
			Arrays.fill(arr, Integer.MIN_VALUE);
			if (!check(arr, new Path(i, 0), 0)) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
	
	static boolean check(int[] arr, Path p, int value) {
		if (arr[p.to] != Integer.MIN_VALUE) {
			return (arr[p.to] == p.value + value);
		}
		arr[p.to] = p.value + value;
		for (Path x : graph[p.to]) {
			if (!check(arr, x, arr[p.to])) {
				return false;
			}
		}
		return true;
	}
	
	static class Path {
		int to;
		int value;
		public Path(int to, int value) {
			this.to = to;
			this.value = value;
		}
	}
	
	static class UnionFindTree {
		int[] parents;
		
		public UnionFindTree(int size) {
			parents = new int[size + 1];
			for (int i = 0; i <= size; i++) {
				parents[i] = i;
			}
		}
		
		public int find(int x) {
			if (parents[x] == x) {
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
