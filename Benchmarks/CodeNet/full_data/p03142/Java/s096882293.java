import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static final int MAX_HIGHT = 100;

	static int N;
	static int M;
	static Node[] nodeArray;
	static Node root;

	public static void main(String[] args) {
		readInput();

		solve();
	}

	public static void solve() {
		// 幅優先探索で距離が長いパスがもともとのパス
		Queue<Node> queue = new ArrayDeque<>();
		queue.add(root);
		
		boolean[] isSearched = new boolean[N+1];

		while(!queue.isEmpty()) {
			Node node = queue.poll();
			
			// 探索済みなら探索不要
			if(isSearched[node.id]) {
				continue;
			}
			
			for(Node child : node.children) {
				child.parentId = node.id;
				queue.add(child);
			}
			isSearched[node.id] = true;
		}
		
		for(int i = 1; i<=N; i++) {
			System.out.println(nodeArray[i].parentId);
		}
	}

	public static void readInput() {
		try (Scanner sc = new Scanner(System.in)) {
			N = sc.nextInt();
			M = sc.nextInt();

			nodeArray = new Node[N+1];

			for(int i = 1; i<nodeArray.length; i++) {
				nodeArray[i] = new Node(i);
			}
			
			// 根（親のいないノード）の検索用
			boolean[] hasParent = new boolean[N+1];
			
			// 辺の情報を読み込む
			for(int i = 0; i<(N - 1 + M); i++) {
				int s = sc.nextInt();
				int d = sc.nextInt();

				nodeArray[s].children.add(nodeArray[d]);
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
	
	public static class Node{
		public int id;
		public int parentId;
		public ArrayList<Node> children;

		public Node(int id) {
			parentId = 0;
			this.id = id;
			children = new ArrayList<Node>();
		}
	}
}
