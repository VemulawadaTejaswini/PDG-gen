import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc146/tasks/abc146_d
 *
 */
public final class Main {

	private static Node[] nodes;
	private static int[][] edges;

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		nodes = new Node[n + 1]; // 0番目は空き
		edges = new int[n - 1][2]; // 辺の数はN-1

		for (int i = 0; i < n - 1; i++) {
			int parent = scanner.nextInt();
			int child = scanner.nextInt();
			edges[i][0] = parent;
			edges[i][1] = child;

			if (nodes[parent] == null) {
				nodes[parent] = new Node(); // 親なのにない場合は初出なので親なしで作る
			}
			nodes[parent].addChild(child);

			if (nodes[child] == null) {
				nodes[child] = new Node(parent);
			} else {
				// 子供なのに既出→親なしで作ったのでここで親をセット
				nodes[child].setParent(parent);
			}
		}

		int maxColor = 0;
		for (int i = 1; i < n; i++) {
			final int color = nodes[i].children.size() + (nodes[i].parent == 0 ? 0 : 1);
			if (color > maxColor) {
				maxColor = color;
			}
		}

		paint(nodes[1], 0, maxColor);

		System.out.println(maxColor);
		for (int i = 0; i < n - 1; i++) {
			System.out.println(nodes[edges[i][1]].parentColor);
		}
	}

	private static void paint(Node node, int parentColor, int maxColor) {
		node.parentColor = parentColor;

		final int childNum = node.children.size();
		int color = 1;
		for (int i = 0; i < childNum; i++) {
			if (color == parentColor) {
				color++;
			}
			node.childrenColors.add(color);
			paint(nodes[node.children.get(i)], color, maxColor);
			color++;
		}
	}

	private static final class Node {
		public int parent; // 0 is root
		public final List<Integer> children;
		public int parentColor;
		public final List<Integer> childrenColors;

		public Node() {
			this.parent = 0;
			this.children = new ArrayList<>();
			this.parentColor = 0;
			this.childrenColors = new ArrayList<>();
		}

		public Node(int parent) {
			this.parent = parent;
			this.children = new ArrayList<>();
			this.parentColor = 0;
			this.childrenColors = new ArrayList<>();
		}

		public void setParent(int parent) {
			this.parent = parent;
		}

		public void addChild(int child) {
			this.children.add(child);
		}

		public String toString() {
			return "[parent=" + parent + ", children=" + children + "]";
		}

	}

}
