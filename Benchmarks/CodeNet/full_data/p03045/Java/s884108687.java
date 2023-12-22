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
	UnionFind uf;
	public void solve() {
		int N = ni();
		int M = ni();
		uf = new UnionFind(N);
		int x, y, z;
		for (int i = 0; i < M; i++) {
			x = ni() - 1;
			y = ni() - 1;
			z = ni();
			uf.connect(x, y);
		}
		out.println(uf.groupCnt());
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
