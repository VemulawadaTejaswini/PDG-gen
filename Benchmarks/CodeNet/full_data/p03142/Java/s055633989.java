import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int N;
	static int M;
	static Node[] nodeArray;
	static Node root;

	public static void main(String[] args) {
		readInput();

		solve();
	}

	static void solve() {
		boolean[] isSearched = new boolean[N+1];
		
		recursiveSearch(root.id, isSearched);
		
		for(int i = 1; i<=N; i++) {
			System.out.println(nodeArray[i].parentId);
		}
	}
	
	static void recursiveSearch(int nodeId, boolean[] isSearched) {
		Node node = nodeArray[nodeId];
		
		for(int childId : node.children) {
			if(!isSearched[childId]) {
				recursiveSearch(childId, isSearched);
			}
			nodeArray[childId].parentId = nodeId;
			isSearched[childId] = true;
		}
	}

	static void readInput() {
		try (Scanner sc = new Scanner(System.in)) {
			N = sc.nextInt();
			M = sc.nextInt();

			nodeArray = new Node[N+1];

			for(int i = 0; i<nodeArray.length; i++) {
				nodeArray[i] = new Node(i);
			}

			// 根（親のいないノード）の検索用
			boolean[] hasParent = new boolean[N+1];

			// 辺の情報を読み込む
			for(int i = 0; i<(N - 1 + M); i++) {
				int s = sc.nextInt();
				int d = sc.nextInt();

				nodeArray[s].children.add(d);
				hasParent[d] = true;
			}

			// 根を探す
			for(int i = 1; i<=N; i++) {
				if(!hasParent[i]) {
					root = nodeArray[i];
				}
			}
		}
	}

	static class Node{
		public int id;
		public int parentId;
		public ArrayList<Integer> children;

		public Node(int id) {
			parentId = 0;
			this.id = id;
			children = new ArrayList<>();
		}
	}
}
