import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Node {
		int id;
		int uDist, vDist;
		Set<Integer> connNodes;

		Node(int id) {
			this.id = id;
			this.connNodes = new HashSet<>();
		}
	}

	int N, u, v;
	Node[] nodes;
	int result = -1;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	void labelUDist(int targetId, int dist, int parentId) {
		nodes[targetId].uDist = dist;
		for (int id : nodes[targetId].connNodes) {
			if (parentId == id) {
				continue;
			}
			labelUDist(id, dist + 1, targetId);
		}
	}

	void labelVDist(int targetId, int dist, int parentId) {
		nodes[targetId].vDist = dist;
		for (int id : nodes[targetId].connNodes) {
			if (parentId == id) {
				continue;
			}
			labelVDist(id, dist + 1, targetId);
		}
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		u = Integer.parseInt(tokens[1]) - 1;
		v = Integer.parseInt(tokens[2]) - 1;
		nodes = new Node[N];
		for (int i = 0; i < N; ++i) {
			nodes[i] = new Node(i);
		}
		for (int i = 0; i < N - 1; ++i) {
			tokens = in.readLine().split(" ");
			int a = Integer.parseInt(tokens[0]) - 1;
			int b = Integer.parseInt(tokens[1]) - 1;
			nodes[a].connNodes.add(b);
			nodes[b].connNodes.add(a);
		}
		// 距離のラベル付け
		labelUDist(u, 0, -1);
		labelVDist(v, 0, -1);
	}

	void calc() {
		// vDist > uDistの条件を満たす場所で，vDistが最大の場所が理論上の場所
		int goal = v;
		int dist = 0;
		for (int i = 0; i < N; ++i) {
			Node node = nodes[i];
			if (node.uDist < node.vDist) {
				if (dist < node.vDist) {
					dist = node.vDist;
					goal = node.id;
				}
			}
		}
		result = dist - 1;

	}

	void showResult() {
		System.out.println(result);
	}
}