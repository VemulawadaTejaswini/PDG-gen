import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long N = n;
		int m = sc.nextInt();
		UnionFind uf = new UnionFind(n);
		int[][] ab = new int[2][m];
		for (int i = 0; i < m; i++) {
			ab[0][i] = Integer.parseInt(sc.next())-1;
			ab[1][i] = Integer.parseInt(sc.next())-1;
		}
		StringBuilder sb = new StringBuilder();
		long[] answer = new long[m];
		long ans = N*(N-1)/2;
		//sb.insert(0,"\n");
		//sb.insert(0, ans);
		answer[m-1] = ans;
		for (int i = m-1; i >= 1; i--) {
			if(!uf.same(ab[0][i], ab[1][i])) {
				ans -= (long)uf.amount(ab[0][i])*(long)uf.amount(ab[1][i]);
			}
			uf.unite(ab[0][i], ab[1][i]);
			//sb.insert(0,"\n");
			//sb.insert(0, ans);
			answer[i-1] = ans;
		}
		for (int i = 0; i < m; i++) {
			sb.append(answer[i]);
			sb.append("\n");
		}
		System.out.println(new String(sb));
		sc.close();
	}
	public static class UnionFind {

		int par[]; int rank[]; int size[]; int count;

		public UnionFind(int n) {
			this.par = new int[n];
			this.rank = new int[n];
			this.size = new int[n];
			this.count = n;
			for(int i = 0; i < n; i++) {
				par[i] = i; rank[i] = 0; size[i] = 1;
			}
		}

		int find(int x) {//xの属する集合の根を探す
			if(par[x] == x) return x;
			else return par[x] = find(par[x]);
		}

		void unite(int x, int y) {//x,yの集合を合併
			x = find(x);
			y = find(y);
			if(x == y) return ;
			if(rank[x] < rank[y]) {
				par[x] = y;
				size[y] += size[x];
			}else {
				par[y] = x;
				size[x] += size[y];
				if(rank[x] == rank[y]) {
					rank[x]++;
				}
			}
			count--;
		}

		boolean same(int x, int y) {//x,yが同じ集合に属するか
			return find(x) == find(y);
		}

		int amount(int x) {//xの属する集合の要素数
			return size[par[x]];
		}

		int count() {//集合の数
			return count;
		}
	}
}