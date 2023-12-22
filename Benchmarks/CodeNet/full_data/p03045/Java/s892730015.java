import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		UnionFindTree uft=new UnionFindTree(N);
		for(int i=0; i<M; i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			int z=sc.nextInt();
			if(uft.same(x, y)) {
				//同じ群に属してたら何もしない
			}
			else {
				uft.union(x, y);
			}
		}
		int num=0;
		boolean[] use=new boolean[N+1];
		for(int i=1; i<=N; i++) {
			use[uft.parent[i]]=true;
		}
		for(int i=1; i<=N; i++) {
			if(use[i]) {
				num++;
			}
		}
		pl(num);
	}
	static class SC {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public SC(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}
		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
			return tokenizer.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		}
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
	public static class UnionFindTree {
		int nodeNum;	//頂点数
		int [] parent;	//親の頂点の値
		int [] height;	//高さ（祖先からの距離）
		int [] treeSize;	//共通祖先を持つ頂点集合の数（クラスタ内の頂点の数）

		public UnionFindTree(int nodeNum) {
			this.nodeNum = nodeNum;
			parent = new int[nodeNum+1];
			height = new int[nodeNum+1];
			treeSize = new int[nodeNum+1];
			for (int i = 1; i <= nodeNum; i++) {
				parent[i] = i;
				height[i] = 0;
				treeSize[i] = 1;
			}
		}
		int find(int x) {
			if (parent[x] == x) {
				return x;
			} else {
				return parent[x] = find(parent[x]);
			}
		}
		void union(int x, int y) {
			int rootX = find(x);
			int rootY = find(y);
			if (rootX == rootY) {
				return;
			}
			if (height[rootX] < height[rootY]) {
				parent[rootX] = rootY;
				treeSize[rootY] += treeSize[rootX];
			} else {
				if (height[rootX] == height[rootY]) {
					height[rootX]++;
				}
				parent[rootY] = rootX;
				treeSize[rootX] += treeSize[rootY];
			}
		}
		int size(int vertex) {
			return treeSize[vertex];
		}
		boolean same(int x, int y){
			return find(x) == find(y);
		}
	}
}