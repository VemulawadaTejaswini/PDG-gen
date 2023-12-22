import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
 
public class Main {
	private class Edge {
		public int score = Integer.MAX_VALUE;
	}
	
	private class Node implements Comparable<Node> {
		public int number = -1;
		LinkedList<Edge> list = new LinkedList<Edge>();
		
		public Node() {
			
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
			return this.list.size() - o.list.size();
		}
	}
	
	public void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		Edge[] edges = new Edge[N-1];
		Node[] nodes = new Node[N];
		Node[] sortedNodes = new Node[N];
		
		for (int i=0; i<N; i++) {
			nodes[i] = new Node();
			sortedNodes[i] = nodes[i];
		}
		for (int i=0; i<N-1; i++) {
			edges[i] = new Edge();
			int a = in.nextInt();
			int b = in.nextInt();
			nodes[a-1].add(edges[i]);
			nodes[b-1].add(edges[i]);
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
