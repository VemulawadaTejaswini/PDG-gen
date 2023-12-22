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
import java.util.PriorityQueue;
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
	List<PPP> list = new ArrayList<>();
	GraphV G = new GraphV();
	public void solve() {
		int N = ni();
		int x, y;
		for (int i = 0; i < N; i++) {
			x = ni();
			y = ni();
			list.add(new PPP(i, x, y));
		}
		list.sort(comparing(PPP::getVal));
		PPP from = null;
		int len1, len2;
		for (PPP to : list) {
			if(from == null)	from = to;
			else {
				len1 = Math.abs(to.val - from.val);
				len2 = Math.abs(to.val2 - from.val2);
				if(len1 <= len2) {
					G.add(from.key, new PP(to.key, len1));
					G.add(to.key, new PP(from.key, len1));
				}
				from = to;
			}
		}
		list.sort(comparing(PPP::getVal2));
		from = null;
		for (PPP to : list) {
			if(from == null)	from = to;
			else {
				len1 = Math.abs(to.val - from.val);
				len2 = Math.abs(to.val2 - from.val2);
				if(len2 < len1) {
					G.add(from.key, new PP(to.key, len2));
					G.add(to.key, new PP(from.key, len2));
				}
				from = to;
			}
		}
		out.println(prim(G));
	}
	// Set に入れるなら　PPKEY　を使う！
	class PPP {
		public int key, val, val2;
		public PPP(int key, int val, int val2) {
			this.key = key;
			this.val = val;
			this.val2 = val2;
		}
		public int getVal() {
			return val;
		}
		public void setVal(int val) {
			this.val = val;
		}
		public int getVal2() {
			return val2;
		}
		public void setVal2(int val2) {
			this.val2 = val2;
		}
	}
	int prim(GraphV G) {
		final int INF = 1000000010;
		final int WHITE = 0, GRAY = 1, BLACK = 2;
		int N = G.keySet().size();
		int[] d = new int[N]; // d[3] なら 頂点３ までの最短コストを記録する
		int[] p = new int[N]; // p[3] なら 頂点３ の親の頂点を保存する（つながっていなければ -1 ）
		int[] color = new int[N]; // 白：未処理　黒：処理済み　グレー：
									// 辺の長さの短い順で並ぶ、優先度付きキュー
		PriorityQueue<PP> PQ = new PriorityQueue<PP>(comparing(PP::getKey));
		for (int i = 0; i < N; i++) { // 変数の初期化
			d[i] = INF;
			p[i] = -1;
			color[i] = WHITE;
		}
		d[0] = 0; // 先頭は　０
		PQ.add(new PP(0, 0)); // 優先度付きキューにいれるのは　辺の長さと頂点のペア（並びに注意）
		int u, v;
		PP pp;
		while (!PQ.isEmpty()) {
			pp = PQ.poll(); // 始点に一番近い頂点を取り出して、消す
			u = pp.getVal(); // 頂点の番号
			color[u] = BLACK;
			if (G.contains(u)) {
				for (PP wk : G.get(u)) {
					v = wk.getKey(); // u につながる頂点
					if (color[v] == BLACK)
						continue; // 処理済みなら　次へ
					if (d[v] > wk.getVal()) { // wk.getVal() が辺の長さ
						d[v] = wk.getVal();
						p[v] = u;
						PQ.add(new PP(d[v], v));
					}
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < N; i++) {
			// つながっている頂点の辺を集計する
			if (p[i] != -1) {
				for (PP wk : G.get(i)) {
					if (wk.getKey() == p[i]) {
						sum += wk.getVal();
					}
				}
			} else if (i != 0) {
				sum = -1;
				break;
			}
		}
		return sum;
	}

	// 重さを持ったグラフのリンクリスト
	class GraphV {
		// キーに紐づくリストに、頂点番号と重さのペアを持つ
		private Map<Integer, List<PP>> data = new HashMap<Integer, List<PP>>();

		// 指定された頂点に紐づく、頂点と重さのペアを追加する
		void add(int key, PP p) {
			List<PP> list = data.get(key);
			if (list == null) {
				list = new ArrayList<PP>();
				data.put(key, list);
			}
			list.add(p);
		}

		// 頂点に紐づく、頂点と重さのペアのリストを返す
		List<PP> get(int key) {
			return data.get(key);
		}

		// 頂点 key が登録されているか？
		boolean contains(int key) {
			return data.containsKey(key);
		}

		//　頂点のセットを返す
		Set<Integer> keySet() {
			return data.keySet();
		}

		// 頂点　key_1 と 頂点　key_2 がつながっていれば　距離 を返す
		int getDistance(int key_1, int key_2) {
			List<PP> list = data.get(key_1);
			if (list == null)
				return -1;
			int ans = -1;
			for (PP p : list) {
				if (p.getKey() == key_2) {
					ans = p.getVal();
					break;
				}
			}
			return ans;
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
