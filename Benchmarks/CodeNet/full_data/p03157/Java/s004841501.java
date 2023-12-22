import java.util.*;

public class Main {
	static class Node {
		int index;
		int color;
		int group;
		Set<Node> conNodes;
		Node parent = null;

		Node(int index, int color) {
			this.index = index;
			this.color = color;
			this.group = -1;
			this.conNodes = new HashSet<>();
		}

		Node getRoot() {
			if (this.parent == this) {
				return this;
			}
			return this.parent.getRoot();
		}
	}

	public static void main(String[] args) {
		Main ins = new Main();
		long result = ins.calc();
		System.out.println(result);
	}

	int H, W;
	Node[] graph;
	Map<Node, Set<Node>> groups;

	Main() {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		H = Integer.parseInt(tokens[0]);
		W = Integer.parseInt(tokens[1]);
		this.graph = new Node[H * W];
		// nodeの読み込み
		for (int h = 0; h < H; ++h) {
			String line = in.nextLine();
			for (int w = 0; w < W; ++w) {
				int index = h * W + w;
				char c = line.charAt(w);
				int color = (c == '#') ? 1 : 0;
				graph[index] = new Node(index, color);
			}
		}
		in.close();

		// graphの作成
		initGraph();

		// parentの設定
		for (int i = 0; i < H * W; ++i) {
			if (graph[i].parent == null) {
				buildTree(graph[i], graph[i]);
			}
		}

		// group分け
		groups = new HashMap<>();
		for (int i = 0; i < H * W; ++i) {
			Node root = graph[i].getRoot();
			if (!groups.containsKey(root)) {
				groups.put(root, new HashSet<>());
			}
			groups.get(root).add(graph[i]);
		}
	}

	void buildTree(Node target, Node parent) {
		if (target.parent != null) {
			return;
		}
		target.parent = parent;
		for (Node child : target.conNodes) {
			if (target.parent != null) {
				buildTree(child, target);
			}
		}
	}

	long calc() {
		long result = 0;
		for (Node key : this.groups.keySet()) {
			result += countPerGroup(this.groups.get(key));
		}
		return result;
	}

	long countPerGroup(Set<Node> nodes) {
		int blackNum = 0;
		int whiteNum = 0;
		for (Node node : nodes) {
			if (node.color == 0) {
				whiteNum++;
			} else {
				blackNum++;
			}
		}
		return blackNum * whiteNum;
	}

	int getIndex(int h, int w) {
		return h * W + w;
	}

	void initGraph() {
		for (int h = 0; h + 1 < H; ++h) {
			for (int w = 0; w < W; ++w) {
				Node current = graph[getIndex(h, w)];
				Node down = graph[getIndex(h + 1, w)];
				if (current.color != down.color) {
					current.conNodes.add(down);
					down.conNodes.add(current);
				}
			}
		}
		for (int h = 0; h < H; ++h) {
			for (int w = 0; w + 1 < W; ++w) {
				Node current = graph[getIndex(h, w)];
				Node right = graph[getIndex(h, w + 1)];
				if (current.color != right.color) {
					current.conNodes.add(right);
					right.conNodes.add(current);
				}
			}
		}
	}
}