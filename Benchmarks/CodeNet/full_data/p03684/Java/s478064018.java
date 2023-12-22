import java.util.*;

public class Main {
	int INF = 1 << 29;
	
	class C implements Comparable<C>{
		int x , y;
		int ind;

		public C(int x, int y, int ind) {
			super();
			this.x = x;
			this.y = y;
			this.ind = ind;
		}

		@Override
		public int compareTo(C o) {
			if(this.x < o.x) return -1;
			if(this.x > o.x) return 1;
			return 0;
		}

		@Override
		public String toString() {
			return "C [x=" + x + ", y=" + y + ", ind=" + ind + "]";
		}
		
	}
	class D implements Comparable<D>{
		int x , y, ind;

		public D(int x, int y, int ind) {
			super();
			this.x = x;
			this.y = y;
			this.ind = ind;
		}

		@Override
		public int compareTo(D o) {
			if(this.y < o.y) return -1;
			if(this.y > o.y) return 1;
			return 0;
		}

		@Override
		public String toString() {
			return "D [x=" + x + ", y=" + y + ", ind=" + ind + "]";
		}
		
		
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int [][] data = new int[n][2];
			C [] data1 = new C[n];
			D [] data2 = new D[n];
			for(int i = 0; i < n; i++){
				data[i][0] = sc.nextInt();
				data[i][1] = sc.nextInt();
				data1[i] = new C(data[i][0], data[i][1], i);
				data2[i] = new D(data[i][0], data[i][1], i);
			}
			Arrays.sort(data1);
			Arrays.sort(data2);
			
			ArrayList<Edge> list = new ArrayList<>();
			
			C prev = data1[0];
			for(int i = 1; i < data1.length; i++){
				
				int cost = Math.min(Math.abs(prev.x - data1[i].x), Math.abs(prev.y - data1[i].y));
				list.add(new Edge(prev.ind, data1[i].ind, cost));
				list.add(new Edge(data1[i].ind, prev.ind, cost));
				
				prev = data1[i];
			}
			
			
			D prevD = data2[0];
			for(int i = 1; i < data2.length; i++){
				
				int cost = Math.min(Math.abs(prevD.x - data2[i].x), Math.abs(prevD.y - data2[i].y));
				list.add(new Edge(prevD.ind, data2[i].ind, cost));
				list.add(new Edge(data2[i].ind, prevD.ind, cost));
				
				prevD = data2[i];
			}
			
			int res = kruskal(list, n);
			System.out.println(res);
		}
	}
	
	private int kruskal(ArrayList<Edge> edgelist, int nodesize) {
		int m = edgelist.size();
		Collections.sort(edgelist);
		UnionFind uf = new UnionFind(nodesize);
		int res = 0;
		for(int i = 0 ; i < m; i++){
			Edge e = edgelist.get(i);
			if(! uf.same(e.from, e.to)){
				uf.unite(e.from, e.to);
				res += e.cost;
			}
		}
		return res;
	}
	
	class UnionFind{
		int [] par, rank;
		int num;
		public UnionFind(int n) {
			par = new int[n];
			rank = new int[n];
			for(int i = 0 ; i < n; i++){
				par[i] = i;
				//rank[i] = 0;
			}
			num = n;
		}
		int find(int x){
			if(par[x] == x)return x;
			else return par[x] = find(par[x]);
		}
		void unite(int x, int y){
			x = find(x);
			y = find(y);
			if(x == y) return ;
			if(rank[x] < rank[y]) par[x] = y;
			else{
				par[y] = x;
				if(rank[x] == rank[y]) rank[x]++;
			}
			num--;
		}
		boolean same(int x, int y){
			return find(x) == find(y);
		}
	}
	
	class Edge implements Comparable<Edge>{
		int from,to, cost;
		public Edge(int from, int to, int cost) {
			this.from = from; this.to = to; this.cost = cost;
		}
		public int compareTo(Edge o) {
			if(this.cost < o.cost)return -1;
			if(this.cost > o.cost)return 1;
			return 0;
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
