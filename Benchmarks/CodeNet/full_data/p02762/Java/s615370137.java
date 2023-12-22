import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();
		UnionFind uf = new UnionFind(n);
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<m; i++){
			int a = in.nextInt();
			Integer ai = map.get(a);
			int b = in.nextInt();
			Integer bi = map.get(b);
			map.put(a, ai == null ? 1 : ai + 1);
			map.put(b, bi == null ? 1 : bi + 1);
			uf.unite(a, b);
		}
		for(int i=0; i<k; i++){
			int c = in.nextInt();
			Integer ci = map.get(c);
			int d = in.nextInt();
			Integer di = map.get(d);
			if(uf.same(c, d)) {
				map.put(c, ci == null ? 1 : ci + 1);
				map.put(d, di == null ? 1 : di + 1);
			}
		}

		for(int i=1; i<=n; i++){
			Integer j = map.get(i);
			if (j == null) j = 0;
			System.out.print(uf.size(i) - j -1 +" ");
		}
	}
}

class UnionFind {
	int[] parents;
	int[] size;

	public UnionFind(int n) {
		this.parents = new int[n + 1];
		this.size = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			parents[i] = i;
		}
		Arrays.fill(size, 1);
	}

	public void unite(int x, int y) {
		int rx = find(x);
		int ry = find(y);
		if (rx == ry) {
			return;
		}
		if (size[rx] < size[ry]) {
			size[ry] += size[rx];
			parents[rx] = ry;
		} else {
			size[rx] += size[ry];
			parents[ry] = rx;
		}
	}

	public int find(int x) {
		int root = x;
		while (root != parents[root]) {
			root = parents[root];
		}
		return root;
	}

	public int size(int x) {
		return size[find(x)];
	}

	public boolean same(int x, int y) {
		return find(x) == find(y);
	}
}

