import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int M = in.nextInt();
		
		int[] groups = new int[N + 1];
		Arrays.fill(groups, -1);
		
		HashMap<Integer, Node> graphs = new HashMap<Integer, Node>();

		boolean answer = true;
		for (int i = 0; i < M; i++) {
			int l = in.nextInt();
			int r = in.nextInt();
			int c = in.nextInt();
			
			if (groups[l] == -1 && groups[r] == -1) {
				groups[l] = l;
				groups[r] = l;
				Node n = new Node(l);
				n.edges.put(l, 0);
				n.edges.put(r, c);
				graphs.put(l, n);
			} else if (groups[l] == -1) {
				groups[l] = groups[r];
				Node n = graphs.get(groups[r]);
				n.edges.put(l, c + n.edges.get(r));
			} else if (groups[r] == -1) {
				groups[r] = groups[l];
				Node n = graphs.get(groups[l]);
				n.edges.put(r, c + n.edges.get(l));
			} else if (groups[l] != groups[r]) {
				Node n = graphs.get(groups[l]);
				Node m = graphs.get(groups[r]);
				int temp = groups[r];
				for (int j = 1; j < N + 1; j++) {
					if (groups[j] == temp) {
						groups[j] = groups[l];
					}
				}
				
				for (int key: m.edges.keySet()) {
					n.edges.put(key, n.edges.get(l) + c - m.edges.get(r) + m.edges.get(key));
				}
			} else {
				Node n = graphs.get(groups[l]);
				if (n.edges.get(l) + c != n.edges.get(r)) {
					answer = false;
				}
			}
		}
				
		System.out.println(answer ? "Yes" : "No");
	}
}

class Node {
	int n;
	HashMap<Integer, Integer> edges;
	
	public Node(int n) {
		this.n = n;
		this.edges = new HashMap<Integer, Integer>();
	}
}
