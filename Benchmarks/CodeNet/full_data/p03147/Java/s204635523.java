import java.util.*;

public class Main {
	static class Node {
		Node parent;
		int value;
		Node right, left;

		Node(int value) {
			this.value = value;
			this.parent = null;
			this.right = null;
			this.left = null;
		}

		/**
		 * 値を追加して，rootのnodeを返す
		 * 
		 * @param value
		 * @return
		 */
		Node add(int value) {
			if (this.value >= value) {
				// 自分の親にする
				Node insert = new Node(value);
				Node parent = this.parent;
				if (parent != null) {
					parent.right = insert;
					insert.parent = parent;
				}
				insert.left = this;
				this.parent = insert;
				return parent;
			} else {
				// 右に挿入
				if (this.right == null) {
					this.right = new Node(value);
					this.right.parent = this;
					return this;
				} else {
					// 右の子として挿入
					this.right.add(value);
					return this;
				}
			}
		}

		Node getRoot() {
			if (this.parent == null) {
				return this;
			} else {
				return this.parent.getRoot();
			}
		}

		long getCost(long base) {
			if (this.left == null && this.right == null) {
				return this.value - base;
			} else if (this.left != null && this.right != null) {
				long result = 0;
				result += this.left.getCost(this.value);
				result += this.right.getCost(this.value);
				result += this.value - base;
				return result;
			} else if (this.left != null) {
				// leftのみ
				long result = 0;
				result += this.left.getCost((this.value));
				result += this.value - base;
				return result;
			} else {
				// rightのみ
				long result = 0;
				result += this.right.getCost(this.value);
				result += this.value - base;
				return result;
			}
		}
	}

	int N;
	int[] h;
	List<Deque<Integer>> sections;

	Main() {
		Scanner in = new Scanner(System.in);
		N = Integer.parseInt(in.nextLine());
		String[] tokens = in.nextLine().split(" ");
		h = new int[N];
		for (int i = 0; i < N; ++i) {
			h[i] = Integer.parseInt(tokens[i]);
		}
		in.close();
	}

	Node genTree(int[] h) {
		// 最初のnodeを作る
		Node root = new Node(h[0]);
		for (int i = 1; i < h.length; ++i) {
			root.add(h[i]);
			root = root.getRoot();
		}
		return root;
	}

	public static void main(String[] args) {
		Main ins = new Main();
		Node root = ins.genTree(ins.h);
		System.out.println(root.getCost(0));
	}

}