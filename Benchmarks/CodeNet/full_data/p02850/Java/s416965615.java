import java.util.*;
import java.math.*;
public class Main {
	static int max = 0;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] edges = new int[n][n];
		Edge[] ad = new Edge[n];
		Vertex[] vt = new Vertex[n];
		int[] color = new int[n];
		for(int i = 0; i < n; i++) vt[i] = new Vertex(n, i);
		for(int i = 0; i < n - 1; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			vt[a - 1].adj.add(b - 1);
			vt[b - 1].adj.add(a - 1);
			ad[i] = new Edge(a - 1, b - 1);
		}
		dfs(color, vt[0], vt, edges);
		System.out.println(max);
		for(int i = 0; i < n - 1; i++) {
			System.out.println(edges[ad[i].a][ad[i].b]);
		}
	}
	public static void dfs(int[] color, Vertex root, Vertex[] vt, int[][] edges) {
		color[root.index] = 1;
		int nxtcolor = 1;
		for(int nxt : root.adj) {
			if(color[nxt] == 0) {
				if(root.flag[nxtcolor] == 1) nxtcolor += 1;
				root.flag[nxtcolor] = 1;
				vt[nxt].flag[nxtcolor] = 1;
				edges[root.index][nxt] = nxtcolor;
				edges[nxt][root.index] = nxtcolor;
				max = Math.max(max, nxtcolor);
				dfs(color, vt[nxt], vt, edges);
				nxtcolor += 1;
			}
		}
	}
}
class Edge {
	int a;
	int b;
	public Edge(int a, int b) {
		this.a = a;
		this.b = b;
	}
}
class Vertex {
	int[] flag;
	int index;
	List<Integer> adj;
	public Vertex(int n, int index) {
		this.index = index;
		this.flag = new int[n + 1];
		this.adj = new ArrayList<>();
	}
}