import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N, M, K;
	int[] A, B, C, D;
	Node[] nodes;
	Map<Integer, Set<Integer>> groupInfos;

	static class Node {
		Set<Integer> blocks;
		Set<Integer> friends;
		Set<Integer> kouhos;
		int id;
		int group;

		Node(int id) {
			this.id = id;
			this.group = -1;
			this.blocks = new HashSet<>();
			this.friends = new HashSet<>();
			this.kouhos = new HashSet<>();
		}

		void setKouhoNum(Set<Integer> ids) {
			kouhos.addAll(ids);
			kouhos.remove(id);
			kouhos.removeAll(friends);
			kouhos.removeAll(blocks);
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		M = Integer.parseInt(tokens[1]);
		K = Integer.parseInt(tokens[2]);
		this.A = new int[M];
		this.B = new int[M];
		for (int i = 0; i < M; ++i) {
			tokens = in.readLine().split(" ");
			A[i] = Integer.parseInt(tokens[0]);
			B[i] = Integer.parseInt(tokens[1]);
		}
		C = new int[K];
		D = new int[K];
		for (int i = 0; i < K; ++i) {
			tokens = in.readLine().split(" ");
			C[i] = Integer.parseInt(tokens[0]);
			D[i] = Integer.parseInt(tokens[1]);
		}
		nodes = new Node[N];
		for (int i = 0; i < N; ++i) {
			nodes[i] = new Node(i);
		}
		for (int i = 0; i < M; ++i) {
			nodes[A[i] - 1].friends.add(B[i] - 1);
			nodes[B[i] - 1].friends.add(A[i] - 1);
		}
		for (int i = 0; i < K; ++i) {
			nodes[C[i] - 1].blocks.add(D[i] - 1);
			nodes[D[i] - 1].blocks.add(C[i] - 1);
		}
	}

	void setGroup(Node node, int parent, int group) {
		if (node.group >= 0) {
			// すでにセット済み
			return;
		}
		node.group = group;
		for (Integer friend : node.friends) {
			if (friend != parent) {
				setGroup(nodes[friend], node.id, group);
			}
		}
	}

	void calc() {
		// まずグループをセットする
		int groupId = 0;
		for (int i = 0; i < N; ++i) {
			if (nodes[i].group < 0) {
				setGroup(nodes[i], -1, groupId);
				++groupId;
			}
		}

		// groupInfoを作成
		this.groupInfos = new HashMap<>();
		for (int i = 0; i < N; ++i) {
			Node node = nodes[i];
			if (!groupInfos.containsKey(node.group)) {
				groupInfos.put(node.group, new HashSet<>());
			}
			groupInfos.get(node.group).add(node.id);
		}
		// groupInfoをもとに値をセット
		for (int i = 0; i < N; ++i) {
			Node node = nodes[i];
			node.setKouhoNum(groupInfos.get(node.group));
		}
	}

	void show() {
		for (int i = 0; i < N; ++i) {
			for (Integer id : nodes[i].kouhos) {
				System.out.print(id + " ");
			}
			System.out.println("");
		}
	}

	void showResult() {
		// show();
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(Integer.toString(nodes[0].kouhos.size()));
		for (int i = 1; i < N; ++i) {
			strBuilder.append(" " + Integer.toString(nodes[i].kouhos.size()));
		}
		System.out.println(strBuilder.toString());
	}

}