import java.util.*;

public class Main {
	Scanner sc;
	int N;
	int total;
	
	Node[][] nodes;
	Node[] starts;
	static int maxOrder = -1;
	
	class Node {
		Node next1;
		Node next2;
		int order;
		void putNext(Node next) {
			if (next1 == null) next1 = next;
			else next2 = next;
		}
		void setOrder(int order) {
			if (this.order >= order) return;
			if (this.order > total) throw new RuntimeException("loop found");
			this.order = order;
			if (order > maxOrder) maxOrder = order;
			if (next1 != null) next1.setOrder(order+1);
			if (next2 != null) next2.setOrder(order+1);
		}
	}

	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		N = sc.nextInt();
		total = N*(N-1)/2;
		nodes = new Node[N+1][];
		for (int a = 2; a <= N; a++) {
			nodes[a] = new Node[a];
			for (int b = 1; b < a; b++)
				nodes[a][b] = new Node();
		}
		starts = new Node[N+1];
		for (int i = 1; i <= N; i++) {
			Node from = null;
			for (int j = 0; j < N-1; j++) {
				int a = i;
				int b = sc.nextInt();
				if (a < b) {
					int tmp = a; a = b; b = tmp;
				}
				if (j > 0) from.putNext(nodes[a][b]);
				from = nodes[a][b];
				if (j == 0) starts[i] = from;
			}
		}
		try {
			for (int a = 1; a <= N; a++) starts[a].setOrder(1);
			System.out.println(maxOrder);
		} catch (RuntimeException loopFound) {
			System.out.println(-1);
		}
		System.out.flush();
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}