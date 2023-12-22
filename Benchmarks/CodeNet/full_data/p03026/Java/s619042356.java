import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
 
public class Main {
	private class Edge {
		public int score = Integer.MAX_VALUE;
		public Node a = null;
		public Node b = null;
		
		public Edge(Node a, Node b) {
			this.a = a;
			this.b = b;
		}
		
		public Node getTo(Node a) {
			if (this.a == a) {
				return this.b;
			} else if (this.b == a) {
				return this.a;
			} else {
				return null;
			}
		}
	}
	
	private class Node implements Comparable<Node> {
		public int n = 0;
		public int number = -1;
		LinkedList<Edge> list = new LinkedList<Edge>();
		
		private int sameBranchNodeCount = -1;
		
		public Node(int n) {
			this.n = n;
		}
		
		public int getSameBranchNodeCount() {
			if (this.sameBranchNodeCount != -1) {
				return this.sameBranchNodeCount;
			}
			int count = 0;
			for (Edge e : list) {
				Node node = e.getTo(this);
				if (this.list.size() == node.list.size()) {
					count++;
				}
			}
			this.sameBranchNodeCount = count;
			return count;
		}
		
		public void setNumber(int x) {
			number = x;
			for (Edge e : list) {
				if (e.score > x) {
					e.score = x;
				}
			}
		}
		
		public void add(Edge edge) {
			this.list.add(edge);
		}

		@Override
		public int compareTo(Node o) {
			int diff = this.list.size() - o.list.size();
			if (diff == 0) {
				diff = this.getSameBranchNodeCount() - o.getSameBranchNodeCount();
			}
			return diff;
		}
	}
	
	public void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		Edge[] edges = new Edge[N-1];
		Node[] nodes = new Node[N];
		Node[] sortedNodes = new Node[N];
		
		for (int i=0; i<N; i++) {
			nodes[i] = new Node(i);
			sortedNodes[i] = nodes[i];
		}
		for (int i=0; i<N-1; i++) {
			int a = in.nextInt()-1;
			int b = in.nextInt()-1;
			edges[i] = new Edge(nodes[a], nodes[b]);
			nodes[a].add(edges[i]);
			nodes[b].add(edges[i]);
		}
		int[] nums = new int[N];
		for (int i=0; i<N; i++) {
			nums[i] = in.nextInt();
		}
		in.close();

		Arrays.sort(nums);
		Arrays.sort(sortedNodes);
		
		for (int i=0; i<N; i++) {
			sortedNodes[i].setNumber(nums[i]);
		}
		int score = 0;
		for (int i=0; i<N-1; i++) {
			score += edges[i].score;
		}
		
		System.out.println(score);
		System.out.print(nodes[0].number);
		for (int i=1; i<N; i++) {
			System.out.print(" " + nodes[i].number);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}
 
}
