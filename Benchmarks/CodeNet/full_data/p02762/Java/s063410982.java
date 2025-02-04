import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.rmi.dgc.Lease;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

import static java.util.Comparator.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		main.out.close();
	}

	// ======================================================================
	Graph F = new Graph();
	Graph B = new Graph();
	UnionFind UF;
	public void solve() {
		int N = ni();
		UF = new UnionFind(N);
		int M = ni();
		int K = ni();
		int a, b;
		for (int i = 0; i < M; i++) {
			a = ni() - 1;
			b = ni() - 1;
			F.add(a, b);
			F.add(b, a);
			UF.connect(a, b);
		}
		for (int i = 0; i < K; i++) {
			a = ni() - 1;
			b = ni() - 1;
			B.add(a, b);
			B.add(b, a);
		}
		long ans, gcnt, fcnt, bcnt;
		List<Integer> list;
		for (int i = 0; i < N; i++) {
			gcnt = UF.size(i) - 1;
			fcnt = F.get(i).size();
			list = B.get(i);
			bcnt = 0;
			if(list != null) {
				for(int bb : list) {
					if(UF.member(i).contains(bb))	bcnt++;
				}
			}
			ans = (gcnt - fcnt - bcnt);
			out.println(ans);
		}
	}
	class UnionFind {
		int gcnt; // グループ数
		int[] par; // [子番号] = 親番号(親の場合、メンバ数のマイナス値)
					// [1]=3 [2]=-1 [3]=-2  なら　１　と　３　は　同じグループ

		public UnionFind(int n) {
			gcnt = n;
			par = new int[n];
			Arrays.fill(par, -1); // 全部が親で、メンバ数を　１　とする
		}

		// 親の番号を返す（この中で親に直接つなぎ変えている）
		int root(int x) {
			if (par[x] < 0)
				return x; // 親の場合はマイナスが入っている
			else
				return par[x] = root(par[x]);
		}

		// 同じグループなら true を返す
		boolean same(int x, int y) {
			return root(x) == root(y);
		}

		// グループ数を返す
		int groupCnt() {
			return gcnt;
		}

		// メンバ数を返す
		int size(int x) {
			return -par[root(x)];
		}

		// メンバのリストを返す
		List<Integer> member(int x) {
			List<Integer> ans = new ArrayList<>();
			int root = root(x);
			for (int i = 0; i < par.length; i++) {
				if (root(i) == root) {
					ans.add(i);
				}
			}
			return ans;
		}

		// 同じ親につなげる
		void connect(int x, int y) {
			int xP = root(x); // 親を取得する
			int yP = root(y); // 親を取得する
			if (xP == yP)
				return; // 同じなので処理しない
			if (size(xP) > size(yP)) { // メンバ数が多い方にくっつける
				par[xP] += par[yP]; //   メンバ数を更新する
				par[yP] = xP; //   親番号を設定する
			} else {
				par[yP] += par[xP];
				par[xP] = yP;
			}
			gcnt--;
		}

		void dump(PrintWriter out) {
			for (int i = 0; i < par.length; i++) {
				out.println("par[" + i + "] = " + par[i]);
			}
			out.println("");
		}
	}
	// 重みなし　グラフのリンクリスト
	class Graph {
		// 頂点に紐づく頂点のリスト
		private Map<Integer, List<Integer>> data = new HashMap<Integer, List<Integer>>();

		// 頂点と頂点の繋がりを追加する
		void add(int from, int to) {
			List<Integer> list = data.get(from);
			if (list == null) {
				list = new ArrayList<Integer>();
				data.put(from, list);
			}
			list.add(to);
		}

		// 始点から終点が繋がっていれば切る
		void del(int from, int to) {
			List<Integer> list = data.get(from);
			if (list == null) {
				return;
			}
			if (list.contains(to)) {
				list.remove((Object) to);
			}
		}

		// 指定された頂点に紐づく、頂点のリストを返す
		List<Integer> get(int key) {
			return data.get(key);
		}

		// 頂点 key が登録されているか？
		boolean contains(int key) {
			return data.containsKey(key);
		}

		// 頂点のセットを返す
		Set<Integer> keySet() {
			return data.keySet();
		}

		// 頂点　key_1 と 頂点　key_2 がつながっていれば　true を返す
		boolean isConnect(int key_1, int key_2) {
			List<Integer> list = data.get(key_1);
			if (list == null)
				return false;
			else
				return list.contains(key_2);
		}

		// 指定された頂点から、すべての頂点への距離を返す（幅優先　ＢＦＳ）	→　返り値は配列
		int[] getDistV(int n, int key) { //  n : 頂点数    key : 開始頂点
			int[] dist = new int[n]; // [頂点] = 距離
			Arrays.fill(dist, -1); // 届かない場合　-1
			Deque<PP> deque = new ArrayDeque<>(); // キュー
			deque.offerLast(new PP(key, 0)); // スタートをスタックに保存
			dist[key] = 0;
			while (deque.peekFirst() != null) {
				PP wk = deque.pollFirst(); // キューから次の頂点を取得
				int no = wk.getKey();
				int dd = wk.getVal();
				//				out.println("キューから取り出し　：　<--  [" + no + "][" + dd + "]");
				List<Integer> list = get(no); // つながっている頂点のリストを取得
				if (list != null) {
					for (int next : list) {
						if (dist[next] != -1)
							continue;
						dist[next] = dd + 1; // 距離を登録
						deque.offerLast(new PP(next, dd + 1));
						//						out.println("キューに登録　：　-->  [" + next + "][" + (dd + 1) + "]");
					}
				}
			}
			return dist;
		}

		Map<Integer, Integer> mapCnt = new HashMap<>(); // 項番（何番目に訪れたか）
		Map<Integer, Integer> mapLow = new HashMap<>(); // 初期値は項番、つながっている先の項番が小さければコピーする
														// mapCnt > mapLow なら閉路に含まれる頂点
		Set<Integer> mark = new HashSet<>(); // 処理したら入れる
		int number;

		// mapCnt, mapLow を設定する
		int bridgeDfs(int now, int pre) {
			mark.add(now);
			mapCnt.put(now, number);
			mapLow.put(now, number);
			int low;
			for (int next : get(now)) {
				if (next == pre)
					continue;
				if (mark.contains(next)) {
					if (mapLow.get(now) > mapLow.get(next)) {
						mapLow.put(now, mapLow.get(next));
					}
					continue;
				}
				number++;
				low = bridgeDfs(next, now);
				if (mapLow.get(now) > low) {
					mapLow.put(now, low);
				}
			}
			return mapLow.get(now);
		}

		// -----------------------------------------
		// 橋の数を返す  先頭の頂点番号を引数とする
		// -----------------------------------------
		int bridgeCnt(int start) {
			mapCnt.clear();
			mapLow.clear();
			mark.clear();
			number = 0;
			bridgeDfs(start, start);
			int ans = 0;
			for (int key : mapCnt.keySet()) {
				if (mapCnt.get(key) == mapLow.get(key)) {
					ans++;
				}
			}
			return ans - 1;
		}

		// ダンプ
		void dump(PrintWriter out) {
			for (int key : data.keySet()) {
				out.print(key + " : ");
				for (int val : data.get(key)) {
					out.print(val + " ");
				}
				out.println("");
			}
		}
	}
	// Set に入れるなら　PPKEY　を使う！
	class PP {
		public int key, val;

		public PP(int key, int val) {
			this.key = key;
			this.val = val;
		}

		public int getKey() {
			return key;
		}

		public void setKey(int key) {
			this.key = key;
		}

		public int getVal() {
			return val;
		}

		public void setVal(int val) {
			this.val = val;
		}
	}

	// ------------------------------------------
	// ライブラリ
	// ------------------------------------------
	// Print
	private PrintWriter out = new PrintWriter(System.out);

	// Scanner
	private FastScanner scan = new FastScanner();

	int ni() {
		return scan.nextInt();
	}

	int[] ni(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = ni();
		}
		return a;
	}

	int[][] ni(int y, int x) {
		int[][] a = new int[y][x];
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				a[i][j] = ni();
			}
		}
		return a;
	}

	long nl() {
		return scan.nextLong();
	}

	long[] nl(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = nl();
		}
		return a;
	}

	long[][] nl(int y, int x) {
		long[][] a = new long[y][x];
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				a[i][j] = nl();
			}
		}
		return a;
	}

	String ns() {
		return scan.next();
	}

	String[] ns(int n) {
		String[] a = new String[n];
		for (int i = 0; i < n; i++) {
			a[i] = ns();
		}
		return a;
	}

	String[][] ns(int y, int x) {
		String[][] a = new String[y][x];
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				a[i][j] = ns();
			}
		}
		return a;
	}
}

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}

	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}

	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
