import java.util.*;

public class Main {
	static class Node {
		int id;
		int depth = -1;
		List<Node> parents = new ArrayList<>();
		List<Node> children = new ArrayList<>();

		Node(int id) {
			this.id = id;
		}

		void setDepth() {
			if (this.parents.isEmpty()) {
				depth = 0;
				for (Node child : children) {
					child.setDepth();
				}
			} else {
				int minParentDepth = Integer.MAX_VALUE;
				Node maxParent = this;
				int maxParentDepth = -1;
				for (int i = 0; i < parents.size(); ++i) {
					Node parent = parents.get(i);
					if (minParentDepth > parent.depth) {
						minParentDepth = parent.depth;
					}
					if (maxParentDepth < parent.depth) {
						maxParentDepth = parent.depth;
						maxParent = parent;
					}
				}
				if (minParentDepth < 0) {
					// 全部そろっていない:
					return;
				} else {
					// maxParentがもともとの親
					this.parents.clear();
					this.parents.add(maxParent);
					this.depth = maxParent.depth + 1;
					for (Node child : children) {
						child.setDepth();
					}
				}
			}
		}
	}

	int N, M;
	int[] A, B;
	Node[] nodes;
	Node root;

	Main() {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		M = Integer.parseInt(tokens[1]);
		A = new int[N - 1 + M];
		B = new int[N - 1 + M];
		for (int i = 0; i < N - 1 + M; ++i) {
			tokens = in.nextLine().split(" ");
			A[i] = Integer.parseInt(tokens[0]);
			B[i] = Integer.parseInt(tokens[1]);
		}
		in.close();

		this.nodes = genTree();
		this.root = findRoot(this.nodes);
		this.root.setDepth();
	}

	Node findRoot(Node[] nodes) {
		for (Node node : nodes) {
			if (node.parents.isEmpty()) {
				return node;
			}
		}
		return null;
	}

	Node[] genTree() {
		Node[] tree = new Node[N];
		for (int i = 0; i < N; ++i) {
			tree[i] = new Node(i);
		}
		// edgeの追加
		for (int i = 0; i < N - 1 + M; ++i) {
			Node src = tree[A[i] - 1];
			Node dst = tree[B[i] - 1];
			src.children.add(dst);
			dst.parents.add(src);
		}
		return tree;
	}

	void show() {
		for (int i = 0; i < N; ++i) {
			if (nodes[i].parents.isEmpty()) {
				System.out.println(0);
			} else {
				System.out.println((nodes[i].parents.get(0).id + 1));
			}
		}
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.show();
	}
}