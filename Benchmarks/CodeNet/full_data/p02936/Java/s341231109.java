import java.util.*;
import java.lang.*;

public class abc{
	static Tree tree;
	static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		tree = new Tree(n);
		for (int i = 0; i < n - 1; i++) {
			tree.union(sc.nextInt() - 1, sc.nextInt() - 1);
		}
		for (int i = 0; i < q; i++) {
			tree.node[sc.nextInt() - 1].value += sc.nextInt();
		}
		visited = new boolean[n];
		visited[0] = true;
		dfs(0);
		for (int i = 0; i < n - 1; i++) {
			System.out.print(tree.node[i].value + " ");
		}
		System.out.println(tree.node[n - 1].value);
	}
	static void dfs(int n) {
		visited[n] = true;
		for (int key : tree.node[n].list) {
			if (!visited[key]) {
				visited[key] = true;
				tree.node[key].value += tree.node[n].value;
				dfs(key);
			}
		}
	}
}

class Node {
	ArrayList<Integer> list;
	int value;
	Node() {
		list = new ArrayList<>();
		value = 0;
	}
}

class Tree {
	Node[] node;
	Tree(int n) {
		node = new Node[n];
		for (int i = 0; i < n; i++) {
			node[i] = new Node();
		}
	}
	void union(int n, int m) {
		node[n].list.add(m);
		node[m].list.add(n);
	}
}