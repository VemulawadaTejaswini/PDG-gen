import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Node {
		int id, gid, val;
		Set<Integer> conns;

		Node(int id, int val) {
			this.id = id;
			this.val = val;
			this.gid = -1;
			this.conns = new HashSet<>();
		}

	}

	int N, M;
	Node[] p;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	void mark(int current, int gid, int parent) {
		p[current].gid = gid;
		for (Integer conn : p[current].conns) {
			if (conn != parent) {
				mark(conn, gid, current);
			}
		}
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		M = Integer.parseInt(tokens[1]);
		p = new Node[N];
		tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			p[i] = new Node(i, Integer.parseInt(tokens[i]) - 1);
		}
		for (int i = 0; i < M; ++i) {
			tokens = in.readLine().split(" ");
			int x = Integer.parseInt(tokens[0]) - 1;
			int y = Integer.parseInt(tokens[1]) - 1;
			p[x].conns.add(y);
			p[y].conns.add(x);
		}
	}

	int count(Set<Node> nodes) {
		Set<Integer> ids = new HashSet<>();
		Set<Integer> vals = new HashSet<>();
		for (Node node : nodes) {
			ids.add(node.id);
			vals.add(node.val);
		}
		ids.retainAll(vals);

		return ids.size();
	}

	void calc() {
		// mark
		int gid = 0;
		for (int i = 0; i < N; ++i) {
			if (p[i].gid < 0) {
				mark(i, gid, -1);
				++gid;
			}
		}
		// gidごとにまとめる
		Map<Integer, Set<Node>> groups = new HashMap<>();
		for (int i = 0; i < N; ++i) {
			if (!groups.containsKey(p[i].gid)) {
				groups.put(p[i].gid, new HashSet<>());
			}
			groups.get(p[i].gid).add(p[i]);
		}

		int count = 0;
		for (Set<Node> group : groups.values()) {
			count += count(group);
		}
		System.out.println(count);

	}

	void showResult() {
	}
}
