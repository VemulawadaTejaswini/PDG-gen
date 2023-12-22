import java.util.*;

public class Main {
	static class Node {
		int index;
		int color;
		int group;
		Node parent = null;

		Node(int index, int color) {
			this.index = index;
			this.color = color;
			this.group = -1;
		}

		Node getRoot() {
			if (this.parent == this) {
				return this;
			}
			return this.parent.getRoot();
		}
	}

	int H, W;
	Node[] graph;
	Map<Node, Set<Node>> groups;

	int getIndex(int h, int w) {
		return h * W + w;
	}

	void buildTree() {

	}

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

		// parentの追加
		for (int h = 0; h + 1 < H; ++h) {
			for (int w = 0; w + 1 < W; ++w) {
				if (graph[getIndex(h, w)].color != graph[getIndex(h, w + 1)].color) {
					graph[getIndex(h, w)].parent = graph[getIndex(h, w + 1)];
				} else if (graph[getIndex(h, w)].color != graph[getIndex(h + 1, w)].color) {
					graph[getIndex(h, w)].parent = graph[getIndex(h + 1, w)];
				} else {
					graph[getIndex(h, w)].parent = graph[getIndex(h, w)];
				}
			}
		}
		for (int h = 0; h + 1 < H; ++h) {
			if (graph[getIndex(h, W - 1)].color != graph[getIndex(h + 1, W - 1)].color) {
				graph[getIndex(h, W - 1)].parent = graph[getIndex(h + 1, W - 1)];
			} else {
				graph[getIndex(h, W - 1)].parent = graph[getIndex(h, W - 1)];
			}
		}
		for (int w = 0; w + 1 < W; ++w) {
			if (graph[getIndex(H - 1, w)].color != graph[getIndex(H - 1, w + 1)].color) {
				graph[getIndex(H - 1, w)].parent = graph[getIndex(H - 1, w + 1)];
			} else {
				graph[getIndex(H - 1, w)].parent = graph[getIndex(H - 1, w)];
			}
		}
		graph[getIndex(H - 1, W - 1)].parent = graph[getIndex(H - 1, W - 1)];

		this.groups = new HashMap<>();
		for (int h = 0; h < H; ++h) {
			for (int w = 0; w < W; ++w) {
				Node root = this.graph[getIndex(h, w)].getRoot();
				if (!this.groups.containsKey(root)) {
					this.groups.put(root, new HashSet<>());
				}
				this.groups.get(root).add(this.graph[getIndex(h, w)]);
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

	public static void main(String[] args) {
		Main ins = new Main();
		long result = ins.calc();
		System.out.println(result);
	}
}