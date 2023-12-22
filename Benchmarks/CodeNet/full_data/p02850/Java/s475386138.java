import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc146/tasks/abc146_d
 *
 */
public final class Main {

	private static int maxColor = 0;

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		Node[] nodes = new Node[n + 1]; // 0番目は空き
		List<Integer> colors = new ArrayList<>();

		boolean isParent = true;
		int parent = 0;
		while (true) {
			int no = scanner.nextInt();

			if (no == 1) {
				if (nodes[no] == null) {
					nodes[no] = new Node(); // root node
				}
			}

			if (isParent) {
				parent = no;
			} else {
				final int color = nodes[parent].addChild(no);
				nodes[no] = new Node(color);
				colors.add(color);
			}

			isParent = !isParent;

			if (no == n) {
				break;
			}
		}

		System.out.println(maxColor);
		colors.stream().forEach(c -> System.out.println(c));
	}

	private static final class Node {
		public final List<Integer> children;
		public final List<Integer> colors;

		public Node() {
			this.children = new ArrayList<>();
			this.colors = new ArrayList<>();
		}

		public Node(int parentColor) {
			this.children = new ArrayList<>();
			this.colors = new ArrayList<>();
			this.colors.add(parentColor);
		}

		public int addChild(int no) {
			this.children.add(no);
			final int nextColor = nextColor();
			this.colors.add(nextColor);
			return nextColor;
		}

		private int nextColor() {
			for (int i = 1; i < Main.maxColor; i++) {
				if (!this.colors.contains(i)) {
					return i;
				}
			}
			maxColor++;
			return maxColor;
		}
	}

}
