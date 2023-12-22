
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Set;

class Solver {

	class Node {
		int ith = -1;
		int c;
		Set<Node> next = new HashSet<Node>();

		public Node(int i) {
			c = i;
		}

		public int dfs(int g) {
			int ans = c;
			if (ith == -1) {
				ith = g;
				for (Node n : next)
					ans = Math.min(ans, n.dfs(g));
			}
			return ans;
		}
	}

	public List<Integer> components(int[] costs, int[][] edges) {
		Node[] nodes = new Node[costs.length];
		for (int i = 0; i < costs.length; i++)
			nodes[i] = new Node(costs[i]);

		for (int i = 0; i < edges.length; i++)
			for (int j = 0; j < edges[i].length; j++) {
				nodes[edges[i][0]].next.add(nodes[edges[i][1]]);
				nodes[edges[i][1]].next.add(nodes[edges[i][0]]);
			}

		List<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < costs.length; i++)
			if (nodes[i].ith == -1) {
				l.add(nodes[i].dfs(0));

			}
		return l;
	}
}

public class Main {

	InputStream is;
	PrintWriter out;
	String INPUT = "";
	long M = 1003;// 1000000007;

	void solve() {

		int t = 1;
		while (t-- > 0) {
			try {
				int n = ni();
				int m = ni();
				List<Integer> ans = new Solver().components(na(n), na(m, 2));
				if (ans.size() <= 1)
					System.out.println(0);
				else if (ans.size() == 2)
					System.out.println(ans.get(0) + ans.get(1));
				else
					System.out.println("Impossible");
			} catch (Exception e) {
				out.println(e.getMessage());
				throw e;
			}
		}
	}

	void run() throws Exception {
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);

		long s = System.currentTimeMillis();
		solve();
		out.flush();
		if (!INPUT.isEmpty())
			tr(System.currentTimeMillis() - s + "ms");
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	private byte[] inbuf = new byte[1024];
	public int lenbuf = 0, ptrbuf = 0;

	private int readByte() {
		if (lenbuf == -1)
			throw new InputMismatchException();
		if (ptrbuf >= lenbuf) {
			ptrbuf = 0;
			try {
				lenbuf = is.read(inbuf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (lenbuf <= 0)
				return -1;
		}
		return inbuf[ptrbuf++];
	}

	private boolean isSpaceChar(int c) {
		return !(c >= 33 && c <= 126);
	}

	private int skip() {
		int b;
		while ((b = readByte()) != -1 && isSpaceChar(b))
			;
		return b;
	}

	private double nd() {
		return Double.parseDouble(ns());
	}

	private char nc() {
		return (char) skip();
	}

	private String ns() {
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != '
									// ')
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	private char[] ns(int n) {
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while (p < n) {
			if (!(isSpaceChar(b)))
				buf[p++] = (char) b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}

	private char[][] nm(int n, int m) {
		char[][] map = new char[n][];
		for (int i = 0; i < n; i++)
			map[i] = ns(m);
		return map;
	}

	private int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = ni();
		}
		return a;
	}

	private int[][] na(int n, int m) {
		int[][] a = new int[n][];
		for (int i = 0; i < n; i++)
			a[i] = na(m);
		return a;
	}

	private int ni() {
		int num = 0, b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}

		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	private long nl() {
		long num = 0;
		int b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}

		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	private static void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}
