
import java.util.*;


public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class Pair{
		int a;
		int b;
		Pair(int a,int b){
			this.a=a;
			this.b=b;
		}
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		ArrayList<Pair> pl = new ArrayList<Pair>();
		for(int i=0; i<m; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			a--;
			b--;
			pl.add(new Pair(a,b));
		}

		UnionFind uf = new UnionFind(n);

		ArrayList<Long> ans = new ArrayList<Long>();
		long pre = (long)n*(long)(n-1)/(long)2;

		for(int i=m-1; i>=0; i--) {
			ans.add(pre);
			Pair p = pl.get(i);
			int as = uf.size(p.a);
			int bs = uf.size(p.b);
			pre = Math.max(0, pre-(long)as*(long)bs);
			uf.unite(p.a, p.b);
		}
		for(int i=ans.size()-1; i>=0; i--) {
			System.out.println(ans.get(i));
		}
		sc.close();
	}

	class UnionFind {

		int r[];
		int size[];
		int rank[];
		UnionFind(int n){
			r = new int[n];
			size = new int[n];
			rank = new int[n];
			for(int i=0; i<n; i++) {
				r[i]=i;
				size[i]=1;
				rank[i]=0;
			}
		}

		public void link(int x, int y) {

			if(rank[x]<rank[y]) {
				r[x]=y;
				size[y] += size[x];
			}else {
				r[y]=x;
				size[x] += size[y];
				if(rank[x]==rank[y]) {
					rank[x]++;
				}
			}
		}

		public void unite(int x, int y) {
			link(find(x), find(y));
		}

		public int size(int x) {
			return size[find(x)];
		}

		public int find(int x) {
			int res = x;
			if(r[x] != x) {
				res = find(r[x]);
			}
			return res;
		}
	}
}
