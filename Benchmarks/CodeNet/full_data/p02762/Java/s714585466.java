import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

//System.out.println();
public class Main implements Runnable { //クラス名はMain4

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}

	public void run() {
		FastScannerMain4 sc = new FastScannerMain4(System.in);

		try {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int K = sc.nextInt();

			//UnionFindでGroupを作成
			UnionFindTree unionfindtreeFriends = new UnionFindTree(N);

			for (int i = 0; i < M; i++) {
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;

				unionfindtreeFriends.connected.get(a).add(b);
				unionfindtreeFriends.connected.get(b).add(a);

				if (!unionfindtreeFriends.same(a, b)) {
					unionfindtreeFriends.unite(a, b);
				}
			}

			for (int i = 0; i < K; i++) {
				int c = sc.nextInt() - 1;
				int d = sc.nextInt() - 1;

				unionfindtreeFriends.blocked.get(c).add(d);
				unionfindtreeFriends.blocked.get(d).add(c);
			}

			int anseach = 0;
			String ans = "";
			for (int i = 0; i < N; i++) {
				//友達候補から自分自身を引くので-1とする。
				anseach = unionfindtreeFriends.size(i) - 1;

				for (int j = 0; j < N; j++) {
					//Blockかつ、同じGroupの場合、-1
					if (unionfindtreeFriends.blocked.get(i).contains(j) && unionfindtreeFriends.same(i, j)) {
						anseach--;
					}
					//Friendかつ、同じGroupの場合、-1
					if (unionfindtreeFriends.connected.get(i).contains(j) && unionfindtreeFriends.same(i, j)) {
						anseach--;
					}
				}

				if (i == N - 1) {
					ans += anseach;
				} else {
					ans += anseach + " ";
				}
			}

			System.out.println(ans);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

class UnionFindTree {

	int[] parent; //インデックスにとノードを対応させ、そのルートノードのインデックスを格納
	int[] rank; //parentと同様に、木の高さを格納
	int[] size; //木の要素の数を格納。最新はparentのindexに
	int group;
	Map<Integer, Set<Integer>> connected = new HashMap<>();
	Map<Integer, Set<Integer>> blocked = new HashMap<>();

	public UnionFindTree(int n) {
		this.parent = new int[n];
		this.rank = new int[n];
		this.size = new int[n];
		group = n;

		for (int i = 0; i < n; i++) {
			makeSet(i);
			connected.put(i, new HashSet<>());
			blocked.put(i, new HashSet<>());
		}
	}

	public void makeSet(int i) {
		parent[i] = i;
		rank[i] = 0; //集合の高さ
		size[i] = 1;
	}

	public void unite(int x, int y) {
		int xRoot = find(x);
		int yRoot = find(y);
		if (xRoot == yRoot)
			return;
		group--;
		//xが属する木の方が大きい場合
		if (rank[xRoot] > rank[yRoot]) {
			parent[yRoot] = xRoot; //yの親をxに更新
			size[xRoot] += size[yRoot];

		} else if (rank[xRoot] < rank[yRoot]) {
			parent[xRoot] = yRoot;
			size[yRoot] += size[xRoot];
		} else {
			parent[yRoot] = xRoot;
			rank[xRoot]++; //同じ高さの木がルートの子として着くから大きさ++;
			size[xRoot] += size[yRoot];
		}
	}

	//引数の属する木のルートのidを返す
	public int find(int i) {
		if (i != parent[i]) {
			parent[i] = find(parent[i]);
		}
		return parent[i];
	}

	//同じ木に属しているか
	public boolean same(int x, int y) {
		return find(x) == find(y);
	}

	// via Oland https://atcoder.jp/contests/abc120/submissions/4452920
	public int size(int i) {
		return size[find(i)];
	}
}

//高速なScanner
class FastScannerMain4 {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScannerMain4(InputStream in) {
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
