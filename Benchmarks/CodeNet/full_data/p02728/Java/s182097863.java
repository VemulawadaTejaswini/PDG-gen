import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Main {
	static int n;
	static List<List<Integer>> list;
	static Kaijou kai;
	static int mod = 1000000007;
	static Map<Integer, Map<Integer, Node>> map;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		n = Integer.parseInt(sa[0]);
		list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < n - 1; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;
			list.get(a).add(b);
			list.get(b).add(a);
		}
		br.close();

		kai = new Kaijou(200000, mod);
		map = new HashMap<>();
		dfs(0, -1);

		Queue<Node2> que = new ArrayDeque<>();
		que.add(new Node2(0, -1));
		while (!que.isEmpty()) {
			Node2 cur = que.poll();
			Node total = map.get(cur.x).get(-1);
			if (total == null) {
				Node base = map.get(cur.x).get(cur.p);
				long val = base.val;
				val *= kai.p[n - 1];
				val %= mod;
				val *= kai.pi[base.num - 1];
				val %= mod;

				Node add = map.get(cur.p).get(cur.x);
				val *= kai.pi[add.num];
				val %= mod;
				val *= add.val;
				val %= mod;

				total = new Node(n, val);
				map.get(cur.x).put(-1, total);
			}
			for (int c : list.get(cur.x)) {
				if (c != cur.p) {
					que.add(new Node2(c, cur.x));

					Node rem = map.get(c).get(cur.x);
					long val = total.val;
					val *= kai.pi[n - 1];
					val %= mod;
					val *= kai.p[n - 1 - rem.num];
					val %= mod;

					val *= kai.p[rem.num];
					val %= mod;
					val = divide(val, rem.val, mod);

					Node o = new Node(n - rem.num, val);
					map.get(cur.x).put(c, o);
				}
			}
		}

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < n; i++) {
			pw.println(map.get(i).get(-1).val);
		}
		pw.flush();
	}

	static Node dfs(int x, int p) {
		List<Node> list2 = new ArrayList<>();
		for (int c : list.get(x)) {
			if (c != p) {
				list2.add(dfs(c, x));
			}
		}
		int sum = 0;
		for (Node o : list2) {
			sum += o.num;
		}
		long val = kai.p[sum];
		for (Node o : list2) {
			val *= kai.pi[o.num];
			val %= mod;
			val *= o.val;
			val %= mod;
		}
		Node o = new Node(sum + 1, val);
		Map<Integer, Node> map2 = map.get(x);
		if (map2 == null) {
			map2 = new HashMap<>();
			map.put(x, map2);
		}
		map2.put(p, o);
		return o;
	}

	static class Node {
		int num;
		long val;

		public Node(int num, long val) {
			this.num = num;
			this.val = val;
		}
	}

	static class Node2 {
		int x, p;

		public Node2(int x, int p) {
			this.x = x;
			this.p = p;
		}
	}

	static long divide(long a, long b, int m) {
		BigInteger ba = BigInteger.valueOf(a);
		BigInteger bm = BigInteger.valueOf(m);
		BigInteger bb = BigInteger.valueOf(b).modInverse(bm);
		return ba.multiply(bb).mod(bm).longValue();
	}

	static class Kaijou {
		long[] p, pi;
		int m;

		public Kaijou(int n, int mod) {
			n++;
			m = mod;
			p = new long[n];
			pi = new long[n];
			p[0] = 1;
			pi[0] = 1;
			for (int i = 1; i < n; i++) {
				p[i] = p[i - 1] * i % m;
			}
			pi[n - 1] = BigInteger.valueOf(p[n - 1])
					.modInverse(BigInteger.valueOf(m)).longValue();
			for (int i = n - 1; i > 1; i--) {
				pi[i - 1] = pi[i] * i % m;
			}
		}
	}
}
