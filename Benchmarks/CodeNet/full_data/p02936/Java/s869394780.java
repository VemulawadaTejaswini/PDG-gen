import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		Tree tree = new Tree(n);
		for (int i = 0; i < n - 1; i++) {
			tree.union(sc.nextInt() - 1, sc.nextInt() - 1);
		}
		for (int i = 0; i < q; i++) {
			tree.node[sc.nextInt() - 1].count += sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			int tmp = tree.node[i].count;
			for (int num: tree.node[i].children) {
				tree.node[num].count += tmp;
			}
		}
		for (int i = 0; i < n - 1; i++) {
			System.out.print(tree.node[i].count + " ");
		}
		System.out.println(tree.node[n - 1].count);
	}
}

class Node {
	int rank;
	TreeSet<Integer> children;
	int count;
	Node(int n) {
		rank = 0;
		children = new TreeSet<>();
		count = 0;
	}
}

class Tree {
	Node[] node;
	Tree(int n) {
		node = new Node[n];
		for (int i = 0; i < n; i++) {
			node[i] = new Node(i);
		}
		node[0].rank = 1;
	}
	void union(int n, int m) {
		if (node[n].rank != 0) {
			node[m].rank = node[n].rank + 1;
			node[n].children.add(m);
		} else {
			node[n].rank = node[m].rank + 1;
			node[m].children.add(m);
		}
	}
}
