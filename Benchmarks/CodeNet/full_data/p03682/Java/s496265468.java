import java.util.*;
import java.io.*;

//クラスカル法

class Edge{
	int u, v, cost;
	public Edge(int u, int v, int cost) {
		this.u = u;
		this.v = v;
		this.cost = cost;
	}	
}

class Node{
	int id, x, y;

	public Node(int id, int x, int y) {
		this.id = id;
		this.x = x;
		this.y = y;
	}
	
}

public class Main {

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int n = fs.nextInt();
		List<Node> nodes = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int x = fs.nextInt(), y = fs.nextInt();
			Node node = new Node(i,x,y);
			nodes.add(node);
		}
		List<Edge> es = new ArrayList<>();
		Collections.sort(nodes,(n1,n2)->n1.x - n2.x);
		for(int i=0;i<n-1;i++) {
			Node n1 = nodes.get(i), n2 = nodes.get(i+1);
			Edge e = new Edge(n1.id,n2.id,n2.x - n1.x);
			es.add(e);
		}
		Collections.sort(nodes,(n1,n2)->n1.y - n2.y);
		for(int i=0;i<n-1;i++) {
			Node n1 = nodes.get(i), n2 = nodes.get(i+1);
			Edge e = new Edge(n1.id,n2.id,n2.y - n1.y);
			es.add(e);
		}
		Collections.sort(es,(e1,e2)->e1.cost - e2.cost);
		long ans = 0;
		UnionFind uf = new UnionFind(nodes.size());
		for(Edge e : es) {
			if(!uf.same(e.u,e.v)) {
				ans += e.cost;
				uf.unite(e.u, e.v);
			}
		}
		System.out.println(ans);
	}
}

class UnionFind{
	//親の番号を格納する配列
	//自分が根のときは、-(自身の木のサイズ)を格納して置くと、結合時に小さい方を大きい方に繋ぐことができる。
	private int[] parent;
	
	//constructor
	//親の初期値を存在しない-1とすることで全てバラバラになる。
	UnionFind(int N){
		parent = new int[N];
		Arrays.fill(parent, -1);
	}
	
	//xの属する木の根を返す
	int root(int x) {
		if(parent[x]<0)return x;
		return parent[x]=root(parent[x]);//"point"：parent[x]を根に更新した上で、返す
	}
	
	//属する木の頂点数を調べる。parent[]における根の要素が-(超点数)になっている。
	int size(int x) {
		return - parent[root(x)];//−をかけるのを忘れない
	}
	
	//２数x,yの根を結合する
	boolean unite(int x, int y) {
		int rx = root(x);
		int ry = root(y);
		if(rx == ry) return false;
		//属する木が大きい方をxにする。
		if(size(rx)<size(ry)) {
			int tmp = rx;
			rx = ry;
			ry = tmp;
		}
		//yの根をxの根にする
		parent[rx] += parent[ry]; 
		parent[ry] = rx;
		return true;
	}
	
	//２数x,yが同一木に属するならtrue
	boolean same(int x, int y) {
		return root(x)==root(y);
	}
	
}


//高速なScanner
class FastScanner {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScanner(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}