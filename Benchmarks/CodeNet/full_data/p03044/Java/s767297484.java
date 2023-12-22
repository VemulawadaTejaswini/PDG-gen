import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs = br.readLine().split(" ");
		int n = Integer.parseInt(inputs[0]);

		ArrayList<ArrayList<Edge>> nodes = new ArrayList<>();
		for ( int i = 0; i < n; i++ ) {
			nodes.add(new ArrayList<Edge>());
		}

		for ( int i = 0; i < n - 1; i++ ) {
			inputs = br.readLine().split(" ");
			int u = Integer.parseInt(inputs[0]) - 1;
			int v = Integer.parseInt(inputs[1]) - 1;
			int w = Integer.parseInt(inputs[2]);
			nodes.get(u).add(new Edge(v, w));
			nodes.get(v).add(new Edge(u, w));
		}
		br.close();

		ArrayDeque<Integer> q = new ArrayDeque<>();
		q.add(0);
		int[] tree = new int[n];
		tree[0] = 1;
		while ( !q.isEmpty() ) {
			int idx = q.poll();

			for ( Edge e : nodes.get(idx) ) {
				if ( tree[e.to] == 0 ) {
					q.add(e.to);

					if ( e.dist % 2 == 0 ) tree[e.to] = tree[idx];
					else tree[e.to] = tree[idx] * (-1);
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for ( int i : tree ) {
			sb.append(Math.max(i, 0) + "\n");
		}
		System.out.println(sb);
	}
}

class Node {

	ArrayList<Edge> nexts = new ArrayList<>();
}

class Edge {

	int	to		= 0;
	int	dist	= 0;

	public Edge(int t, int d) {
		to = t;
		dist = d;
	}
}