import static java.lang.System.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	static Tree tree;
	static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		tree = new Tree(n);
		for(int i = 0; i < n - 1; i++) {
			tree.union(sc.nextInt(), sc.nextInt());
		}
		for(int i = 0; i < q; i++) {
			tree.nodes[sc.nextInt()].score += sc.nextInt();
		}
		visited = new boolean[n + 1];
		visited[1] = true;
		dfs(1);
		
		for(int i = 1; i <= n; i++) {
			out.print(tree.nodes[i].score + " ");
		}
		
		
	}
	static void dfs(int n) {
		for(int i = 0; i < tree.nodes[n].list.size(); i++) {
			int m = tree.nodes[n].list.get(i);
			if (!visited[m]) {
				visited[m] = true;
				tree.nodes[m].score += tree.nodes[n].score;
				dfs(m);
			}
		}
	}
	
	static class Node{
		List<Integer> list = new ArrayList<>();
		int score = 0;
	}
	static class Tree{
		Node[] nodes;
		Tree(int n){
			nodes = new Node[n + 1];
			for(int i = 1; i <= n ; i++) {
				nodes[i] = new Node();
			}
		}
		void union(int a, int b) {
			nodes[a].list.add(b);
			nodes[b].list.add(a);
		}
	}
}

