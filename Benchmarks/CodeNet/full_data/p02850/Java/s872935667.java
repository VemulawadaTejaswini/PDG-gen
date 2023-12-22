//--- pD ---//
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws java.lang.Exception {
		new Solution();
	}
}
class Solution {
	Scanner scanner;
	int mod = (int)1e9+7;

	public Solution() {
		scanner = new Scanner(System.in);

		// scanner.nextLine();
		while (scanner.hasNext()) {
			run_case();
		}
	}

	Map<Integer, Set<Integer>> adj;
	Map<String, Edge> edge_map;
	List<String> edges;
	Map<String, Integer> color = new HashMap<>();
	private void run_case() {
		// scanner.nextLine();
		String line = scanner.nextLine();
		int N = Integer.parseInt(line);
		// System.out.println(N);

		// build graph
		adj = new HashMap<>();
		edges = new ArrayList<>();
		edge_map = new HashMap<>();
		for (int i=0; i<N; i++) {
			adj.put(i, new HashSet<>());
		}
		for (int i=0; i<N-1; i++) {
			line = scanner.nextLine();
			// System.out.println(line);
			int a = Integer.parseInt(line.split("\\s+")[0]);
			int b = Integer.parseInt(line.split("\\s+")[1]);
			a --; b --;
			adj.get(a).add(b);
			adj.get(b).add(a);
			// Edge e1 = new Edge(a, b, 1);
			// Edge e2 = new Edge(b, a, 1);
			String key1 = String.valueOf(a) + "_" + String.valueOf(b);
			// String key2 = String.valueOf(b) + "_" + String.valueOf(a);
			// edge_map.put(key, e);
			// edge_map.put(key1, e1);
			// edge_map.put(key2, e2);
			edges.add(key1);
		}

		// find max vertex
		int max_edge = 0;
		for (int i=0; i<N; i++) {
			max_edge = Math.max(max_edge, adj.get(i).size());
		}

		// color
		dfs(0, -1, 0);

		// print res
		System.out.println(max_edge);
		for (String e : edges) {
			System.out.println(color.get(e) % max_edge + 1);
		}
		return;
	}

	private void dfs(int cur, int pv, int color_num) {
		// Edge e1 = new Edge(cur, pv, 1);
		// Edge e2 = new Edge(pv, cur, 1);
		String key1 = String.valueOf(cur) + "_" + String.valueOf(pv);
		String key2 = String.valueOf(pv) + "_" + String.valueOf(cur);
		// Edge e1 = edge_map.get(key1);
		// Edge e2 = edge_map.get(key2);

	    color.putIfAbsent(key1, color_num);
		color.putIfAbsent(key2, color_num);
		color.put(key1, color_num);
		color.put(key2, color_num);

		color_num ++;

		// if (adj.get(cur) != null) {
		    for (int nx : adj.get(cur)) {
				if (nx != pv){
		        	dfs(nx, cur, color_num++);
				}
		    }
		// }

		return;
	}

	private int[] strToIntArray(String str) {
	    String[] vals = str.split("\\s+");
	    int sz = vals.length;
	    int[] res = new int[sz];
	    for (int i=0; i<sz; i++) {
	        res[i] = Integer.parseInt(vals[i]);
	    }
	    return res;
	}
}

class Edge {
    public int u, v, w;
    public Edge(int u, int v, int w) {
        this.u = u;
        this.v = v;
        this.w = w;
    }
}
