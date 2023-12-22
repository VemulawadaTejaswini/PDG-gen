
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class FS{
		int p[];
		int rank[];
		int cnt[];
		public FS(int n) {
			p= new int[n];
			rank=new int[n];
			cnt = new int[n];
			for(int i=0; i<n; i++) {
				makeSet(i);
			}
		}
		public void makeSet(int i) {
			p[i]=i;
			rank[i]=0;
			cnt[i]=1;
		}
		public boolean same(int x, int y) {
			return find(x) == find(y);
		}
		public int find(int x) {
			if(p[x]==x) return x;
			p[x] = find(p[x]);
			return p[x];
		}
		public boolean link(int x, int y) {
			if(x==y) return false;
			if(rank[x]>rank[y]) {
				p[y]=x;
				cnt[x] += cnt[y];
			}else {
				p[x]=y;
				cnt[y] += cnt[x];
				if(rank[x]==rank[y]) {
					rank[y]++;
				}
			}
			return true;
		}
		public boolean unite(int x, int y) {
			return link(find(x), find(y));
		}
		public int size(int x) {
			return cnt[find(x)];
		}
	}

	class Edge implements Comparable<Edge>{
		int s;
		int t;
		long c;
		Edge(int s, int t, long c){
			this.s=s;
			this.t=t;
			this.c=c;
		}
		@Override
		public int compareTo(Edge o) {
			return Long.compare(this.c, o.c);
		}
	}

	class Pair implements Comparable<Pair>{
		int p;
		int i;
		Pair(int p, int i){
			this.p=p;
			this.i=i;
		}
		@Override
		public int compareTo(Pair o) {
			if(this.p==o.p) {
				return Long.compare(this.i, o.i);
			}
			return Long.compare(this.p, o.p);
		}

	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();

		ArrayList<Pair> px = new ArrayList<Pair>();
		ArrayList<Pair> py = new ArrayList<Pair>();
		for(int i=0; i<n; i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			px.add(new Pair(x, i));
			py.add(new Pair(y, i));
		}

		Collections.sort(px);
		Collections.sort(py);

		ArrayList<Edge> es = new ArrayList<Edge>();


		for(int i=0; i<n-1; i++) {
			Pair ps = px.get(i);
			Pair pt = px.get(i+1);
			int s = ps.i;
			int t = pt.i;
			int c = Math.abs(pt.p-ps.p);
			Edge e = new Edge(s,t,c);
			es.add(e);

			ps = py.get(i);
			pt = py.get(i+1);
			s = ps.i;
			t = pt.i;
			c = Math.abs(pt.p-ps.p);
			e = new Edge(s,t,c);
			es.add(e);
		}

		Collections.sort(es);

		long ans = kruskal(es);
		System.out.println(ans);

		sc.close();
	}

	private long kruskal(ArrayList<Edge> es) {
		FS fs = new FS(es.size());
		long cnt = 0;
		for(Edge e : es) {
			if(!fs.same(e.s, e.t)) {
				fs.unite(e.s, e.t);
				cnt += e.c;
			}
		}
		return cnt;
	}
}
