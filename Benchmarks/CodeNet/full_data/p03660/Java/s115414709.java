import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	static class Node {
		int id;
		Set<Integer> conns;

		Node(int id) {
			this.id = id;
			this.conns = new HashSet<>();
		}
	}

	int N;
	Node[] nodes;

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		nodes = new Node[N];
		for (int i = 0; i < N; ++i) {
			nodes[i] = new Node(i);
		}
		for (int i = 0; i < N - 1; ++i) {
			String[] tokens = in.readLine().split(" ");
			int a = Integer.parseInt(tokens[0]) - 1;
			int b = Integer.parseInt(tokens[1]) - 1;
			nodes[a].conns.add(b);
			nodes[b].conns.add(a);
		}
	}

	List<Integer> getPath(int current, int parent) {
		if (current == N - 1) {
			List<Integer> path = new ArrayList<>();
			path.add(current);
			return path;
		} else {
			List<Integer> remain = null;
			for (Integer i : nodes[current].conns) {
				if (i != parent) {
					List<Integer> l = getPath(i, current);
					if (l != null) {
						remain = l;
						break;
					}
				}
			}
			if (remain != null) {
				remain.add(current);
			}
			return remain;
		}
	}

	int count(int current, int parent) {
		int c = 1;
		for (Integer i : nodes[current].conns) {
			if (i != parent) {
				c += count(i, current);
			}
		}
		return c;
	}

	void calc() {
		// まずpathを求める
		List<Integer> path = getPath(0, -1);
		int middle = (path.size() - 1) / 2;
		// 分割する
		int blackEdge = path.get(middle);
		int whiteEdge = path.get(middle + 1);
		nodes[blackEdge].conns.remove(whiteEdge);
		nodes[whiteEdge].conns.remove(blackEdge);

		int blackNum = count(0, -1);
		int whiteNum = count(N - 1, -1);
		if (blackNum <= whiteNum) {
			System.out.println("Snuke");
		} else {
			System.out.println("Fennec");
		}
	}

	void showResult() {
	}
}